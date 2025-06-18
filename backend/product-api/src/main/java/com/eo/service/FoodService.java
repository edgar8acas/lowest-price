package com.eo.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import com.eo.client.FoodApiClient;

@ApplicationScoped
public class FoodService {

    @Inject
    Logger log;

    @Inject
    @RestClient
    FoodApiClient foodApiClient;

    public String getProductData(String barcode) {
        String res = foodApiClient.getProductByBarcode(barcode);
        return res;
    }

}