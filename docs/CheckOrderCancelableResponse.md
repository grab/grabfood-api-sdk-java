

# CheckOrderCancelableResponse



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cancelAble** | **Boolean** | The boolean value to indicate whether an order can be cancelled. |  [optional] |
|**nonCancellationReason** | [**NonCancellationReasonEnum**](#NonCancellationReasonEnum) | The reason for the order to be non-cancelable. |  [optional] |
|**limitType** | **CancelOrderLimitType** |  |  [optional] |
|**limitTimes** | **Long** | The remaining cancellation quota for the merchant. A value is only returned when the nearest remaining cancellation limit is approaching, else it returns 0. |  [optional] |
|**cancelReasons** | [**List&lt;CancelReason&gt;**](CancelReason.md) | An array of cancel order reasons JSON objects. |  [optional] |



## Enum: NonCancellationReasonEnum

| Name | Value |
|---- | -----|
| GKMM_GRAB_KITCHEN_MIX_MATCH_ORDERS_CANNOT_BE_CANCELLED | &quot;GKMM (Grab Kitchen Mix &amp; Match) orders cannot be cancelled&quot; |
| SELF_PICK_UP_ORDERS_CANNOT_BE_CANCELLED | &quot;Self pick-up orders cannot be cancelled&quot; |
| SCHEDULED_ORDERS_CANNOT_BE_CANCELLED | &quot;Scheduled orders cannot be cancelled&quot; |
| DAILY_CANCELLATION_LIMIT_REACHED | &quot;Daily cancellation limit reached&quot; |
| WEEKLY_CANCELLATION_LIMIT_REACHED | &quot;Weekly cancellation limit reached&quot; |
| MONTHLY_CANCELLATION_LIMIT_REACHED | &quot;Monthly cancellation limit reached&quot; |
| DRIVER_HAS_BEEN_ALLOCATED_FOR_TOO_LONG | &quot;Driver has been allocated for too long&quot; |
| DRIVER_APP_VERSION_IS_OUTDATED_PREVENTING_CANCELLATION | &quot;Driver App version is outdated preventing cancellation&quot; |
| ORDER_HAS_NOT_YET_BEEN_ALLOCATED_PREVENTING_CANCELLATION | &quot;Order has not yet been allocated preventing cancellation&quot; |
| THE_CURRENT_STATUS_OF_THE_ORDER_DOES_NOT_ALLOW_CANCELLATION | &quot;The current status of the order does not allow cancellation&quot; |
| DEFAULT_ERROR | &quot;Default Error&quot; |
| EMPTY | &quot;&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



