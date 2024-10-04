

# GetDineInVoucherResponse



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificateID** | **String** | This certificateID is decoded from scanning the QR code, and 1:1 mapping with &#x60;voucherCode&#x60;. |  [optional] |
|**voucherCode** | **String** | A short code for the dine-in voucher purchased by the user. |  [optional] |
|**voucher** | [**Voucher**](Voucher.md) |  |  [optional] |
|**voucherStatus** | [**VoucherStatusEnum**](#VoucherStatusEnum) | The status of the dine-in voucher purchased. Only active voucher is eligible for redemption. |  [optional] |
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  [optional] |
|**campaignID** | **String** | The dine-in voucher campaign&#39;s ID in GrabFood&#39;s database. |  [optional] |



## Enum: VoucherStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| REDEEMED | &quot;REDEEMED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| REFUNDED | &quot;REFUNDED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



