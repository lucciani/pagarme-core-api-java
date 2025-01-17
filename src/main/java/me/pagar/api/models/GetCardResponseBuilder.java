/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetCardResponseBuilder {
    //the instance to build
    private GetCardResponse getCardResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetCardResponseBuilder() {
        getCardResponse = new GetCardResponse();
    }

    public GetCardResponseBuilder id(String id) {
        getCardResponse.setId(id);
        return this;
    }

    public GetCardResponseBuilder lastFourDigits(String lastFourDigits) {
        getCardResponse.setLastFourDigits(lastFourDigits);
        return this;
    }

    public GetCardResponseBuilder brand(String brand) {
        getCardResponse.setBrand(brand);
        return this;
    }

    public GetCardResponseBuilder holderName(String holderName) {
        getCardResponse.setHolderName(holderName);
        return this;
    }

    public GetCardResponseBuilder expMonth(int expMonth) {
        getCardResponse.setExpMonth(expMonth);
        return this;
    }

    public GetCardResponseBuilder expYear(int expYear) {
        getCardResponse.setExpYear(expYear);
        return this;
    }

    public GetCardResponseBuilder status(String status) {
        getCardResponse.setStatus(status);
        return this;
    }

    public GetCardResponseBuilder createdAt(DateTime createdAt) {
        getCardResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetCardResponseBuilder updatedAt(DateTime updatedAt) {
        getCardResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public GetCardResponseBuilder billingAddress(GetBillingAddressResponse billingAddress) {
        getCardResponse.setBillingAddress(billingAddress);
        return this;
    }

    public GetCardResponseBuilder customer(GetCustomerResponse customer) {
        getCardResponse.setCustomer(customer);
        return this;
    }

    public GetCardResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getCardResponse.setMetadata(metadata);
        return this;
    }

    /**
     * Card type
     */
    public GetCardResponseBuilder type(String type) {
        getCardResponse.setType(type);
        return this;
    }

    /**
     * Document number for the card's holder
     */
    public GetCardResponseBuilder holderDocument(String holderDocument) {
        getCardResponse.setHolderDocument(holderDocument);
        return this;
    }

    public GetCardResponseBuilder deletedAt(DateTime deletedAt) {
        getCardResponse.setDeletedAt(deletedAt);
        return this;
    }

    /**
     * First six digits
     */
    public GetCardResponseBuilder firstSixDigits(String firstSixDigits) {
        getCardResponse.setFirstSixDigits(firstSixDigits);
        return this;
    }

    public GetCardResponseBuilder label(String label) {
        getCardResponse.setLabel(label);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCardResponse build() {
        return getCardResponse;
    }
}