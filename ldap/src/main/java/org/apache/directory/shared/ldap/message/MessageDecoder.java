/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package org.apache.directory.shared.ldap.message;


import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.apache.directory.shared.asn1.Asn1Object;
import org.apache.directory.shared.asn1.codec.DecoderException;
import org.apache.directory.shared.asn1.codec.stateful.DecoderCallback;
import org.apache.directory.shared.asn1.codec.stateful.DecoderMonitor;
import org.apache.directory.shared.asn1.codec.stateful.StatefulDecoder;
import org.apache.directory.shared.ldap.codec.ResponseCarryingException;
import org.apache.directory.shared.ldap.constants.JndiPropertyConstants;
import org.apache.directory.shared.ldap.message.spi.Provider;
import org.apache.directory.shared.ldap.message.spi.ProviderDecoder;
import org.apache.directory.shared.ldap.message.spi.TransformerSpi;
import org.apache.directory.shared.ldap.util.StringTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Decodes a BER encoded LDAPv3 message envelope from an input stream
 * demarshaling it into a Message instance using a BER library provider.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev$
 */
public final class MessageDecoder implements ProviderDecoder
{
    private static final Logger log = LoggerFactory.getLogger( MessageDecoder.class );

    private static final String BINARY_KEY = JndiPropertyConstants.JNDI_LDAP_ATTRIBUTES_BINARY;
    
    private final static Set<String> EMPTY_SET_STRING = new HashSet<String>();

    /** Environment parameters stored here */
    private final Hashtable<String, Object> env;

    /** the ASN.1 provider */
    private final Provider provider;

    /** the ASN.1 provider's decoder */
    private final ProviderDecoder decoder;

    /** the ASN.1 provider's transformer */
    private final TransformerSpi transformer;

    /** the Message decode operation callback */
    private DecoderCallback cb;


    /**
     * Creates a MessageDecoder using default properties for enabling a BER
     * library provider.
     * 
     * @param env
     *            The Map of environment parameters.
     * @throws MessageException
     *             if there is a problem creating this decoder.
     */
    public MessageDecoder(final Hashtable<String, Object> env) throws MessageException
    {
        this.env = ( Hashtable<String, Object> ) env.clone();
        
        // We need to get the encoder class name
        Hashtable providerEnv = Provider.getEnvironment();
        
        this.env.put( Provider.BERLIB_PROVIDER, providerEnv.get( Provider.BERLIB_PROVIDER ) );
        this.provider = Provider.getProvider( providerEnv );

        Set<String> binaries;

        if ( env.containsKey( BINARY_KEY ) )
        {
            Object val = env.get( BINARY_KEY );

            if ( val == null )
            {
                if ( log.isWarnEnabled() )
                {
                    log.warn( "Null value for " + BINARY_KEY + " key in environment.  Using empty set for binaries." );
                }
                
                binaries = EMPTY_SET_STRING;
            }
            else if ( val instanceof String )
            {
                // parse out all words based on expected JNDI format of this
                // attribute
                String binaryIds = ( String ) val;
                binaries = new HashSet<String>();

                if ( !StringTools.isEmpty( binaryIds ) )
                {
                    String[] binaryArray = binaryIds.split( " " );

                    for ( String binary:binaryArray )
                    {
                        binaries.add( StringTools.lowerCaseAscii( StringTools.trim( binary ) ) );
                    }
                }
            } // if already parsed and set as a collection use it
            else if ( val instanceof Collection )
            {
                binaries = new HashSet<String>();
                binaries.addAll( ( Set<String> ) val );
            } // complain if it's something else
            else
            {
                if ( log.isWarnEnabled() )
                {
                    log.warn( "Unrecognized value for " + BINARY_KEY
                        + " key in environment.  Using empty set for binaries." );
                }
                
                binaries = EMPTY_SET_STRING;
            }
        }
        else
        {
            if ( log.isWarnEnabled() )
            {
                log.warn( "Could not find " + BINARY_KEY + " key in environment.  Using empty set for binaries." );
            }
            binaries = EMPTY_SET_STRING;
        }

        this.decoder = this.provider.getDecoder( binaries );
        this.transformer = this.provider.getTransformer();
        this.decoder.setCallback( new DecoderCallback()
        {
            public void decodeOccurred( StatefulDecoder decoder, Object decoded )
            {
            	if ( decoded instanceof Asn1Object )
            	{
            		cb.decodeOccurred( decoder, transformer.transform( decoded ) );
            	}
            	else
            	{
            		cb.decodeOccurred( decoder, decoded );
            	}
            }
        } );
    }


    /**
     * Reads and decodes a BER encoded LDAPv3 ASN.1 message envelope structure
     * from an input stream to build a fully populated Message object instance.
     * 
     * @param lock
     *            lock object used to exclusively read from the input stream
     * @param in
     *            the input stream to read PDU data from.
     * @return the populated Message representing the PDU envelope.
     * @throws MessageException
     *             if there is a problem decoding.
     */
    public Object decode( final Object lock, final InputStream in ) throws MessageException
    {
        Object providerEnvelope;

        try
        {
            if ( lock == null )
            {
                // Complain here somehow first then do the following w/o synch!
    
                // Call provider decoder to demarshall PDU into berlib specific form
                providerEnvelope = decoder.decode( lock, in );
            }
            else
            {
                synchronized ( lock )
                {
                    // Same as above but a synchronized read using valid lock object
                    providerEnvelope = decoder.decode( lock, in );
                    lock.notifyAll();
                }
            }
        }
        catch (Exception e) 
        {
            throw (MessageException)e;
        }

        // Call on transformer to convert stub based PDU into Message based PDU
        Message message = transformer.transform( providerEnvelope );
        return message;
    }


    /**
     * Decodes a chunk of stream data returning any resultant decoded PDU via a
     * callback.
     * 
     * @param chunk
     *            the chunk to decode
     * @throws MessageException
     *             if there are failures while decoding the chunk
     */
    public void decode( Object chunk ) throws MessageException
    {
        try
        {
            decoder.decode( chunk );
        }
        catch ( DecoderException e )
        {
            // transform the DecoderException message to a MessageException
            if ( e instanceof ResponseCarryingException ) 
            {
                ResponseCarryingMessageException rcme = new ResponseCarryingMessageException( e.getMessage() );
                rcme.setResponse( ((ResponseCarryingException)e).getResponse() );
                
                throw rcme;
            }
            else
            {
            	// TODO : this is certainly not the way we should handle such an exception !
            	throw new ResponseCarryingMessageException( e.getMessage() );
            }
        }
    }


    /**
     * Sets the callback used to deliver completly decoded PDU's.
     * 
     * @param cb
     *            the callback to use for decoded PDU delivery
     */
    public void setCallback( DecoderCallback cb )
    {
        this.cb = cb;
    }


    /**
     * Sets the monitor for this MessageDecoder which receives callbacks for
     * noteworthy events during decoding.
     * 
     * @param monitor
     *            the monitor to receive notifications via callback events
     */
    public void setDecoderMonitor( DecoderMonitor monitor )
    {
        decoder.setDecoderMonitor( monitor );
    }


    public Provider getProvider()
    {
        return this.provider;
    }
}
