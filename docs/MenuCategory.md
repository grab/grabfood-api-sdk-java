

# MenuCategory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The category&#39;s ID that is on the partner system. This ID should be unique with a min length of 1 and max of 64. |  |
|**name** | **String** | The name of the category. |  |
|**nameTranslation** | **Map&lt;String, String&gt;** | Translation of the category name. Only support up to 1 translated language. Refer [Menu Translation](#section/Menu-Translation). |  [optional] |
|**availableStatus** | [**AvailableStatusEnum**](#AvailableStatusEnum) | The status for the category. Refer to FAQs for more details about [availableStatus](#section/Menu/What-is-availableStatus). |  |
|**sellingTimeID** | **String** | The selling time&#39;s ID for the category. All items within the category will apply the same selling time unless there is another selling time specified for the item. |  |
|**items** | [**List&lt;MenuItem&gt;**](MenuItem.md) | An array of item JSON objects. Max 300 allowed per category. Refer to [Items](#items) for more information. |  |



## Enum: AvailableStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| HIDE | &quot;HIDE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



