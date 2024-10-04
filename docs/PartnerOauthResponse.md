

# PartnerOauthResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The OAuth 2.0 access token issued by the partner. |  [optional] |
|**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | The type of token issued which is case insensitive. |  [optional] |
|**expiresIn** | **Integer** | The access token lifespan in seconds. |  [optional] |



## Enum: TokenTypeEnum

| Name | Value |
|---- | -----|
| BEARER | &quot;Bearer&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



