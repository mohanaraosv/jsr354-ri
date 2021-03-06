/*
Copyright (c) 2012, 2018, Anatole Tresch, Werner Keil and others by the @author tag.

Licensed under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
*/
module org.javamoney.moneta {
    exports org.javamoney.moneta;
    exports org.javamoney.moneta.format;
    exports org.javamoney.moneta.function;
    exports org.javamoney.moneta.spi;
    requires transitive java.money;
    requires transitive java.logging;
    requires java.annotation;
    requires static org.osgi.core;
    requires static org.osgi.compendium;
    requires static org.osgi.annotation;
    provides javax.money.spi.CurrencyProviderSpi with org.javamoney.moneta.internal.JDKCurrencyProvider, org.javamoney.moneta.internal.ConfigurableCurrencyUnitProvider;
    provides javax.money.spi.MonetaryAmountFactoryProviderSpi with org.javamoney.moneta.internal.MoneyAmountFactoryProvider, org.javamoney.moneta.internal.FastMoneyAmountFactoryProvider, org.javamoney.moneta.internal.RoundedMoneyAmountFactoryProvider;
    provides javax.money.spi.MonetaryAmountFormatProviderSpi with org.javamoney.moneta.internal.format.DefaultAmountFormatProviderSpi;
    provides javax.money.spi.MonetaryAmountsSingletonQuerySpi with org.javamoney.moneta.internal.DefaultMonetaryAmountsSingletonQuerySpi;
    provides javax.money.spi.MonetaryAmountsSingletonSpi with org.javamoney.moneta.internal.DefaultMonetaryAmountsSingletonSpi;
    provides javax.money.spi.MonetaryCurrenciesSingletonSpi with org.javamoney.moneta.internal.DefaultMonetaryCurrenciesSingletonSpi;
    provides javax.money.spi.RoundingProviderSpi with org.javamoney.moneta.internal.DefaultRoundingProvider;
    provides javax.money.spi.ServiceProvider with org.javamoney.moneta.internal.PriorityAwareServiceProvider;
    provides org.javamoney.moneta.spi.LoaderService with org.javamoney.moneta.internal.loader.DefaultLoaderService;

    uses org.javamoney.moneta.spi.LoaderService;
    uses org.javamoney.moneta.spi.MonetaryAmountProducer;
    
    uses javax.money.spi.CurrencyProviderSpi;
    uses javax.money.spi.MonetaryCurrenciesSingletonSpi;
    uses javax.money.spi.MonetaryAmountFactoryProviderSpi;
    uses javax.money.spi.MonetaryAmountFormatProviderSpi;
    uses javax.money.spi.MonetaryAmountsSingletonQuerySpi;
    uses javax.money.spi.MonetaryAmountsSingletonSpi;
    uses javax.money.spi.MonetaryConversionsSingletonSpi;
    uses javax.money.spi.MonetaryFormatsSingletonSpi;
    uses javax.money.spi.MonetaryRoundingsSingletonSpi;
    uses javax.money.spi.RoundingProviderSpi;
    uses javax.money.spi.ServiceProvider;
    uses javax.money.convert.ExchangeRateProvider;
    uses javax.money.convert.ExchangeRateProviderSupplier;
    uses javax.money.format.MonetaryAmountFormat;
}