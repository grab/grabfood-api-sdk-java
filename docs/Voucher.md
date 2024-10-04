

# Voucher

A JSON object containing dine-in voucher details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the voucher. |  [optional] |
|**discountedPrice** | **String** | The amount paid after discount is applied in local currency. |  [optional] |
|**originalPrice** | **String** | The original amount before discount is applied in local currency. |  [optional] |
|**descriptionInfo** | [**VoucherDescriptionInfo**](VoucherDescriptionInfo.md) |  |  [optional] |
|**voucherType** | [**VoucherTypeEnum**](#VoucherTypeEnum) | The type of the dine-in voucher. |  [optional] |



## Enum: VoucherTypeEnum

| Name | Value |
|---- | -----|
| CASH | &quot;CASH&quot; |
| ITEM | &quot;ITEM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



