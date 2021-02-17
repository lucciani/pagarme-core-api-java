/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class ListAccessTokensResponseBuilder {
    //the instance to build
    private ListAccessTokensResponse listAccessTokensResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListAccessTokensResponseBuilder() {
        listAccessTokensResponse = new ListAccessTokensResponse();
    }

    /**
     * The access token objects
     */
    public ListAccessTokensResponseBuilder data(List<GetAccessTokenResponse> data) {
        listAccessTokensResponse.setData(data);
        return this;
    }

    /**
     * Paging object
     */
    public ListAccessTokensResponseBuilder paging(PagingResponse paging) {
        listAccessTokensResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListAccessTokensResponse build() {
        return listAccessTokensResponse;
    }
}