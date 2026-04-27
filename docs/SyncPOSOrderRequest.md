

# SyncPOSOrderRequest

The syncPOSOrder API allows POS to sync its order data with Grab and generate a PayBill QR.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | This action indicates the target action POS wants to do, eg, BILL_GENERATED, COMPLETED. |  |
|**order** | [**PosOrder**](PosOrder.md) |  |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| BILL_GENERATED | &quot;BILL_GENERATED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



