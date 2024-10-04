# GetStoreStatusApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStoreStatus**](GetStoreStatusApi.md#getStoreStatus) | **GET** /partner/v1/merchants/{merchantID}/store/status | Get Store Status |


<a id="getStoreStatus"></a>
# **getStoreStatus**
> StoreStatusResponse getStoreStatus(authorization, merchantID)

Get Store Status

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.GetStoreStatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    GetStoreStatusApi apiInstance = new GetStoreStatusApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String merchantID = "1-CYNGRUNGSBCCC"; // String | The merchant's ID that is in GrabFood's database.
    try {
      StoreStatusResponse result = apiInstance.getStoreStatus(authorization, merchantID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetStoreStatusApi#getStoreStatus");
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
| **merchantID** | **String**| The merchant&#39;s ID that is in GrabFood&#39;s database. | |

### Return type

[**StoreStatusResponse**](StoreStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized. The access token is invalid. |  -  |
| **5XX** | All other unexpected errors. |  -  |

