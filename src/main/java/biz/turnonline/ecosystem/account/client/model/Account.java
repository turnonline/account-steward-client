/*
 * Copyright 2018 Comvai, s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package biz.turnonline.ecosystem.account.client.model;

import java.io.Serializable;

public class Account
        implements Serializable
{
    private static final long serialVersionUID = 4192743023975738655L;

    private String email = null;

    private String identityId = null;

    private String loginProvider = null;

    private String contactEmail = null;

    private String role = "STANDARD";

    private String locale = null;

    private String prefix = null;

    private String firstName = null;

    private String middleName = null;

    private String lastName = null;

    private String suffix = null;

    private AccountPersonalAddress personalAddress = null;

    private Boolean company = false;

    private String businessName = null;

    private String legalForm = "ltd";

    private String street = null;

    private String city = null;

    private String domicile = null;

    private String postcode = null;

    private Double latitude = null;

    private Double longitude = null;

    private String companyId = null;

    private String taxId = null;

    private Boolean vatPayer = false;

    private String vatId = null;

    private AccountPublicContact publicContact = null;

    private AccountBillingContact billingContact = null;

    private Boolean hasBillingAddress = false;

    private AccountBillingAddress billingAddress = null;

    private Boolean hasPostalAddress = false;

    private AccountPostalAddress postalAddress = null;

    /**
     * The login email address as the account unique identification, taken from the login provider as an authenticated email.
     **/
    public Account email( String email )
    {
        this.email = email;
        return this;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    /**
     * The email account unique identification within third-party provider system. Taken from the login provider.
     **/
    public Account identityId( String identityId )
    {
        this.identityId = identityId;
        return this;
    }

    public String getIdentityId()
    {
        return identityId;
    }

    public void setIdentityId( String identityId )
    {
        this.identityId = identityId;
    }

    /**
     * The login provider used to authenticate email address.
     **/
    public Account loginProvider( String loginProvider )
    {
        this.loginProvider = loginProvider;
        return this;
    }

    public String getLoginProvider()
    {
        return loginProvider;
    }

    public void setLoginProvider( String loginProvider )
    {
        this.loginProvider = loginProvider;
    }

    /**
     * The email address considered as a contact email used for notification purposes related to this account. If it's not provided the account's email will be used by default.
     **/
    public Account contactEmail( String contactEmail )
    {
        this.contactEmail = contactEmail;
        return this;
    }

    public String getContactEmail()
    {
        return contactEmail;
    }

    public void setContactEmail( String contactEmail )
    {
        this.contactEmail = contactEmail;
    }

    /**
     * The account role
     **/
    public Account role( String role )
    {
        this.role = role;
        return this;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole( String role )
    {
        this.role = role;
    }

    /**
     * The preferred account language. ISO 639 alpha-2 or alpha-3 language code.
     **/
    public Account locale( String locale )
    {
        this.locale = locale;
        return this;
    }

    public String getLocale()
    {
        return locale;
    }

    public void setLocale( String locale )
    {
        this.locale = locale;
    }

    /**
     * The personal / sub account, person name prefix.
     **/
    public Account prefix( String prefix )
    {
        this.prefix = prefix;
        return this;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public void setPrefix( String prefix )
    {
        this.prefix = prefix;
    }

    /**
     * The personal / sub account, person first name.
     **/
    public Account firstName( String firstName )
    {
        this.firstName = firstName;
        return this;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    /**
     * The personal / sub account, person middle name.
     **/
    public Account middleName( String middleName )
    {
        this.middleName = middleName;
        return this;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName( String middleName )
    {
        this.middleName = middleName;
    }

    /**
     * The personal / sub account, person last name.
     **/
    public Account lastName( String lastName )
    {
        this.lastName = lastName;
        return this;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    /**
     * The personal / sub account, person name suffix.
     **/
    public Account suffix( String suffix )
    {
        this.suffix = suffix;
        return this;
    }

    public String getSuffix()
    {
        return suffix;
    }

    public void setSuffix( String suffix )
    {
        this.suffix = suffix;
    }

    /**
     * The personal account address details.
     **/
    public Account personalAddress( AccountPersonalAddress personalAddress )
    {
        this.personalAddress = personalAddress;
        return this;
    }

    public AccountPersonalAddress getPersonalAddress()
    {
        return personalAddress;
    }

    public void setPersonalAddress( AccountPersonalAddress personalAddress )
    {
        this.personalAddress = personalAddress;
    }

    /**
     * The boolean indicating whether this account represents a business account. The missing value or false means it's a personal account.
     **/
    public Account company( Boolean company )
    {
        this.company = company;
        return this;
    }

    public Boolean getCompany()
    {
        return company;
    }

    public void setCompany( Boolean company )
    {
        this.company = company;
    }

    /**
     * The company business name.
     **/
    public Account businessName( String businessName )
    {
        this.businessName = businessName;
        return this;
    }

    public String getBusinessName()
    {
        return businessName;
    }

    public void setBusinessName( String businessName )
    {
        this.businessName = businessName;
    }

    /**
     * The company legal form.
     **/
    public Account legalForm( String legalForm )
    {
        this.legalForm = legalForm;
        return this;
    }

    public String getLegalForm()
    {
        return legalForm;
    }

    public void setLegalForm( String legalForm )
    {
        this.legalForm = legalForm;
    }

    /**
     * The company street and street number.
     **/
    public Account street( String street )
    {
        this.street = street;
        return this;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet( String street )
    {
        this.street = street;
    }

    /**
     * The company domicile city.
     **/
    public Account city( String city )
    {
        this.city = city;
        return this;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity( String city )
    {
        this.city = city;
    }

    /**
     * The company ISO 3166 alpha-2 country code. It's case insensitive. Technically it's same as country but the supported list is limited.
     **/
    public Account domicile( String domicile )
    {
        this.domicile = domicile;
        return this;
    }

    public String getDomicile()
    {
        return domicile;
    }

    public void setDomicile( String domicile )
    {
        this.domicile = domicile;
    }

    /**
     * The company postal code.
     **/
    public Account postcode( String postcode )
    {
        this.postcode = postcode;
        return this;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode( String postcode )
    {
        this.postcode = postcode;
    }

    /**
     * The company address latitude geographic coordinate, generated by the service.
     **/
    public Account latitude( Double latitude )
    {
        this.latitude = latitude;
        return this;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public void setLatitude( Double latitude )
    {
        this.latitude = latitude;
    }

    /**
     * The company address longitude geographic coordinate, generated by the service.
     **/
    public Account longitude( Double longitude )
    {
        this.longitude = longitude;
        return this;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public void setLongitude( Double longitude )
    {
        this.longitude = longitude;
    }

    /**
     * The company business identification number.
     **/
    public Account companyId( String companyId )
    {
        this.companyId = companyId;
        return this;
    }

    public String getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId( String companyId )
    {
        this.companyId = companyId;
    }

    /**
     * The company tax payer identification number.
     **/
    public Account taxId( String taxId )
    {
        this.taxId = taxId;
        return this;
    }

    public String getTaxId()
    {
        return taxId;
    }

    public void setTaxId( String taxId )
    {
        this.taxId = taxId;
    }

    /**
     * The boolean indication whether company is registered as VAT payer. The missing value or false means company it's not a VAT payer.
     **/
    public Account vatPayer( Boolean vatPayer )
    {
        this.vatPayer = vatPayer;
        return this;
    }

    public Boolean getVatPayer()
    {
        return vatPayer;
    }

    public void setVatPayer( Boolean vatPayer )
    {
        this.vatPayer = vatPayer;
    }

    /**
     * The company value added tax identification number (VAT ID). Mandatory if vatPayer property is true.
     **/
    public Account vatId( String vatId )
    {
        this.vatId = vatId;
        return this;
    }

    public String getVatId()
    {
        return vatId;
    }

    public void setVatId( String vatId )
    {
        this.vatId = vatId;
    }

    /**
     * The public contact of the account, might be publicly available.
     **/
    public Account publicContact( AccountPublicContact publicContact )
    {
        this.publicContact = publicContact;
        return this;
    }

    public AccountPublicContact getPublicContact()
    {
        return publicContact;
    }

    public void setPublicContact( AccountPublicContact publicContact )
    {
        this.publicContact = publicContact;
    }

    /**
     * The contact person related to billing. It might be presented at invoice or in email communication related to billing.
     **/
    public Account billingContact( AccountBillingContact billingContact )
    {
        this.billingContact = billingContact;
        return this;
    }

    public AccountBillingContact getBillingContact()
    {
        return billingContact;
    }

    public void setBillingContact( AccountBillingContact billingContact )
    {
        this.billingContact = billingContact;
    }

    /**
     * If true, the billing address is not same as the company address and must be provided.
     **/
    public Account hasBillingAddress( Boolean hasBillingAddress )
    {
        this.hasBillingAddress = hasBillingAddress;
        return this;
    }

    public Boolean getHasBillingAddress()
    {
        return hasBillingAddress;
    }

    public void setHasBillingAddress( Boolean hasBillingAddress )
    {
        this.hasBillingAddress = hasBillingAddress;
    }

    /**
     * The billing address details.
     **/
    public Account billingAddress( AccountBillingAddress billingAddress )
    {
        this.billingAddress = billingAddress;
        return this;
    }

    public AccountBillingAddress getBillingAddress()
    {
        return billingAddress;
    }

    public void setBillingAddress( AccountBillingAddress billingAddress )
    {
        this.billingAddress = billingAddress;
    }

    /**
     * If true, the postal address is not same as the company address and must be provided.
     **/
    public Account hasPostalAddress( Boolean hasPostalAddress )
    {
        this.hasPostalAddress = hasPostalAddress;
        return this;
    }

    public Boolean getHasPostalAddress()
    {
        return hasPostalAddress;
    }

    public void setHasPostalAddress( Boolean hasPostalAddress )
    {
        this.hasPostalAddress = hasPostalAddress;
    }

    /**
     * The postal address details.
     **/
    public Account postalAddress( AccountPostalAddress postalAddress )
    {
        this.postalAddress = postalAddress;
        return this;
    }

    public AccountPostalAddress getPostalAddress()
    {
        return postalAddress;
    }

    public void setPostalAddress( AccountPostalAddress postalAddress )
    {
        this.postalAddress = postalAddress;
    }

    @Override
    public String toString()
    {
        return "class Account {\n" +
                "    email: " + toIndentedString( email ) + "\n" +
                "    identityId: " + toIndentedString( identityId ) + "\n" +
                "    loginProvider: " + toIndentedString( loginProvider ) + "\n" +
                "    contactEmail: " + toIndentedString( contactEmail ) + "\n" +
                "    role: " + toIndentedString( role ) + "\n" +
                "    locale: " + toIndentedString( locale ) + "\n" +
                "    prefix: " + toIndentedString( prefix ) + "\n" +
                "    firstName: " + toIndentedString( firstName ) + "\n" +
                "    middleName: " + toIndentedString( middleName ) + "\n" +
                "    lastName: " + toIndentedString( lastName ) + "\n" +
                "    suffix: " + toIndentedString( suffix ) + "\n" +
                "    personalAddress: " + toIndentedString( personalAddress ) + "\n" +
                "    company: " + toIndentedString( company ) + "\n" +
                "    businessName: " + toIndentedString( businessName ) + "\n" +
                "    legalForm: " + toIndentedString( legalForm ) + "\n" +
                "    street: " + toIndentedString( street ) + "\n" +
                "    city: " + toIndentedString( city ) + "\n" +
                "    domicile: " + toIndentedString( domicile ) + "\n" +
                "    postcode: " + toIndentedString( postcode ) + "\n" +
                "    latitude: " + toIndentedString( latitude ) + "\n" +
                "    longitude: " + toIndentedString( longitude ) + "\n" +
                "    companyId: " + toIndentedString( companyId ) + "\n" +
                "    taxId: " + toIndentedString( taxId ) + "\n" +
                "    vatPayer: " + toIndentedString( vatPayer ) + "\n" +
                "    vatId: " + toIndentedString( vatId ) + "\n" +
                "    publicContact: " + toIndentedString( publicContact ) + "\n" +
                "    billingContact: " + toIndentedString( billingContact ) + "\n" +
                "    hasBillingAddress: " + toIndentedString( hasBillingAddress ) + "\n" +
                "    billingAddress: " + toIndentedString( billingAddress ) + "\n" +
                "    hasPostalAddress: " + toIndentedString( hasPostalAddress ) + "\n" +
                "    postalAddress: " + toIndentedString( postalAddress ) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString( Object o )
    {
        if ( o == null )
        {
            return "null";
        }
        return o.toString().replace( "\n", "\n    " );
    }
}

