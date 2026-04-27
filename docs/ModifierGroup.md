

# ModifierGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The modifier group&#39;s ID that is on the partner system. This ID should be unique. |  |
|**name** | **String** | The name of the modifier group. |  |
|**nameTranslation** | **Map&lt;String, String&gt;** | Translation of the modifier group name. Only support up to 1 translated language. Refer [Menu Translation](#section/Menu-Translation). |  [optional] |
|**availableStatus** | [**AvailableStatusEnum**](#AvailableStatusEnum) | The status for the modifier group.   Note: &#x60;HIDE&#x60; will only update the modifier group to unavailable, remove the modifier group from the menu if you want to hide it entirely. &gt; The item may be marked as &#x60;\&quot;UNAVAILABLE\&quot;&#x60; if no available modifier to be selected within the required modifier group where &#x60;\&quot;selectionRangeMin\&quot;: 1&#x60;.  |  |
|**selectionRangeMin** | **Integer** | The minimum quantity of the modifiers to be selected. Refer to FAQs for more details about [selection range](#section/Menu/What-does-the-selection-range-do). |  [optional] |
|**selectionRangeMax** | **Integer** | The maximum quantity of the modifiers to be selected. Refer to FAQs for more details about [selection range](#section/Menu/What-does-the-selection-range-do). |  |
|**sequence** | **Integer** | The sort or display order of the modifier group within the menu. |  [optional] |
|**modifiers** | [**List&lt;MenuModifier&gt;**](MenuModifier.md) | An array of modifier JSON objects. Max 100 per modifierGroup. Refer to [Modifiers](#modifiers) for more information. |  [optional] |



## Enum: AvailableStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| UNAVAILABLETODAY | &quot;UNAVAILABLETODAY&quot; |
| HIDE | &quot;HIDE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



