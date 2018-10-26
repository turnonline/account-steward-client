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
 * on 2018-10-26 at 13:28:43 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.steward.model;

import java.io.Serializable;

/**
 * Model definition for InvoicingConfig.
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
public final class InvoicingConfig
        extends com.google.api.client.json.GenericJson
        implements Serializable
{
    private static final long serialVersionUID = -218120443476626260L;

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
    private java.lang.Boolean hasBillingAddress;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer numberOfDays;

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
