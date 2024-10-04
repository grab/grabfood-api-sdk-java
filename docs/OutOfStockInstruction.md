

# OutOfStockInstruction

An JSON object that indicates the instructions to be taken by the merchant when the item is out of stock.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The short instruction message. |  [optional] |
|**instructionType** | [**InstructionTypeEnum**](#InstructionTypeEnum) | Type of out-of-stock instruction chosen by customer. &#x60;CONTACT&#x60; is disabled by default, kindly reach out to your integration manager if you wish to receive this instruction. |  [optional] |
|**replacementItemID** | **String** | The preferred item&#39;s ID in the partner system. Only applicable when the instructionType is &#x60;SPECIFIC_ITEM&#x60;. |  [optional] |
|**replacementGrabItemID** | **String** | The preferred item&#39;s ID in the Grab system. Only applicable when the instructionType is &#x60;SPECIFIC_ITEM&#x60;. |  [optional] |



## Enum: InstructionTypeEnum

| Name | Value |
|---- | -----|
| REMOVE | &quot;REMOVE&quot; |
| CANCEL | &quot;CANCEL&quot; |
| SPECIFIC_ITEM | &quot;SPECIFIC_ITEM&quot; |
| CONTACT | &quot;CONTACT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



