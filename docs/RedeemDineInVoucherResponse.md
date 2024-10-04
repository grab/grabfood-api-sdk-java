

# RedeemDineInVoucherResponse



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificateID** | **String** | This certificateID is decoded from scanning the QR code, and 1:1 mapping with &#x60;voucherCode&#x60;. |  [optional] |
|**voucherCode** | **String** | A short code for the dine-in voucher purchased by the user. |  [optional] |
|**voucher** | [**Voucher**](Voucher.md) |  |  [optional] |
|**redeemResult** | [**RedeemResult**](RedeemResult.md) |  |  [optional] |
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  [optional] |
|**campaignID** | **String** | The dine-in voucher campaign&#39;s ID in GrabFood&#39;s database. |  [optional] |



