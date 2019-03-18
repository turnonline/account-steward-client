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
 * on 2019-03-18 at 16:21:51 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.steward.model;

/**
 * Model definition for InvoicingConfigBillingContact.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Account &amp; Contact management. For
 * a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class InvoicingConfigBillingContact
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
    private java.lang.String firstName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String lastName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String middleName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String phone;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String prefix;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String suffix;

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
    public InvoicingConfigBillingContact setEmail( java.lang.String email )
    {
        this.email = email;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName firstName or {@code null} for none
     */
    public InvoicingConfigBillingContact setFirstName( java.lang.String firstName )
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName lastName or {@code null} for none
     */
    public InvoicingConfigBillingContact setLastName( java.lang.String lastName )
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getMiddleName()
    {
        return middleName;
    }

    /**
     * @param middleName middleName or {@code null} for none
     */
    public InvoicingConfigBillingContact setMiddleName( java.lang.String middleName )
    {
        this.middleName = middleName;
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
    public InvoicingConfigBillingContact setPhone( java.lang.String phone )
    {
        this.phone = phone;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPrefix()
    {
        return prefix;
    }

    /**
     * @param prefix prefix or {@code null} for none
     */
    public InvoicingConfigBillingContact setPrefix( java.lang.String prefix )
    {
        this.prefix = prefix;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSuffix()
    {
        return suffix;
    }

    /**
     * @param suffix suffix or {@code null} for none
     */
    public InvoicingConfigBillingContact setSuffix( java.lang.String suffix )
    {
        this.suffix = suffix;
        return this;
    }

    @Override
    public InvoicingConfigBillingContact set( String fieldName, Object value )
    {
        return ( InvoicingConfigBillingContact ) super.set( fieldName, value );
    }

    @Override
    public InvoicingConfigBillingContact clone()
    {
        return ( InvoicingConfigBillingContact ) super.clone();
    }

}
