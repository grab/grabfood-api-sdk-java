

# CampaignDiscount

The discount detail for a particular campaign when conditions are satisfied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of discount  |  |
|**cap** | **Double** | The maximum discount dollar amount. It is **not required** and will be ignored when the &#x60;discount.type&#x60; is: - &#x60;net&#x60; - &#x60;delivery&#x60; - &#x60;freeItem&#x60; - &#x60;bundleSameNet&#x60; - &#x60;bundleSamePercentage&#x60; - &#x60;bundleSameFixPrice&#x60; - &#x60;bundleDiffNet&#x60; - &#x60;bundleDiffPercentage&#x60; - &#x60;bundleDiffFixPrice&#x60;  |  [optional] |
|**value** | **Double** | Specify the discount amount. Decimal number is not supported For VN, ID and TH. For example, &#x60;10.5&#x60; is not allowed and it should be &#x60;10.0&#x60;. * Dollar amount value when &#x60;discount.type&#x60; is &#x60;net&#x60;, &#x60;delivery&#x60;, &#x60;bundleSameNet&#x60;, &#x60;bundleSameFixPrice&#x60;, &#x60;bundleDiffNet&#x60;, &#x60;bundleDiffFixPrice&#x60;. * Percentage value (0-100) when &#x60;discount.type&#x60; is &#x60;percentage&#x60;, &#x60;bundleSamePercentage&#x60;, &#x60;bundleDiffPercentage&#x60;. * **Not required** when &#x60;discount.type&#x60; is &#x60;freeItem&#x60;.  |  [optional] |
|**scope** | [**CampaignScope**](CampaignScope.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NET | &quot;net&quot; |
| PERCENTAGE | &quot;percentage&quot; |
| DELIVERY | &quot;delivery&quot; |
| FREE_ITEM | &quot;freeItem&quot; |
| BUNDLE_SAME_NET | &quot;bundleSameNet&quot; |
| BUNDLE_SAME_PERCENTAGE | &quot;bundleSamePercentage&quot; |
| BUNDLE_SAME_FIX_PRICE | &quot;bundleSameFixPrice&quot; |
| BUNDLE_DIFF_NET | &quot;bundleDiffNet&quot; |
| BUNDLE_DIFF_PERCENTAGE | &quot;bundleDiffPercentage&quot; |
| BUNDLE_DIFF_FIX_PRICE | &quot;bundleDiffFixPrice&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



