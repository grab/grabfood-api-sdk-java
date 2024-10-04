

# CampaignConditions

The conditions to apply to a campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **OffsetDateTime** | The campaign&#39;s start time in UTC format. For example, 2021-09-23T03:30:00Z means 2021-09-23 11:30:00 (UTC +08:00). |  |
|**endTime** | **OffsetDateTime** | The campaign&#39;s end time in UTC format. |  |
|**eaterType** | [**EaterTypeEnum**](#EaterTypeEnum) | The type of eater eligible for the campaign.  * &#x60;all&#x60; - campaign will be applied to everyone. No limitation on campaign type. * &#x60;new&#x60; - campaign will be applied to consumers who have not ordered from this store in the last three months. Only applicable to **order-level** campaign.  |  |
|**minBasketAmount** | **Double** | The minimum basket amount to be eligible for the campaign. Only applicable for **order-level** campaign. For example, 10.5 means the basket amount has to be at least $10.50. |  [optional] |
|**bundleQuantity** | **Integer** | Specify the bundle quantity for bundle offer campaign. |  [optional] |
|**workingHour** | [**WorkingHour**](WorkingHour.md) |  |  [optional] |



## Enum: EaterTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| NEW | &quot;new&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



