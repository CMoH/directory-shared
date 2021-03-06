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
package org.apache.directory.api.ldap.extras.extended.ads_impl.cancel;


import org.apache.directory.api.asn1.DecoderException;
import org.apache.directory.api.asn1.ber.grammar.AbstractGrammar;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.api.asn1.ber.grammar.GrammarAction;
import org.apache.directory.api.asn1.ber.grammar.GrammarTransition;
import org.apache.directory.api.asn1.ber.tlv.BerValue;
import org.apache.directory.api.asn1.ber.tlv.IntegerDecoder;
import org.apache.directory.api.asn1.ber.tlv.IntegerDecoderException;
import org.apache.directory.api.asn1.ber.tlv.UniversalTag;
import org.apache.directory.api.i18n.I18n;
import org.apache.directory.api.ldap.codec.api.LdapApiServiceFactory;
import org.apache.directory.api.ldap.extras.extended.cancel.CancelRequestImpl;
import org.apache.directory.api.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class implements the Cancel operation. All the actions are declared
 * in this class. As it is a singleton, these declaration are only done once.
 * The grammar is :
 * 
 * <pre>
 *  cancelRequestValue ::= SEQUENCE {
 *      cancelId     MessageID 
 *                   -- MessageID is as defined in [RFC2251]
 * }
 * </pre>
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public final class CancelGrammar extends AbstractGrammar<CancelContainer>
{
    /** The logger */
    static final Logger LOG = LoggerFactory.getLogger( CancelGrammar.class );

    /** Speedup for logs */
    static final boolean IS_DEBUG = LOG.isDebugEnabled();

    /** The instance of grammar. CancelGrammar is a singleton */
    private static Grammar<CancelContainer> instance = new CancelGrammar();


    /**
     * Creates a new GracefulDisconnectGrammar object.
     */
    @SuppressWarnings("unchecked")
    private CancelGrammar()
    {
        setName( CancelGrammar.class.getName() );

        // Create the transitions table
        super.transitions = new GrammarTransition[CancelStatesEnum.LAST_CANCEL_STATE.ordinal()][256];

        /**
         * Transition from init state to cancel sequence
         * cancelRequestValue ::= SEQUENCE {
         *     ... 
         * 
         * Creates the Cancel object
         */
        super.transitions[CancelStatesEnum.START_STATE.ordinal()][UniversalTag.SEQUENCE.getValue()] =
            new GrammarTransition<CancelContainer>( CancelStatesEnum.START_STATE,
                CancelStatesEnum.CANCEL_SEQUENCE_STATE,
                UniversalTag.SEQUENCE.getValue(),
                new GrammarAction<CancelContainer>( "Init Cancel" )
                {
                    public void action( CancelContainer cancelContainer )
                    {
                        CancelRequestDecorator cancel = new CancelRequestDecorator(
                            LdapApiServiceFactory.getSingleton(),
                            new CancelRequestImpl() );

                        cancelContainer.setCancel( cancel );
                    }
                } );

        /**
         * Transition from cancel SEQ to cancelId
         * 
         * cancelRequestValue ::= SEQUENCE {
         *     cancelId   MessageID 
         * }
         *     
         * Set the cancelId value into the Cancel object.    
         */
        super.transitions[CancelStatesEnum.CANCEL_SEQUENCE_STATE.ordinal()][UniversalTag.INTEGER.getValue()] =
            new GrammarTransition<CancelContainer>( CancelStatesEnum.CANCEL_SEQUENCE_STATE,
                CancelStatesEnum.CANCEL_ID_STATE,
                UniversalTag.INTEGER.getValue(),
                new GrammarAction<CancelContainer>( "Stores CancelId" )
                {
                    public void action( CancelContainer cancelContainer ) throws DecoderException
                    {
                        BerValue value = cancelContainer.getCurrentTLV().getValue();

                        try
                        {
                            int cancelId = IntegerDecoder.parse( value, 0, Integer.MAX_VALUE );

                            if ( IS_DEBUG )
                            {
                                LOG.debug( "CancelId = " + cancelId );
                            }

                            cancelContainer.getCancel().setCancelId( cancelId );
                            cancelContainer.setGrammarEndAllowed( true );
                        }
                        catch ( IntegerDecoderException ide )
                        {
                            String msg = I18n.err( I18n.ERR_04031, Strings.dumpBytes( value.getData() ) );
                            LOG.error( msg );
                            throw new DecoderException( msg, ide );
                        }
                    }
                } );
    }


    /**
     * This class is a singleton.
     * 
     * @return An instance on this grammar
     */
    public static Grammar<CancelContainer> getInstance()
    {
        return instance;
    }
}
