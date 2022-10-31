/*
 * SiskomVoiceAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.controllers;

import com.example.ApiHelper;
import com.example.Server;
import com.example.exceptions.ApiException;
import com.example.exceptions.IVRDeleteException;
import com.example.exceptions.IVRDeleteItemException;
import com.example.exceptions.IVRNewException;
import com.example.http.request.HttpMethod;
import com.example.models.IVRDeleteItemRequest;
import com.example.models.IVRDeleteRequest;
import com.example.models.IVRLang;
import com.example.models.IVRNewRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class IVRController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public IVRController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * ACTION: \* new \* edit LANG : \* id-ID \* en-US GENDER \* MALE \* FEMALE.
     * @param  body  Required parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void iVRNew(
            final IVRNewRequest body) throws ApiException, IOException {
        prepareIVRNewRequest(body).execute();
    }

    /**
     * ACTION: \* new \* edit LANG : \* id-ID \* en-US GENDER \* MALE \* FEMALE.
     * @param  body  Required parameter: Example:
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> iVRNewAsync(
            final IVRNewRequest body) {
        try { 
            return prepareIVRNewRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for iVRNew.
     */
    private ApiCall<Void, ApiException> prepareIVRNewRequest(
            final IVRNewRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER_1.value())
                        .path("/ivr/new")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.create("Forbidden",
                                (reason, context) -> new IVRNewException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void iVRDelete(
            final IVRDeleteRequest body) throws ApiException, IOException {
        prepareIVRDeleteRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> iVRDeleteAsync(
            final IVRDeleteRequest body) {
        try { 
            return prepareIVRDeleteRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for iVRDelete.
     */
    private ApiCall<Void, ApiException> prepareIVRDeleteRequest(
            final IVRDeleteRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER_1.value())
                        .path("/ivr/delete")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.create("Not Found",
                                (reason, context) -> new IVRDeleteException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void iVRDeleteItem(
            final IVRDeleteItemRequest body) throws ApiException, IOException {
        prepareIVRDeleteItemRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> iVRDeleteItemAsync(
            final IVRDeleteItemRequest body) {
        try { 
            return prepareIVRDeleteItemRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for iVRDeleteItem.
     */
    private ApiCall<Void, ApiException> prepareIVRDeleteItemRequest(
            final IVRDeleteItemRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER_1.value())
                        .path("/ivr/deleteitem")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.create("Not Found",
                                (reason, context) -> new IVRDeleteItemException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public String iVRList() throws ApiException, IOException {
        return prepareIVRListRequest().execute();
    }

    /**
     * @return    Returns the String response from the API call
     */
    public CompletableFuture<String> iVRListAsync() {
        try { 
            return prepareIVRListRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for iVRList.
     */
    private ApiCall<String, ApiException> prepareIVRListRequest() throws IOException {
        return new ApiCall.Builder<String, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER_1.value())
                        .path("/ivr/list")
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> new String(response))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the IVRLang response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IVRLang iVRLang() throws ApiException, IOException {
        return prepareIVRLangRequest().execute();
    }

    /**
     * @return    Returns the IVRLang response from the API call
     */
    public CompletableFuture<IVRLang> iVRLangAsync() {
        try { 
            return prepareIVRLangRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for iVRLang.
     */
    private ApiCall<IVRLang, ApiException> prepareIVRLangRequest() throws IOException {
        return new ApiCall.Builder<IVRLang, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER_1.value())
                        .path("/ivr/lang")
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, IVRLang.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}