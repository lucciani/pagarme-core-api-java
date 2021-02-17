/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateConfirmPaymentRequestBuilder {
    //the instance to build
    private CreateConfirmPaymentRequest createConfirmPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateConfirmPaymentRequestBuilder() {
        createConfirmPaymentRequest = new CreateConfirmPaymentRequest();
    }

    /**
     * Description
     */
    public CreateConfirmPaymentRequestBuilder description(String description) {
        createConfirmPaymentRequest.setDescription(description);
        return this;
    }

    /**
     * Amount
     */
    public CreateConfirmPaymentRequestBuilder amount(Integer amount) {
        createConfirmPaymentRequest.setAmount(amount);
        return this;
    }

    /**
     * Code reference
     */
    public CreateConfirmPaymentRequestBuilder code(String code) {
        createConfirmPaymentRequest.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateConfirmPaymentRequest build() {
        return createConfirmPaymentRequest;
    }
}