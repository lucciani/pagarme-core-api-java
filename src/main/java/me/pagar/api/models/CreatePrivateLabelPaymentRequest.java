/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreatePrivateLabelPaymentRequest type.
 */
public class CreatePrivateLabelPaymentRequest {
    private Integer installments;
    private String statementDescriptor;
    private CreateCardRequest card;
    private String cardId;
    private String cardToken;
    private Boolean recurrence;
    private Boolean capture;
    private Boolean extendedLimitEnabled;
    private String extendedLimitCode;

    /**
     * Default constructor.
     */
    public CreatePrivateLabelPaymentRequest() {
        installments = 1;
        capture = true;
    }

    /**
     * Initialization constructor.
     * @param  installments  Integer value for installments.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  card  CreateCardRequest value for card.
     * @param  cardId  String value for cardId.
     * @param  cardToken  String value for cardToken.
     * @param  recurrence  Boolean value for recurrence.
     * @param  capture  Boolean value for capture.
     * @param  extendedLimitEnabled  Boolean value for extendedLimitEnabled.
     * @param  extendedLimitCode  String value for extendedLimitCode.
     */
    public CreatePrivateLabelPaymentRequest(
            Integer installments,
            String statementDescriptor,
            CreateCardRequest card,
            String cardId,
            String cardToken,
            Boolean recurrence,
            Boolean capture,
            Boolean extendedLimitEnabled,
            String extendedLimitCode) {
        this.installments = installments;
        this.statementDescriptor = statementDescriptor;
        this.card = card;
        this.cardId = cardId;
        this.cardToken = cardToken;
        this.recurrence = recurrence;
        this.capture = capture;
        this.extendedLimitEnabled = extendedLimitEnabled;
        this.extendedLimitCode = extendedLimitCode;
    }

    /**
     * Getter for Installments.
     * Number of installments
     * @return Returns the Integer
     */
    @JsonGetter("installments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInstallments() {
        return installments;
    }

    /**
     * Setter for Installments.
     * Number of installments
     * @param installments Value for Integer
     */
    @JsonSetter("installments")
    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    /**
     * Getter for StatementDescriptor.
     * The text that will be shown on the private label's statement
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * The text that will be shown on the private label's statement
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Card.
     * Card data
     * @return Returns the CreateCardRequest
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateCardRequest getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Card data
     * @param card Value for CreateCardRequest
     */
    @JsonSetter("card")
    public void setCard(CreateCardRequest card) {
        this.card = card;
    }

