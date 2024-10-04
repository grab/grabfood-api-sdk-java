

# StoreStatusResponse

Object contains store status info

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**closeReason** | [**CloseReasonEnum**](#CloseReasonEnum) | The code of store close reason. Blank indicates store is currently open. |  |
|**isInSpecialOpeningHourRange** | **Boolean** | Indicate whether the store is in special opening hour range. |  |
|**isOpen** | **Boolean** | Indicate whether the store is open. |  |



## Enum: CloseReasonEnum

| Name | Value |
|---- | -----|
| MEX_PAUSED | &quot;mex_paused&quot; |
| OPS_PAUSED | &quot;ops_paused&quot; |
| OUT_OF_SPECIAL_OPENING_HOURS | &quot;out_of_special_opening_hours&quot; |
| OUT_OF_OPENING_HOURS | &quot;out_of_opening_hours&quot; |
| INACTIVE | &quot;inactive&quot; |
| OPS_PAUSED_WITHOUT_COMM | &quot;ops_paused_without_comm&quot; |
| RESTRICTED | &quot;restricted&quot; |
| SUSPENDED | &quot;suspended&quot; |
| PARSE_DATA_FAIL | &quot;parse_data_fail&quot; |
| EMPTY | &quot;&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



