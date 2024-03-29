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
 * on 2022-05-04 at 21:49:23 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.steward.model;

import java.io.Serializable;

/**
 * Model definition for PickupPointPhotos.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Account Steward. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class PickupPointPhotos
        implements Serializable
{
    private static final long serialVersionUID = 6622814366252329890L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String normal;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String thumbnail;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getNormal()
    {
        return normal;
    }

    /**
     * @param normal normal or {@code null} for none
     */
    public PickupPointPhotos setNormal( java.lang.String normal )
    {
        this.normal = normal;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getThumbnail()
    {
        return thumbnail;
    }

    /**
     * @param thumbnail thumbnail or {@code null} for none
     */
    public PickupPointPhotos setThumbnail( java.lang.String thumbnail )
    {
        this.thumbnail = thumbnail;
        return this;
    }
}
