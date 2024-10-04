# GetOauthGrabApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOauthGrab**](GetOauthGrabApi.md#getOauthGrab) | **POST** /grabid/v1/oauth2/token | Get Oauth access token |


<a id="getOauthGrab"></a>
# **getOauthGrab**
> GrabOauthResponse getOauthGrab(contentType, grabOauthRequest)

Get Oauth access token

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.GetOauthGrabApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    GetOauthGrabApi apiInstance = new GetOauthGrabApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    GrabOauthRequest grabOauthRequest = new GrabOauthRequest(); // GrabOauthRequest | 
    try {
      GrabOauthResponse result = apiInstance.getOauthGrab(contentType, grabOauthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetOauthGrabApi#getOauthGrab");
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
| **grabOauthRequest** | [**GrabOauthRequest**](GrabOauthRequest.md)|  | |

### Return type

[**GrabOauthResponse**](GrabOauthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |

