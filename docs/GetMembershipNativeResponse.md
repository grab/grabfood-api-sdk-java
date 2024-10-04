

# GetMembershipNativeResponse

This response returns membership detail. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**membershipStatus** | [**MembershipStatusEnum**](#MembershipStatusEnum) | Status of the memberID. |  [optional] |
|**pointInfo** | [**GetMembershipNativeResponsePointInfo**](GetMembershipNativeResponsePointInfo.md) |  |  [optional] |
|**pointsExpireDate** | **String** | Earliest points expiry date. In &#x60;yyyy-mm-dd&#x60; format |  [optional] |



## Enum: MembershipStatusEnum

| Name | Value |
|---- | -----|
| VALID | &quot;VALID&quot; |
| INVALID | &quot;INVALID&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



