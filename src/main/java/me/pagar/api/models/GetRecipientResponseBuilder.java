/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetRecipientResponseBuilder {
    //the instance to build
    private GetRecipientResponse getRecipientResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetRecipientResponseBuilder() {
        getRecipientResponse = new GetRecipientResponse();
    }

    /**
     * Id
     */
    public GetRecipientResponseBuilder id(String id) {
        getRecipientResponse.setId(id);
        return this;
    }

    /**
     * Name
     */
    public GetRecipientResponseBuilder name(String name) {
        getRecipientResponse.setName(name);
        return this;
    }

    /**
     * Email
     */
    public GetRecipientResponseBuilder email(String email) {
        getRecipientResponse.setEmail(email);
        return this;
    }

    /**
     * Document
     */
    public GetRecipientResponseBuilder document(String document) {
        getRecipientResponse.setDocument(document);
        return this;
    }

    /**
     * Description
     */
    public GetRecipientResponseBuilder description(String description) {
        getRecipientResponse.setDescription(description);
        return this;
    }

    /**
     * Type
     */
    public GetRecipientResponseBuilder type(String type) {
        getRecipientResponse.setType(type);
        return this;
    }

    /**
     * Status
     */
    public GetRecipientResponseBuilder status(String status) {
        getRecipientResponse.setStatus(status);
        return this;
    }

    /**
     * Creation date
     */
    public GetRecipientResponseBuilder createdAt(DateTime createdAt) {
        getRecipientResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last update date
     */
    public GetRecipientResponseBuilder updatedAt(DateTime updatedAt) {
        getRecipientResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Deletion date
     */
    public GetRecipientResponseBuilder deletedAt(DateTime deletedAt) {
        getRecipientResponse.setDeletedAt(deletedAt);
        return this;
    }

    /**
     * Default bank account
     */
    public GetRecipientResponseBuilder defaultBankAccount(GetBankAccountResponse defaultBankAccount) {
        getRecipientResponse.setDefaultBankAccount(defaultBankAccount);
        return this;
    }

    /**
     * Info about the recipient on the gateway
     */
    public GetRecipientResponseBuilder gatewayRecipients(List<GetGatewayRecipientResponse> gatewayRecipients) {
        getRecipientResponse.setGatewayRecipients(gatewayRecipients);
        return this;
    }

    /**
     * Metadata
     */
    public GetRecipientResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getRecipientResponse.setMetadata(metadata);
        return this;
    }

    public GetRecipientResponseBuilder automaticAnticipationSettings(GetAutomaticAnticipationResponse automaticAnticipationSettings) {
        getRecipientResponse.setAutomaticAnticipationSettings(automaticAnticipationSettings);
        return this;
    }

    public GetRecipientResponseBuilder transferSettings(GetTransferSettingsResponse transferSettings) {
        getRecipientResponse.setTransferSettings(transferSettings);
        return this;
    }

    /**
     * Recipient code
     */
    public GetRecipientResponseBuilder code(String code) {
        getRecipientResponse.setCode(code);
        return this;
    }

    /**
     * Payment mode
     */
    public GetRecipientResponseBuilder paymentMode(String paymentMode) {
        getRecipientResponse.setPaymentMode(paymentMode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetRecipientResponse build() {
        return getRecipientResponse;
    }
}