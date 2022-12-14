/*
 * SiskomVoiceAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for DIDListAll type.
 */
public class DIDListAll {
    private boolean response;
    private int total;
    private List<Data11> data;

    /**
     * Default constructor.
     */
    public DIDListAll() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  total  int value for total.
     * @param  data  List of Data11 value for data.
     */
    public DIDListAll(
            boolean response,
            int total,
            List<Data11> data) {
        this.response = response;
        this.total = total;
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
     * Getter for Total.
     * @return Returns the int
     */
    @JsonGetter("total")
    public int getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * @param total Value for int
     */
    @JsonSetter("total")
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Getter for Data.
     * @return Returns the List of Data11
     */
    @JsonGetter("data")
    public List<Data11> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of Data11
     */
    @JsonSetter("data")
    public void setData(List<Data11> data) {
        this.data = data;
    }

    /**
     * Converts this DIDListAll into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DIDListAll [" + "response=" + response + ", total=" + total + ", data=" + data
                + "]";
    }

    /**
     * Builds a new {@link DIDListAll.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DIDListAll.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, total, data);
        return builder;
    }

    /**
     * Class to build instances of {@link DIDListAll}.
     */
    public static class Builder {
        private boolean response;
        private int total;
        private List<Data11> data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  total  int value for total.
         * @param  data  List of Data11 value for data.
         */
        public Builder(boolean response, int total, List<Data11> data) {
            this.response = response;
            this.total = total;
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
         * Setter for total.
         * @param  total  int value for total.
         * @return Builder
         */
        public Builder total(int total) {
            this.total = total;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  List of Data11 value for data.
         * @return Builder
         */
        public Builder data(List<Data11> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link DIDListAll} object using the set fields.
         * @return {@link DIDListAll}
         */
        public DIDListAll build() {
            return new DIDListAll(response, total, data);
        }
    }
}
