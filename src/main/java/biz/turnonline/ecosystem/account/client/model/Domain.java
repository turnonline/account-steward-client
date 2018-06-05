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
import java.util.Objects;

/**
 * The domain as a representation where a certain product will be publicly available.
 **/
public class Domain
        implements Serializable
{
    private static final long serialVersionUID = 3496527404465225613L;

    private String name = null;

    private String domain = null;

    private String subdomain = null;

    private String uri = null;

    private String url = null;

    /**
     * The name that represents an unique domain specification. Assembled by the service based on Domain resource input.
     **/
    public Domain name( String name )
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
     * The domain unique across the globe. As a composition of the domain name and TLD. It will always be saved in lowercase letters. In case the domain property is being provided together with subdomain (can be provided even as an URL), only the naked domain part will be accepted for this property.
     **/
    public Domain domain( String domain )
    {
        this.domain = domain;
        return this;
    }

    public String getDomain()
    {
        return domain;
    }

    public void setDomain( String domain )
    {
        this.domain = domain;
    }

    /**
     * The optional sub-domain. If missing, this Domain represents a naked domain. It will always be saved in lowercase letters.
     **/
    public Domain subdomain( String subdomain )
    {
        this.subdomain = subdomain;
        return this;
    }

    public String getSubdomain()
    {
        return subdomain;
    }

    public void setSubdomain( String subdomain )
    {
        this.subdomain = subdomain;
    }

    /**
     * The optional path of a product (slash \"/\" prefix will be ignored). It will always be saved in lowercase letters.
     **/
    public Domain uri( String uri )
    {
        this.uri = uri;
        return this;
    }

    public String getUri()
    {
        return uri;
    }

    public void setUri( String uri )
    {
        this.uri = uri;
    }

    /**
     * The final URL, rendered by the service.
     **/
    public Domain url( String url )
    {
        this.url = url;
        return this;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }


    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }
        Domain domain = ( Domain ) o;
        return Objects.equals( name, domain.name );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( name );
    }

    @Override
    public String toString()
    {
        return "class Domain {\n" +
                "    name: " + toIndentedString( name ) + "\n" +
                "    domain: " + toIndentedString( domain ) + "\n" +
                "    subdomain: " + toIndentedString( subdomain ) + "\n" +
                "    uri: " + toIndentedString( uri ) + "\n" +
                "    url: " + toIndentedString( url ) + "\n" +
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

