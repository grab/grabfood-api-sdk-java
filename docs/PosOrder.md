

# PosOrder

The POSOrder indicates the detail order information from POS system.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderID** | **String** | The long orderID in grab system. |  [optional] |
|**partnerOrderID** | **String** | The orderID in pos system. |  [optional] |
|**merchantID** | **String** | The merchant&#39;s ID is the one in GrabFood&#39;s database. |  [optional] |
|**partnerMerchantID** | **String** | The merchant ID in pos system. |  [optional] |
|**orderTime** | **OffsetDateTime** | The UTC time that a consumer places the order, based on ISO_8601/RFC3339. |  [optional] |
|**orderState** | **String** | The order state in POS system, eg, COMPLETED. |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**items** | [**List&lt;POSItem&gt;**](POSItem.md) | The ordered items in an array of JSON Object.  |  [optional] |
|**price** | [**PosPriceDetails**](PosPriceDetails.md) |  |  [optional] |
|**dineIn** | [**DineIn**](DineIn.md) |  |  [optional] |
|**payments** | [**List&lt;Payment&gt;**](Payment.md) | An array of payment objects. &#x60;null&#x60; when there is no payment info from pos. This is only applicable for STO order |  [optional] |



