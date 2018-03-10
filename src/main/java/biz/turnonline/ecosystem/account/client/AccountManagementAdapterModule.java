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

package biz.turnonline.ecosystem.account.client;

import biz.turnonline.ecosystem.account.client.adaptee.AccountAdaptee;
import biz.turnonline.ecosystem.account.client.adaptee.ContactAdaptee;
import biz.turnonline.ecosystem.account.client.adaptee.CountryAdaptee;
import biz.turnonline.ecosystem.account.client.adaptee.LegalFormAdaptee;
import biz.turnonline.ecosystem.accountManagement.model.Account;
import biz.turnonline.ecosystem.accountManagement.model.ContactCard;
import biz.turnonline.ecosystem.accountManagement.model.Country;
import biz.turnonline.ecosystem.accountManagement.model.LegalForm;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.multibindings.Multibinder;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.NewExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.BeanMapperConfig;

import javax.inject.Singleton;

/**
 * The account management guice default adaptee configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class AccountManagementAdapterModule
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

        Multibinder<BeanMapperConfig> multibinder = Multibinder.newSetBinder( binder(), BeanMapperConfig.class );
        multibinder.addBinding().to( AccountManagementMapperConfig.class ).in( Singleton.class );
    }
}
