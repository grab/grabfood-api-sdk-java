

# GetMenuNewResponse



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantID** | **String** | The merchant&#39;s ID that is in GrabFood&#39;s database. |  [optional] |
|**partnerMerchantID** | **String** | The merchant&#39;s ID that is on the partner&#39;s database. |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  |
|**sellingTimes** | [**List&lt;SellingTime&gt;**](SellingTime.md) | An array of sellingTimes JSON objects. Max 20 allowed. Refer to [Selling Times](#selling-times) for more information. |  |
|**categories** | [**List&lt;MenuCategory&gt;**](MenuCategory.md) | An array of category JSON objects. Max 100 allowed per section. Refer to [Categories](#categories) for more information. |  |



