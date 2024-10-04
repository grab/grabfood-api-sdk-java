

# PauseStoreRequest

This request pauses a store temporarily for (30 minutes/1 hour/24 hours) or unpauses a store on GrabFood. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  |
|**isPause** | **Boolean** | Boolean value to pause or unpause store. |  |
|**duration** | [**DurationEnum**](#DurationEnum) | The duration to pause the store. Only required when &#x60;isPause&#x3D;true&#x60;. |  [optional] |



## Enum: DurationEnum

| Name | Value |
|---- | -----|
| _30M | &quot;30m&quot; |
| _1H | &quot;1h&quot; |
| _24H | &quot;24h&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



