

# OrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The item&#39;s ExternalID in the partner system.  |  |
|**grabItemID** | **String** | The item&#39;s ID in Grab system. Partner can use this field in the &#x60;EditOrder&#x60; endpoint. |  |
|**quantity** | **Integer** | The number of the item ordered. |  |
|**price** | **Long** | The price (tax-inclusive) in minor format for 1 item and modifiers under it. &#x60;Item price(tax inclusive) + Modifier price(tax inclusive) | (2241*1.06)+(165*1.06)&#x3D;2550&#x60;.  |  |
|**tax** | **Long** | Tax in minor format for 1 item and all modifiers under it. &#x60;0&#x60; if tax configuration is absent. &#x60;Item tax + Modifier tax | (2241*0.06)+(165*0.06)&#x3D;144&#x60;. Refer to FAQs for more details about [tax](#section/Order/How-is-tax-calculated). |  [optional] |
|**specifications** | **String** | An extra note for the merchant. &#x60;Blank&#x60; if no note from consumer.  |  [optional] |
|**outOfStockInstruction** | [**OutOfStockInstruction**](OutOfStockInstruction.md) |  |  [optional] |
|**modifiers** | [**List&lt;OrderItemModifier&gt;**](OrderItemModifier.md) | An array of JSON objects modifiers. Read [this](#categories) for more information. |  [optional] |



