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
 * Model definition for AccountPersonalAddress.
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
public final class AccountPersonalAddress
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String city;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String country;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double latitude;

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
     * @return value or {@code null} for none
     */
    public java.lang.String getCity()
    {
        return city;
    }

    /**
     * @param city city or {@code null} for none
     */
    public AccountPersonalAddress setCity( java.lang.String city )
    {
        this.city = city;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCountry()
    {
        return country;
    }

    /**
     * @param country country or {@code null} for none
     */
    public AccountPersonalAddress setCountry( java.lang.String country )
    {
        this.country = country;
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
    public AccountPersonalAddress setLatitude( java.lang.Double latitude )
    {
        this.latitude = latitude;
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
    public AccountPersonalAddress setLongitude( java.lang.Double longitude )
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
    public AccountPersonalAddress setPostcode( java.lang.String postcode )
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
    public AccountPersonalAddress setStreet( java.lang.String street )
    {
        this.street = street;
        return this;
    }

    @Override
    public AccountPersonalAddress set( String fieldName, Object value )
    {
        return ( AccountPersonalAddress ) super.set( fieldName, value );
    }

    @Override
    public AccountPersonalAddress clone()
    {
        return ( AccountPersonalAddress ) super.clone();
    }

}
