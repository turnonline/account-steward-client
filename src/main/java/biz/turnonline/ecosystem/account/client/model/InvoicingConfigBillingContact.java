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

public class InvoicingConfigBillingContact
        implements Serializable
{
    private static final long serialVersionUID = 7997256007405427518L;

    private String email = null;

    private String prefix = null;

    private String firstName = null;

    private String middleName = null;

    private String lastName = null;

    private String suffix = null;

    private String phone = null;

    /**
     * The billing contact email.
     **/
    public InvoicingConfigBillingContact email( String email )
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
     * The billing contact, name prefix.
     **/
    public InvoicingConfigBillingContact prefix( String prefix )
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
     * The billing contact, first name.
     **/
    public InvoicingConfigBillingContact firstName( String firstName )
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
     * The billing contact, middle name.
     **/
    public InvoicingConfigBillingContact middleName( String middleName )
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
     * The billing contact, last name.
     **/
    public InvoicingConfigBillingContact lastName( String lastName )
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
     * The billing contact, name suffix.
     **/
    public InvoicingConfigBillingContact suffix( String suffix )
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
     * The billing contact, phone number.
     **/
    public InvoicingConfigBillingContact phone( String phone )
    {
        this.phone = phone;
        return this;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone( String phone )
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return "class InvoicingConfigBillingContact {\n" +
                "    email: " + toIndentedString( email ) + "\n" +
                "    prefix: " + toIndentedString( prefix ) + "\n" +
                "    firstName: " + toIndentedString( firstName ) + "\n" +
                "    middleName: " + toIndentedString( middleName ) + "\n" +
                "    lastName: " + toIndentedString( lastName ) + "\n" +
                "    suffix: " + toIndentedString( suffix ) + "\n" +
                "    phone: " + toIndentedString( phone ) + "\n" +
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

