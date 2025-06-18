package com.eo.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "food-api")
public interface FoodApiClient {

    @GET
    @Path("/product/{barcode}")
    @Produces(MediaType.APPLICATION_JSON)
    String getProductByBarcode(@PathParam("barcode") String barcode);
}