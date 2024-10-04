

# Campaign

A JSON object containing the campaign details for a merchant. Only campaigns that are funded by merchants will be sent.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The campaign&#39;s ID. |  |
|**createdBy** | [**CreatedByEnum**](#CreatedByEnum) | The party who created the campaign. Can be created by partners via API, merchants via the merchant app or Grab. |  |
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  |
|**name** | **String** | The campaign&#39;s name. |  |
|**quotas** | [**CampaignQuotas**](CampaignQuotas.md) |  |  [optional] |
|**conditions** | [**CampaignConditions**](CampaignConditions.md) |  |  [optional] |
|**discount** | [**CampaignDiscount**](CampaignDiscount.md) |  |  [optional] |
|**customTag** | **String** | Specify the tag for custom bundle offer campaign. Only whitelisted partner is supported as of now. |  [optional] |



## Enum: CreatedByEnum

| Name | Value |
|---- | -----|
| GRAB | &quot;Grab&quot; |
| MERCHANT | &quot;Merchant&quot; |
| PARTNER | &quot;Partner&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



