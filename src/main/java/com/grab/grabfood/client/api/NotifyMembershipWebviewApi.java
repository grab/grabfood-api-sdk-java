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


import com.grab.grabfood.client.model.NotifyMembershipWebviewRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotifyMembershipWebviewApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NotifyMembershipWebviewApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotifyMembershipWebviewApi(ApiClient apiClient) {
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
     * Build call for notifyMembershipWebview
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param contentType The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. (required)
     * @param notifyMembershipWebviewRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Success. No content returned. </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notifyMembershipWebviewCall(String authorization, String contentType, NotifyMembershipWebviewRequest notifyMembershipWebviewRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = notifyMembershipWebviewRequest;

        // create path and map variables
        String localVarPath = "/partner/v1/membership/notify";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        final String[] localVarAccepts = {
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call notifyMembershipWebviewValidateBeforeCall(String authorization, String contentType, NotifyMembershipWebviewRequest notifyMembershipWebviewRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling notifyMembershipWebview(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling notifyMembershipWebview(Async)");
        }

        // verify the required parameter 'notifyMembershipWebviewRequest' is set
        if (notifyMembershipWebviewRequest == null) {
            throw new ApiException("Missing the required parameter 'notifyMembershipWebviewRequest' when calling notifyMembershipWebview(Async)");
        }

        return notifyMembershipWebviewCall(authorization, contentType, notifyMembershipWebviewRequest, _callback);

    }

    /**
     * Notify Membership
     * 
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param contentType The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. (required)
     * @param notifyMembershipWebviewRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Success. No content returned. </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Failed. </td><td>  -  </td></tr>
     </table>
     */
    public void notifyMembershipWebview(String authorization, String contentType, NotifyMembershipWebviewRequest notifyMembershipWebviewRequest) throws ApiException {
        notifyMembershipWebviewWithHttpInfo(authorization, contentType, notifyMembershipWebviewRequest);
    }

    /**
     * Notify Membership
     * 
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param contentType The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. (required)
     * @param notifyMembershipWebviewRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Success. No content returned. </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Failed. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> notifyMembershipWebviewWithHttpInfo(String authorization, String contentType, NotifyMembershipWebviewRequest notifyMembershipWebviewRequest) throws ApiException {
        okhttp3.Call localVarCall = notifyMembershipWebviewValidateBeforeCall(authorization, contentType, notifyMembershipWebviewRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Notify Membership (asynchronously)
     * 
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param contentType The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. (required)
     * @param notifyMembershipWebviewRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Success. No content returned. </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notifyMembershipWebviewAsync(String authorization, String contentType, NotifyMembershipWebviewRequest notifyMembershipWebviewRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = notifyMembershipWebviewValidateBeforeCall(authorization, contentType, notifyMembershipWebviewRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
