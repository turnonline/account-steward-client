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
 * (build: 2018-10-08 17:45:39 UTC)
 * on 2019-01-10 at 19:32:54 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.steward.model;

/**
 * Model definition for AccountPublicContact.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Account & Contact management. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class AccountPublicContact
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String email;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String phone;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String website;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEmail()
    {
        return email;
    }

    /**
     * @param email email or {@code null} for none
     */
    public AccountPublicContact setEmail( java.lang.String email )
    {
        this.email = email;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getName()
    {
        return name;
    }

    /**
     * @param name name or {@code null} for none
     */
    public AccountPublicContact setName( java.lang.String name )
    {
        this.name = name;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPhone()
    {
        return phone;
    }

    /**
     * @param phone phone or {@code null} for none
     */
    public AccountPublicContact setPhone( java.lang.String phone )
    {
        this.phone = phone;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getWebsite()
    {
        return website;
    }

    /**
     * @param website website or {@code null} for none
     */
    public AccountPublicContact setWebsite( java.lang.String website )
    {
        this.website = website;
        return this;
    }

    @Override
    public AccountPublicContact set( String fieldName, Object value )
    {
        return ( AccountPublicContact ) super.set( fieldName, value );
    }

    @Override
    public AccountPublicContact clone()
    {
        return ( AccountPublicContact ) super.clone();
    }

}
