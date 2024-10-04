

# ModifierGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ModifierGroup&#39;s ID that is on the partner system. This ID should be unique with a min length of 1 and max of 64. |  |
|**name** | **String** | The name of the ModifierGroup for the item that is in the parent category and section. |  |
|**nameTranslation** | **Map&lt;String, String&gt;** | Translation of the modifier group name. Only support up to 1 translated language. Refer [Menu Translation](#section/Menu-Translation). |  [optional] |
|**availableStatus** | [**AvailableStatusEnum**](#AvailableStatusEnum) | The status for the ModifierGroup that is in the item. |  |
|**selectionRangeMin** | **Integer** | The minimum quantity of the attribute. Refer to FAQs for more details about [selection range](#section/Menu/What-does-the-selection-range-do). |  [optional] |
|**selectionRangeMax** | **Integer** | The maximum quantity of the attribute. Refer to FAQs for more details about [selection range](#section/Menu/What-does-the-selection-range-do). |  |
|**modifiers** | [**List&lt;MenuModifier&gt;**](MenuModifier.md) | An array of modifier JSON objects. Max 100 per modifierGroup. Refer to [Modifiers](#modifiers) for more information. |  [optional] |



## Enum: AvailableStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| UNAVAILABLETODAY | &quot;UNAVAILABLETODAY&quot; |
| HIDE | &quot;HIDE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



