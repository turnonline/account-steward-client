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

import biz.turnonline.ecosystem.steward.model.Account;
import biz.turnonline.ecosystem.steward.model.ContactCard;
import biz.turnonline.ecosystem.steward.model.Country;
import biz.turnonline.ecosystem.steward.model.Domain;
import biz.turnonline.ecosystem.steward.model.InvoicingConfig;
import biz.turnonline.ecosystem.steward.model.LegalForm;
import biz.turnonline.ecosystem.steward.model.NewsletterResponse;
import biz.turnonline.ecosystem.steward.model.NewsletterSubscription;
import biz.turnonline.ecosystem.steward.model.Uri;
import ma.glasnost.orika.MapperFactory;
import org.ctoolkit.restapi.client.adapter.BeanMapperConfig;

/**
 * The account management mapper configuration for orika.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class AccountStewardMapperConfig
        implements BeanMapperConfig
{
    @Override
    public void config( MapperFactory factory )
    {
        factory.classMap( Account.class, biz.turnonline.ecosystem.account.client.model.Account.class ).byDefault().register();
        factory.classMap( InvoicingConfig.class, biz.turnonline.ecosystem.account.client.model.InvoicingConfig.class ).byDefault().register();
        factory.classMap( Domain.class, biz.turnonline.ecosystem.account.client.model.Domain.class ).byDefault().register();
        factory.classMap( Uri.class, biz.turnonline.ecosystem.account.client.model.Uri.class ).byDefault().register();
        factory.classMap( ContactCard.class, biz.turnonline.ecosystem.account.client.model.ContactCard.class ).byDefault().register();
        factory.classMap( NewsletterSubscription.class, biz.turnonline.ecosystem.account.client.model.NewsletterSubscription.class ).byDefault().register();
        factory.classMap( NewsletterResponse.class, biz.turnonline.ecosystem.account.client.model.NewsletterResponse.class ).byDefault().register();
        factory.classMap( Country.class, biz.turnonline.ecosystem.account.client.model.Country.class ).byDefault().register();
        factory.classMap( LegalForm.class, biz.turnonline.ecosystem.account.client.model.LegalForm.class ).byDefault().register();
    }
}
