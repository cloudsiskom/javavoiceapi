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
 * This is a model class for List type.
 */
public class List {
    private boolean response;
    private java.util.List<String> data;

    /**
     * Default constructor.
     */
    public List() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  data  java.util.List of String value for data.
     */
    public List(
            boolean response,
            java.util.List<String> data) {
        this.response = response;
        this.data = data;
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
     * Getter for Data.
     * @return Returns the java.util.List of String
     */
    @JsonGetter("data")
    public java.util.List<String> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for java.util.List of String
     */
    @JsonSetter("data")
    public void setData(java.util.List<String> data) {
        this.data = data;
    }

    /**
     * Converts this List into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "List [" + "response=" + response + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link List.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link List.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, data);
        return builder;
    }

    /**
     * Class to build instances of {@link List}.
     */
    public static class Builder {
        private boolean response;
        private java.util.List<String> data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  data  java.util.List of String value for data.
         */
        public Builder(boolean response, java.util.List<String> data) {
            this.response = response;
            this.data = data;
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
         * Setter for data.
         * @param  data  java.util.List of String value for data.
         * @return Builder
         */
        public Builder data(java.util.List<String> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link List} object using the set fields.
         * @return {@link List}
         */
        public List build() {
            return new List(response, data);
        }
    }
}
