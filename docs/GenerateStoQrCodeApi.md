# GenerateStoQrCodeApi

All URIs are relative to *https://partner-api.grab.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateStoQrCode**](GenerateStoQrCodeApi.md#generateStoQrCode) | **GET** /partner/v1/dinein/sto/qrcode | Generate STO QR code |


<a id="generateStoQrCode"></a>
# **generateStoQrCode**
> GenerateSTOQRCodeResponse generateStoQrCode(authorization, contentType, merchantID, qrType, tableNumber)

Generate STO QR code

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.GenerateStoQrCodeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.grab.com/grabfood-sandbox");

    GenerateStoQrCodeApi apiInstance = new GenerateStoQrCodeApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    String merchantID = "merchantID_example"; // String | 
    String qrType = "qrType_example"; // String | 
    String tableNumber = "tableNumber_example"; // String | 
    try {
      GenerateSTOQRCodeResponse result = apiInstance.generateStoQrCode(authorization, contentType, merchantID, qrType, tableNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateStoQrCodeApi#generateStoQrCode");
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
| **contentType** | **String**| The content type of the request body. You must use &#x60;application/json&#x60; for this header as GrabFood API currently does not support other formats. | |
| **merchantID** | **String**|  | |
| **qrType** | **String**|  | |
| **tableNumber** | **String**|  | |

### Return type

[**GenerateSTOQRCodeResponse**](GenerateSTOQRCodeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |
| **400** | invalid_argument | Code | Reason           | Message                                    | Description                                                                                               |  | ---- | ---------------- | ------------------------------------------ | --------------------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | not enabled                                | The generate STO QR code feature is not enabled for the merchant, please reach out to the integration manager    |  |  -  |
| **404** | not_found | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 404  | not_found   | failed to get store info     | The store is not found for the specified merchantID.                                            |  |  -  |
| **500** | internal | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 500  | internal    | generate QR failed        | generate QR failed, please try again later.                                                      |  |  -  |

