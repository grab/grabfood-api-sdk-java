

# EditOrderRequest

Information about editing an existing order on GrabFood. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderID** | **String** | The order&#39;s ID that is returned from GrabFood. Refer to FAQs for more details about [orderID and shortOrderNumber](#section/Order/What&#39;s-the-difference-between-orderID-and-shortOrderNumber). |  |
|**items** | [**List&lt;EditOrderItem&gt;**](EditOrderItem.md) | Specify the array of all items in the order, including deleted, added, updated and unchanged items. |  |
|**onlyRecalculate** | **Boolean** | This parameter specifies whether to recalculate the edited order without submitting it. It is intended for testing purposes only. This parameter is set to false by default, which means the edited order will be recalculated and re-submitted to partners.  |  [optional] |
|**depositAmountInMin** | **Long** | The deposit amount in minor unit in POS system. This is only applicable for STO order |  [optional] |
|**offlinePOSDiscountInMin** | **Long** | The POS side discount amount in minor unit. This is only applicable for STO order |  [optional] |



