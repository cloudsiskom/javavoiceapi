/*
 * SiskomVoiceAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.ApiHelper;
import com.example.SiskomVoiceAPIClient;
import com.example.exceptions.ApiException;
import com.example.models.AgentDelete;
import com.example.models.AgentDeleteRequest;
import com.example.models.AgentList;
import com.example.models.AgentNew;
import com.example.models.AgentNewRequest;
import io.apimatic.core.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AgentControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static SiskomVoiceAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static AgentController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAgentController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * ACTION : \* new (New agent) \* edit (Edit existing Agent).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testAgentNew() throws Exception {
        // Parameters for the API call
        AgentNewRequest body = ApiHelper.deserialize(
                "{\r\n  \"action\": \"[ACTION]\",\r\n  \"agent_code\": \"[AGENT_CODE]\",\r\n  \"age"
                + "nt_name\": \"[AGENT_NAME]\",\r\n  \"agent_password\": \"[AGENT_PASSWORD]\"\r\n}",
                AgentNewRequest.class);

        // Set callback and perform API call
        AgentNew result = null;
        try {
            result = controller.agentNew(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        headers.put("Date", TestHelper.nullString);
        headers.put("Server", TestHelper.nullString);
        headers.put("X-Powered-By", TestHelper.nullString);
        headers.put("Content-Length", TestHelper.nullString);
        headers.put("ETag", TestHelper.nullString);
        headers.put("Keep-Alive", TestHelper.nullString);
        headers.put("Connection", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\r\n  \"response\": true,\r\n  \"data\": {\r\n    \"action\": \"new\",\r\n    \"a"
                + "gent_code\": \"10002\",\r\n    \"agent_name\": \"queue-152\",\r\n    \"agent_pas"
                + "sword\": \"4321\"\r\n  }\r\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Test case for Agent delete.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testAgentDelete() throws Exception {
        // Parameters for the API call
        AgentDeleteRequest body = ApiHelper.deserialize(
                "{\r\n  \"agent_code\": \"[AGENT_CODE]\"\r\n}",
                AgentDeleteRequest.class);

        // Set callback and perform API call
        AgentDelete result = null;
        try {
            result = controller.agentDelete(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        headers.put("Date", TestHelper.nullString);
        headers.put("Server", TestHelper.nullString);
        headers.put("X-Powered-By", TestHelper.nullString);
        headers.put("Content-Length", TestHelper.nullString);
        headers.put("ETag", TestHelper.nullString);
        headers.put("Keep-Alive", TestHelper.nullString);
        headers.put("Connection", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\r\n  \"response\": true,\r\n  \"data\": {\r\n    \"agent_code\": \"10002\"\r\n  "
                + "}\r\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Test case for Agent list.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testAgentList() throws Exception {

        // Set callback and perform API call
        AgentList result = null;
        try {
            result = controller.agentList();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        headers.put("Date", TestHelper.nullString);
        headers.put("Server", TestHelper.nullString);
        headers.put("X-Powered-By", TestHelper.nullString);
        headers.put("Content-Length", TestHelper.nullString);
        headers.put("ETag", TestHelper.nullString);
        headers.put("Keep-Alive", TestHelper.nullString);
        headers.put("Connection", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\r\n  \"response\": true,\r\n  \"data\": [\r\n    {\r\n      \"id\": 34,\r\n     "
                + " \"customer_code\": \"GOJEK\",\r\n      \"agent_code\": 9610002,\r\n      \"agen"
                + "t_name\": \"queue-152\",\r\n      \"require_password\": 1,\r\n      \"agent_pass"
                + "word\": 4321,\r\n      \"lastlogin\": 0,\r\n      \"isActive\": 1,\r\n      \"is"
                + "Login\": 0,\r\n      \"login_channel\": null,\r\n      \"login_extension\": null"
                + ",\r\n      \"login_uniqueid\": null\r\n    }\r\n  ]\r\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
