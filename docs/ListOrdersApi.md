# ListOrdersApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listOrders**](ListOrdersApi.md#listOrders) | **GET** /partner/v1/orders | List orders |


<a id="listOrders"></a>
# **listOrders**
> ListOrdersResponse listOrders(authorization, merchantID, date, page)

List orders

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.ListOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    ListOrdersApi apiInstance = new ListOrdersApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String merchantID = "1-CYNGRUNGSBCCC"; // String | The merchant's ID that is in GrabFood's database.
    String date = "date_example"; // String | 
    Integer page = 1; // Integer | Specify the page number for the report.
    try {
      ListOrdersResponse result = apiInstance.listOrders(authorization, merchantID, date, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListOrdersApi#listOrders");
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
| **date** | **String**|  | |
| **page** | **Integer**| Specify the page number for the report. | |

### Return type

[**ListOrdersResponse**](ListOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2xx** | Sync success |  -  |

