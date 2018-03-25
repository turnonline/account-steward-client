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

package biz.turnonline.ecosystem.account.client.adaptee;

import biz.turnonline.ecosystem.steward.Steward;
import biz.turnonline.ecosystem.steward.model.SubAccount;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adaptee.NewExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.RestExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The {@link SubAccount} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class SubAccountAdaptee
        extends AbstractGoogleClientAdaptee<Steward>
        implements RestExecutorAdaptee<SubAccount>, NewExecutorAdaptee<SubAccount>
{
    @Inject
    public SubAccountAdaptee( Steward client )
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
    public void executeDelete( @Nonnull Object request,
                               @Nullable Map<String, Object> parameters,
                               @Nullable Locale locale )
            throws IOException
    {
        execute( request, parameters );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier )
            throws IOException
    {
        return client().accounts().sub().get( identifier.getString(), identifier.child().getString() );
    }

    @Override
    public SubAccount executeGet( @Nonnull Object request,
                                  @Nullable Map<String, Object> parameters,
                                  @Nullable Locale locale )
            throws IOException
    {
        return SubAccount.class.cast( execute( request, parameters ) );
    }

    @Override
    public Object prepareInsert( @Nonnull SubAccount resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        String errorMessage = "Sub account insert requires login email as a parent key.";
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
        String errorMessage = "Sub account list retrieval requires login email as a parent key.";
        checkNotNull( parentKey, errorMessage );
        checkNotNull( parentKey.getString(), errorMessage );

        return client().accounts().sub().list( parentKey.getString() );
    }

    @Override
    public List<SubAccount> executeList( @Nonnull Object request,
                                         @Nullable Map<String, Object> parameters,
                                         @Nullable Locale locale,
                                         @Nullable Integer start,
                                         @Nullable Integer length,
                                         @Nullable String orderBy,
                                         @Nullable Boolean ascending )
            throws IOException
    {
        Steward.Accounts.Sub.List list = ( Steward.Accounts.Sub.List ) request;
        if ( start != null && start > 0 )
        {
            list.setStart( start );
        }
        if ( length != null && length > 0 )
        {
            list.setLength( length );
        }

        fill( request, parameters );
        return list.execute().getItems();
    }

    @Override
    public Object prepareNew( @Nullable String type )
            throws IOException
    {
        return null;
    }

    @Override
    public SubAccount executeNew( @Nonnull Object request,
                                  @Nullable Map<String, Object> parameters,
                                  @Nullable Locale locale )
            throws IOException
    {
        return null;
    }

    @Override
    public Object prepareUpdate( @Nonnull SubAccount resource,
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
