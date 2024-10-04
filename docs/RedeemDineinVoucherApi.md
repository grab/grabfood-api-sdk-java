# RedeemDineinVoucherApi

All URIs are relative to *https://partner-api.stg-myteksi.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**redeemDineinVoucher**](RedeemDineinVoucherApi.md#redeemDineinVoucher) | **POST** /partner/v1/dinein/voucher/redeem | Redeem Dine In Voucher |


<a id="redeemDineinVoucher"></a>
# **redeemDineinVoucher**
> RedeemDineInVoucherResponse redeemDineinVoucher(authorization, contentType, redeemDineInVoucherRequest)

Redeem Dine In Voucher

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.RedeemDineinVoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.stg-myteksi.com/grabfood-sandbox");

    RedeemDineinVoucherApi apiInstance = new RedeemDineinVoucherApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    RedeemDineInVoucherRequest redeemDineInVoucherRequest = new RedeemDineInVoucherRequest(); // RedeemDineInVoucherRequest | 
    try {
      RedeemDineInVoucherResponse result = apiInstance.redeemDineinVoucher(authorization, contentType, redeemDineInVoucherRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedeemDineinVoucherApi#redeemDineinVoucher");
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
| **redeemDineInVoucherRequest** | [**RedeemDineInVoucherRequest**](RedeemDineInVoucherRequest.md)|  | |

### Return type

[**RedeemDineInVoucherResponse**](RedeemDineInVoucherResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |
| **400** | invalid_argument | Code | Reason           | Message                                    | Description                                                                                               |  | ---- | ---------------- | ------------------------------------------ | --------------------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | invalid certificateID                      | The certificateID is not valid.                                                                           | | 400  | invalid_argument | not enabled                                | The QR redemption feature is not enabled for the merchant, please reach out to the integration manager    |  |  -  |
| **404** | not_found | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 404  | not_found   | voucher not found            | The voucher is not found for the specified voucherCode or certificateID.                        | | 404  | not_found   | failed to get store info     | The store is not found for the specified merchantID.                                            |  |  -  |
| **500** | internal | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 500  | internal    | redeem failed                | Redemption failed, please try again later.                                                      |  |  -  |

