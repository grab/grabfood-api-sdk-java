# CheckOrderCancelableApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkOrderCancelable**](CheckOrderCancelableApi.md#checkOrderCancelable) | **GET** /partner/v1/order/cancelable | Check order cancelable |


<a id="checkOrderCancelable"></a>
# **checkOrderCancelable**
> CheckOrderCancelableResponse checkOrderCancelable(authorization, orderID, merchantID)

Check order cancelable

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.CheckOrderCancelableApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    CheckOrderCancelableApi apiInstance = new CheckOrderCancelableApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String orderID = "orderID_example"; // String | 
    String merchantID = "1-CYNGRUNGSBCCC"; // String | The merchant's ID that is in GrabFood's database.
    try {
      CheckOrderCancelableResponse result = apiInstance.checkOrderCancelable(authorization, orderID, merchantID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckOrderCancelableApi#checkOrderCancelable");
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
| **orderID** | **String**|  | |
| **merchantID** | **String**| The merchant&#39;s ID that is in GrabFood&#39;s database. | |

### Return type

[**CheckOrderCancelableResponse**](CheckOrderCancelableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |

