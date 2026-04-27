

# OrderFeatureFlags

The featureFlag JSON object containing an order's feature related information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderAcceptedType** | [**OrderAcceptedTypeEnum**](#OrderAcceptedTypeEnum) | The acceptance type for the order. Refer to FAQs for more details about [orderAcceptedType](#section/Order/How-do-I-identify-if-a-particular-order-is-auto-or-manual-acceptance).  |  |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | The type of order.  |  |
|**isMexEditOrder** | **Boolean** | A boolean value that indicates if the order is edited or recalculated. It does not necessarily mean the order was edited by the merchant. The changes could have been made by Grab, the Merchant, or the Customer.  |  [optional] |



## Enum: OrderAcceptedTypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| MANUAL | &quot;MANUAL&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: OrderTypeEnum

| Name | Value |
|---- | -----|
| TAKE_AWAY | &quot;TakeAway&quot; |
| DELIVERED_BY_GRAB | &quot;DeliveredByGrab&quot; |
| DELIVERED_BY_RESTAURANT | &quot;DeliveredByRestaurant&quot; |
| DINE_IN | &quot;DineIn&quot; |
| SCAN_TO_ORDER | &quot;ScanToOrder&quot; |
| TAKE_AWAY_ORDER | &quot;TakeAwayOrder&quot; |
| POS_DINE_OUT_ORDER | &quot;PosDineOutOrder&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



