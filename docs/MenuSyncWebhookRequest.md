

# MenuSyncWebhookRequest

This request pushes the state of a menu sync operation. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestID** | **String** | An universally unique identifier (UUID) string. Used to uniquely identify a webhook request. Partners should use this value to distinguish between different webhook requests. If two requests contain the same requestID, only the first request should be considered and later requests **must** be ignored or discarded.  |  [optional] |
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  [optional] |
|**partnerMerchantID** | **String** | The merchant&#39;s ID that is on the partner&#39;s database. |  [optional] |
|**jobID** | **String** | An UUID string. Uniquely identifies a menu sync job. This can be found from the [Menu Update Notification](#tag/update-menu-noti) API response header.  |  [optional] |
|**updatedAt** | **String** | Indicates the time of menu sync status change. This is based on ISO_8601/RFC3339. For example: &#x60;2022-07-29T15:55:59Z&#x60;.  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Indicates the state of the menu sync job. |  [optional] |
|**errors** | **List&lt;String&gt;** | A string array of errors that occurred during processing. This array is empty if the status is not &#x60;FAILED&#x60;. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUEING | &quot;QUEUEING&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



