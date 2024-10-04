

# SpecialOpeningHourOpeningHours

Store special opening hour period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**openPeriodType** | [**OpenPeriodTypeEnum**](#OpenPeriodTypeEnum) | The period type for when the outlet is open. |  [optional] |
|**periods** | [**List&lt;OpenPeriod&gt;**](OpenPeriod.md) | An array of open periods. Maximum of 3 periods. |  [optional] |



## Enum: OpenPeriodTypeEnum

| Name | Value |
|---- | -----|
| PERIOD | &quot;Period&quot; |
| OPEN_ALL_DAY | &quot;OpenAllDay&quot; |
| CLOSED_ALL_DAY | &quot;ClosedAllDay&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



