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
import biz.turnonline.ecosystem.steward.model.Domain;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
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
 * The {@link Domain} adaptee implementation.
 * Supported operations:
 * <ul>
 * <li>Insert (POST)</li>
 * <li>Retrieval (GET)</li>
 * <li>List retrieval (GET)</li>
 * <li>Delete (DELETE)</li>
 * </ul>
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class DomainAdaptee
        extends AbstractGoogleClientAdaptee<AccountSteward>
        implements InsertExecutorAdaptee<Domain>, GetExecutorAdaptee<Domain>,
        ListExecutorAdaptee<Domain>, DeleteExecutorAdaptee<Domain>
{
    @Inject
    public DomainAdaptee( Provider<AccountSteward> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        return client().domains().delete( identifier.getString(), identifier.child().getString() );
    }

    @Override
    public Object executeDelete( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier ) throws IOException
    {
        return client().domains().get( identifier.getString(), identifier.child().getString() );
    }

    @Override
    public Domain executeGet( @Nonnull Object request,
                              @Nullable Map<String, Object> parameters,
                              @Nullable Locale locale ) throws IOException
    {
        return ( Domain ) execute( request, parameters );
    }

    @Override
    public Object prepareInsert( @Nonnull Domain resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        checkNotNull( parentKey, "Domain requires a login_email identification." );
        return client().domains().insert( parentKey.getString(), resource );
    }

    @Override
    public Object executeInsert( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        checkNotNull( parentKey, "Listing domains requires a login_email identification." );
        return client().domains().list( parentKey.getString() );
    }

    @Override
    public List<Domain> executeList( @Nonnull Object request,
                                     @Nullable Map<String, Object> parameters,
                                     @Nullable Locale locale,
                                     @Nullable Integer offset,
                                     @Nullable Integer limit,
                                     @Nullable String orderBy,
                                     @Nullable Boolean ascending ) throws IOException
    {
        AccountSteward.Domains.List list = ( AccountSteward.Domains.List ) request;
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
}
