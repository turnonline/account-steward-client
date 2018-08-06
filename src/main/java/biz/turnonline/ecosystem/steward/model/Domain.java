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
 * on 2018-08-05 at 18:06:31 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.steward.model;

/**
 * Model definition for Domain.
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
public final class Domain
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String domain;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String subdomain;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String uri;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDomain()
    {
        return domain;
    }

    /**
     * @param domain domain or {@code null} for none
     */
    public Domain setDomain( java.lang.String domain )
    {
        this.domain = domain;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getName()
    {
        return name;
    }

    /**
     * @param name name or {@code null} for none
     */
    public Domain setName( java.lang.String name )
    {
        this.name = name;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSubdomain()
    {
        return subdomain;
    }

    /**
     * @param subdomain subdomain or {@code null} for none
     */
    public Domain setSubdomain( java.lang.String subdomain )
    {
        this.subdomain = subdomain;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUri()
    {
        return uri;
    }

    /**
     * @param uri uri or {@code null} for none
     */
    public Domain setUri( java.lang.String uri )
    {
        this.uri = uri;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl()
    {
        return url;
    }

    /**
     * @param url url or {@code null} for none
     */
    public Domain setUrl( java.lang.String url )
    {
        this.url = url;
        return this;
    }

    @Override
    public Domain set( String fieldName, Object value )
    {
        return ( Domain ) super.set( fieldName, value );
    }

    @Override
    public Domain clone()
    {
        return ( Domain ) super.clone();
    }

}
