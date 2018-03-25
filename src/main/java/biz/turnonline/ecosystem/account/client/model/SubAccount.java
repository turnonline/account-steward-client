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
 * The definition of the associated email to the main account. The sub accounts are available only for company accounts.
 **/
public class SubAccount
        implements Serializable
{
    private static final long serialVersionUID = -5959015671363480427L;

    private String email = null;

    private String role = "DEPUTY_STANDARD";

    private String prefix = null;

    private String locale = null;

    private String firstName = null;

    private String middleName = null;

    private String lastName = null;

    private String suffix = null;

    /**
     * The email associated with the account.
     **/
    public SubAccount email( String email )
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
     * The role of the user that logs in with associated email.
     **/
    public SubAccount role( String role )
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
     * The name prefix.
     **/
    public SubAccount prefix( String prefix )
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
     * The preferred language of the associated account. ISO 639 alpha-2 or alpha-3 language code. If not configured the value from the parent account will be set.
     **/
    public SubAccount locale( String locale )
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
     * The first name of the person with access to the parent account.
     **/
    public SubAccount firstName( String firstName )
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
     * The middle name of the person with access to the parent account.
     **/
    public SubAccount middleName( String middleName )
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
     * The last name of the person with access to the parent account.
     **/
    public SubAccount lastName( String lastName )
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
     * The name suffix.
     **/
    public SubAccount suffix( String suffix )
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


    @Override
    public String toString()
    {
        return "class SubAccount {\n" +
                "    email: " + toIndentedString( email ) + "\n" +
                "    role: " + toIndentedString( role ) + "\n" +
                "    prefix: " + toIndentedString( prefix ) + "\n" +
                "    locale: " + toIndentedString( locale ) + "\n" +
                "    firstName: " + toIndentedString( firstName ) + "\n" +
                "    middleName: " + toIndentedString( middleName ) + "\n" +
                "    lastName: " + toIndentedString( lastName ) + "\n" +
                "    suffix: " + toIndentedString( suffix ) + "\n" +
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