    /**
     * Getter for CardId.
     * The Card id
     * @return Returns the String
     */
    @JsonGetter("card_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * The Card id
     * @param cardId Value for String
     */
    @JsonSetter("card_id")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for CardToken.
     * @return Returns the String
     */
    @JsonGetter("card_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardToken() {
        return cardToken;
    }

    /**
     * Setter for CardToken.
     * @param cardToken Value for String
     */
    @JsonSetter("card_token")
    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    /**
     * Getter for Recurrence.
     * Indicates a recurrence
     * @return Returns the Boolean
     */
    @JsonGetter("recurrence")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRecurrence() {
        return recurrence;
    }

    /**
     * Setter for Recurrence.
     * Indicates a recurrence
     * @param recurrence Value for Boolean
     */
    @JsonSetter("recurrence")
    public void setRecurrence(Boolean recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * Getter for Capture.
     * Indicates if the operation should be only authorization or auth and capture.
     * @return Returns the Boolean
     */
    @JsonGetter("capture")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCapture() {
        return capture;
    }

    /**
     * Setter for Capture.
     * Indicates if the operation should be only authorization or auth and capture.
     * @param capture Value for Boolean
     */
    @JsonSetter("capture")
    public void setCapture(Boolean capture) {
        this.capture = capture;
    }

    /**
     * Getter for ExtendedLimitEnabled.
     * Indicates whether the extended label (private label) is enabled
     * @return Returns the Boolean
     */
    @JsonGetter("extended_limit_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExtendedLimitEnabled() {
        return extendedLimitEnabled;
    }

    /**
     * Setter for ExtendedLimitEnabled.
     * Indicates whether the extended label (private label) is enabled
     * @param extendedLimitEnabled Value for Boolean
     */
    @JsonSetter("extended_limit_enabled")
    public void setExtendedLimitEnabled(Boolean extendedLimitEnabled) {
        this.extendedLimitEnabled = extendedLimitEnabled;
    }

    /**
     * Getter for ExtendedLimitCode.
     * Extended Limit Code
     * @return Returns the String
     */
    @JsonGetter("extended_limit_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExtendedLimitCode() {
        return extendedLimitCode;
    }

    /**
     * Setter for ExtendedLimitCode.
     * Extended Limit Code
     * @param extendedLimitCode Value for String
     */
    @JsonSetter("extended_limit_code")
    public void setExtendedLimitCode(String extendedLimitCode) {
        this.extendedLimitCode = extendedLimitCode;
    }

    /**
     * Converts this CreatePrivateLabelPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePrivateLabelPaymentRequest [" + "installments=" + installments
                + ", statementDescriptor=" + statementDescriptor + ", card=" + card + ", cardId="
                + cardId + ", cardToken=" + cardToken + ", recurrence=" + recurrence + ", capture="
                + capture + ", extendedLimitEnabled=" + extendedLimitEnabled
                + ", extendedLimitCode=" + extendedLimitCode + "]";
    }

    /**
     * Builds a new {@link CreatePrivateLabelPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePrivateLabelPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .installments(getInstallments())
                .statementDescriptor(getStatementDescriptor())
                .card(getCard())
                .cardId(getCardId())
                .cardToken(getCardToken())
                .recurrence(getRecurrence())
                .capture(getCapture())
                .extendedLimitEnabled(getExtendedLimitEnabled())
                .extendedLimitCode(getExtendedLimitCode());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePrivateLabelPaymentRequest}.
     */
    public static class Builder {
        private Integer installments = 1;
        private String statementDescriptor;
        private CreateCardRequest card;
        private String cardId;
        private String cardToken;
        private Boolean recurrence;
        private Boolean capture = true;
        private Boolean extendedLimitEnabled;
        private String extendedLimitCode;



        /**
         * Setter for installments.
         * @param  installments  Integer value for installments.
         * @return Builder
         */
        public Builder installments(Integer installments) {
            this.installments = installments;
            return this;
        }

        /**
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  CreateCardRequest value for card.
         * @return Builder
         */
        public Builder card(CreateCardRequest card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for cardId.
         * @param  cardId  String value for cardId.
         * @return Builder
         */
        public Builder cardId(String cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Setter for cardToken.
         * @param  cardToken  String value for cardToken.
         * @return Builder
         */
        public Builder cardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        /**
         * Setter for recurrence.
         * @param  recurrence  Boolean value for recurrence.
         * @return Builder
         */
        public Builder recurrence(Boolean recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        /**
         * Setter for capture.
         * @param  capture  Boolean value for capture.
         * @return Builder
         */
        public Builder capture(Boolean capture) {
            this.capture = capture;
            return this;
        }

        /**
         * Setter for extendedLimitEnabled.
         * @param  extendedLimitEnabled  Boolean value for extendedLimitEnabled.
         * @return Builder
         */
        public Builder extendedLimitEnabled(Boolean extendedLimitEnabled) {
            this.extendedLimitEnabled = extendedLimitEnabled;
            return this;
        }

        /**
         * Setter for extendedLimitCode.
         * @param  extendedLimitCode  String value for extendedLimitCode.
         * @return Builder
         */
        public Builder extendedLimitCode(String extendedLimitCode) {
            this.extendedLimitCode = extendedLimitCode;
            return this;
        }

        /**
         * Builds a new {@link CreatePrivateLabelPaymentRequest} object using the set fields.
         * @return {@link CreatePrivateLabelPaymentRequest}
         */
        public CreatePrivateLabelPaymentRequest build() {
            return new CreatePrivateLabelPaymentRequest(installments, statementDescriptor, card,
                    cardId, cardToken, recurrence, capture, extendedLimitEnabled,
                    extendedLimitCode);
        }
    }
}
