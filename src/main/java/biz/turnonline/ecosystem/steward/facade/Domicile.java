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

package biz.turnonline.ecosystem.steward.facade;

import java.util.Locale;

import static biz.turnonline.ecosystem.steward.facade.Domicile.RoundingMode.HUNDREDTHS;
import static biz.turnonline.ecosystem.steward.facade.Domicile.RoundingMode.TENTHS;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The enumeration as a list of supported domicile.
 * Domicile as a country of company residence, Enum based on ISO 3166 alpha-2 country code.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public enum Domicile
{
    SK( new Locale( "sk", "SK" ), "EUR", HUNDREDTHS ),
    CZ( new Locale( "cs", "CZ" ), "CZK", TENTHS );

    private Locale locale;

    private String currency;

    private RoundingMode rounding;

    Domicile( Locale locale, String currency, RoundingMode rounding )
    {
        this.locale = checkNotNull( locale );
        this.currency = checkNotNull( currency );
        this.rounding = checkNotNull( rounding );
    }

    public static Domicile getDefault()
    {
        return SK;
    }

    /**
     * Returns the default locale for this domicile.
     *
     * @return the default locale
     */
    public Locale getLocale()
    {
        return locale;
    }

    /**
     * Returns domicile default currency alphabetic code based on the ISO 4217
     *
     * @return the domicile default currency alphabetic code
     */
    public String getCurrency()
    {
        return currency;
    }

    /**
     * Returns the default rounding mode for this domicile.
     *
     * @return the default rounding mode
     */
    public RoundingMode getRoundingMode()
    {
        return rounding;
    }

    /**
     * The rounding mode represented as enum.
     */
    public enum RoundingMode
    {
        THOUSANDTHS,
        HUNDREDTHS,
        TENTHS,
        ONES,
        TENS,
        HUNDREDS
    }
}