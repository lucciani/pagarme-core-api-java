/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateApplePayHeaderRequestBuilder {
    //the instance to build
    private CreateApplePayHeaderRequest createApplePayHeaderRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateApplePayHeaderRequestBuilder() {
        createApplePayHeaderRequest = new CreateApplePayHeaderRequest();
    }

    /**
     * SHA–256 hash, Base64 string codified
     */
    public CreateApplePayHeaderRequestBuilder publicKeyHash(String publicKeyHash) {
        createApplePayHeaderRequest.setPublicKeyHash(publicKeyHash);
        return this;
    }

    /**
     * X.509 encoded key bytes, Base64 encoded as a string
     */
    public CreateApplePayHeaderRequestBuilder ephemeralPublicKey(String ephemeralPublicKey) {
        createApplePayHeaderRequest.setEphemeralPublicKey(ephemeralPublicKey);
        return this;
    }

    /**
     * Transaction identifier, generated on Device
     */
    public CreateApplePayHeaderRequestBuilder transactionId(String transactionId) {
        createApplePayHeaderRequest.setTransactionId(transactionId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateApplePayHeaderRequest build() {
        return createApplePayHeaderRequest;
    }
}