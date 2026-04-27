# RefundOrderApi

All URIs are relative to *https://partner-api.grab.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**refundOrder**](RefundOrderApi.md#refundOrder) | **POST** /partner/v1/orders/refund | Refund Order |


<a id="refundOrder"></a>
# **refundOrder**
> refundOrder(authorization, contentType, refundOrderRequest)

Refund Order

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.RefundOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.grab.com/grabfood-sandbox");

    RefundOrderApi apiInstance = new RefundOrderApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    RefundOrderRequest refundOrderRequest = new RefundOrderRequest(); // RefundOrderRequest | 
    try {
      apiInstance.refundOrder(authorization, contentType, refundOrderRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundOrderApi#refundOrder");
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
| **authorization** | **String**| Specify the generated authorization token of the bearer type. | |
| **contentType** | **String**| The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. | |
| **refundOrderRequest** | [**RefundOrderRequest**](RefundOrderRequest.md)|  | |

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
| **204** | Success. No content returned. |  -  |
| **400** | invalid_argument | Code | Reason           | Message                                    | Description                                                                                               |  | ---- | ---------------- | ------------------------------------------ | --------------------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | INVALID_ORDER                              | The orderID is not found in grab, or the order is not a ScanToOrder or offline POS order               | | 400  | invalid_argument | ORDER_ALREADY_REFUND                       | The order already been refunded                                                                          | | 400  | invalid_argument | ORDER_WRONG_STATUS_FOR_REFUND              | The order is not in COMPLETED status, can&#39;t be refunded                                                 | | 400  | invalid_argument | REACH_DAILY_THROTTLE                       | Reached daily refund limit                                                                               | | 400  | invalid_argument | TIME_OUT_REFUND_PERIOD                     | Exceed the refund time window                                                                            |  |  -  |
| **404** | Not Found. Order doesn&#39;t exist. |  -  |
| **500** | Internal Server Error. Server encountered an unexpected error that prevented it from serving the API request. |  -  |

