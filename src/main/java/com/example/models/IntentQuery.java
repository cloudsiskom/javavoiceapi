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
 * This is a model class for IntentQuery type.
 */
public class IntentQuery {
    private boolean response;
    private String messageTexts;

    /**
     * Default constructor.
     */
    public IntentQuery() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  messageTexts  String value for messageTexts.
     */
    public IntentQuery(
            boolean response,
            String messageTexts) {
        this.response = response;
        this.messageTexts = messageTexts;
    }

    /**
     * Getter for Response.
     * @return Returns the boolean
     */
    @JsonGetter("response")
    public boolean getResponse() {
        return response;
    }

    /**
     * Setter for Response.
     * @param response Value for boolean
     */
    @JsonSetter("response")
    public void setResponse(boolean response) {
        this.response = response;
    }

    /**
     * Getter for MessageTexts.
     * @return Returns the String
     */
    @JsonGetter("message_texts")
    public String getMessageTexts() {
        return messageTexts;
    }

    /**
     * Setter for MessageTexts.
     * @param messageTexts Value for String
     */
    @JsonSetter("message_texts")
    public void setMessageTexts(String messageTexts) {
        this.messageTexts = messageTexts;
    }

    /**
     * Converts this IntentQuery into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IntentQuery [" + "response=" + response + ", messageTexts=" + messageTexts + "]";
    }

    /**
     * Builds a new {@link IntentQuery.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IntentQuery.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, messageTexts);
        return builder;
    }

    /**
     * Class to build instances of {@link IntentQuery}.
     */
    public static class Builder {
        private boolean response;
        private String messageTexts;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  messageTexts  String value for messageTexts.
         */
        public Builder(boolean response, String messageTexts) {
            this.response = response;
            this.messageTexts = messageTexts;
        }

        /**
         * Setter for response.
         * @param  response  boolean value for response.
         * @return Builder
         */
        public Builder response(boolean response) {
            this.response = response;
            return this;
        }

        /**
         * Setter for messageTexts.
         * @param  messageTexts  String value for messageTexts.
         * @return Builder
         */
        public Builder messageTexts(String messageTexts) {
            this.messageTexts = messageTexts;
            return this;
        }

        /**
         * Builds a new {@link IntentQuery} object using the set fields.
         * @return {@link IntentQuery}
         */
        public IntentQuery build() {
            return new IntentQuery(response, messageTexts);
        }
    }
}