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
package org.apache.directory.shared.asn1.codec;


import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

import org.apache.directory.shared.asn1.codec.stateful.EncoderCallback;
import org.apache.directory.shared.asn1.codec.stateful.StatefulEncoder;
import org.apache.directory.shared.i18n.I18n;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;


/**
 * Adapts {@link StatefulEncoder} to MINA <tt>ProtocolEncoder</tt>
 * 
 * @author The Apache Directory Project (mina-dev@directory.apache.org)
 * @version $Rev$, $Date$, 
 */
public class Asn1CodecEncoder implements ProtocolEncoder
{
    private final StatefulEncoder encoder;
    private final EncoderCallbackImpl callback = new EncoderCallbackImpl();


    public Asn1CodecEncoder( StatefulEncoder encoder )
    {
        encoder.setCallback( callback );
        this.encoder = encoder;
    }


    public void encode( IoSession session, Object message, ProtocolEncoderOutput out ) throws EncoderException
    {
        callback.encOut = out;
        encoder.encode( message );
    }


    public void dispose( IoSession session ) throws Exception
    {
    }


    private class EncoderCallbackImpl implements EncoderCallback
    {
        private ProtocolEncoderOutput encOut;


        public void encodeOccurred( StatefulEncoder codec, Object encoded )
        {
            if( encoded instanceof java.nio.ByteBuffer )
            {
                java.nio.ByteBuffer buf = ( java.nio.ByteBuffer ) encoded;
                IoBuffer wrappedBuf = IoBuffer.wrap( buf );
                encOut.write( wrappedBuf );
            }
            else if( encoded instanceof Object[] )
            {
                Object[] bufArray = ( Object[] ) encoded;
                for ( Object buf : bufArray )
                {
                    this.encodeOccurred( codec, buf );
                }

                encOut.mergeAll();
            }
            else if( encoded instanceof Iterator )
            {
                Iterator it = ( Iterator ) encoded;
                while( it.hasNext() )
                {
                    this.encodeOccurred( codec, it.next() );
                }
                
                encOut.mergeAll();
            }
            else if( encoded instanceof Collection )
            {
                for ( Object o : ( ( Collection ) encoded ) )
                {
                    this.encodeOccurred( codec, o );
                }
                
                encOut.mergeAll();
            }
            else if( encoded instanceof Enumeration )
            {
                Enumeration e = ( Enumeration ) encoded;
                while( e.hasMoreElements() )
                {
                    this.encodeOccurred( codec, e.nextElement() );
                }
                
                encOut.mergeAll();
            }
            else
            {
                throw new IllegalArgumentException( I18n.err( I18n.ERR_01001, encoded.getClass() ) );
            }
        }
    }
}