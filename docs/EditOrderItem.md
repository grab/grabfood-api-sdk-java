

# EditOrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemID** | **String** | The item&#39;s ID in Grab system that can be obtained from the [Submit Order Webhook](#tag/submit-order-webhook/operation/submit-order-webhook) request payload parameters under &#x60;items[].grabItemID&#x60;, or &#x60;items[].outOfStockInstruction.replacementGrabItemID&#x60; for item replacement. External item ID from Partner system is only supported when &#x60;ADDED&#x60; status and &#x60;isExternalItemID: true&#x60;. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The item&#39;s edited status. Leave empty string if there is no change to the item. |  |
|**quantity** | **Long** | The item&#39;s quantity. If the item is not being updated or deleted, use the original quantity. |  [optional] |
|**isExternalItemID** | **Boolean** | Only applicable for &#x60;ADDED&#x60;status. Indicate if the &#x60;itemID&#x60; is an external item ID. Grab checks for the items that are mapped to the provided item ID, considering their availability. If multiple Grab items are found to be mapped to the provided external item ID, the last updated item will be chosen. If no suitable record is found, an 400 error will be returned to the partner, indicating that the submitted external item ID cannot be edited. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DELETED | &quot;DELETED&quot; |
| UPDATED | &quot;UPDATED&quot; |
| ADDED | &quot;ADDED&quot; |
| EMPTY | &quot;&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



