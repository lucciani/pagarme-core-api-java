/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetGatewayRecipientResponse type.
 */
public class GetGatewayRecipientResponse {
    private String gateway;
    private String status;
    private String pgid;
    private String createdAt;
    private String updatedAt;

    /**
     * Default constructor.
     */
    public GetGatewayRecipientResponse() {
    }

    /**
     * Initialization constructor.
     * @param  gateway  String value for gateway.
     * @param  status  String value for status.
     * @param  pgid  String value for pgid.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     */
    public GetGatewayRecipientResponse(
            String gateway,
            String status,
            String pgid,
            String createdAt,
            String updatedAt) {
        this.gateway = gateway;
        this.status = status;
        this.pgid = pgid;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Gateway.
     * Gateway name
     * @return Returns the String
     */
    @JsonGetter("gateway")
    public String getGateway() {
        return gateway;
    }

    /**
     * Setter for Gateway.
     * Gateway name
     * @param gateway Value for String
     */
    @JsonSetter("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * Getter for Status.
     * Status of the recipient on the gateway
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of the recipient on the gateway
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Pgid.
     * Recipient id on the gateway
     * @return Returns the String
     */
    @JsonGetter("pgid")
    public String getPgid() {
        return pgid;
    }

    /**
     * Setter for Pgid.
     * Recipient id on the gateway
     * @param pgid Value for String
     */
    @JsonSetter("pgid")
    public void setPgid(String pgid) {
        this.pgid = pgid;
    }

    /**
     * Getter for CreatedAt.
     * Creation date
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Creation date
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * Last update date
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * Last update date
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this GetGatewayRecipientResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetGatewayRecipientResponse [" + "gateway=" + gateway + ", status=" + status
                + ", pgid=" + pgid + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link GetGatewayRecipientResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetGatewayRecipientResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(gateway, status, pgid, createdAt, updatedAt);
        return builder;
    }

    /**
     * Class to build instances of {@link GetGatewayRecipientResponse}.
     */
    public static class Builder {
        private String gateway;
        private String status;
        private String pgid;
        private String createdAt;
        private String updatedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  gateway  String value for gateway.
         * @param  status  String value for status.
         * @param  pgid  String value for pgid.
         * @param  createdAt  String value for createdAt.
         * @param  updatedAt  String value for updatedAt.
         */
        public Builder(String gateway, String status, String pgid, String createdAt,
                String updatedAt) {
            this.gateway = gateway;
            this.status = status;
            this.pgid = pgid;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
        }

        /**
         * Setter for gateway.
         * @param  gateway  String value for gateway.
         * @return Builder
         */
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for pgid.
         * @param  pgid  String value for pgid.
         * @return Builder
         */
        public Builder pgid(String pgid) {
            this.pgid = pgid;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link GetGatewayRecipientResponse} object using the set fields.
         * @return {@link GetGatewayRecipientResponse}
         */
        public GetGatewayRecipientResponse build() {
            return new GetGatewayRecipientResponse(gateway, status, pgid, createdAt, updatedAt);
        }
    }
}
