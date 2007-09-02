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
package org.apache.directory.shared.ldap.aci;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;


/**
 * An {@link ACIItem} which specifies {@link ProtectedItem}s first and then
 * {@link UserClass}es each {@link ProtectedItem} will have. (18.4.2.4. X.501)
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev$, $Date$
 */
public class ItemFirstACIItem extends ACIItem
{
    private static final long serialVersionUID = -8199453391060356463L;

    private final Collection<ProtectedItem> protectedItems;

    private final Collection<ItemPermission> itemPermissions;


    /**
     * Creates a new instance.
     * 
     * @param identificationTag
     *            the id string of this item
     * @param precedence
     *            the precedence of this item
     * @param authenticationLevel
     *            the level of authentication required to this item
     * @param protectedItems
     *            the collection of {@link ProtectedItem}s this item protects
     * @param itemPermissions
     *            the collection of {@link ItemPermission}s each
     *            <tt>protectedItems</tt> will have
     */
    public ItemFirstACIItem( String identificationTag, int precedence, AuthenticationLevel authenticationLevel,
        Collection<ProtectedItem> protectedItems, Collection<ItemPermission> itemPermissions )
    {
        super( identificationTag, precedence, authenticationLevel );

        this.protectedItems = Collections.unmodifiableCollection( new ArrayList<ProtectedItem>( protectedItems ) );
        this.itemPermissions = Collections.unmodifiableCollection( new ArrayList<ItemPermission>( itemPermissions ) );
    }


    /**
     * Returns the collection of {@link ProtectedItem}s.
     */
    public Collection<ProtectedItem> getProtectedItems()
    {
        return protectedItems;
    }


    /**
     * Returns the collection of {@link ItemPermission}s.
     */
    public Collection<ItemPermission> getItemPermissions()
    {
        return itemPermissions;
    }


    public String toString()
    {
        return "itemFirstACIItem: " + "identificationTag=" + getIdentificationTag() + ", " + "precedence="
            + getPrecedence() + ", " + "authenticationLevel=" + getAuthenticationLevel() + ", " + "protectedItems="
            + protectedItems + ", " + "itemPermissions=" + itemPermissions;
    }


    public Collection<ACITuple> toTuples()
    {
        Collection<ACITuple> tuples = new ArrayList<ACITuple>();
        
        for ( ItemPermission itemPermission:itemPermissions )
        {
            Set<GrantAndDenial> grants = itemPermission.getGrants();
            Set<GrantAndDenial> denials = itemPermission.getDenials();
            int precedence = itemPermission.getPrecedence() >= 0 ? itemPermission.getPrecedence() : this
                .getPrecedence();

            if ( grants.size() > 0 )
            {
                tuples.add( new ACITuple( itemPermission.getUserClasses(), getAuthenticationLevel(), protectedItems,
                    toMicroOperations( grants ), true, precedence ) );
            }
            if ( denials.size() > 0 )
            {
                tuples.add( new ACITuple( itemPermission.getUserClasses(), getAuthenticationLevel(), protectedItems,
                    toMicroOperations( denials ), false, precedence ) );
            }
        }
        return tuples;
    }


    /**
     * Converts this item into its string representation as stored
     * in directory.
     *
     * @param buffer the string buffer
     */
    public void printToBuffer( StringBuffer buffer )
    {
        // identificationTag
        buffer.append( "{ identificationTag \"" );
        buffer.append( getIdentificationTag() );

        // precedence
        buffer.append( "\", precedence " );
        buffer.append( getPrecedence() );
        
        // authenticationLevel
        buffer.append( ", authenticationLevel " );
        buffer.append( getAuthenticationLevel().getName() );
        
        // itemOrUserFirst
        buffer.append( ", itemOrUserFirst itemFirst: { " );
        
        // protectedItems
        buffer.append( "protectedItems { " );
        
        boolean isFirst = true;

        for ( ProtectedItem item:protectedItems )
        {
            item.printToBuffer( buffer );
            
            if ( isFirst )
            {
                isFirst = false;
            }
            else
            {
                buffer.append( ", " );
            }
        }

        // itemPermissions
        buffer.append( " }, itemPermissions { " );

        isFirst = true;
        
        for ( ItemPermission permission:itemPermissions )
        {
            permission.printToBuffer( buffer );
            
            if ( isFirst )
            {
                isFirst = false;
            }
            else
            {
                buffer.append( ", " );
            }
        }

        buffer.append( " } } }" );
    }
}
