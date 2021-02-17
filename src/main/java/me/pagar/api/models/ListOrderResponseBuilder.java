/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class ListOrderResponseBuilder {
    //the instance to build
    private ListOrderResponse listOrderResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListOrderResponseBuilder() {
        listOrderResponse = new ListOrderResponse();
    }

    /**
     * The order object
     */
    public ListOrderResponseBuilder data(List<GetOrderResponse> data) {
        listOrderResponse.setData(data);
        return this;
    }

    /**
     * Paging object
     */
    public ListOrderResponseBuilder paging(PagingResponse paging) {
        listOrderResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListOrderResponse build() {
        return listOrderResponse;
    }
}