# MarkOrderReadyApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**markOrderReady**](MarkOrderReadyApi.md#markOrderReady) | **POST** /partner/v1/orders/mark | Mark order as ready |


<a id="markOrderReady"></a>
# **markOrderReady**
> markOrderReady(contentType, authorization, markOrderRequest)

Mark order as ready

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.MarkOrderReadyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    MarkOrderReadyApi apiInstance = new MarkOrderReadyApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    MarkOrderRequest markOrderRequest = new MarkOrderRequest(); // MarkOrderRequest | 
    try {
      apiInstance.markOrderReady(contentType, authorization, markOrderRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarkOrderReadyApi#markOrderReady");
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
| **markOrderRequest** | [**MarkOrderRequest**](MarkOrderRequest.md)|  | |

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
| **400** | invalid_argument | Code | Reason | Message | | ----- | ------ | ------- | | 400 | invalid_argument | invalid order state | | 400 | invalid_argument | order already marked ready| | 400 | invalid_argument | invalid markStatus: 0|  |  -  |

