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
 * (build: 1969-12-31 23:59:59 UTC)
 * on 2021-01-08 at 14:43:10 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.steward.model;

/**
 * Model definition for InvoicingConfig.
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
public final class InvoicingConfig
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private InvoicingConfigBillingAddress billingAddress;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private InvoicingConfigBillingContact billingContact;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String finalText;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean hasBillingAddress;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String introductoryText;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime modificationDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer numberOfDays;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Image stamp;

    /**
     * @return value or {@code null} for none
     */
    public InvoicingConfigBillingAddress getBillingAddress()
    {
        return billingAddress;
    }

    /**
     * @param billingAddress billingAddress or {@code null} for none
     */
    public InvoicingConfig setBillingAddress( InvoicingConfigBillingAddress billingAddress )
    {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public InvoicingConfigBillingContact getBillingContact()
    {
        return billingContact;
    }

    /**
     * @param billingContact billingContact or {@code null} for none
     */
    public InvoicingConfig setBillingContact( InvoicingConfigBillingContact billingContact )
    {
        this.billingContact = billingContact;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCurrency()
    {
        return currency;
    }

    /**
     * @param currency currency or {@code null} for none
     */
    public InvoicingConfig setCurrency( java.lang.String currency )
    {
        this.currency = currency;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFinalText()
    {
        return finalText;
    }

    /**
     * @param finalText finalText or {@code null} for none
     */
    public InvoicingConfig setFinalText( java.lang.String finalText )
    {
        this.finalText = finalText;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getHasBillingAddress()
    {
        return hasBillingAddress;
    }

    /**
     * @param hasBillingAddress hasBillingAddress or {@code null} for none
     */
    public InvoicingConfig setHasBillingAddress( java.lang.Boolean hasBillingAddress )
    {
        this.hasBillingAddress = hasBillingAddress;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getIntroductoryText()
    {
        return introductoryText;
    }

    /**
     * @param introductoryText introductoryText or {@code null} for none
     */
    public InvoicingConfig setIntroductoryText( java.lang.String introductoryText )
    {
        this.introductoryText = introductoryText;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getModificationDate()
    {
        return modificationDate;
    }

    /**
     * @param modificationDate modificationDate or {@code null} for none
     */
    public InvoicingConfig setModificationDate( com.google.api.client.util.DateTime modificationDate )
    {
        this.modificationDate = modificationDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getNumberOfDays()
    {
        return numberOfDays;
    }

    /**
     * @param numberOfDays numberOfDays or {@code null} for none
     */
    public InvoicingConfig setNumberOfDays( java.lang.Integer numberOfDays )
    {
        this.numberOfDays = numberOfDays;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Image getStamp()
    {
        return stamp;
    }

    /**
     * @param stamp stamp or {@code null} for none
     */
    public InvoicingConfig setStamp( Image stamp )
    {
        this.stamp = stamp;
        return this;
    }

    @Override
    public InvoicingConfig set( String fieldName, Object value )
    {
        return ( InvoicingConfig ) super.set( fieldName, value );
    }

    @Override
    public InvoicingConfig clone()
    {
        return ( InvoicingConfig ) super.clone();
    }

}
