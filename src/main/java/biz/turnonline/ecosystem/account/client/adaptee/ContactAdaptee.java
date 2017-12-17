/*
 * Copyright 2017 Comvai, s.r.o.
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

import biz.turnonline.ecosystem.accountManagement.AccountManagement;
import biz.turnonline.ecosystem.accountManagement.model.ContactCard;
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

/**
 * The {@link ContactCard} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class ContactAdaptee
        extends AbstractGoogleClientAdaptee<AccountManagement>
        implements RestExecutorAdaptee<ContactCard>, NewExecutorAdaptee<ContactCard>
{
    @Inject
    public ContactAdaptee( AccountManagement client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier )
            throws IOException
    {
        return client().contacts().delete( identifier.getLong() );
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
        return client().contacts().get( identifier.getLong() );
    }

    @Override
    public ContactCard executeGet( @Nonnull Object request,
                                   @Nullable Map<String, Object> parameters,
                                   @Nullable Locale locale )
            throws IOException
    {
        return ContactCard.class.cast( execute( request, parameters ) );
    }

    @Override
    public Object prepareInsert( @Nonnull ContactCard resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        return client().contacts().insert( resource );
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
        return client().contacts().list();
    }

    @Override
    public List<ContactCard> executeList( @Nonnull Object request,
                                          @Nullable Map<String, Object> parameters,
                                          @Nullable Locale locale,
                                          @Nullable Integer start,
                                          @Nullable Integer length,
                                          @Nullable String orderBy,
                                          @Nullable Boolean ascending )
            throws IOException
    {
        AccountManagement.Contacts.List list = ( AccountManagement.Contacts.List ) request;
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
    public ContactCard executeNew( @Nonnull Object request,
                                   @Nullable Map<String, Object> parameters,
                                   @Nullable Locale locale )
            throws IOException
    {
        return null;
    }

    @Override
    public Object prepareUpdate( @Nonnull ContactCard resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        return client().contacts().update( identifier.getLong(), resource );
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
