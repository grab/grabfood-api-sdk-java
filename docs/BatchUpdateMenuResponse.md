

# BatchUpdateMenuResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of this request. |  [optional] |
|**errors** | [**List&lt;MenuEntityError&gt;**](MenuEntityError.md) | The error messages when batch update menu record was partial success/fail. &#x60;null&#x60; when the request was success. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| PARTIAL_SUCCESS | &quot;partial success&quot; |
| FAIL | &quot;fail&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



