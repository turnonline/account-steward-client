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

package biz.turnonline.ecosystem.steward.facade;

import biz.turnonline.ecosystem.steward.facade.adaptee.AccountAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.ContactAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.CountryAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.DeputyAccountAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.DomainAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.DomainUriAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.InvoicingAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.LegalFormAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.NewsletterAdaptee;
import biz.turnonline.ecosystem.steward.facade.adaptee.PickupPointAdaptee;
import biz.turnonline.ecosystem.steward.model.Account;
import biz.turnonline.ecosystem.steward.model.ContactCard;
import biz.turnonline.ecosystem.steward.model.Country;
import biz.turnonline.ecosystem.steward.model.DeputyAccount;
import biz.turnonline.ecosystem.steward.model.Domain;
import biz.turnonline.ecosystem.steward.model.InvoicingConfig;
import biz.turnonline.ecosystem.steward.model.LegalForm;
import biz.turnonline.ecosystem.steward.model.NewsletterSubscription;
import biz.turnonline.ecosystem.steward.model.PickupPoint;
import biz.turnonline.ecosystem.steward.model.PreferredPickupPoint;
import biz.turnonline.ecosystem.steward.model.Uri;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.NewExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;

/**
 * The account management guice default adaptee configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class AccountStewardAdapterModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        // Account adaptee
        bind( new TypeLiteral<GetExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        bind( new TypeLiteral<NewExecutorAdaptee<Account>>()
        {
        } ).to( AccountAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<PickupPoint>>()
        {
        } ).to( PickupPointAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<PreferredPickupPoint>>()
        {
        } ).to( PickupPointAdaptee.class );

        // Deputy account adaptee
        bind( new TypeLiteral<GetExecutorAdaptee<DeputyAccount>>()
        {
        } ).to( DeputyAccountAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<DeputyAccount>>()
        {
        } ).to( DeputyAccountAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<DeputyAccount>>()
        {
        } ).to( DeputyAccountAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<DeputyAccount>>()
        {
        } ).to( DeputyAccountAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<DeputyAccount>>()
        {
        } ).to( DeputyAccountAdaptee.class );

        bind( new TypeLiteral<NewExecutorAdaptee<DeputyAccount>>()
        {
        } ).to( DeputyAccountAdaptee.class );

        // invoicing config adaptee
        bind( new TypeLiteral<GetExecutorAdaptee<InvoicingConfig>>()
        {
        } ).to( InvoicingAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<InvoicingConfig>>()
        {
        } ).to( InvoicingAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<InvoicingConfig>>()
        {
        } ).to( InvoicingAdaptee.class );

        // Domain adaptee
        bind( new TypeLiteral<InsertExecutorAdaptee<Domain>>()
        {
        } ).to( DomainAdaptee.class );

        bind( new TypeLiteral<GetExecutorAdaptee<Domain>>()
        {
        } ).to( DomainAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Domain>>()
        {
        } ).to( DomainAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Domain>>()
        {
        } ).to( DomainAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<Uri>>()
        {
        } ).to( DomainUriAdaptee.class );

        // ContactCard adaptee
        bind( new TypeLiteral<GetExecutorAdaptee<ContactCard>>()
        {
        } ).to( ContactAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<ContactCard>>()
        {
        } ).to( ContactAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<ContactCard>>()
        {
        } ).to( ContactAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<ContactCard>>()
        {
        } ).to( ContactAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<ContactCard>>()
        {
        } ).to( ContactAdaptee.class );

        bind( new TypeLiteral<NewExecutorAdaptee<ContactCard>>()
        {
        } ).to( ContactAdaptee.class );

        // Newsletter
        bind( new TypeLiteral<UpdateExecutorAdaptee<NewsletterSubscription>>()
        {
        } ).to( NewsletterAdaptee.class );

        // Country adaptee
        bind( new TypeLiteral<GetExecutorAdaptee<Country>>()
        {
        } ).to( CountryAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Country>>()
        {
        } ).to( CountryAdaptee.class );

        // Legal form adaptee
        bind( new TypeLiteral<GetExecutorAdaptee<LegalForm>>()
        {
        } ).to( LegalFormAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<LegalForm>>()
        {
        } ).to( LegalFormAdaptee.class );
    }
}
