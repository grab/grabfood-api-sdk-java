# UpdateStoreDineInHourApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateStoreDineInHour**](UpdateStoreDineInHourApi.md#updateStoreDineInHour) | **PUT** /partner/v1/merchants/{merchantID}/store/dine-in-hours | Update Store Dine-in Hours |


<a id="updateStoreDineInHour"></a>
# **updateStoreDineInHour**
> UpdateDineInHourResponse updateStoreDineInHour(contentType, authorization, merchantID, updateDineInHourRequest)

Update Store Dine-in Hours

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.UpdateStoreDineInHourApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    UpdateStoreDineInHourApi apiInstance = new UpdateStoreDineInHourApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String merchantID = "1-CYNGRUNGSBCCC"; // String | The merchant's ID that is in GrabFood's database.
    UpdateDineInHourRequest updateDineInHourRequest = new UpdateDineInHourRequest(); // UpdateDineInHourRequest | 
    try {
      UpdateDineInHourResponse result = apiInstance.updateStoreDineInHour(contentType, authorization, merchantID, updateDineInHourRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateStoreDineInHourApi#updateStoreDineInHour");
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
| **merchantID** | **String**| The merchant&#39;s ID that is in GrabFood&#39;s database. | |
| **updateDineInHourRequest** | [**UpdateDineInHourRequest**](UpdateDineInHourRequest.md)|  | |

### Return type

[**UpdateDineInHourResponse**](UpdateDineInHourResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized. The access token is invalid. |  -  |
| **5XX** | All other unexpected errors. |  -  |

