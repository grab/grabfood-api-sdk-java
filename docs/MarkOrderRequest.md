

# MarkOrderRequest

This request marks an order as ready for delivery or completed on GrabFood. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderID** | **String** | The order&#39;s ID that is returned from GrabFood. Refer to FAQs for more details about [orderID and shortOrderNumber](#section/Order/What&#39;s-the-difference-between-orderID-and-shortOrderNumber). |  |
|**markStatus** | [**MarkStatusEnum**](#MarkStatusEnum) | The status to be marked accordingly.  * &#x60;1&#x60; - mark order as ready  * &#x60;2&#x60; - mark order as completed and only applicable to **dine-in** orders  |  |



## Enum: MarkStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_unknown_default_open_api | 11184809 |



