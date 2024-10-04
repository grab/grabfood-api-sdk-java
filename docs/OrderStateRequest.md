

# OrderStateRequest

This request pushes the state of an order on GrabFood. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  |
|**orderID** | **String** | The order&#39;s ID that is returned from GrabFood. Refer to FAQs for more details about [orderID and shortOrderNumber](#section/Order/What&#39;s-the-difference-between-orderID-and-shortOrderNumber). |  |
|**state** | [**StateEnum**](#StateEnum) | The current order state. For takeaway orders, only &#x60;DELIVERED&#x60; and &#x60;CANCELLED&#x60; states are pushed. |  |
|**driverETA** | **Integer** | The driver&#39;s estimated of arrival (ETA) in seconds when the state is &#x60;DRIVER_ALLOCATED&#x60;. |  [optional] |
|**code** | **String** | The current order&#39;s sub-state. This is in free text so you should only use for reference. Grab may use this for troubleshooting. If you want some analysis, kindly use &#x60;state&#x60; instead. |  [optional] |
|**message** | **String** | Additional information to explain the current order state. May be system status or human entered message. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;ACCEPTED&quot; |
| DRIVER_ALLOCATED | &quot;DRIVER_ALLOCATED&quot; |
| DRIVER_ARRIVED | &quot;DRIVER_ARRIVED&quot; |
| COLLECTED | &quot;COLLECTED&quot; |
| DELIVERED | &quot;DELIVERED&quot; |
| FAILED | &quot;FAILED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



