# GetDineinVoucherApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDineinVoucher**](GetDineinVoucherApi.md#getDineinVoucher) | **GET** /partner/v1/dinein/voucher | Get Dine In Voucher |


<a id="getDineinVoucher"></a>
# **getDineinVoucher**
> GetDineInVoucherResponse getDineinVoucher(authorization, merchantID, voucherCode, certificateID)

Get Dine In Voucher

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.GetDineinVoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    GetDineinVoucherApi apiInstance = new GetDineinVoucherApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String merchantID = "merchantID_example"; // String | 
    String voucherCode = "voucherCode_example"; // String | A short code for the dine-in voucher purchased by the user. Required if `certificateID` is not specified.
    String certificateID = "certificateID_example"; // String | This certificateID is decoded from scanning the QR code, and 1:1 mapping with voucherCode. Required if `voucherCode` is not specified.
    try {
      GetDineInVoucherResponse result = apiInstance.getDineinVoucher(authorization, merchantID, voucherCode, certificateID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetDineinVoucherApi#getDineinVoucher");
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
| **merchantID** | **String**|  | |
| **voucherCode** | **String**| A short code for the dine-in voucher purchased by the user. Required if &#x60;certificateID&#x60; is not specified. | [optional] |
| **certificateID** | **String**| This certificateID is decoded from scanning the QR code, and 1:1 mapping with voucherCode. Required if &#x60;voucherCode&#x60; is not specified. | [optional] |

### Return type

[**GetDineInVoucherResponse**](GetDineInVoucherResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |
| **400** | invalid_argument | Code | Reason           | Message                                    | Description                                                                                    |  | ---- | ---------------- | ------------------------------------------ | ---------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | invalid certificateID                      | The certificateID is not valid.                                                                | | 400  | invalid_argument | voucherCode or certificateID not specified | The voucherCode and certificateID are both empty in params, one of the both must be provided.  |  |  -  |
| **404** | not_found | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 404  | not_found   | voucher not found            | The voucher is not found for the specified voucherCode or certificateID.                        | | 404  | not_found   | failed to get store info     | The store is not found for the specified merchantID.                                             |  |  -  |

