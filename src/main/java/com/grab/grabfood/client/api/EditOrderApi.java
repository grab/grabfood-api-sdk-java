// Copyright 2024 Grabtaxi Holdings PTE LTE (GRAB), All rights reserved.
// Use of this source code is governed by an MIT-style license that can be found in the LICENSE file

/*
 * GrabFood
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.grab.grabfood.client.api;

import com.grab.grabfood.client.ApiCallback;
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.ApiResponse;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.Pair;
import com.grab.grabfood.client.ProgressRequestBody;
import com.grab.grabfood.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.grab.grabfood.client.model.EditOrderRequest;
import com.grab.grabfood.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EditOrderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EditOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EditOrderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for editOrder
     * @param contentType The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. (required)
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param orderID  (required)
     * @param editOrderRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful. No content returned. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> invalid_argument Fail example with code and reason. | Code | Reason | Message | | ------| ------| ------ | | 400 | invalid_argument | nothing changed | | 400 | invalid_argument | can&#39;t remove all items | | 404 | not_found | order detail abnormal | | 403 | forbidden | not editable | | 400 | invalid_argument | recalculate failed | | 400 | invalid_argument| submit edit failed | | 404 | not_found | get merchant failed | | 400 | invalid_argument | exceed basket limit | | 400 | invalid_argument | exceed price increase limit | | 400 | invalid_argument | negative weight | | 400 | invalid_argument | parameters must include all items | | 400 | invalid_argument | fraud check error | | 400  | invalid_argument | externalItemID not supported for this status | | 400 | invalid_argument | externalItemID inactive or out of selling time | | 400 | invalid_argument | added item invalid |  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call editOrderCall(String contentType, String authorization, String orderID, EditOrderRequest editOrderRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = editOrderRequest;

        // create path and map variables
        String localVarPath = "/partner/v1/orders/{orderID}"
            .replace("{" + "orderID" + "}", localVarApiClient.escapeString(orderID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call editOrderValidateBeforeCall(String contentType, String authorization, String orderID, EditOrderRequest editOrderRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling editOrder(Async)");
        }

        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling editOrder(Async)");
        }

        // verify the required parameter 'orderID' is set
        if (orderID == null) {
            throw new ApiException("Missing the required parameter 'orderID' when calling editOrder(Async)");
        }

        // verify the required parameter 'editOrderRequest' is set
        if (editOrderRequest == null) {
            throw new ApiException("Missing the required parameter 'editOrderRequest' when calling editOrder(Async)");
        }

        return editOrderCall(contentType, authorization, orderID, editOrderRequest, _callback);

    }

    /**
     * Edit Order
     * 
     * @param contentType The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. (required)
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param orderID  (required)
     * @param editOrderRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful. No content returned. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> invalid_argument Fail example with code and reason. | Code | Reason | Message | | ------| ------| ------ | | 400 | invalid_argument | nothing changed | | 400 | invalid_argument | can&#39;t remove all items | | 404 | not_found | order detail abnormal | | 403 | forbidden | not editable | | 400 | invalid_argument | recalculate failed | | 400 | invalid_argument| submit edit failed | | 404 | not_found | get merchant failed | | 400 | invalid_argument | exceed basket limit | | 400 | invalid_argument | exceed price increase limit | | 400 | invalid_argument | negative weight | | 400 | invalid_argument | parameters must include all items | | 400 | invalid_argument | fraud check error | | 400  | invalid_argument | externalItemID not supported for this status | | 400 | invalid_argument | externalItemID inactive or out of selling time | | 400 | invalid_argument | added item invalid |  </td><td>  -  </td></tr>
     </table>
     */
    public void editOrder(String contentType, String authorization, String orderID, EditOrderRequest editOrderRequest) throws ApiException {
        editOrderWithHttpInfo(contentType, authorization, orderID, editOrderRequest);
    }

    /**
     * Edit Order
     * 
     * @param contentType The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. (required)
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param orderID  (required)
     * @param editOrderRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful. No content returned. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> invalid_argument Fail example with code and reason. | Code | Reason | Message | | ------| ------| ------ | | 400 | invalid_argument | nothing changed | | 400 | invalid_argument | can&#39;t remove all items | | 404 | not_found | order detail abnormal | | 403 | forbidden | not editable | | 400 | invalid_argument | recalculate failed | | 400 | invalid_argument| submit edit failed | | 404 | not_found | get merchant failed | | 400 | invalid_argument | exceed basket limit | | 400 | invalid_argument | exceed price increase limit | | 400 | invalid_argument | negative weight | | 400 | invalid_argument | parameters must include all items | | 400 | invalid_argument | fraud check error | | 400  | invalid_argument | externalItemID not supported for this status | | 400 | invalid_argument | externalItemID inactive or out of selling time | | 400 | invalid_argument | added item invalid |  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> editOrderWithHttpInfo(String contentType, String authorization, String orderID, EditOrderRequest editOrderRequest) throws ApiException {
        okhttp3.Call localVarCall = editOrderValidateBeforeCall(contentType, authorization, orderID, editOrderRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Edit Order (asynchronously)
     * 
     * @param contentType The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. (required)
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param orderID  (required)
     * @param editOrderRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful. No content returned. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> invalid_argument Fail example with code and reason. | Code | Reason | Message | | ------| ------| ------ | | 400 | invalid_argument | nothing changed | | 400 | invalid_argument | can&#39;t remove all items | | 404 | not_found | order detail abnormal | | 403 | forbidden | not editable | | 400 | invalid_argument | recalculate failed | | 400 | invalid_argument| submit edit failed | | 404 | not_found | get merchant failed | | 400 | invalid_argument | exceed basket limit | | 400 | invalid_argument | exceed price increase limit | | 400 | invalid_argument | negative weight | | 400 | invalid_argument | parameters must include all items | | 400 | invalid_argument | fraud check error | | 400  | invalid_argument | externalItemID not supported for this status | | 400 | invalid_argument | externalItemID inactive or out of selling time | | 400 | invalid_argument | added item invalid |  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call editOrderAsync(String contentType, String authorization, String orderID, EditOrderRequest editOrderRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = editOrderValidateBeforeCall(contentType, authorization, orderID, editOrderRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
