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
 * This is a model class for RouteList type.
 */
public class RouteList {
    private boolean response;
    private List<IncomingRoute> incomingRoute;
    private List<OutgoingRoute> outgoingRoute;

    /**
     * Default constructor.
     */
    public RouteList() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  incomingRoute  List of IncomingRoute value for incomingRoute.
     * @param  outgoingRoute  List of OutgoingRoute value for outgoingRoute.
     */
    public RouteList(
            boolean response,
            List<IncomingRoute> incomingRoute,
            List<OutgoingRoute> outgoingRoute) {
        this.response = response;
        this.incomingRoute = incomingRoute;
        this.outgoingRoute = outgoingRoute;
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
     * Getter for IncomingRoute.
     * @return Returns the List of IncomingRoute
     */
    @JsonGetter("incoming_route")
    public List<IncomingRoute> getIncomingRoute() {
        return incomingRoute;
    }

    /**
     * Setter for IncomingRoute.
     * @param incomingRoute Value for List of IncomingRoute
     */
    @JsonSetter("incoming_route")
    public void setIncomingRoute(List<IncomingRoute> incomingRoute) {
        this.incomingRoute = incomingRoute;
    }

    /**
     * Getter for OutgoingRoute.
     * @return Returns the List of OutgoingRoute
     */
    @JsonGetter("outgoing_route")
    public List<OutgoingRoute> getOutgoingRoute() {
        return outgoingRoute;
    }

    /**
     * Setter for OutgoingRoute.
     * @param outgoingRoute Value for List of OutgoingRoute
     */
    @JsonSetter("outgoing_route")
    public void setOutgoingRoute(List<OutgoingRoute> outgoingRoute) {
        this.outgoingRoute = outgoingRoute;
    }

    /**
     * Converts this RouteList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RouteList [" + "response=" + response + ", incomingRoute=" + incomingRoute
                + ", outgoingRoute=" + outgoingRoute + "]";
    }

    /**
     * Builds a new {@link RouteList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RouteList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, incomingRoute, outgoingRoute);
        return builder;
    }

    /**
     * Class to build instances of {@link RouteList}.
     */
    public static class Builder {
        private boolean response;
        private List<IncomingRoute> incomingRoute;
        private List<OutgoingRoute> outgoingRoute;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  incomingRoute  List of IncomingRoute value for incomingRoute.
         * @param  outgoingRoute  List of OutgoingRoute value for outgoingRoute.
         */
        public Builder(boolean response, List<IncomingRoute> incomingRoute,
                List<OutgoingRoute> outgoingRoute) {
            this.response = response;
            this.incomingRoute = incomingRoute;
            this.outgoingRoute = outgoingRoute;
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
         * Setter for incomingRoute.
         * @param  incomingRoute  List of IncomingRoute value for incomingRoute.
         * @return Builder
         */
        public Builder incomingRoute(List<IncomingRoute> incomingRoute) {
            this.incomingRoute = incomingRoute;
            return this;
        }

        /**
         * Setter for outgoingRoute.
         * @param  outgoingRoute  List of OutgoingRoute value for outgoingRoute.
         * @return Builder
         */
        public Builder outgoingRoute(List<OutgoingRoute> outgoingRoute) {
            this.outgoingRoute = outgoingRoute;
            return this;
        }

        /**
         * Builds a new {@link RouteList} object using the set fields.
         * @return {@link RouteList}
         */
        public RouteList build() {
            return new RouteList(response, incomingRoute, outgoingRoute);
        }
    }
}
