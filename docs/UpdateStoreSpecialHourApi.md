# UpdateStoreSpecialHourApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateStoreSpecialHour**](UpdateStoreSpecialHourApi.md#updateStoreSpecialHour) | **PUT** /partner/v2/merchants/{merchantID}/store/special-opening-hour | Update Store Special Hours |


<a id="updateStoreSpecialHour"></a>
# **updateStoreSpecialHour**
> UpdateSpecialHourResponse updateStoreSpecialHour(contentType, authorization, merchantID, updateSpecialHourRequest)

Update Store Special Hours

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.UpdateStoreSpecialHourApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    UpdateStoreSpecialHourApi apiInstance = new UpdateStoreSpecialHourApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String merchantID = "1-CYNGRUNGSBCCC"; // String | The merchant's ID that is in GrabFood's database.
    UpdateSpecialHourRequest updateSpecialHourRequest = new UpdateSpecialHourRequest(); // UpdateSpecialHourRequest | 
    try {
      UpdateSpecialHourResponse result = apiInstance.updateStoreSpecialHour(contentType, authorization, merchantID, updateSpecialHourRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateStoreSpecialHourApi#updateStoreSpecialHour");
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
| **updateSpecialHourRequest** | [**UpdateSpecialHourRequest**](UpdateSpecialHourRequest.md)|  | |

### Return type

[**UpdateSpecialHourResponse**](UpdateSpecialHourResponse.md)

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

