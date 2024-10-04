

# RedeemResult

A JSON object containing dine-in voucher details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | To indicate whether the dine-in voucher redemption succeeded. |  [optional] |
|**code** | [**CodeEnum**](#CodeEnum) | The code for the reason of failed redemption. Empty if the &#x60;success&#x60; is true.  * &#x60;VOUCHER_REDEEMED&#x60; - The voucher has already been redeemed. * &#x60;INVALID_STATE&#x60; - The current status of voucher is EXPIRED or REFUNDED. * &#x60;REDEEM_FAILED&#x60; - Internal service error. * &#x60;INVALID_MERCHANT&#x60; - Voucher not applicable for this merchant. * &#x60;INVALID_ID&#x60; - Invalid certificateID.  |  [optional] |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| VOUCHER_REDEEMED | &quot;VOUCHER_REDEEMED&quot; |
| INVALID_STATE | &quot;INVALID_STATE&quot; |
| REDEEM_FAILED | &quot;REDEEM_FAILED&quot; |
| INVALID_MERCHANT | &quot;INVALID_MERCHANT&quot; |
| INVALID_ID | &quot;INVALID_ID&quot; |
| EMPTY | &quot;&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



