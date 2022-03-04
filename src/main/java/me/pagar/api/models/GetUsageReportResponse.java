/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetUsageReportResponse type.
 */
public class GetUsageReportResponse {
    private String url;
    private String usageReportUrl;
    private String groupedReportUrl;

    /**
     * Default constructor.
     */
    public GetUsageReportResponse() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  usageReportUrl  String value for usageReportUrl.
     * @param  groupedReportUrl  String value for groupedReportUrl.
     */
    public GetUsageReportResponse(
            String url,
            String usageReportUrl,
            String groupedReportUrl) {
        this.url = url;
        this.usageReportUrl = usageReportUrl;
        this.groupedReportUrl = groupedReportUrl;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for UsageReportUrl.
     * @return Returns the String
     */
    @JsonGetter("usage_report_url")
    public String getUsageReportUrl() {
        return usageReportUrl;
    }

    /**
     * Setter for UsageReportUrl.
     * @param usageReportUrl Value for String
     */
    @JsonSetter("usage_report_url")
    public void setUsageReportUrl(String usageReportUrl) {
        this.usageReportUrl = usageReportUrl;
    }

    /**
     * Getter for GroupedReportUrl.
     * @return Returns the String
     */
    @JsonGetter("grouped_report_url")
    public String getGroupedReportUrl() {
        return groupedReportUrl;
    }

    /**
     * Setter for GroupedReportUrl.
     * @param groupedReportUrl Value for String
     */
    @JsonSetter("grouped_report_url")
    public void setGroupedReportUrl(String groupedReportUrl) {
        this.groupedReportUrl = groupedReportUrl;
    }

    /**
     * Converts this GetUsageReportResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetUsageReportResponse [" + "url=" + url + ", usageReportUrl=" + usageReportUrl
                + ", groupedReportUrl=" + groupedReportUrl + "]";
    }

    /**
     * Builds a new {@link GetUsageReportResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetUsageReportResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, usageReportUrl, groupedReportUrl);
        return builder;
    }

    /**
     * Class to build instances of {@link GetUsageReportResponse}.
     */
    public static class Builder {
        private String url;
        private String usageReportUrl;
        private String groupedReportUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  usageReportUrl  String value for usageReportUrl.
         * @param  groupedReportUrl  String value for groupedReportUrl.
         */
        public Builder(String url, String usageReportUrl, String groupedReportUrl) {
            this.url = url;
            this.usageReportUrl = usageReportUrl;
            this.groupedReportUrl = groupedReportUrl;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for usageReportUrl.
         * @param  usageReportUrl  String value for usageReportUrl.
         * @return Builder
         */
        public Builder usageReportUrl(String usageReportUrl) {
            this.usageReportUrl = usageReportUrl;
            return this;
        }

        /**
         * Setter for groupedReportUrl.
         * @param  groupedReportUrl  String value for groupedReportUrl.
         * @return Builder
         */
        public Builder groupedReportUrl(String groupedReportUrl) {
            this.groupedReportUrl = groupedReportUrl;
            return this;
        }

        /**
         * Builds a new {@link GetUsageReportResponse} object using the set fields.
         * @return {@link GetUsageReportResponse}
         */
        public GetUsageReportResponse build() {
            return new GetUsageReportResponse(url, usageReportUrl, groupedReportUrl);
        }
    }
}
