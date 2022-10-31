/*
 * SiskomVoiceAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for TranslationSetup type.
 */
public class TranslationSetup {
    private boolean respose;
    private String action;
    private String transactionId;
    private String externalId;
    private String fromNumber;
    private String destinationNumber;
    private String callerDidgateway;
    private String calledDidgateway;

    /**
     * Default constructor.
     */
    public TranslationSetup() {
    }

    /**
     * Initialization constructor.
     * @param  respose  boolean value for respose.
     * @param  action  String value for action.
     * @param  transactionId  String value for transactionId.
     * @param  externalId  String value for externalId.
     * @param  fromNumber  String value for fromNumber.
     * @param  destinationNumber  String value for destinationNumber.
     * @param  callerDidgateway  String value for callerDidgateway.
     * @param  calledDidgateway  String value for calledDidgateway.
     */
    public TranslationSetup(
            boolean respose,
            String action,
            String transactionId,
            String externalId,
            String fromNumber,
            String destinationNumber,
            String callerDidgateway,
            String calledDidgateway) {
        this.respose = respose;
        this.action = action;
        this.transactionId = transactionId;
        this.externalId = externalId;
        this.fromNumber = fromNumber;
        this.destinationNumber = destinationNumber;
        this.callerDidgateway = callerDidgateway;
        this.calledDidgateway = calledDidgateway;
    }

    /**
     * Getter for Respose.
     * @return Returns the boolean
     */
    @JsonGetter("respose")
    public boolean getRespose() {
        return respose;
    }

    /**
     * Setter for Respose.
     * @param respose Value for boolean
     */
    @JsonSetter("respose")
    public void setRespose(boolean respose) {
        this.respose = respose;
    }

    /**
     * Getter for Action.
     * @return Returns the String
     */
    @JsonGetter("action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * @param action Value for String
     */
    @JsonSetter("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Getter for TransactionId.
     * @return Returns the String
     */
    @JsonGetter("transaction_id")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * @param transactionId Value for String
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for ExternalId.
     * @return Returns the String
     */
    @JsonGetter("external_id")
    public String getExternalId() {
        return externalId;
    }

    /**
     * Setter for ExternalId.
     * @param externalId Value for String
     */
    @JsonSetter("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Getter for FromNumber.
     * @return Returns the String
     */
    @JsonGetter("from_number")
    public String getFromNumber() {
        return fromNumber;
    }

    /**
     * Setter for FromNumber.
     * @param fromNumber Value for String
     */
    @JsonSetter("from_number")
    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    /**
     * Getter for DestinationNumber.
     * @return Returns the String
     */
    @JsonGetter("destination_number")
    public String getDestinationNumber() {
        return destinationNumber;
    }

    /**
     * Setter for DestinationNumber.
     * @param destinationNumber Value for String
     */
    @JsonSetter("destination_number")
    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    /**
     * Getter for CallerDidgateway.
     * @return Returns the String
     */
    @JsonGetter("caller_didgateway")
    public String getCallerDidgateway() {
        return callerDidgateway;
    }

    /**
     * Setter for CallerDidgateway.
     * @param callerDidgateway Value for String
     */
    @JsonSetter("caller_didgateway")
    public void setCallerDidgateway(String callerDidgateway) {
        this.callerDidgateway = callerDidgateway;
    }

    /**
     * Getter for CalledDidgateway.
     * @return Returns the String
     */
    @JsonGetter("called_didgateway")
    public String getCalledDidgateway() {
        return calledDidgateway;
    }

    /**
     * Setter for CalledDidgateway.
     * @param calledDidgateway Value for String
     */
    @JsonSetter("called_didgateway")
    public void setCalledDidgateway(String calledDidgateway) {
        this.calledDidgateway = calledDidgateway;
    }

    /**
     * Converts this TranslationSetup into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TranslationSetup [" + "respose=" + respose + ", action=" + action
                + ", transactionId=" + transactionId + ", externalId=" + externalId
                + ", fromNumber=" + fromNumber + ", destinationNumber=" + destinationNumber
                + ", callerDidgateway=" + callerDidgateway + ", calledDidgateway="
                + calledDidgateway + "]";
    }

    /**
     * Builds a new {@link TranslationSetup.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TranslationSetup.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(respose, action, transactionId, externalId, fromNumber,
                destinationNumber, callerDidgateway, calledDidgateway);
        return builder;
    }

    /**
     * Class to build instances of {@link TranslationSetup}.
     */
    public static class Builder {
        private boolean respose;
        private String action;
        private String transactionId;
        private String externalId;
        private String fromNumber;
        private String destinationNumber;
        private String callerDidgateway;
        private String calledDidgateway;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  respose  boolean value for respose.
         * @param  action  String value for action.
         * @param  transactionId  String value for transactionId.
         * @param  externalId  String value for externalId.
         * @param  fromNumber  String value for fromNumber.
         * @param  destinationNumber  String value for destinationNumber.
         * @param  callerDidgateway  String value for callerDidgateway.
         * @param  calledDidgateway  String value for calledDidgateway.
         */
        public Builder(boolean respose, String action, String transactionId, String externalId,
                String fromNumber, String destinationNumber, String callerDidgateway,
                String calledDidgateway) {
            this.respose = respose;
            this.action = action;
            this.transactionId = transactionId;
            this.externalId = externalId;
            this.fromNumber = fromNumber;
            this.destinationNumber = destinationNumber;
            this.callerDidgateway = callerDidgateway;
            this.calledDidgateway = calledDidgateway;
        }

        /**
         * Setter for respose.
         * @param  respose  boolean value for respose.
         * @return Builder
         */
        public Builder respose(boolean respose) {
            this.respose = respose;
            return this;
        }

        /**
         * Setter for action.
         * @param  action  String value for action.
         * @return Builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  String value for transactionId.
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for externalId.
         * @param  externalId  String value for externalId.
         * @return Builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Setter for fromNumber.
         * @param  fromNumber  String value for fromNumber.
         * @return Builder
         */
        public Builder fromNumber(String fromNumber) {
            this.fromNumber = fromNumber;
            return this;
        }

        /**
         * Setter for destinationNumber.
         * @param  destinationNumber  String value for destinationNumber.
         * @return Builder
         */
        public Builder destinationNumber(String destinationNumber) {
            this.destinationNumber = destinationNumber;
            return this;
        }

        /**
         * Setter for callerDidgateway.
         * @param  callerDidgateway  String value for callerDidgateway.
         * @return Builder
         */
        public Builder callerDidgateway(String callerDidgateway) {
            this.callerDidgateway = callerDidgateway;
            return this;
        }

        /**
         * Setter for calledDidgateway.
         * @param  calledDidgateway  String value for calledDidgateway.
         * @return Builder
         */
        public Builder calledDidgateway(String calledDidgateway) {
            this.calledDidgateway = calledDidgateway;
            return this;
        }

        /**
         * Builds a new {@link TranslationSetup} object using the set fields.
         * @return {@link TranslationSetup}
         */
        public TranslationSetup build() {
            return new TranslationSetup(respose, action, transactionId, externalId, fromNumber,
                    destinationNumber, callerDidgateway, calledDidgateway);
        }
    }
}