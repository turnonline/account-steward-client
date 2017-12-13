/*
 * Copyright 2017 Comvai, s.r.o.
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

public class AccountPublicContact
        implements Serializable
{
    private static final long serialVersionUID = -7077712293102504777L;

    private String email = null;

    private String name = null;

    private String phone = null;

    private String website = null;

    /**
     * The public contact email address.
     **/
    public AccountPublicContact email( String email )
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
     * The public contact person name.
     **/
    public AccountPublicContact name( String name )
    {
        this.name = name;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * The public contact phone number.
     **/
    public AccountPublicContact phone( String phone )
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

    /**
     * The account website.
     **/
    public AccountPublicContact website( String website )
    {
        this.website = website;
        return this;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite( String website )
    {
        this.website = website;
    }

    @Override
    public String toString()
    {
        return "class AccountPublicContact {\n" +
                "    email: " + toIndentedString( email ) + "\n" +
                "    name: " + toIndentedString( name ) + "\n" +
                "    phone: " + toIndentedString( phone ) + "\n" +
                "    website: " + toIndentedString( website ) + "\n" +
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

