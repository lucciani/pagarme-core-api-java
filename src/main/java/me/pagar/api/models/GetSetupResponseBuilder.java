/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetSetupResponseBuilder {
    //the instance to build
    private GetSetupResponse getSetupResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetSetupResponseBuilder() {
        getSetupResponse = new GetSetupResponse();
    }

    public GetSetupResponseBuilder id(String id) {
        getSetupResponse.setId(id);
        return this;
    }

    public GetSetupResponseBuilder description(String description) {
        getSetupResponse.setDescription(description);
        return this;
    }

    public GetSetupResponseBuilder amount(int amount) {
        getSetupResponse.setAmount(amount);
        return this;
    }

    public GetSetupResponseBuilder status(String status) {
        getSetupResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSetupResponse build() {
        return getSetupResponse;
    }
}