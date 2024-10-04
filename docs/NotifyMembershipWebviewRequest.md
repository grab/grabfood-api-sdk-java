

# NotifyMembershipWebviewRequest

This request submits membership registration request to partner. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memberID** | **String** | The unique member ID on the partner&#39;s database. |  [optional] |
|**grabID** | **String** | The id used to identify an unique grab user. |  [optional] |
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Action completed in partner&#39;s webview. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| LINK | &quot;LINK&quot; |
| REGISTER | &quot;REGISTER&quot; |
| UNLINK | &quot;UNLINK&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



