# UpdateCampaignApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateCampaign**](UpdateCampaignApi.md#updateCampaign) | **PUT** /partner/v1/campaigns/{campaign_id} | Update campaign |


<a id="updateCampaign"></a>
# **updateCampaign**
> updateCampaign(contentType, authorization, campaignId, updateCampaignRequest)

Update campaign

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.UpdateCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    UpdateCampaignApi apiInstance = new UpdateCampaignApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String campaignId = "campaignId_example"; // String | 
    UpdateCampaignRequest updateCampaignRequest = new UpdateCampaignRequest(); // UpdateCampaignRequest | 
    try {
      apiInstance.updateCampaign(contentType, authorization, campaignId, updateCampaignRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateCampaignApi#updateCampaign");
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
| **campaignId** | **String**|  | |
| **updateCampaignRequest** | [**UpdateCampaignRequest**](UpdateCampaignRequest.md)|  | |

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
| **204** | The API request is successfully processed. |  -  |

