

# GrabDiscount1

A JSON object reflects the discount in grab app paybill flow that eater has used. Only applicable for Dine out STO case. `null` if not applicable. Only present in submitOrder webhook. Not present in [ListOrder](#tag/list-order/operation/list-orders) response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | discount code. |  [optional] |
|**id** | **String** | discount id. |  [optional] |
|**name** | **String** | discount name. |  [optional] |
|**deductAmountInMin** | **Long** | The total discount amount in minor unit. |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) | discount level, eg, order / item level. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | discount type, eg, Promo / DineOutVoucher / DineOutDiscount. |  [optional] |
|**mexFundedAmountInMin** | **Long** | The mexFundDiscount in minor unit. |  [optional] |
|**appliedItemIDs** | **List&lt;String&gt;** | An array of item IDs that get discount under this grabDiscount. &#x60;null&#x60; if no item applied in this grabDiscount. |  [optional] |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;order&quot; |
| ITEM | &quot;item&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROMO | &quot;Promo&quot; |
| DINE_OUT_VOUCHER | &quot;DineOutVoucher&quot; |
| DINE_OUT_DISCOUNT | &quot;DineOutDiscount&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



