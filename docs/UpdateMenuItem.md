

# UpdateMenuItem

Information about the GrabFood client updating their food menu. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  |
|**field** | [**FieldEnum**](#FieldEnum) | The record type that you want to update. |  |
|**id** | **String** | The record&#39;s ID on the partner system. For example, the item id in case type is ITEM. |  |
|**price** | **Long** | The record&#39;s price in minor unit format. |  [optional] |
|**availableStatus** | [**AvailableStatusEnum**](#AvailableStatusEnum) | The record&#39;s availableStatus.   Note: In order to set an item as \&quot;UNAVAILABLE\&quot;, it is required to update both the &#x60;availableStatus&#x60; and &#x60;maxStock&#x60; fields, whereby the &#x60;maxStock&#x60; value should be set to 0.  |  [optional] |
|**maxStock** | **Long** | Available stocks under inventory for this item. Auto reduce when there is order placed for this item.  Note: It is necessary to set &#x60;maxStock&#x60; to 0 if the &#x60;availableStatus&#x60; of the item is \&quot;UNAVAILABLE\&quot;. Item will be set to \&quot;AVAILABLE\&quot; if &#x60;maxStock&#x60; &gt; 0.  |  [optional] |
|**advancedPricings** | [**List&lt;UpdateAdvancedPricing&gt;**](UpdateAdvancedPricing.md) | Price configuration (in minor unit) for different service, order type and channel combination. If a service type does not have a specified price, it will utilize the default price of the item.  |  [optional] |
|**purchasabilities** | [**List&lt;UpdatePurchasability&gt;**](UpdatePurchasability.md) | Purchasability is set to true by default for all service type, unless it is explicitly set to false. Modifier will reuse it’s item’s purchasability.  |  [optional] |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| ITEM | &quot;ITEM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: AvailableStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| UNAVAILABLETODAY | &quot;UNAVAILABLETODAY&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



