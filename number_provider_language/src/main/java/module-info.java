module number_language {
    requires number_api;

    provides no.dervis.numbertotext.api.spi.NumberResourcesProvider
            with no.dervis.numbertotext.language.impl.NumberResourcesProviderImpl;
}
