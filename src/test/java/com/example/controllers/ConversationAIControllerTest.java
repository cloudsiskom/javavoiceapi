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
import com.example.models.AIName;
import com.example.models.IntentDelete;
import com.example.models.IntentDeleteRequest;
import com.example.models.IntentEdit;
import com.example.models.IntentEditRequest;
import com.example.models.IntentList;
import com.example.models.IntentQuery;
import com.example.models.IntentQueryRequest;
import io.apimatic.core.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConversationAIControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static SiskomVoiceAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ConversationAIController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getConversationAIController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for Intent query.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testIntentQuery() throws Exception {
        // Parameters for the API call
        IntentQueryRequest body = ApiHelper.deserialize(
                "{\r\n  \"ai_name\": \"[AI_NAME]\",\r\n  \"training_phrases\": \"[TRAINING_PHRASE]"
                + "\"\r\n}",
                IntentQueryRequest.class);

        // Set callback and perform API call
        IntentQuery result = null;
        try {
            result = controller.intentQuery(body);
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
                "{\r\n  \"response\": true,\r\n  \"message_texts\": \"Saya tidak dengar Anda bilang"
                + " apa. Bisa ulangi lagi?\"\r\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Test case for Intent list.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testIntentList() throws Exception {

        // Set callback and perform API call
        IntentList result = null;
        try {
            result = controller.intentList();
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
                "{\r\n  \"response\": true,\r\n  \"data\": [\r\n    {\r\n      \"id\": 14,\r\n     "
                + " \"ai_name\": \"BANK_BKKN\",\r\n      \"display_name\": \"sahabat\",\r\n      "
                + "\"training_phrases\": \"sahabatmu siapa\",\r\n      \"message_texts\": \"nggak p"
                + "unya deh\",\r\n      \"create_date\": \"2022-08-22T19:59:06.000Z\"\r\n    },\r\n"
                + "    {\r\n      \"id\": 15,\r\n      \"ai_name\": \"BANK_BKKN\",\r\n      \"displ"
                + "ay_name\": \"terima kasih\",\r\n      \"training_phrases\": \"terima kasih\",\r"
                + "\n      \"message_texts\": \"pulang saja kamu sana!\",\r\n      \"create_date\":"
                + " \"2022-08-23T14:45:39.000Z\"\r\n    },\r\n    {\r\n      \"id\": 16,\r\n      "
                + "\"ai_name\": \"BANK_BKKN\",\r\n      \"display_name\": \"teman\",\r\n      \"tra"
                + "ining_phrases\": \"temanmu siapa\",\r\n      \"message_texts\": \"nggak punya ju"
                + "ga\",\r\n      \"create_date\": \"2022-08-24T02:11:58.000Z\"\r\n    },\r\n    {"
                + "\r\n      \"id\": 17,\r\n      \"ai_name\": \"BANK_BKKN\",\r\n      \"display_na"
                + "me\": \"kamu siapa yang buat\",\r\n      \"training_phrases\": \"kamu siapa yang"
                + " buat;siapa yang buat;programmermu siapa\",\r\n      \"message_texts\": \"Aku la"
                + "hir dari batu !\",\r\n      \"create_date\": \"2022-08-25T18:53:35.000Z\"\r\n   "
                + " },\r\n    {\r\n      \"id\": 19,\r\n      \"ai_name\": \"BANK_BKKN\",\r\n      "
                + "\"display_name\": \"Hidayat\",\r\n      \"training_phrases\": \"hidayat\",\r\n  "
                + "    \"message_texts\": \"jelek banget\",\r\n      \"create_date\": \"2022-09-01T"
                + "17:02:54.000Z\"\r\n    }\r\n  ]\r\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Test case for Intent edit.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testIntentEdit() throws Exception {
        // Parameters for the API call
        IntentEditRequest body = ApiHelper.deserialize(
                "{\r\n  \"ai_name\": \"[AI_NAME]\",\r\n  \"display_name\": \"[DISPLAY_NAME]\",\r\n "
                + " \"training_phrases\": \"[TRAINING_PHRASE,SPARATED BY ;]\",\r\n  \"message_texts"
                + "\": \"[RESPONSE_TEXT SPARATED BY ;]\"\r\n}",
                IntentEditRequest.class);

        // Set callback and perform API call
        IntentEdit result = null;
        try {
            result = controller.intentEdit(body);
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
                "{\r\n  \"response\": true,\r\n  \"message\": \"Update intent success\"\r\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Test case for AI Name.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testAIName() throws Exception {

        // Set callback and perform API call
        AIName result = null;
        try {
            result = controller.aIName();
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
                "{\r\n  \"response\": true,\r\n  \"data\": [\r\n    {\r\n      \"id\": 1,\r\n      "
                + "\"ai_name\": \"BANK_BKKN\",\r\n      \"create_date\": \"2022-08-15T17:13:43.000Z"
                + "\"\r\n    }\r\n  ]\r\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Test case for Intent delete.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testIntentDelete() throws Exception {
        // Parameters for the API call
        IntentDeleteRequest body = ApiHelper.deserialize(
                "{\r\n  \"ai_name\": \"[AI_NAME]\",\r\n  \"display_name\": \"[DISPLAY_NAME]\"\r\n}",
                IntentDeleteRequest.class);

        // Set callback and perform API call
        IntentDelete result = null;
        try {
            result = controller.intentDelete(body);
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
                "{\r\n  \"response\": true,\r\n  \"message\": \"Delete intent success\"\r\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
