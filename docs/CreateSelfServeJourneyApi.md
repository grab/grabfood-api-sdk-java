# CreateSelfServeJourneyApi

All URIs are relative to *https://partner-api.grab.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSelfServeJourney**](CreateSelfServeJourneyApi.md#createSelfServeJourney) | **POST** /partner/v1/self-serve/activation | Create self serve journey |


<a id="createSelfServeJourney"></a>
# **createSelfServeJourney**
> CreateSelfServeJourneyResponse createSelfServeJourney(contentType, authorization, createSelfServeJourneyRequest)

Create self serve journey

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.CreateSelfServeJourneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.grab.com/grabfood-sandbox");

    CreateSelfServeJourneyApi apiInstance = new CreateSelfServeJourneyApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    CreateSelfServeJourneyRequest createSelfServeJourneyRequest = new CreateSelfServeJourneyRequest(); // CreateSelfServeJourneyRequest | 
    try {
      CreateSelfServeJourneyResponse result = apiInstance.createSelfServeJourney(contentType, authorization, createSelfServeJourneyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSelfServeJourneyApi#createSelfServeJourney");
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
| **createSelfServeJourneyRequest** | [**CreateSelfServeJourneyRequest**](CreateSelfServeJourneyRequest.md)|  | |

### Return type

[**CreateSelfServeJourneyResponse**](CreateSelfServeJourneyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

