# EditOrderApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**editOrder**](EditOrderApi.md#editOrder) | **PUT** /partner/v1/orders/{orderID} | Edit Order |


<a id="editOrder"></a>
# **editOrder**
> editOrder(contentType, authorization, orderID, editOrderRequest)

Edit Order

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
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    EditOrderApi apiInstance = new EditOrderApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String orderID = "orderID_example"; // String | 
    EditOrderRequest editOrderRequest = new EditOrderRequest(); // EditOrderRequest | 
    try {
      apiInstance.editOrder(contentType, authorization, orderID, editOrderRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EditOrderApi#editOrder");
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
| **4XX** | invalid_argument Fail example with code and reason. | Code | Reason | Message | | ------| ------| ------ | | 400 | invalid_argument | nothing changed | | 400 | invalid_argument | can&#39;t remove all items | | 404 | not_found | order detail abnormal | | 403 | forbidden | not editable | | 400 | invalid_argument | recalculate failed | | 400 | invalid_argument| submit edit failed | | 404 | not_found | get merchant failed | | 400 | invalid_argument | exceed basket limit | | 400 | invalid_argument | exceed price increase limit | | 400 | invalid_argument | negative weight | | 400 | invalid_argument | parameters must include all items | | 400 | invalid_argument | fraud check error | | 400  | invalid_argument | externalItemID not supported for this status | | 400 | invalid_argument | externalItemID inactive or out of selling time | | 400 | invalid_argument | added item invalid |  |  -  |

