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
package org.apache.directory.shared.ldap.filter;


import org.apache.directory.shared.ldap.entry.Value;


/**
 * A assertion value node for GreaterOrEqual.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Revision: 519266 $
 */
public class GreaterEqNode<T> extends SimpleNode<T>
{
    /**
     * Creates a new GreaterOrEqual object.
     * 
     * @param attribute the attribute name
     * @param value the value to test for
     */
    public GreaterEqNode( String attribute, Value<T> value )
    {
        super( attribute, value, AssertionType.GREATEREQ );
    }


    /**
     * @see Object#hashCode()
     */
    public int hashCode()
    {
        return super.hashCode();
    }


    /**
     * @see Object#toString()
     */
    public String toString()
    {
        StringBuilder buf = new StringBuilder();

        buf.append( '(' ).append( getAttribute() ).append( ">=" ).append( value );

        buf.append( super.toString() );

        buf.append( ')' );

        return buf.toString();
    }
}
