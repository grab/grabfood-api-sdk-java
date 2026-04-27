

# MenuModifier


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The modifier&#39;s ID that is on the partner&#39;s system. This ID should be unique. |  |
|**name** | **String** | The name of the modifier. |  |
|**nameTranslation** | **Map&lt;String, String&gt;** | Translation of the modifier name. Only support up to 1 translated language. Refer [Menu Translation](#section/Menu-Translation). |  [optional] |
|**availableStatus** | [**AvailableStatusEnum**](#AvailableStatusEnum) | The status for the modifier. Refer to FAQs for more details about [availableStatus](#section/Menu/What-is-availableStatus).   Note: &#x60;HIDE&#x60; will only update the modifier to unavailable, remove the modifier from the menu if you want to hide it entirely.  |  |
|**price** | **Long** | The modifier&#39;s price in minor format. Refer to FAQs for more details about [tax](#section/Menu/Is-the-menu-price-with-or-without-tax). |  [optional] |
|**barcode** | **String** | The barcode Number (GTIN). GTIN must be 8, 12, 13, 14 numeric digits. |  [optional] |
|**sequence** | **Integer** | The sort or display order of the modifier within the menu. |  [optional] |
|**advancedPricing** | [**AdvancedPricing**](AdvancedPricing.md) |  |  [optional] |



## Enum: AvailableStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| UNAVAILABLETODAY | &quot;UNAVAILABLETODAY&quot; |
| HIDE | &quot;HIDE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



