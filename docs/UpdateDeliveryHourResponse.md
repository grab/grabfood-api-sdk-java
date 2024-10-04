

# UpdateDeliveryHourResponse

Object contain update store delivery hour response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorReasons** | [**List&lt;ErrorReasonsEnum&gt;**](#List&lt;ErrorReasonsEnum&gt;) | Error message when updating store delivery hour. &#x60;null&#x60; indicates no error. |  [optional] |
|**orderCount** | **Long** | Total active order for the day. |  |
|**scheduledOrderCount** | **Long** | Total scheduled order during store close period. |  |
|**closeImmediately** | **Boolean** | Indicate the store status after updating delivery hours. |  |



## Enum: List&lt;ErrorReasonsEnum&gt;

| Name | Value |
|---- | -----|
| CLOSING_HOURS_INEFFECTIVE | &quot;ClosingHoursIneffective&quot; |
| FORCE_UPDATED | &quot;ForceUpdated&quot; |
| PENDING_SCHEDULED_ORDERS | &quot;PendingScheduledOrders&quot; |
| PENDING_ORDERS | &quot;PendingOrders&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



