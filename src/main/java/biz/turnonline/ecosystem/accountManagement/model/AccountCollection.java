/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-11-07 19:12:12 UTC)
 * on 2018-01-27 at 06:33:04 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.accountManagement.model;

/**
 * Model definition for AccountCollection.
 * <p>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Account & Contact management. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class AccountCollection
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Account> items;

    static
    {
        // hack to force ProGuard to consider Account used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( Account.class );
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<Account> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public AccountCollection setItems( java.util.List<Account> items )
    {
        this.items = items;
        return this;
    }

    @Override
    public AccountCollection set( String fieldName, Object value )
    {
        return ( AccountCollection ) super.set( fieldName, value );
    }

    @Override
    public AccountCollection clone()
    {
        return ( AccountCollection ) super.clone();
    }

}
