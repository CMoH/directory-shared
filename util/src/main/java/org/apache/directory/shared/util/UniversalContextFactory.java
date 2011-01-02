/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */
package org.apache.directory.shared.util;


import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;


/**
 * A context factory that delegates calls to the underlying JNDI 
 * implementation of the JVM.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class UniversalContextFactory implements InitialContextFactory
{
    
    /** The Constant SUN_ICF_FQCN. */
    private static final String SUN_ICF_FQCN = "com.sun.jndi.ldap.LdapCtxFactory";
    
    /** The Constant IBM_ICF_FQCN. */
    private static final String IBM_ICF_FQCN = "com.ibm.jndi.LDAPCtxFactory";
    
    /** The Constant BEA_ICF_FQCN. */
    private static final String BEA_ICF_FQCN = SUN_ICF_FQCN; // BEA JRocket might use SUN classes
    
    /** The Constant ORACLE_FQCN. */
    private static final String ORACLE_FQCN = BEA_ICF_FQCN; // Oracle JRocket is the former BEA JRockit
    
    /** The Constant ICF_FQCN. */
    private static final String ICF_FQCN;

    static
    {
        // -------------------------------------------------------------------
        // for lack of a better approach we're just checking the JVM here and 
        // setting the ICF_FQCN based on that using a bunch of conditional tests
        // -------------------------------------------------------------------

        String jvmVendor = System.getProperty( "java.vm.vendor" );

        if ( jvmVendor.equalsIgnoreCase( "SUN Microsystems, Inc." ) )
        {
            ICF_FQCN = SUN_ICF_FQCN;
        }
        else if ( jvmVendor.equalsIgnoreCase( "BEA Systems, Inc." ) )
        {
            ICF_FQCN = ORACLE_FQCN;
        }
        else if ( jvmVendor.equalsIgnoreCase( "Oracle Corporation" ) )
        {
            ICF_FQCN = BEA_ICF_FQCN;
        }
        else if ( jvmVendor.equalsIgnoreCase( "IBM, Inc." ) )
        {
            ICF_FQCN = IBM_ICF_FQCN;
        }
        else
        {
            ICF_FQCN = "Unknown";
        }
    }

    /** The initial context factory. */
    private final InitialContextFactory factory;


    /**
     * Instantiates a new universal context factory.
     *
     * @throws InstantiationException if this Class represents an abstract class, an interface, 
     *         an array class, a primitive type, or void; or if the class has no nullary constructor; 
     *         or if the instantiation fails for some other reason.
     * @throws IllegalAccessException if the class or its nullary constructor is not accessible
     * @throws ClassNotFoundException if the class cannot be located
     */
    public UniversalContextFactory() throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        factory = ( InitialContextFactory ) Class.forName( ICF_FQCN ).newInstance();
    }


    
    /**
     * {@inheritDoc}
     */
    public Context getInitialContext( Hashtable<?, ?> env ) throws NamingException
    {
        return factory.getInitialContext( env );
    }
}