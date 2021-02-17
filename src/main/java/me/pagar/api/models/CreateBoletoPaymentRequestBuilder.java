/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class CreateBoletoPaymentRequestBuilder {
    //the instance to build
    private CreateBoletoPaymentRequest createBoletoPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateBoletoPaymentRequestBuilder() {
        createBoletoPaymentRequest = new CreateBoletoPaymentRequest();
    }

    /**
     * Number of retries
     */
    public CreateBoletoPaymentRequestBuilder retries(int retries) {
        createBoletoPaymentRequest.setRetries(retries);
        return this;
    }

    /**
     * The bank code, containing three characters. The available codes are on the API specification
     */
    public CreateBoletoPaymentRequestBuilder bank(String bank) {
        createBoletoPaymentRequest.setBank(bank);
        return this;
    }

    /**
     * The instructions field that will be printed on the boleto.
     */
    public CreateBoletoPaymentRequestBuilder instructions(String instructions) {
        createBoletoPaymentRequest.setInstructions(instructions);
        return this;
    }

    /**
     * Boleto due date
     */
    public CreateBoletoPaymentRequestBuilder dueAt(DateTime dueAt) {
        createBoletoPaymentRequest.setDueAt(dueAt);
        return this;
    }

    /**
     * Card's billing address
     */
    public CreateBoletoPaymentRequestBuilder billingAddress(CreateAddressRequest billingAddress) {
        createBoletoPaymentRequest.setBillingAddress(billingAddress);
        return this;
    }

    /**
     * The address id for the billing address
     */
    public CreateBoletoPaymentRequestBuilder billingAddressId(String billingAddressId) {
        createBoletoPaymentRequest.setBillingAddressId(billingAddressId);
        return this;
    }

    /**
     * Customer identification number with the bank
     */
    public CreateBoletoPaymentRequestBuilder nossoNumero(String nossoNumero) {
        createBoletoPaymentRequest.setNossoNumero(nossoNumero);
        return this;
    }

    /**
     * Boleto identification
     */
    public CreateBoletoPaymentRequestBuilder documentNumber(String documentNumber) {
        createBoletoPaymentRequest.setDocumentNumber(documentNumber);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateBoletoPaymentRequest build() {
        return createBoletoPaymentRequest;
    }
}