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

package org.apache.directory.ldap.client.api.listener;


import org.apache.directory.ldap.client.api.LdapAsyncConnection;
import org.apache.directory.shared.ldap.exception.LdapException;
import org.apache.directory.shared.ldap.message.CompareResponse;


/**
 * interface used for invoking the callback after completing the compare operation.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public interface CompareListener extends OperationResponseListener
{
    /**
     * callback method called after completing the compare operation.
     *
     * @param connection the LdapConnection
     * @param response the compare operation's response
     * @throws LdapException
     */
    void attributeCompared( LdapAsyncConnection connection, CompareResponse response )
        throws LdapException;
}
