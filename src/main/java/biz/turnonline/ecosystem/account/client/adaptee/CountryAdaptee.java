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
import biz.turnonline.ecosystem.accountManagement.model.Country;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGetExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The {@link Country} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class CountryAdaptee
        extends AbstractGetExecutorAdaptee<AccountManagement, Country>
        implements ListExecutorAdaptee<Country>
{
    @Inject
    public CountryAdaptee( AccountManagement client )
    {
        super( client );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier )
            throws IOException
    {
        return client().countries().get( identifier.getString() );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey )
            throws IOException
    {
        return client().countries().list();
    }

    @Override
    public List<Country> executeList( @Nonnull Object request,
                                      @Nullable Map<String, Object> parameters,
                                      @Nullable Locale locale,
                                      @Nullable Integer start,
                                      @Nullable Integer length,
                                      @Nullable String orderBy,
                                      @Nullable Boolean ascending )
            throws IOException
    {
        AccountManagement.Countries.List list = ( AccountManagement.Countries.List ) request;

        fill( request, parameters );
        return list.execute().getItems();
    }
}
