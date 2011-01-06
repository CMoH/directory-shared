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
package org.apache.directory.shared.ldap.codec.message;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.apache.directory.junit.tools.Concurrent;
import org.apache.directory.junit.tools.ConcurrentJunitRunner;
import org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl;
import org.apache.directory.shared.ldap.codec.message.ReferralImpl;
import org.apache.directory.shared.ldap.exception.LdapException;
import org.apache.directory.shared.ldap.message.*;
import org.apache.directory.shared.ldap.message.control.Control;
import org.apache.directory.shared.ldap.name.DN;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * TestCase for the ExtendedResponseImpl class.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@RunWith(ConcurrentJunitRunner.class)
@Concurrent()
public class ExtendedResponseImplTest
{
    private static final Map<String, Control> EMPTY_CONTROL_MAP = new HashMap<String, Control>();


    /**
     * Creates and populates a ExtendedResponseImpl stub for testing purposes.
     * 
     * @return a populated ExtendedResponseImpl stub
     */
    private org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl createStub()
    {
        // Construct the Search response to test with results and referrals
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl response = new org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl( 45 );
        response.setResponseValue( "Hello World!".getBytes() );
        response.setResponseName( "1.1.1.1" );
        LdapResult result = response.getLdapResult();

        try
        {
            result.setMatchedDn( new DN( "dc=example,dc=com" ) );
        }
        catch ( LdapException ine )
        {
            // Do nothing
        }

        result.setResultCode( ResultCodeEnum.SUCCESS );
        org.apache.directory.shared.ldap.codec.message.ReferralImpl refs = new ReferralImpl();
        refs.addLdapUrl( "ldap://someserver.com" );
        refs.addLdapUrl( "ldap://apache.org" );
        refs.addLdapUrl( "ldap://another.net" );
        result.setReferral( refs );
        return response;
    }


    /**
     * Tests for equality using the same object.
     */
    @Test
    public void testEqualsSameObj()
    {
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp = createStub();
        assertTrue( resp.equals( resp ) );
    }


    /**
     * Tests for equality using an exact copy.
     */
    @Test
    public void testEqualsExactCopy()
    {
        ExtendedResponseImpl resp0 = createStub();
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp1 = createStub();
        assertTrue( resp0.equals( resp1 ) );
        assertTrue( resp1.equals( resp0 ) );
    }


    /**
     * Tests for equality using different stub implementations.
     */
    @Test
    public void testEqualsDiffImpl()
    {
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp0 = createStub();
        ExtendedResponse resp1 = new ExtendedResponse()
        {
            private static final long serialVersionUID = 5297000474419901408L;


            public String getID()
            {
                return "1.1.1.1";
            }


            public String getResponseName()
            {
                return "1.1.1.1";
            }


            public void setResponseName( String oid )
            {
            }


            public byte[] getEncodedValue()
            {
                return "Hello World!".getBytes();
            }


            public byte[] getResponseValue()
            {
                return "Hello World!".getBytes();
            }


            public void setResponseValue( byte[] value )
            {
            }


            public LdapResult getLdapResult()
            {
                org.apache.directory.shared.ldap.codec.message.LdapResultImpl result = new org.apache.directory.shared.ldap.codec.message.LdapResultImpl();

                try
                {
                    result.setMatchedDn( new DN( "dc=example,dc=com" ) );
                }
                catch ( LdapException ine )
                {
                    // do nothing
                }

                result.setResultCode( ResultCodeEnum.SUCCESS );
                org.apache.directory.shared.ldap.codec.message.ReferralImpl refs = new org.apache.directory.shared.ldap.codec.message.ReferralImpl();
                refs.addLdapUrl( "ldap://someserver.com" );
                refs.addLdapUrl( "ldap://apache.org" );
                refs.addLdapUrl( "ldap://another.net" );
                result.setReferral( refs );

                return result;
            }


            public MessageTypeEnum getType()
            {
                return MessageTypeEnum.EXTENDED_RESPONSE;
            }


            public Map<String, Control> getControls()
            {
                return EMPTY_CONTROL_MAP;
            }


            public void addControl( Control a_control ) throws MessageException
            {
            }


            public void removeControl( Control a_control ) throws MessageException
            {
            }


            public int getMessageId()
            {
                return 45;
            }


            public Object get( Object a_key )
            {
                return null;
            }


            public Object put( Object a_key, Object a_value )
            {
                return null;
            }


            public void addAllControls( Control[] controls ) throws MessageException
            {
            }


            public boolean hasControl( String oid )
            {
                return false;
            }


            public Control getCurrentControl()
            {
                return null;
            }


            public int getControlsLength()
            {
                return 0;
            }


            public void setControlsLength( int controlsLength )
            {
            }


            public int getMessageLength()
            {
                return 0;
            }


            public void setMessageLength( int messageLength )
            {
            }


            public Control getControl( String oid )
            {
                return null;
            }


            public void setMessageId( int messageId )
            {
            }
        };

        assertTrue( resp0.equals( resp1 ) );
        assertFalse( resp1.equals( resp0 ) );
    }


    /**
     * Tests for equal hashCode using the same object.
     */
    @Test
    public void testHashCodeSameObj()
    {
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp = createStub();
        assertTrue( resp.hashCode() == resp.hashCode() );
    }


    /**
     * Tests for equal hashCode using an exact copy.
     */
    @Test
    public void testHashCodeExactCopy()
    {
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp0 = createStub();
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp1 = createStub();
        assertTrue( resp0.hashCode() == resp1.hashCode() );
    }


    /**
     * Tests inequality when messageIds are different.
     */
    @Test
    public void testNotEqualsDiffIds()
    {
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp0 = new org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl( 3 );
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp1 = new org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl( 4 );

        assertFalse( resp0.equals( resp1 ) );
        assertFalse( resp1.equals( resp0 ) );
    }


    /**
     * Tests inequality when responseNames are different.
     */
    @Test
    public void testNotEqualsDiffNames()
    {
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp0 = createStub();
        resp0.setResponseName( "1.2.3.4" );
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp1 = createStub();
        resp1.setResponseName( "1.2.3.4.5" );

        assertFalse( resp0.equals( resp1 ) );
        assertFalse( resp1.equals( resp0 ) );
    }


    /**
     * Tests inequality when responses are different.
     */
    @Test
    public void testNotEqualsDiffResponses()
    {
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp0 = createStub();
        resp0.setResponseValue( "abc".getBytes() );
        org.apache.directory.shared.ldap.codec.message.ExtendedResponseImpl resp1 = createStub();
        resp1.setResponseValue( "123".getBytes() );

        assertFalse( resp0.equals( resp1 ) );
        assertFalse( resp1.equals( resp0 ) );
    }
}
