/*
 * Copyright (c) 2022 TurnOnline.biz s.r.o.
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
import biz.turnonline.ecosystem.steward.model.PickupPoint;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
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
 * The {@link PickupPoint} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class PickupPointAdaptee
        extends AbstractGoogleClientAdaptee<AccountSteward>
        implements ListExecutorAdaptee<PickupPoint>
{
    @Inject
    public PickupPointAdaptee( Provider<AccountSteward> client )
    {
        super( client );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey )
            throws IOException
    {
        checkNotNull( parentKey, "Listing pickup-points requires a login_id identification." );
        return client().accounts().pickup().list( parentKey.getString() );
    }

    @Override
    public List<PickupPoint> executeList( @Nonnull Object request,
                                          @Nullable Map<String, Object> parameters,
                                          @Nullable Locale locale,
                                          @Nullable Integer start,
                                          @Nullable Integer length,
                                          @Nullable String orderBy,
                                          @Nullable Boolean ascending )
            throws IOException
    {
        AccountSteward.Accounts.Pickup.List list = ( AccountSteward.Accounts.Pickup.List ) request;

        fill( request, parameters );
        return list.execute().getItems();
    }
}
