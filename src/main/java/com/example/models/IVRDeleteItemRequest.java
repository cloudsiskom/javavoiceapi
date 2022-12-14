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
 * This is a model class for IVRDeleteItemRequest type.
 */
public class IVRDeleteItemRequest {
    private String ivrItemId;

    /**
     * Default constructor.
     */
    public IVRDeleteItemRequest() {
    }

    /**
     * Initialization constructor.
     * @param  ivrItemId  String value for ivrItemId.
     */
    public IVRDeleteItemRequest(
            String ivrItemId) {
        this.ivrItemId = ivrItemId;
    }

    /**
     * Getter for IvrItemId.
     * @return Returns the String
     */
    @JsonGetter("ivr_item_id")
    public String getIvrItemId() {
        return ivrItemId;
    }

    /**
     * Setter for IvrItemId.
     * @param ivrItemId Value for String
     */
    @JsonSetter("ivr_item_id")
    public void setIvrItemId(String ivrItemId) {
        this.ivrItemId = ivrItemId;
    }

    /**
     * Converts this IVRDeleteItemRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IVRDeleteItemRequest [" + "ivrItemId=" + ivrItemId + "]";
    }

    /**
     * Builds a new {@link IVRDeleteItemRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IVRDeleteItemRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ivrItemId);
        return builder;
    }

    /**
     * Class to build instances of {@link IVRDeleteItemRequest}.
     */
    public static class Builder {
        private String ivrItemId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ivrItemId  String value for ivrItemId.
         */
        public Builder(String ivrItemId) {
            this.ivrItemId = ivrItemId;
        }

        /**
         * Setter for ivrItemId.
         * @param  ivrItemId  String value for ivrItemId.
         * @return Builder
         */
        public Builder ivrItemId(String ivrItemId) {
            this.ivrItemId = ivrItemId;
            return this;
        }

        /**
         * Builds a new {@link IVRDeleteItemRequest} object using the set fields.
         * @return {@link IVRDeleteItemRequest}
         */
        public IVRDeleteItemRequest build() {
            return new IVRDeleteItemRequest(ivrItemId);
        }
    }
}
