# AcceptRejectOrderApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptRejectOrder**](AcceptRejectOrderApi.md#acceptRejectOrder) | **POST** /partner/v1/order/prepare | Manually accept/reject orders |


<a id="acceptRejectOrder"></a>
# **acceptRejectOrder**
> acceptRejectOrder(authorization, contentType, acceptOrderRequest)

Manually accept/reject orders

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.AcceptRejectOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    AcceptRejectOrderApi apiInstance = new AcceptRejectOrderApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    AcceptOrderRequest acceptOrderRequest = new AcceptOrderRequest(); // AcceptOrderRequest | 
    try {
      apiInstance.acceptRejectOrder(authorization, contentType, acceptOrderRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcceptRejectOrderApi#acceptRejectOrder");
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
| **acceptOrderRequest** | [**AcceptOrderRequest**](AcceptOrderRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful. No content returned. |  -  |

