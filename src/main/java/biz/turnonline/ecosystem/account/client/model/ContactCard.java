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

/**
 * The contact that represents a business partner (customer). At least one of the value must be provided; either businessName or lastName.
 **/
public class ContactCard
        implements Serializable
{
    private static final long serialVersionUID = 7799047662827260036L;

    private Long id = null;

    private String contactEmail = null;

    private String prefix = null;

    private String firstName = null;

    private String lastName = null;

    private String suffix = null;

    private String street = null;

    private String city = null;

    private String country = null;

    private String postcode = null;

    private Double latitude = null;

    private Double longitude = null;

    private Boolean hasPostalAddress = false;

    private ContactCardPostalAddress postalAddress = null;

    private Boolean company = false;

    private String businessName = null;

    private String companyId = null;

    private String taxId = null;

    private String vatId = null;

    private Boolean vatPayer = false;

    /**
     * The contact unique identification.
     **/
    public ContactCard id( Long id )
    {
        this.id = id;
        return this;
    }

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    /**
     * The contact email used for notification purposes.
     **/
    public ContactCard contactEmail( String contactEmail )
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
     * The personal name prefix.
     **/
    public ContactCard prefix( String prefix )
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
     * The personal first name.
     **/
    public ContactCard firstName( String firstName )
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
     * The personal last name.
     **/
    public ContactCard lastName( String lastName )
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
     * The personal name suffix.
     **/
    public ContactCard suffix( String suffix )
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
     * The street and street number.
     **/
    public ContactCard street( String street )
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
     * The city.
     **/
    public ContactCard city( String city )
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
     * The contact ISO 3166 alpha-2 country code. It's case insensitive.
     **/
    public ContactCard country( String country )
    {
        this.country = country;
        return this;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String country )
    {
        this.country = country;
    }

    /**
     * The post code.
     **/
    public ContactCard postcode( String postcode )
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
     * The contact address latitude geographic coordinate, generated by the service.
     **/
    public ContactCard latitude( Double latitude )
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
     * The contact address longitude geographic coordinate, generated by the service.
     **/
    public ContactCard longitude( Double longitude )
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
     * If true, the postal address is not same as the company/personal address and must be provided.
     **/
    public ContactCard hasPostalAddress( Boolean hasPostalAddress )
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
    public ContactCard postalAddress( ContactCardPostalAddress postalAddress )
    {
        this.postalAddress = postalAddress;
        return this;
    }

    public ContactCardPostalAddress getPostalAddress()
    {
        return postalAddress;
    }

    public void setPostalAddress( ContactCardPostalAddress postalAddress )
    {
        this.postalAddress = postalAddress;
    }

    /**
     * The boolean indication whether contact represents a business entity. The missing value or false means it represents a personal contact (not business entity).
     **/
    public ContactCard company( Boolean company )
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
    public ContactCard businessName( String businessName )
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
     * The company business identification number.
     **/
    public ContactCard companyId( String companyId )
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
     * The tax payer identification number of the company.
     **/
    public ContactCard taxId( String taxId )
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
     * The value added tax identification number (VAT ID) of the company. Provided if vatPayer property is true.
     **/
    public ContactCard vatId( String vatId )
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
     * The boolean indication whether company is registered as VAT payer. The missing value or false means company it's not a VAT payer.
     **/
    public ContactCard vatPayer( Boolean vatPayer )
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

    @Override
    public String toString()
    {
        return "class ContactCard {\n" +
                "    id: " + toIndentedString( id ) + "\n" +
                "    contactEmail: " + toIndentedString( contactEmail ) + "\n" +
                "    prefix: " + toIndentedString( prefix ) + "\n" +
                "    firstName: " + toIndentedString( firstName ) + "\n" +
                "    lastName: " + toIndentedString( lastName ) + "\n" +
                "    suffix: " + toIndentedString( suffix ) + "\n" +
                "    street: " + toIndentedString( street ) + "\n" +
                "    city: " + toIndentedString( city ) + "\n" +
                "    country: " + toIndentedString( country ) + "\n" +
                "    postcode: " + toIndentedString( postcode ) + "\n" +
                "    latitude: " + toIndentedString( latitude ) + "\n" +
                "    longitude: " + toIndentedString( longitude ) + "\n" +
                "    hasPostalAddress: " + toIndentedString( hasPostalAddress ) + "\n" +
                "    postalAddress: " + toIndentedString( postalAddress ) + "\n" +
                "    company: " + toIndentedString( company ) + "\n" +
                "    businessName: " + toIndentedString( businessName ) + "\n" +
                "    companyId: " + toIndentedString( companyId ) + "\n" +
                "    taxId: " + toIndentedString( taxId ) + "\n" +
                "    vatId: " + toIndentedString( vatId ) + "\n" +
                "    vatPayer: " + toIndentedString( vatPayer ) + "\n" +
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

