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

import biz.turnonline.ecosystem.steward.Steward;
import biz.turnonline.ecosystem.steward.model.Uri;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractInsertExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.IOException;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The {@link Uri} adaptee implementation.
 * Supported operations:
 * <ul>
 * <li>Insert (POST)</li>
 * </ul>
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class DomainUriAdaptee
        extends AbstractInsertExecutorAdaptee<Steward, Uri>
{
    @Inject
    public DomainUriAdaptee( Steward client )
    {
        super( client );
    }

    @Override
    public Object prepareInsert( @Nonnull Uri resource,
                                 @Nullable Identifier id,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        checkNotNull( id, "New domain URI requires a login_email as identification." );
        checkNotNull( id.child(), "New domain URI requires a hostname as identification." );
        return client().domains().uri().insert( id.getString(), id.child().getString(), resource );
    }
}
