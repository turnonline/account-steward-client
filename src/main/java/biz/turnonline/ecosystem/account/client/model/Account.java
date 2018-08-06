/*
 * Copyright (c) 2018 Comvai, s.r.o.
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

    private AccountPublicContact publicContact = null;

    private Boolean hasPostalAddress = false;

    private AccountPostalAddress postalAddress = null;

    private Boolean company = false;

    private AccountBusiness business = null;

    private InvoicingConfig invoicing = null;

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
     * The postal address details. The address is being ignored until property \"hasPostalAddress\" is set to true.
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
     * The business account details. If the property \"company\" is false, the posted values will be stored anyway for further use,
     * however account is still being considered as a personal account.
     **/
    public Account business( AccountBusiness business )
    {
        this.business = business;
        return this;
    }

    public AccountBusiness getBusiness()
    {
        return business;
    }

    public void setBusiness( AccountBusiness business )
    {
        this.business = business;
    }

    /**
     * The set of default invoicing rules. Valid only for an account representing a business account (configured by \"company\" property).
     **/
    public Account invoicing( InvoicingConfig invoicing )
    {
        this.invoicing = invoicing;
        return this;
    }

    public InvoicingConfig getInvoicing()
    {
        return invoicing;
    }

    public void setInvoicing( InvoicingConfig invoicing )
    {
        this.invoicing = invoicing;
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
                "    publicContact: " + toIndentedString( publicContact ) + "\n" +
                "    hasPostalAddress: " + toIndentedString( hasPostalAddress ) + "\n" +
                "    postalAddress: " + toIndentedString( postalAddress ) + "\n" +
                "    company: " + toIndentedString( company ) + "\n" +
                "    business: " + toIndentedString( business ) + "\n" +
                "    invoicing: " + toIndentedString( invoicing ) + "\n" +
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

