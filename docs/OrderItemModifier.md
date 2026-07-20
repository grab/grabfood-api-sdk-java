

# OrderItemModifier


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The modifier&#39;s ID that is on the partner&#39;s system. |  [optional] |
|**price** | **Long** | The modifier&#39;s price (tax-inclusive) in minor format.  &#x60;&#x60;&#x60; price &#x3D; round(165 * (1 + 0.06)) &#x3D; 175  |  [optional] |
|**tax** | **Long** | Tax in minor format for 1 modifier. Refer to FAQs for more details about [tax](#section/Order/How-is-tax-calculated). &#x60;&#x60;&#x60; tax &#x3D; 165*0.06&#x3D;10  |  [optional] |
|**quantity** | [**QuantityEnum**](#QuantityEnum) | The number of modifiers present. The value is always 1. |  [optional] |
|**bcrsUnitCount** | **Integer** | **For Singapore only.** The number of BCRS (Beverage Container Return Scheme) eligible containers for this modifier. Only present when the modifier is BCRS-eligible and the merchant has BCRS enabled; omitted otherwise.  |  [optional] |



## Enum: QuantityEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_unknown_default_open_api | 11184809 |



