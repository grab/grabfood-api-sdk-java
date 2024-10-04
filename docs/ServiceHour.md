

# ServiceHour

A JSON object serviceHour for each day.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**openPeriodType** | [**OpenPeriodTypeEnum**](#OpenPeriodTypeEnum) | The period type for when the outlet is open. - OpenPeriod &#x3D; open only in given periods - OpenAllDay &#x3D; open 24 hours - CloseAllDay &#x3D; closed 24 hours  |  |
|**periods** | [**List&lt;OpenPeriod&gt;**](OpenPeriod.md) | An array of open periods. Only required when &#x60;openPeriodType&#x60; is **OpenPeriod** |  [optional] |



## Enum: OpenPeriodTypeEnum

| Name | Value |
|---- | -----|
| OPEN_PERIOD | &quot;OpenPeriod&quot; |
| OPEN_ALL_DAY | &quot;OpenAllDay&quot; |
| CLOSE_ALL_DAY | &quot;CloseAllDay&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



