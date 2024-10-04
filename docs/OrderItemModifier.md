

# OrderItemModifier


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The modifier&#39;s ID that is on the partner&#39;s system. |  [optional] |
|**price** | **Long** | The modifier&#39;s price (tax-inclusive) in minor format. &#x60;round(165 * (1 + 0.06)) &#x3D; 175&#x60;. |  [optional] |
|**tax** | **Long** | Tax in minor format for 1 modifier. &#x60;165*0.06&#x3D;10&#x60;. Refer to FAQs for more details about [tax](#section/Order/How-is-tax-calculated). |  [optional] |
|**quantity** | [**QuantityEnum**](#QuantityEnum) | The number of modifiers present. The value is always 1. |  [optional] |



## Enum: QuantityEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_unknown_default_open_api | 11184809 |



