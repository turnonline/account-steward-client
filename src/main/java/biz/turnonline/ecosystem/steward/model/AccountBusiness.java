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
 * on 2019-12-08 at 06:32:52 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.steward.model;

/**
 * Model definition for AccountBusiness.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Account Steward. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class AccountBusiness
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String businessName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String city;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String companyId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Domain domain;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String domicile;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double latitude;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String legalForm;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Image logo;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double longitude;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String postcode;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String street;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String taxId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String vatId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean vatPayer;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBusinessName()
    {
        return businessName;
    }

    /**
     * @param businessName businessName or {@code null} for none
     */
    public AccountBusiness setBusinessName( java.lang.String businessName )
    {
        this.businessName = businessName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCity()
    {
        return city;
    }

    /**
     * @param city city or {@code null} for none
     */
    public AccountBusiness setCity( java.lang.String city )
    {
        this.city = city;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCompanyId()
    {
        return companyId;
    }

    /**
     * @param companyId companyId or {@code null} for none
     */
    public AccountBusiness setCompanyId( java.lang.String companyId )
    {
        this.companyId = companyId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Domain getDomain()
    {
        return domain;
    }

    /**
     * @param domain domain or {@code null} for none
     */
    public AccountBusiness setDomain( Domain domain )
    {
        this.domain = domain;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDomicile()
    {
        return domicile;
    }

    /**
     * @param domicile domicile or {@code null} for none
     */
    public AccountBusiness setDomicile( java.lang.String domicile )
    {
        this.domicile = domicile;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getLatitude()
    {
        return latitude;
    }

    /**
     * @param latitude latitude or {@code null} for none
     */
    public AccountBusiness setLatitude( java.lang.Double latitude )
    {
        this.latitude = latitude;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLegalForm()
    {
        return legalForm;
    }

    /**
     * @param legalForm legalForm or {@code null} for none
     */
    public AccountBusiness setLegalForm( java.lang.String legalForm )
    {
        this.legalForm = legalForm;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Image getLogo()
    {
        return logo;
    }

    /**
     * @param logo logo or {@code null} for none
     */
    public AccountBusiness setLogo( Image logo )
    {
        this.logo = logo;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getLongitude()
    {
        return longitude;
    }

    /**
     * @param longitude longitude or {@code null} for none
     */
    public AccountBusiness setLongitude( java.lang.Double longitude )
    {
        this.longitude = longitude;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPostcode()
    {
        return postcode;
    }

    /**
     * @param postcode postcode or {@code null} for none
     */
    public AccountBusiness setPostcode( java.lang.String postcode )
    {
        this.postcode = postcode;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStreet()
    {
        return street;
    }

    /**
     * @param street street or {@code null} for none
     */
    public AccountBusiness setStreet( java.lang.String street )
    {
        this.street = street;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTaxId()
    {
        return taxId;
    }

    /**
     * @param taxId taxId or {@code null} for none
     */
    public AccountBusiness setTaxId( java.lang.String taxId )
    {
        this.taxId = taxId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getVatId()
    {
        return vatId;
    }

    /**
     * @param vatId vatId or {@code null} for none
     */
    public AccountBusiness setVatId( java.lang.String vatId )
    {
        this.vatId = vatId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getVatPayer()
    {
        return vatPayer;
    }

    /**
     * @param vatPayer vatPayer or {@code null} for none
     */
    public AccountBusiness setVatPayer( java.lang.Boolean vatPayer )
    {
        this.vatPayer = vatPayer;
        return this;
    }

    @Override
    public AccountBusiness set( String fieldName, Object value )
    {
        return ( AccountBusiness ) super.set( fieldName, value );
    }

    @Override
    public AccountBusiness clone()
    {
        return ( AccountBusiness ) super.clone();
    }

}
