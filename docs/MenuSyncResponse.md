

# MenuSyncResponse



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdTime** | **OffsetDateTime** | The Unix time the specified menu was created in GrabFood&#39;s database. |  |
|**updatedTime** | **OffsetDateTime** | The Unix time the specified menu was created in GrabFood&#39;s database. |  |
|**code** | [**CodeEnum**](#CodeEnum) | The status code for this request. See [Menu sync response statuses](#section/Menu-sync-response-statuses) for more information. |  |
|**errors** | **List&lt;String&gt;** | An array of strings of error message. |  [optional] |
|**sections** | [**List&lt;MenuSyncFail&gt;**](MenuSyncFail.md) |  |  [optional] |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;Success&quot; |
| PARTIAL_SUCCESS | &quot;PartialSuccess&quot; |
| IN_QUEUING | &quot;InQueuing&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



