# CreateCampaignApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCampaign**](CreateCampaignApi.md#createCampaign) | **POST** /partner/v1/campaigns | Create campaign |


<a id="createCampaign"></a>
# **createCampaign**
> CreateCampaignResponse createCampaign(contentType, authorization, createCampaignRequest)

Create campaign

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.CreateCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    CreateCampaignApi apiInstance = new CreateCampaignApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    CreateCampaignRequest createCampaignRequest = new CreateCampaignRequest(); // CreateCampaignRequest | 
    try {
      CreateCampaignResponse result = apiInstance.createCampaign(contentType, authorization, createCampaignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateCampaignApi#createCampaign");
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
| **createCampaignRequest** | [**CreateCampaignRequest**](CreateCampaignRequest.md)|  | |

### Return type

[**CreateCampaignResponse**](CreateCampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |
| **400** | invalid_argument | Code | Reason           | Message                            | | ---- | ---------------- | ----------------------------------- | | 400  | invalid_argument | items not found                  | | 400  | invalid_argument | startTime has to be after now    | | 400  | invalid_argument | CAMPAIGN_START_TIME_TOO_CLOSE_TO_NOW:failed to create MFC:    | | 400  | invalid_argument | CAMPAIGN_DURATION_TOO_LONG:failed to create MFC:    | | 400  | invalid_argument | EFFECTIVE_DATE_OVERLAP:failed to create MFC: Item(s) are on multiple promotions in the same promotion period: SGITE2021052909250501859400 (4-CY4VMFMANYBYJ6-CZNZFFL1G8KKLX-94794295)\&quot;    | | 400  | invalid_argument | EATER_TYPE_CONDITION_IS_NOT_SUPPORTED:failed to create MFC: This level campaign can&#39;t be applied for such eater type    | | 400  | invalid_argument | INVALID_QUOTAS:failed to create MFC:    | | 400  | invalid_argument | INVALID_DISCOUNT_VALUE:failed to create MFC:     | | 400  | invalid_argument | INVALID_PARAMS:failed to create MFC: Order level campaign should have min basket condition    | | 400  | invalid_argument | INVALID_BUNDLE_OFFER:failed to create MFC: bundle price invalid    | | 400  | invalid_argument | INVALID_BUNDLE_OFFER:failed to create MFC: itemIDs should be between 2 and 20    | | 400  | invalid_argument | NOT_SUPPORT_BUNDLE_SAME_MULTIPLE_ITEMS:failed to create MFC: bundle multiple items is not supported for same item bundle    | | 400  | invalid_argument | EXCEED_ACTIVE_CAMPAIGN_MAX_LIMIT:failed to create MFC: number of same campaign level&#39;s promotions exceeds maximum limit(100)    |  |  -  |

