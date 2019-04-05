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

import biz.turnonline.ecosystem.steward.AccountSteward;
import com.google.inject.AbstractModule;

/**
 * The Account &amp; Contact Management Java Client guice module default configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class AccountStewardClientModule
        extends AbstractModule
{
    public static final String API_PREFIX = "account";

    @Override
    protected void configure()
    {
        bind( AccountSteward.class ).toProvider( AccountStewardProvider.class );
    }
}
