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
import biz.turnonline.ecosystem.steward.model.ContactCard;
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
 * The {@link ContactCard} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class ContactAdaptee
        extends AbstractGoogleClientAdaptee<Steward>
        implements RestExecutorAdaptee<ContactCard>, NewExecutorAdaptee<ContactCard>
{
    @Inject
    public ContactAdaptee( Steward client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier )
            throws IOException
    {
        Identifier child = identifier.child();
        String contactId;

        // contact identification might be either Long ID or String contact email
        if ( child.isLong() )
        {
            contactId = String.valueOf( child.getLong() );
        }
        else
        {
            contactId = child.getString();
        }

        return client().contacts().delete( identifier.getString(), contactId );
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
        Identifier child = identifier.child();
        String contactId;

        // contact identification might be either Long ID or String contact email
        if ( child.isLong() )
        {
            contactId = String.valueOf( child.getLong() );
        }
        else
        {
            contactId = child.getString();
        }

        return client().contacts().get( identifier.getString(), contactId );
    }

    @Override
    public ContactCard executeGet( @Nonnull Object request,
                                   @Nullable Map<String, Object> parameters,
                                   @Nullable Locale locale )
            throws IOException
    {
        return ( ContactCard ) execute( request, parameters );
    }

    @Override
    public Object prepareInsert( @Nonnull ContactCard resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        checkNotNull( parentKey, "Contact requires a login_email identification." );
        return client().contacts().insert( parentKey.getString(), resource );
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
        checkNotNull( parentKey, "Contact requires a login_email identification." );
        return client().contacts().list( parentKey.getString() );
    }

    @Override
    public List<ContactCard> executeList( @Nonnull Object request,
                                          @Nullable Map<String, Object> parameters,
                                          @Nullable Locale locale,
                                          @Nullable Integer offset,
                                          @Nullable Integer limit,
                                          @Nullable String orderBy,
                                          @Nullable Boolean ascending )
            throws IOException
    {
        Steward.Contacts.List list = ( Steward.Contacts.List ) request;
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
    public ContactCard executeNew( @Nonnull Object request,
                                   @Nullable Map<String, Object> parameters,
                                   @Nullable Locale locale )
    {
        return null;
    }

    @Override
    public Object prepareUpdate( @Nonnull ContactCard resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        Identifier child = identifier.child();
        String contactId;

        // contact identification might be either Long ID or String contact email
        if ( child.isLong() )
        {
            contactId = String.valueOf( child.getLong() );
        }
        else
        {
            contactId = child.getString();
        }

        return client().contacts().update( identifier.getString(), contactId, resource );
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
