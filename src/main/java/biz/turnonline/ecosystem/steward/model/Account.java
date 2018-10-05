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
 * (build: 2018-05-04 17:28:03 UTC)
 * on 2018-10-05 at 13:17:07 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.steward.model;

/**
 * Model definition for Account.
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
public final class Account
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private AccountBusiness business;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean company;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String contactEmail;

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
    private java.lang.Boolean hasPostalAddress;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String identityId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private InvoicingConfig invoicing;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String lastName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String locale;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String loginProvider;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String middleName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private AccountPersonalAddress personalAddress;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private AccountPostalAddress postalAddress;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String prefix;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private AccountPublicContact publicContact;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String role;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String suffix;

    /**
     * @return value or {@code null} for none
     */
    public AccountBusiness getBusiness()
    {
        return business;
    }

    /**
     * @param business business or {@code null} for none
     */
    public Account setBusiness( AccountBusiness business )
    {
        this.business = business;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCompany()
    {
        return company;
    }

    /**
     * @param company company or {@code null} for none
     */
    public Account setCompany( java.lang.Boolean company )
    {
        this.company = company;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getContactEmail()
    {
        return contactEmail;
    }

    /**
     * @param contactEmail contactEmail or {@code null} for none
     */
    public Account setContactEmail( java.lang.String contactEmail )
    {
        this.contactEmail = contactEmail;
        return this;
    }

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
    public Account setEmail( java.lang.String email )
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
    public Account setFirstName( java.lang.String firstName )
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getHasPostalAddress()
    {
        return hasPostalAddress;
    }

    /**
     * @param hasPostalAddress hasPostalAddress or {@code null} for none
     */
    public Account setHasPostalAddress( java.lang.Boolean hasPostalAddress )
    {
        this.hasPostalAddress = hasPostalAddress;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getIdentityId()
    {
        return identityId;
    }

    /**
     * @param identityId identityId or {@code null} for none
     */
    public Account setIdentityId( java.lang.String identityId )
    {
        this.identityId = identityId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public InvoicingConfig getInvoicing()
    {
        return invoicing;
    }

    /**
     * @param invoicing invoicing or {@code null} for none
     */
    public Account setInvoicing( InvoicingConfig invoicing )
    {
        this.invoicing = invoicing;
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
    public Account setLastName( java.lang.String lastName )
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLocale()
    {
        return locale;
    }

    /**
     * @param locale locale or {@code null} for none
     */
    public Account setLocale( java.lang.String locale )
    {
        this.locale = locale;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLoginProvider()
    {
        return loginProvider;
    }

    /**
     * @param loginProvider loginProvider or {@code null} for none
     */
    public Account setLoginProvider( java.lang.String loginProvider )
    {
        this.loginProvider = loginProvider;
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
    public Account setMiddleName( java.lang.String middleName )
    {
        this.middleName = middleName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public AccountPersonalAddress getPersonalAddress()
    {
        return personalAddress;
    }

    /**
     * @param personalAddress personalAddress or {@code null} for none
     */
    public Account setPersonalAddress( AccountPersonalAddress personalAddress )
    {
        this.personalAddress = personalAddress;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public AccountPostalAddress getPostalAddress()
    {
        return postalAddress;
    }

    /**
     * @param postalAddress postalAddress or {@code null} for none
     */
    public Account setPostalAddress( AccountPostalAddress postalAddress )
    {
        this.postalAddress = postalAddress;
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
    public Account setPrefix( java.lang.String prefix )
    {
        this.prefix = prefix;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public AccountPublicContact getPublicContact()
    {
        return publicContact;
    }

    /**
     * @param publicContact publicContact or {@code null} for none
     */
    public Account setPublicContact( AccountPublicContact publicContact )
    {
        this.publicContact = publicContact;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getRole()
    {
        return role;
    }

    /**
     * @param role role or {@code null} for none
     */
    public Account setRole( java.lang.String role )
    {
        this.role = role;
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
    public Account setSuffix( java.lang.String suffix )
    {
        this.suffix = suffix;
        return this;
    }

    @Override
    public Account set( String fieldName, Object value )
    {
        return ( Account ) super.set( fieldName, value );
    }

    @Override
    public Account clone()
    {
        return ( Account ) super.clone();
    }

}
