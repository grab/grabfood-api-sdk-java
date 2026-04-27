# EditOrderApi

All URIs are relative to *https://partner-api.grab.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**editOrderV1**](EditOrderApi.md#editOrderV1) | **PUT** /partner/v1/orders/{orderID} | Edit Order V1 |
| [**editOrderV2**](EditOrderApi.md#editOrderV2) | **PUT** /partner/v2/orders/{orderID} | Edit Order V2 |


<a id="editOrderV1"></a>
# **editOrderV1**
> editOrderV1(contentType, authorization, orderID, editOrderRequest)

Edit Order V1

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.EditOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.grab.com/grabfood-sandbox");

    EditOrderApi apiInstance = new EditOrderApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String orderID = "orderID_example"; // String | 
    EditOrderRequest editOrderRequest = new EditOrderRequest(); // EditOrderRequest | 
    try {
      apiInstance.editOrderV1(contentType, authorization, orderID, editOrderRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EditOrderApi#editOrderV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**| The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. | |
| **authorization** | **String**| Specify the generated authorization token of the bearer type. | |
| **orderID** | **String**|  | |
| **editOrderRequest** | [**EditOrderRequest**](EditOrderRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful. No content returned. |  -  |
| **400** | invalid_argument | Code | Reason           | Message                                    | Description                                                                                               |  | ---- | ---------------- | ------------------------------------------ | --------------------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | nothing changed                            | The items struct is empty                                                                                | | 400  | invalid_argument | can&#39;t remove all items                     | we don&#39;t allow clean all the items                                                                      | | 400  | invalid_argument | externalItemID not supported for this status | externalItemID not supported for this status                                                          | | 400  | invalid_argument | externalItemID only allowed for ADDED item status | externalItemID only allowed for ADDED item status                                                 | | 400  | invalid_argument | invalid price, price can&#39;t be negative     | DepositAmountInMin is negative, OfflinePOSDiscountInMin is negative                                     | | 400  | invalid_argument | params must include all items              | params must include all items in the order                                                              | | 400  | invalid_argument | exceed basket limit                        | Total price exceed basket limit                                                                          | | 400  | invalid_argument | exceed max price amount limit              | Total price exceed limit:&lt;br/&gt;• SG: S$1000&lt;br/&gt;• ID: Rp10,000,000&lt;br/&gt;• PH: ₱15,000&lt;br/&gt;• VN: ₫15,000,000&lt;br/&gt;• TH: ฿300,000&lt;br/&gt;• MY: RM1,500 | | 400  | invalid_argument | recalculate failed                         | recalculate failed                                                                                       | | 400  | invalid_argument | submit edit failed                         | submit edit failed                                                                                       | | 400  | invalid_argument | exceed price increase limit                | exceed price increase limit                                                                              | | 400  | invalid_argument | negative weight                            | negative weight                                                                                          | | 400  | invalid_argument | fraud check error                          | fraud check error                                                                                        | | 400  | invalid_argument | externalItemID inactive or out of selling time | externalItemID inactive or out of selling time                                                      | | 400  | invalid_argument | added item invalid                         | added item invalid                                                                                       |  |  -  |
| **403** | forbidden | Code | Reason    | Message      | Description                                                                                               |  | ---- | --------- | ------------ | --------------------------------------------------------------------------------------------------------- |  | 403  | forbidden | not editable | not editable                                                                                              |  |  -  |
| **404** | not_found | Code | Reason    | Message              | Description                                                                                               |  | ---- | --------- | -------------------- | --------------------------------------------------------------------------------------------------------- |  | 404  | not_found | not found order      | The orderID is not found grab status.                                                                   | | 404  | not_found | invalid order        | The order status is wrong for edit action.                                                              | | 404  | not_found | not found item       | The itemID doesn&#39;t match with isExternalItemID and can&#39;t be found from grab system.                     | | 404  | not_found | Invalid item status  | The item status isn&#39;t correct. Eg, there is no item in the order but want to delete it.                | | 404  | not_found | order detail abnormal | order detail abnormal                                                                                   | | 404  | not_found | get merchant failed  | get merchant failed                                                                                      |  |  -  |

<a id="editOrderV2"></a>
# **editOrderV2**
> EditOrderV2Response editOrderV2(contentType, authorization, orderID, editOrderRequest)

Edit Order V2

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.EditOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.grab.com/grabfood-sandbox");

    EditOrderApi apiInstance = new EditOrderApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String orderID = "orderID_example"; // String | 
    EditOrderRequest editOrderRequest = new EditOrderRequest(); // EditOrderRequest | 
    try {
      EditOrderV2Response result = apiInstance.editOrderV2(contentType, authorization, orderID, editOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EditOrderApi#editOrderV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**| The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. | |
| **authorization** | **String**| Specify the generated authorization token of the bearer type. | |
| **orderID** | **String**|  | |
| **editOrderRequest** | [**EditOrderRequest**](EditOrderRequest.md)|  | |

### Return type

[**EditOrderV2Response**](EditOrderV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |
| **400** | invalid_argument | Code | Reason           | Message                                    | Description                                                                                               |  | ---- | ---------------- | ------------------------------------------ | --------------------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | nothing changed                            | The items struct is empty                                                                                | | 400  | invalid_argument | can&#39;t remove all items                     | we don&#39;t allow clean all the items                                                                      | | 400  | invalid_argument | externalItemID not supported for this status | externalItemID not supported for this status                                                          | | 400  | invalid_argument | externalItemID only allowed for ADDED item status | externalItemID only allowed for ADDED item status                                                 | | 400  | invalid_argument | invalid price, price can&#39;t be negative     | DepositAmountInMin is negative, OfflinePOSDiscountInMin is negative                                     | | 400  | invalid_argument | params must include all items              | params must include all items in the order                                                              | | 400  | invalid_argument | exceed basket limit                        | Total price exceed basket limit                                                                          | | 400  | invalid_argument | exceed max price amount limit              | Total price exceed limit:&lt;br/&gt;• SG: S$1000&lt;br/&gt;• ID: Rp10,000,000&lt;br/&gt;• PH: ₱15,000&lt;br/&gt;• VN: ₫15,000,000&lt;br/&gt;• TH: ฿300,000&lt;br/&gt;• MY: RM1,500 | | 400  | invalid_argument | recalculate failed                         | recalculate failed                                                                                       | | 400  | invalid_argument | submit edit failed                         | submit edit failed                                                                                       | | 400  | invalid_argument | exceed price increase limit                | exceed price increase limit                                                                              | | 400  | invalid_argument | negative weight                            | negative weight                                                                                          | | 400  | invalid_argument | fraud check error                          | fraud check error                                                                                        | | 400  | invalid_argument | externalItemID inactive or out of selling time | externalItemID inactive or out of selling time                                                      | | 400  | invalid_argument | added item invalid                         | added item invalid                                                                                       |  |  -  |
| **403** | forbidden | Code | Reason    | Message      | Description                                                                                               |  | ---- | --------- | ------------ | --------------------------------------------------------------------------------------------------------- |  | 403  | forbidden | not editable | not editable                                                                                              |  |  -  |
| **404** | not_found | Code | Reason    | Message              | Description                                                                                               |  | ---- | --------- | -------------------- | --------------------------------------------------------------------------------------------------------- |  | 404  | not_found | not found order      | The orderID is not found grab status.                                                                   | | 404  | not_found | invalid order        | The order status is wrong for edit action.                                                              | | 404  | not_found | not found item       | The itemID doesn&#39;t match with isExternalItemID and can&#39;t be found from grab system.                     | | 404  | not_found | Invalid item status  | The item status isn&#39;t correct. Eg, there is no item in the order but want to delete it.                | | 404  | not_found | order detail abnormal | order detail abnormal                                                                                   | | 404  | not_found | get merchant failed  | get merchant failed                                                                                      |  |  -  |

