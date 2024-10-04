# ListCampaignApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listCampaign**](ListCampaignApi.md#listCampaign) | **GET** /partner/v1/campaigns | List campaigns |


<a id="listCampaign"></a>
# **listCampaign**
> ListCampaignResponse listCampaign(authorization, merchantID)

List campaigns

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.ListCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    ListCampaignApi apiInstance = new ListCampaignApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String merchantID = "1-CYNGRUNGSBCCC"; // String | The merchant's ID that is in GrabFood's database.
    try {
      ListCampaignResponse result = apiInstance.listCampaign(authorization, merchantID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListCampaignApi#listCampaign");
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

[**ListCampaignResponse**](ListCampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |

