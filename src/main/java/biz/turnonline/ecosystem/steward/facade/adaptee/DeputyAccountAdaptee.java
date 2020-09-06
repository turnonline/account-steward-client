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

package biz.turnonline.ecosystem.steward.facade.adaptee;

import biz.turnonline.ecosystem.steward.AccountSteward;
import biz.turnonline.ecosystem.steward.model.DeputyAccount;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adaptee.NewExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.RestExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The {@link DeputyAccount} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class DeputyAccountAdaptee
        extends AbstractGoogleClientAdaptee<AccountSteward>
        implements RestExecutorAdaptee<DeputyAccount>, NewExecutorAdaptee<DeputyAccount>
{
    @Inject
    public DeputyAccountAdaptee( Provider<AccountSteward> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier )
            throws IOException
    {
        return client().accounts().sub().delete( identifier.getString(), identifier.child().getString() );
    }

    @Override
    public Object executeDelete( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale )
            throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier )
            throws IOException
    {
        return client().accounts().sub().get( identifier.getString(), identifier.child().getString() );
    }

    @Override
    public DeputyAccount executeGet( @Nonnull Object request,
                                     @Nullable Map<String, Object> parameters,
                                     @Nullable Locale locale )
            throws IOException
    {
        return ( DeputyAccount ) execute( request, parameters );
    }

    @Override
    public Object prepareInsert( @Nonnull DeputyAccount resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        String errorMessage = "Deputy account insert requires login email as a parent key.";
        checkNotNull( parentKey, errorMessage );
        checkNotNull( parentKey.getString(), errorMessage );

        return client().accounts().sub().insert( parentKey.getString(), resource );
    }

    @Override
    public Object executeInsert( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale )
            throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey )
            throws IOException
    {
        String errorMessage = "Deputy account list retrieval requires login email as a parent key.";
        checkNotNull( parentKey, errorMessage );
        checkNotNull( parentKey.getString(), errorMessage );

        return client().accounts().sub().list( parentKey.getString() );
    }

    @Override
    public List<DeputyAccount> executeList( @Nonnull Object request,
                                            @Nullable Map<String, Object> parameters,
                                            @Nullable Locale locale,
                                            @Nullable Integer offset,
                                            @Nullable Integer limit,
                                            @Nullable String orderBy,
                                            @Nullable Boolean ascending )
            throws IOException
    {
        AccountSteward.Accounts.Sub.List list = ( AccountSteward.Accounts.Sub.List ) request;
        if ( offset != null && offset > 0 )
        {
            list.setOffset( offset );
        }
        if ( limit != null && limit > 0 )
        {
            list.setLimit( limit );
        }

        fill( request, parameters );
        return list.execute().getItems();
    }

    @Override
    public Object prepareNew( @Nullable String type )
    {
        return null;
    }

    @Override
    public DeputyAccount executeNew( @Nonnull Object request,
                                     @Nullable Map<String, Object> parameters,
                                     @Nullable Locale locale )
    {
        return null;
    }

    @Override
    public Object prepareUpdate( @Nonnull DeputyAccount resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        return client().accounts().sub().update( identifier.getString(), identifier.child().getString(), resource );
    }

    @Override
    public Object executeUpdate( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale )
            throws IOException
    {
        return execute( request, parameters );
    }
}
