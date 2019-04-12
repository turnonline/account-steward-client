/*
 * Copyright (c) 2019 Comvai, s.r.o.
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
import biz.turnonline.ecosystem.steward.AccountStewardScopes;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.common.base.Strings;
import org.ctoolkit.restapi.client.adapter.ClientApiProvider;
import org.ctoolkit.restapi.client.adapter.GoogleApiProxyFactory;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collection;

import static biz.turnonline.ecosystem.steward.facade.AccountStewardClientModule.API_PREFIX;

/**
 * The {@link AccountSteward} API client implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
class AccountStewardProvider
        extends ClientApiProvider<AccountSteward>
{
    @Inject
    AccountStewardProvider( @Nonnull GoogleApiProxyFactory factory )
    {
        super( factory );
    }

    @Override
    protected Collection<String> defaultScopes()
    {
        return AccountStewardScopes.all();
    }

    @Override
    protected String api()
    {
        return API_PREFIX;
    }

    @Override
    protected AccountSteward build( @Nonnull GoogleApiProxyFactory factory,
                                    @Nonnull HttpTransport transport,
                                    @Nonnull JsonFactory jsonFactory,
                                    @Nonnull HttpRequestInitializer credential,
                                    @Nonnull String api )
    {
        String applicationName = factory.getApplicationName( api );
        String endpointUrl = factory.getEndpointUrl( api );

        AccountSteward.Builder builder = new AccountSteward.Builder( transport, jsonFactory, credential );
        builder.setApplicationName( applicationName );

        if ( !Strings.isNullOrEmpty( endpointUrl ) )
        {
            builder.setRootUrl( endpointUrl );
        }

        return builder.build();
    }
}
