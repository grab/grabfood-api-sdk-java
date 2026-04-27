

# EditOrderV2Response



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderID** | **String** | The order&#39;s ID that is returned from GrabFood. Refer to FAQs for more details about [orderID and shortOrderNumber](#section/Order/What&#39;s-the-difference-between-orderID-and-shortOrderNumber). |  [optional] |
|**shortOrderNumber** | **String** | The GrabFood short order number. This is unique for each merchant per day. Refer to FAQs for more details about [orderID and shortOrderNumber](#section/Order/What&#39;s-the-difference-between-orderID-and-shortOrderNumber). |  [optional] |
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  [optional] |
|**partnerMerchantID** | **String** | The merchant&#39;s ID that is on the partner&#39;s database. |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | The payment method used. Refer to FAQs for more details about [paymentType](#section/Order/Does-the-paymentType-affect-partners). |  [optional] |
|**cutlery** | **Boolean** | The boolean value to indicate whether cutlery are needed or not. Refer to FAQs for more details about [cutlery](#section/Order/What-do-the-true-or-false-values-mean-for-cutlery). |  [optional] |
|**orderTime** | **String** | The UTC time that a consumer places the order, based on ISO_8601/RFC3339. |  [optional] |
|**submitTime** | **OffsetDateTime** | The order submit time, based on ISO_8601/RFC3339. &#x60;null&#x60; in EditOrder V2 response. Only present in the [List Orders](#tag/list-order) response. |  [optional] |
|**completeTime** | **OffsetDateTime** | The order complete time, based on ISO_8601/RFC3339. &#x60;null&#x60; in EditOrder V2 response. Only present in the [List Orders](#tag/list-order) response. |  [optional] |
|**scheduledTime** | **String** | The order scheduled time, based on ISO_8601/RFC3339. Empty for non-scheduled orders. |  [optional] |
|**orderState** | **String** | The state of the order. Empty in EditOrder V2 response. Only present in the [List Orders](#tag/list-order) response. Refer to [Order States](#section/Order-states). |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**featureFlags** | [**OrderFeatureFlags**](OrderFeatureFlags.md) |  |  [optional] |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | The ordered items in an array of JSON Object.  |  [optional] |
|**campaigns** | [**List&lt;OrderCampaign&gt;**](OrderCampaign.md) | The campaigns that are applicable for the order. &#x60;null&#x60; when there is no campaign applied. Only campaigns that are funded by merchants will be sent.  |  [optional] |
|**promos** | [**List&lt;OrderPromo&gt;**](OrderPromo.md) | An array of promotion objects. &#x60;null&#x60; when there is no promo code applied. Only promotions that are funded by merchants will be sent. |  [optional] |
|**price** | [**OrderPrice**](OrderPrice.md) |  |  [optional] |
|**dineIn** | [**DineIn**](DineIn.md) |  |  [optional] |
|**receiver** | **Object** | This field is set to &#x60;null&#x60; in the EditOrder V2 response. Refer to the [Submit Order](#tag/submit-order-webhook/operation/submit-order-webhook) payload for the complete receiver information. |  [optional] |
|**orderReadyEstimation** | [**OrderReadyEstimation**](OrderReadyEstimation.md) |  |  [optional] |
|**membershipID** | **String** | Membership ID for loyalty project. Only present for loyalty program partners. Empty if not applicable. |  [optional] |
|**discounts** | [**List&lt;GrabDiscount1&gt;**](GrabDiscount1.md) | The discounts that are applicable for the paybill order in dineout STO case. &#x60;null&#x60; when there is no discount applied. This is only applicable for STO order  |  [optional] |
|**payments** | **List&lt;String&gt;** | This field is set to &#x60;null&#x60; in the EditOrder V2 response. Refer to the [Submit Order](#tag/submit-order-webhook/operation/submit-order-webhook) payload for the complete payment details. |  [optional] |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| CASH | &quot;CASH&quot; |
| CASHLESS | &quot;CASHLESS&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



