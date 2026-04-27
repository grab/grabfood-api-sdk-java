# SyncPosOrderApi

All URIs are relative to *https://partner-api.grab.com/grabfood-sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**syncPosOrder**](SyncPosOrderApi.md#syncPosOrder) | **POST** /partner/v1/pos/order | Sync POS order |


<a id="syncPosOrder"></a>
# **syncPosOrder**
> SyncPOSOrderResponse syncPosOrder(authorization, contentType, syncPOSOrderRequest)

Sync POS order

### Example
```java
// Import classes:
import com.grab.grabfood.client.ApiClient;
import com.grab.grabfood.client.ApiException;
import com.grab.grabfood.client.Configuration;
import com.grab.grabfood.client.models.*;
import com.grab.grabfood.client.api.SyncPosOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://partner-api.grab.com/grabfood-sandbox");

    SyncPosOrderApi apiInstance = new SyncPosOrderApi(defaultClient);
    String authorization = "Bearer <ACCESS_TOKEN_HERE>"; // String | Specify the generated authorization token of the bearer type.
    String contentType = "application/json"; // String | The content type of the request body. You must use `application/json` for this header as GrabFood API currently does not support other formats.
    SyncPOSOrderRequest syncPOSOrderRequest = new SyncPOSOrderRequest(); // SyncPOSOrderRequest | 
    try {
      SyncPOSOrderResponse result = apiInstance.syncPosOrder(authorization, contentType, syncPOSOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncPosOrderApi#syncPosOrder");
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
| **syncPOSOrderRequest** | [**SyncPOSOrderRequest**](SyncPOSOrderRequest.md)|  | |

### Return type

[**SyncPOSOrderResponse**](SyncPOSOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API request is successfully processed. |  -  |
| **400** | invalid_argument | Code | Reason           | Message                                    | Description                                                                                               |  | ---- | ---------------- | ------------------------------------------ | --------------------------------------------------------------------------------------------------------- |  | 400  | invalid_argument | misconfiguration for oauth partnerID      | oauth partnerID is matched with the one in grab system                                                 | | 400  | invalid_argument | invalid request                            | The request body is empty                                                                               | | 400  | invalid_argument | invalid order                              | The order is wrong. Please check:&lt;br/&gt;• order struct is empty&lt;br/&gt;• orderID is not found in grab system          | | 400  | invalid_argument | invalid currency                           | Please check: The currency struct is empty                                                             | | 400  | invalid_argument | invalid action                             | The action is wrong                                                                                     | | 400  | invalid_argument | merchantID is required                     | No merchantID in the request                                                                            | | 400  | invalid_argument | failed to get store info                   | The merchant is not found in the grab system                                                           | | 400  | invalid_argument | invalid merchant                           | The merchant is wrong. Please check:&lt;br/&gt;• The merchant is not found in the grab system&lt;br/&gt;• This order not belong to this merchant | | 400  | invalid_argument | invalid order state                        | Invalid order state to trigger complete                                                                | | 400  | invalid_argument | order already completed                    | order already completed, no further action needed                                                      | | 400  | invalid_argument | invalid pos orderID                        | The partnerOrderID is empty                                                                             | | 400  | invalid_argument | invalid items                              | The items size is empty, invalid item value, missing required fields. Please check:&lt;br/&gt;• For POS synced order, the item name is empty&lt;br/&gt;• Both itemID and grabItemID is empty&lt;br/&gt;• Item quantity is zero&lt;br/&gt;• Item quantity is negative | | 400  | invalid_argument | Invalid item price                         | Please check:&lt;br/&gt;• The item price is negative&lt;br/&gt;• The item tax is negative                                     | | 400  | invalid_argument | invalid modifiers                          | Please check:&lt;br/&gt;• Modifier ID is empty&lt;br/&gt;• Modifier name is empty&lt;br/&gt;• Modifier quantity is zero&lt;br/&gt;• Modifier quantity is negative | | 400  | invalid_argument | invalid modifier price                     | Please check:&lt;br/&gt;• Modifier price is negative&lt;br/&gt;• Modifier tax is negative                                     | | 400  | invalid_argument | invalid price                              | The price-related info is wrong. Please check:&lt;br/&gt;• price struct is empty&lt;br/&gt;• total &#x3D; 0&lt;br/&gt;• eaterPayment &#x3D; 0    | | 400  | invalid_argument | invalid price, price can&#39;t be negative     | Please check:&lt;br/&gt;• eaterPayment is negative&lt;br/&gt;• Subtotal is negative&lt;br/&gt;• Tax is negative&lt;br/&gt;• depositAmountInMin is negative&lt;br/&gt;• merchantChargeFeeInMin is negative&lt;br/&gt;• OfflinePosDiscountInMin is negative | | 400  | invalid_argument | invalid price value, can&#39;t match with calculation | Subtotal + merchantChargeFeeInMin - OfflinePosDiscountInMin - depositAmountInMin Is NOT equal to eaterPayment | | 400  | invalid_argument | invalid exceed max price                   | eaterPayment exceed limit:&lt;br/&gt;• SG: S$1000&lt;br/&gt;• ID: Rp10,000,000&lt;br/&gt;• PH: ₱15,000&lt;br/&gt;• VN: ₫15,000,000&lt;br/&gt;• TH: ฿300,000&lt;br/&gt;• MY: RM1,500 | | 400  | invalid_argument | invalid dine in info                       | dineInInfo is empty                                                                                     | | 400  | invalid_argument | invalid eater count                        | Please check:&lt;br/&gt;• eater count is negative&lt;br/&gt;• eater count is zero&lt;br/&gt;• eater count &gt; 100                         | | 400  | invalid_argument | invalid table id                           | tableID length &gt; 100                                                                                    | | 400  | invalid_argument | invalid too many payments                  | Total payments cannot above than 5                                                                      | | 400  | invalid_argument | invalid payment method name                | Please check:&lt;br/&gt;• Payment method is empty&lt;br/&gt;• Payment method length &gt; 20                                      | | 400  | invalid_argument | invalid payment method amount              | Payment amount is negative                                                                              |  |  -  |
| **404** | not_found | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 404  | not_found   | failed to get store info     | The store is not found for the specified merchantID.                                            |  |  -  |
| **500** | internal | Code | Reason      | Message                      | Description                                                                                     |  | -----| ----------- | ---------------------------- | ----------------------------------------------------------------------------------------------- |  | 500  | internal    | sync pos order failed        | sync pos order failed, please try again later.                                                      |  |  -  |

