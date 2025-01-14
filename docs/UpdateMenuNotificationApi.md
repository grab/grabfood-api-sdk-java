# UpdateMenuNotificationApi

All URIs are relative to *https://partner-api.grab.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateMenuNotification**](UpdateMenuNotificationApi.md#updateMenuNotification) | **POST** /partner/v1/merchant/menu/notification | Notify Grab of updated menu |


<a id="updateMenuNotification"></a>
# **updateMenuNotification**
> updateMenuNotification(contentType, authorization, updateMenuNotifRequest)

Notify Grab of updated menu

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.UpdateMenuNotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.grab.com/grabfood-sandbox");

    UpdateMenuNotificationApi apiInstance = new UpdateMenuNotificationApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    UpdateMenuNotifRequest updateMenuNotifRequest = new UpdateMenuNotifRequest(); // UpdateMenuNotifRequest | 
    try {
      apiInstance.updateMenuNotification(contentType, authorization, updateMenuNotifRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateMenuNotificationApi#updateMenuNotification");
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
| **updateMenuNotifRequest** | [**UpdateMenuNotifRequest**](UpdateMenuNotifRequest.md)|  | |

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
| **204** | Successful. No Content returned. |  * x-job-id - Uniquely identifies a menu sync job. Please mention this value while raising any issues on [Menu sync state webhook](#tag/menu-sync-state-webhook). <br>  |
| **4XX** | invalid_argument Fail example with code and reason. | Code | Reason           | Message                                            | | -----| ---------------  | -------------------------------------------------- | | 409  | invalid_argument | sync menu too frequently, retry after 120 seconds  |  &gt; Note: A distributed interval lock mechanism with a default duration of 120 seconds is in place for the same requests sent. The lock duration is customizable and may vary across different partners.  |  -  |

