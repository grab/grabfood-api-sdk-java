

# NewOrderTimeRequest

This request updates an order with a new ready time on GrabFood. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderID** | **String** | The order&#39;s ID that is returned from GrabFood. Refer to FAQs for more details about [orderID and shortOrderNumber](#section/Order/What&#39;s-the-difference-between-orderID-and-shortOrderNumber). |  |
|**newOrderReadyTime** | **OffsetDateTime** | The new order ready time for this order, based on ISO_8601/RFC3339. |  |



