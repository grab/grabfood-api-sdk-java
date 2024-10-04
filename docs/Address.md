

# Address

A JSON object containing the receiver’s location information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unitNumber** | **String** | The delivery address&#39; unit number. |  [optional] |
|**deliveryInstruction** | **String** | Instructions for the delivery. |  [optional] |
|**poiSource** | [**PoiSourceEnum**](#PoiSourceEnum) | POI source |  [optional] |
|**poiID** | **String** | POI ID, empty when poiSource is GRAB. |  [optional] |
|**address** | **String** | The delivery address containing street name, city, postal code, and country. Has value only when poiSource is &#x60;GRAB&#x60;. |  [optional] |
|**postcode** | **String** | The postcode of the delivery address. Has value only when poiSource is &#x60;GRAB&#x60;. |  [optional] |
|**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional] |



## Enum: PoiSourceEnum

| Name | Value |
|---- | -----|
| GRAB | &quot;GRAB&quot; |
| GOOGLE | &quot;GOOGLE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



