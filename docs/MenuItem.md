

# MenuItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The item&#39;s ID in the partner system.  |  |
|**name** | **String** | The name of the item. |  |
|**nameTranslation** | **Map&lt;String, String&gt;** | Translation of the item name. Only support up to 1 translated language. Refer [Menu Translation](#section/Menu-Translation). |  [optional] |
|**availableStatus** | [**AvailableStatusEnum**](#AvailableStatusEnum) | The status for the item that is in the category.  Note: In order to set an item as \&quot;UNAVAILABLE\&quot;, it is required to update both the &#x60;availableStatus&#x60; and &#x60;maxStock&#x60; fields, whereby the &#x60;maxStock&#x60; value should be set to 0.  |  |
|**description** | **String** | The description of the item. There is a custom length limit of 2000 for &#x60;VN&#x60;.  |  [optional] |
|**descriptionTranslation** | **Map&lt;String, String&gt;** | Translation of the item description. Only support up to 1 translated language. Refer [Menu Translation](#section/Menu-Translation). |  [optional] |
|**price** | **Long** | The item&#39;s price (excluding tax) in minor format. For example: 1900 means $19 with &#x60;currency.exponent&#x60; as 2. Refer to [FAQ](#section/Menu/Is-the-item-price-with-or-without-tax) for more details.  |  |
|**photos** | **List&lt;String&gt;** | An array string for the item’s image URL links. Refer to FAQs for more details about [images](#section/Menu/What-are-the-recommended-formats-for-an-item-image).  |  [optional] |
|**specialType** | [**SpecialTypeEnum**](#SpecialTypeEnum) | The item&#39;s special Tag. Refer to FAQs for more details about [specialType](#section/Menu/What&#39;s-specialType).  |  [optional] |
|**taxable** | **Boolean** | **For Indonesia only.** This field allows the configuration for an item to be marked as tax applicable, and marked item would then be included in a commercial invoice to consumers as per the government&#39;s regulations.  |  [optional] |
|**barcode** | **String** | The barcode Number (GTIN). Max 64 allowed. GTIN must be 8, 12, 13, 14 numeric digits.  |  [optional] |
|**sellingTimeID** | **String** | The selling time&#39;s ID for the item. This value overwrites the category&#39;s selling time if it is different. Empty value implies the category&#39;s selling time will be applied.  |  [optional] |
|**maxStock** | **Long** | Available stocks under inventory for this item. Auto reduce when there is order placed for this item. Empty value implies no limit.  Note: It is necessary to set &#x60;maxStock&#x60; to 0 if the &#x60;availableStatus&#x60; of the item is \&quot;UNAVAILABLE\&quot;. Item will be set to \&quot;AVAILABLE\&quot; if &#x60;maxStock&#x60; &gt; 0.  |  [optional] |
|**advancedPricing** | [**AdvancedPricing**](AdvancedPricing.md) |  |  [optional] |
|**purchasability** | [**Purchasability**](Purchasability.md) |  |  [optional] |
|**modifierGroups** | [**List&lt;ModifierGroup&gt;**](ModifierGroup.md) | An array of the modifierGroup JSON objects. Max 30 allowed per item. Refer to [Modifier groups](#modifier-groups) for more information. |  [optional] |



## Enum: AvailableStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| HIDE | &quot;HIDE&quot; |
| UNAVAILABLETODAY | &quot;UNAVAILABLETODAY&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SpecialTypeEnum

| Name | Value |
|---- | -----|
| ALCOHOL | &quot;alcohol&quot; |
| EMPTY | &quot;&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



