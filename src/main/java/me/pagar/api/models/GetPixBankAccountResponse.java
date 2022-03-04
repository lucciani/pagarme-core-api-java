/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetPixBankAccountResponse type.
 */
public class GetPixBankAccountResponse {
    private String bankName;
    private String ispb;
    private String branchCode;
    private String accountNumber;

    /**
     * Default constructor.
     */
    public GetPixBankAccountResponse() {
    }

    /**
     * Initialization constructor.
     * @param  bankName  String value for bankName.
     * @param  ispb  String value for ispb.
     * @param  branchCode  String value for branchCode.
     * @param  accountNumber  String value for accountNumber.
     */
    public GetPixBankAccountResponse(
            String bankName,
            String ispb,
            String branchCode,
            String accountNumber) {
        this.bankName = bankName;
        this.ispb = ispb;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for BankName.
     * @return Returns the String
     */
    @JsonGetter("bank_name")
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter for BankName.
     * @param bankName Value for String
     */
    @JsonSetter("bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter for Ispb.
     * @return Returns the String
     */
    @JsonGetter("ispb")
    public String getIspb() {
        return ispb;
    }

    /**
     * Setter for Ispb.
     * @param ispb Value for String
     */
    @JsonSetter("ispb")
    public void setIspb(String ispb) {
        this.ispb = ispb;
    }

    /**
     * Getter for BranchCode.
     * @return Returns the String
     */
    @JsonGetter("branch_code")
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Setter for BranchCode.
     * @param branchCode Value for String
     */
    @JsonSetter("branch_code")
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * Getter for AccountNumber.
     * @return Returns the String
     */
    @JsonGetter("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * @param accountNumber Value for String
     */
    @JsonSetter("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Converts this GetPixBankAccountResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPixBankAccountResponse [" + "bankName=" + bankName + ", ispb=" + ispb
                + ", branchCode=" + branchCode + ", accountNumber=" + accountNumber + "]";
    }

    /**
     * Builds a new {@link GetPixBankAccountResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPixBankAccountResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bankName, ispb, branchCode, accountNumber);
        return builder;
    }

    /**
     * Class to build instances of {@link GetPixBankAccountResponse}.
     */
    public static class Builder {
        private String bankName;
        private String ispb;
        private String branchCode;
        private String accountNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bankName  String value for bankName.
         * @param  ispb  String value for ispb.
         * @param  branchCode  String value for branchCode.
         * @param  accountNumber  String value for accountNumber.
         */
        public Builder(String bankName, String ispb, String branchCode, String accountNumber) {
            this.bankName = bankName;
            this.ispb = ispb;
            this.branchCode = branchCode;
            this.accountNumber = accountNumber;
        }

        /**
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        /**
         * Setter for ispb.
         * @param  ispb  String value for ispb.
         * @return Builder
         */
        public Builder ispb(String ispb) {
            this.ispb = ispb;
            return this;
        }

        /**
         * Setter for branchCode.
         * @param  branchCode  String value for branchCode.
         * @return Builder
         */
        public Builder branchCode(String branchCode) {
            this.branchCode = branchCode;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Builds a new {@link GetPixBankAccountResponse} object using the set fields.
         * @return {@link GetPixBankAccountResponse}
         */
        public GetPixBankAccountResponse build() {
            return new GetPixBankAccountResponse(bankName, ispb, branchCode, accountNumber);
        }
    }
}
