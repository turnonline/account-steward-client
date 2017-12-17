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
import biz.turnonline.ecosystem.accountManagement.model.LegalForm;
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
 * The {@link LegalForm} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class LegalFormAdaptee
        extends AbstractGetExecutorAdaptee<AccountManagement, LegalForm>
        implements ListExecutorAdaptee<LegalForm>
{
    @Inject
    public LegalFormAdaptee( AccountManagement client )
    {
        super( client );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier )
            throws IOException
    {
        return client().legalforms().get( identifier.getString() );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey )
            throws IOException
    {
        return client().legalforms().list();
    }

    @Override
    public List<LegalForm> executeList( @Nonnull Object request,
                                        @Nullable Map<String, Object> parameters,
                                        @Nullable Locale locale,
                                        @Nullable Integer start,
                                        @Nullable Integer length,
                                        @Nullable String orderBy,
                                        @Nullable Boolean ascending )
            throws IOException
    {
        AccountManagement.Legalforms.List list = ( AccountManagement.Legalforms.List ) request;

        fill( request, parameters );
        return list.execute().getItems();
    }
}
