

# OrderDeliveryRequest

This request marks an order as delivered on GrabFood. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderID** | **String** | The order&#39;s ID that is returned from GrabFood. Refer to FAQs for more details about [orderID and shortOrderNumber](#section/Order/What&#39;s-the-difference-between-orderID-and-shortOrderNumber). |  |
|**fromState** | [**FromStateEnum**](#FromStateEnum) | Specify the order&#39;s initial state. |  |
|**toState** | [**ToStateEnum**](#ToStateEnum) | Specify the order&#39;s new state. |  |



## Enum: FromStateEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;Accepted&quot; |
| FIND_DRIVER | &quot;FindDriver&quot; |
| COLLECTED | &quot;Collected&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ToStateEnum

| Name | Value |
|---- | -----|
| FIND_DRIVER | &quot;FindDriver&quot; |
| COLLECTED | &quot;Collected&quot; |
| DELIVERED | &quot;Delivered&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



