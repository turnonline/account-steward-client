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


/**
 * The set of account default invoicing rules. These values might be overriden.
 **/
public class InvoicingConfig
        implements Serializable
{
    private static final long serialVersionUID = -8876402491700375465L;

    private String currency = null;

    private Integer numberOfDays = 14;

    private Boolean hasBillingAddress = false;

    private InvoicingConfigBillingAddress billingAddress = null;

    private InvoicingConfigBillingContact billingContact = null;

    /**
     * The currency code (alphabetic code) based on the ISO 4217. If not set, the country default will be set.
     **/
    public InvoicingConfig currency( String currency )
    {
        this.currency = currency;
        return this;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }

    /**
     * The default value of number of days for calculation of the invoice due date.
     **/
    public InvoicingConfig numberOfDays( Integer numberOfDays )
    {
        this.numberOfDays = numberOfDays;
        return this;
    }


    public Integer getNumberOfDays()
    {
        return numberOfDays;
    }

    public void setNumberOfDays( Integer numberOfDays )
    {
        this.numberOfDays = numberOfDays;
    }

    /**
     * If true, the billing address is not same as the company address and must be provided.
     **/
    public InvoicingConfig hasBillingAddress( Boolean hasBillingAddress )
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
     * The billing address details. The address is being ignored until property “hasBillingAddress” is set to true.
     **/
    public InvoicingConfig billingAddress( InvoicingConfigBillingAddress billingAddress )
    {
        this.billingAddress = billingAddress;
        return this;
    }

    public InvoicingConfigBillingAddress getBillingAddress()
    {
        return billingAddress;
    }

    public void setBillingAddress( InvoicingConfigBillingAddress billingAddress )
    {
        this.billingAddress = billingAddress;
    }

    /**
     * The contact person related to billing. It might be presented at invoice or in email communication related to billing.
     **/
    public InvoicingConfig billingContact( InvoicingConfigBillingContact billingContact )
    {
        this.billingContact = billingContact;
        return this;
    }

    public InvoicingConfigBillingContact getBillingContact()
    {
        return billingContact;
    }

    public void setBillingContact( InvoicingConfigBillingContact billingContact )
    {
        this.billingContact = billingContact;
    }

    @Override
    public String toString()
    {
        return "class InvoicingConfig {\n" +
                "    currency: " + toIndentedString( currency ) + "\n" +
                "    numberOfDays: " + toIndentedString( numberOfDays ) + "\n" +
                "    hasBillingAddress: " + toIndentedString( hasBillingAddress ) + "\n" +
                "    billingAddress: " + toIndentedString( billingAddress ) + "\n" +
                "    billingContact: " + toIndentedString( billingContact ) + "\n" +
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

