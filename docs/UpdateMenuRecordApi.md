# UpdateMenuRecordApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchUpdateMenu**](UpdateMenuRecordApi.md#batchUpdateMenu) | **PUT** /partner/v1/batch/menu | Batch Update Menu |
| [**updateMenu**](UpdateMenuRecordApi.md#updateMenu) | **PUT** /partner/v1/menu | Update menu record |


<a id="batchUpdateMenu"></a>
# **batchUpdateMenu**
> BatchUpdateMenuResponse batchUpdateMenu(contentType, authorization, batchUpdateMenuItem)

Batch Update Menu

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.UpdateMenuRecordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    UpdateMenuRecordApi apiInstance = new UpdateMenuRecordApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    BatchUpdateMenuItem batchUpdateMenuItem = new BatchUpdateMenuItem(); // BatchUpdateMenuItem | 
    try {
      BatchUpdateMenuResponse result = apiInstance.batchUpdateMenu(contentType, authorization, batchUpdateMenuItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateMenuRecordApi#batchUpdateMenu");
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
| **batchUpdateMenuItem** | [**BatchUpdateMenuItem**](BatchUpdateMenuItem.md)|  | |

### Return type

[**BatchUpdateMenuResponse**](BatchUpdateMenuResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. Refer to status and errors for more info. |  -  |
| **400** | invalid_argument | Description | | ----------- | | Invalid parameter | | Batch update menu support at most 200 items |  |  -  |
| **409** | conflict. BatchUpdate ITEM xxx too frequently, retry after 10 seconds  |  -  |
| **429** | Too Many Requests  |  -  |

<a id="updateMenu"></a>
# **updateMenu**
> updateMenu(contentType, authorization, updateMenuRequest)

Update menu record

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.UpdateMenuRecordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    UpdateMenuRecordApi apiInstance = new UpdateMenuRecordApi(defaultClient);
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    UpdateMenuRequest updateMenuRequest = new UpdateMenuRequest(); // UpdateMenuRequest | 
    try {
      apiInstance.updateMenu(contentType, authorization, updateMenuRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateMenuRecordApi#updateMenu");
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
| **updateMenuRequest** | [**UpdateMenuRequest**](UpdateMenuRequest.md)|  | |

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
| **204** | Successful. No Content returned. |  -  |

