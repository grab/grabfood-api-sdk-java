

# BatchUpdateMenuItem

Information about the GrabFood client updating their food menu. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  |
|**field** | [**FieldEnum**](#FieldEnum) | The record type that you want to update. |  |
|**menuEntities** | [**List&lt;MenuEntity&gt;**](MenuEntity.md) | The items in an array of JSON Object.  |  [optional] |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| ITEM | &quot;ITEM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



