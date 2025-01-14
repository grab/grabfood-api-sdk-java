

# PushIntegrationStatusWebhookRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partnerMerchantID** | **String** | The merchant&#39;s ID that is on the partner&#39;s database. |  |
|**grabMerchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  |
|**integrationStatus** | [**IntegrationStatusEnum**](#IntegrationStatusEnum) | The store integration status. - &#x60;INACTIVE&#x60;: Merchant integration deactivated - &#x60;ACTIVE&#x60;: Merchant integration activated - &#x60;SYNCING&#x60;: Merchant integration is syncing - &#x60;FAILED&#x60;: Merchant integration has failed  |  |



## Enum: IntegrationStatusEnum

| Name | Value |
|---- | -----|
| INACTIVE | &quot;INACTIVE&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| SYNCING | &quot;SYNCING&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



