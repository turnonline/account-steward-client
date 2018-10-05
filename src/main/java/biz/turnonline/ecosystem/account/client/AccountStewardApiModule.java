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

package biz.turnonline.ecosystem.account.client;

import biz.turnonline.ecosystem.steward.Steward;
import biz.turnonline.ecosystem.steward.StewardScopes;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.ctoolkit.restapi.client.AccessToken;
import org.ctoolkit.restapi.client.ApiToken;
import org.ctoolkit.restapi.client.RemoteServerErrorException;
import org.ctoolkit.restapi.client.UnauthorizedException;
import org.ctoolkit.restapi.client.googleapis.GoogleApiProxyFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Set;

/**
 * The Account &amp; Contact Management Java Client guice module default configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class AccountStewardApiModule
        extends AbstractModule
{
    public static final String API_PREFIX = "account";

    private static final Logger logger = LoggerFactory.getLogger( AccountStewardApiModule.class );

    private ApiToken<? extends HttpRequestInitializer> initialized;

    @Override
    protected void configure()
    {
    }

    @Provides
    @Singleton
    Steward provideAccountManagement( GoogleApiProxyFactory factory )
    {
        Set<String> scopes = StewardScopes.all();
        Steward.Builder builder;

        try
        {
            initialized = factory.authorize( scopes, null, API_PREFIX );
            HttpRequestInitializer credential = initialized.getCredential();
            builder = new Steward.Builder( factory.getHttpTransport(), factory.getJsonFactory(), credential );
            builder.setApplicationName( factory.getApplicationName( API_PREFIX ) );
        }
        catch ( GeneralSecurityException e )
        {
            logger.error( "Failed. Scopes: " + scopes.toString()
                    + " Application name: " + factory.getApplicationName( API_PREFIX )
                    + " Service account: " + factory.getServiceAccountEmail( API_PREFIX ), e );
            throw new UnauthorizedException( e.getMessage() );
        }
        catch ( IOException e )
        {
            logger.error( "Failed. Scopes: " + scopes.toString()
                    + " Application name: " + factory.getApplicationName( API_PREFIX )
                    + " Service account: " + factory.getServiceAccountEmail( API_PREFIX ), e );

            throw new RemoteServerErrorException( e.getMessage() );
        }

        return builder.build();
    }

    @Provides
    @AccessToken( apiName = API_PREFIX )
    ApiToken.Data provideAccountManagementTokenData( Steward client )
    {
        initialized.setServiceUrl( client.getBaseUrl() );
        return initialized.getTokenData();
    }
}
