package com.eo.resource;

import com.eo.service.FoodService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/api/product")
public class ProductResource {

    @Inject
    FoodService foodService;

    @GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    public String getProductData(@QueryParam("barcode") String barcode) {
        return foodService.getProductData(barcode);
    }
}