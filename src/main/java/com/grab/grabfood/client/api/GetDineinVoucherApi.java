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


import com.grab.grabfood.client.model.Error;
import com.grab.grabfood.client.model.GetDineInVoucherResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetDineinVoucherApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GetDineinVoucherApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GetDineinVoucherApi(ApiClient apiClient) {
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
     * Build call for getDineinVoucher
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param merchantID  (required)
     * @param voucherCode A short code for the dine-in voucher purchased by the user. Required if &#x60;certificateID&#x60; is not specified. (optional)
     * @param certificateID This certificateID is decoded from scanning the QR code, and 1:1 mapping with voucherCode. Required if &#x60;voucherCode&#x60; is not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The API request is successfully processed. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid_argument | Code | Reason           | Message                                    | Description                                                                                    |  | ---- | ---------------- | ------------------------------------------ | ---------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | invalid certificateID                      | The certificateID is not valid.                                                                | | 400  | invalid_argument | voucherCode or certificateID not specified | The voucherCode and certificateID are both empty in params, one of the both must be provided.  |  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not_found | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 404  | not_found   | voucher not found            | The voucher is not found for the specified voucherCode or certificateID.                        | | 404  | not_found   | failed to get store info     | The store is not found for the specified merchantID.                                             |  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDineinVoucherCall(String authorization, String merchantID, String voucherCode, String certificateID, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/partner/v1/dinein/voucher";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (voucherCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("voucherCode", voucherCode));
        }

        if (certificateID != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("certificateID", certificateID));
        }

        if (merchantID != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchantID", merchantID));
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDineinVoucherValidateBeforeCall(String authorization, String merchantID, String voucherCode, String certificateID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getDineinVoucher(Async)");
        }

        // verify the required parameter 'merchantID' is set
        if (merchantID == null) {
            throw new ApiException("Missing the required parameter 'merchantID' when calling getDineinVoucher(Async)");
        }

        return getDineinVoucherCall(authorization, merchantID, voucherCode, certificateID, _callback);

    }

    /**
     * Get Dine In Voucher
     * 
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param merchantID  (required)
     * @param voucherCode A short code for the dine-in voucher purchased by the user. Required if &#x60;certificateID&#x60; is not specified. (optional)
     * @param certificateID This certificateID is decoded from scanning the QR code, and 1:1 mapping with voucherCode. Required if &#x60;voucherCode&#x60; is not specified. (optional)
     * @return GetDineInVoucherResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The API request is successfully processed. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid_argument | Code | Reason           | Message                                    | Description                                                                                    |  | ---- | ---------------- | ------------------------------------------ | ---------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | invalid certificateID                      | The certificateID is not valid.                                                                | | 400  | invalid_argument | voucherCode or certificateID not specified | The voucherCode and certificateID are both empty in params, one of the both must be provided.  |  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not_found | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 404  | not_found   | voucher not found            | The voucher is not found for the specified voucherCode or certificateID.                        | | 404  | not_found   | failed to get store info     | The store is not found for the specified merchantID.                                             |  </td><td>  -  </td></tr>
     </table>
     */
    public GetDineInVoucherResponse getDineinVoucher(String authorization, String merchantID, String voucherCode, String certificateID) throws ApiException {
        ApiResponse<GetDineInVoucherResponse> localVarResp = getDineinVoucherWithHttpInfo(authorization, merchantID, voucherCode, certificateID);
        return localVarResp.getData();
    }

    /**
     * Get Dine In Voucher
     * 
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param merchantID  (required)
     * @param voucherCode A short code for the dine-in voucher purchased by the user. Required if &#x60;certificateID&#x60; is not specified. (optional)
     * @param certificateID This certificateID is decoded from scanning the QR code, and 1:1 mapping with voucherCode. Required if &#x60;voucherCode&#x60; is not specified. (optional)
     * @return ApiResponse&lt;GetDineInVoucherResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The API request is successfully processed. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid_argument | Code | Reason           | Message                                    | Description                                                                                    |  | ---- | ---------------- | ------------------------------------------ | ---------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | invalid certificateID                      | The certificateID is not valid.                                                                | | 400  | invalid_argument | voucherCode or certificateID not specified | The voucherCode and certificateID are both empty in params, one of the both must be provided.  |  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not_found | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 404  | not_found   | voucher not found            | The voucher is not found for the specified voucherCode or certificateID.                        | | 404  | not_found   | failed to get store info     | The store is not found for the specified merchantID.                                             |  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetDineInVoucherResponse> getDineinVoucherWithHttpInfo(String authorization, String merchantID, String voucherCode, String certificateID) throws ApiException {
        okhttp3.Call localVarCall = getDineinVoucherValidateBeforeCall(authorization, merchantID, voucherCode, certificateID, null);
        Type localVarReturnType = new TypeToken<GetDineInVoucherResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Dine In Voucher (asynchronously)
     * 
     * @param authorization Specify the generated authorization token of the bearer type. (required)
     * @param merchantID  (required)
     * @param voucherCode A short code for the dine-in voucher purchased by the user. Required if &#x60;certificateID&#x60; is not specified. (optional)
     * @param certificateID This certificateID is decoded from scanning the QR code, and 1:1 mapping with voucherCode. Required if &#x60;voucherCode&#x60; is not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The API request is successfully processed. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> invalid_argument | Code | Reason           | Message                                    | Description                                                                                    |  | ---- | ---------------- | ------------------------------------------ | ---------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | invalid certificateID                      | The certificateID is not valid.                                                                | | 400  | invalid_argument | voucherCode or certificateID not specified | The voucherCode and certificateID are both empty in params, one of the both must be provided.  |  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not_found | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 404  | not_found   | voucher not found            | The voucher is not found for the specified voucherCode or certificateID.                        | | 404  | not_found   | failed to get store info     | The store is not found for the specified merchantID.                                             |  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDineinVoucherAsync(String authorization, String merchantID, String voucherCode, String certificateID, final ApiCallback<GetDineInVoucherResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDineinVoucherValidateBeforeCall(authorization, merchantID, voucherCode, certificateID, _callback);
        Type localVarReturnType = new TypeToken<GetDineInVoucherResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
