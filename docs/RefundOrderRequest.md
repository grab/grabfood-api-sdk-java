

# RefundOrderRequest

The API is to refund a STO order in dineout flow.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderID** | **String** | This order ID in grab system. |  |
|**merchantID** | **String** | This merchant ID in grab system. |  |
|**isFullRefund** | **Boolean** | currently we only support fully refund. |  [optional] |
|**refundAmountInMin** | **Long** | The total amount the POS want to refund for STO order. |  [optional] |



