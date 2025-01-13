

# OrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The item&#39;s externalID in the partner system.  |  |
|**grabItemID** | **String** | The item&#39;s ID in Grab system. Partner can use this field in the &#x60;EditOrder&#x60; endpoint. |  |
|**quantity** | **Integer** | The number of the item ordered. |  |
|**price** | **Long** | The price for a single item along with its associated modifiers in minor unit and tax-inclusive.  &#x60;&#x60;&#x60; price &#x3D; Item price(tax inclusive) + Modifier price(tax inclusive) | (2241*1.06)+(165*1.06)&#x3D;2550  |  |
|**tax** | **Long** | Tax in minor format for a single item along with its associated modifiers. &#x60;0&#x60; if tax configuration is absent. Refer to FAQs for more details about [tax](#section/Order/How-is-tax-calculated). &#x60;&#x60;&#x60; tax &#x3D; Item tax + Modifier tax | (2241*0.06)+(165*0.06)&#x3D;144  |  [optional] |
|**specifications** | **String** | An extra note for the merchant. Empty if no note from consumer.  |  [optional] |
|**outOfStockInstruction** | [**OutOfStockInstruction**](OutOfStockInstruction.md) |  |  [optional] |
|**modifiers** | [**List&lt;OrderItemModifier&gt;**](OrderItemModifier.md) | An array of JSON objects modifiers. |  [optional] |



