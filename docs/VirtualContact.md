

# VirtualContact

A JSON object containing the virtual contact information, where the validity period is 6 hours. Refer [FAQ](#section/Order/How-to-contact-customer-using-the-virtual-contact) on how the virtual contact works.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The generated virtual phone number that will forward calls to the customer&#39;s actual phone number. Will be omitted if the &#x60;status&#x60; is not &#x60;ACTIVE&#x60;. |  [optional] |
|**PIN** | **String** | A unique PIN required when forwarding calls to the customer for verification and security. Will be omitted if the &#x60;status&#x60; is not &#x60;ACTIVE&#x60;. |  [optional] |
|**expiredAt** | **String** | The expiry time of the virtual contact in UTC based on ISO_8601/RFC3339. Will be omitted if the &#x60;status&#x60; is not &#x60;ACTIVE&#x60;. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Indicates the current status and validity of the virtual contact. * &#x60;ACTIVE&#x60; - The virtual contact is valid. * &#x60;EXPIRED&#x60; - The virtual contact has expired and is no longer valid. * &#x60;UNAVAILABLE&#x60; - An internal error occurred while generating or retrieving the virtual contact.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



