/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListTransactionsFilesResponse type.
 */
public class ListTransactionsFilesResponse {
    private List<GetTransactionReportFileResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListTransactionsFilesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetTransactionReportFileResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListTransactionsFilesResponse(
            List<GetTransactionReportFileResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * @return Returns the List of GetTransactionReportFileResponse
     */
    @JsonGetter("data")
    public List<GetTransactionReportFileResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of GetTransactionReportFileResponse
     */
    @JsonSetter("data")
    public void setData(List<GetTransactionReportFileResponse> data) {
        this.data = data;
    }

    /**
     * Getter for Paging.
     * Paging object
     * @return Returns the PagingResponse
     */
    @JsonGetter("paging")
    public PagingResponse getPaging() {
        return paging;
    }

    /**
     * Setter for Paging.
     * Paging object
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = paging;
    }

    /**
     * Converts this ListTransactionsFilesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListTransactionsFilesResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListTransactionsFilesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListTransactionsFilesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListTransactionsFilesResponse}.
     */
    public static class Builder {
        private List<GetTransactionReportFileResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetTransactionReportFileResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetTransactionReportFileResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetTransactionReportFileResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetTransactionReportFileResponse> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for paging.
         * @param  paging  PagingResponse value for paging.
         * @return Builder
         */
        public Builder paging(PagingResponse paging) {
            this.paging = paging;
            return this;
        }

        /**
         * Builds a new {@link ListTransactionsFilesResponse} object using the set fields.
         * @return {@link ListTransactionsFilesResponse}
         */
        public ListTransactionsFilesResponse build() {
            return new ListTransactionsFilesResponse(data, paging);
        }
    }
}
