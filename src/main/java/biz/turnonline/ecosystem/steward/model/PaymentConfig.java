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

import java.io.Serializable;

/**
 * Model definition for PaymentConfig.
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
public final class PaymentConfig
        implements Serializable
{
    private static final long serialVersionUID = 5953716489788708521L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Stripe stripe;

    /**
     * @return value or {@code null} for none
     */
    public Stripe getStripe()
    {
        return stripe;
    }

    /**
     * @param stripe stripe or {@code null} for none
     */
    public PaymentConfig setStripe( Stripe stripe )
    {
        this.stripe = stripe;
        return this;
    }
}
