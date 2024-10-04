

# Currency

A JSON object containing code, symbol, and exponent for a given currency. Refer to [Country and Currency](#section/Getting-started/Country-and-currency).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | The three-letter ISO currency code. This is the currency that is associated with the payment amount.  |  |
|**symbol** | [**SymbolEnum**](#SymbolEnum) | The currency symbol.  |  |
|**exponent** | **Integer** | The log base 10 of the number of times we have to multiply the major unit to get the minor unit. Should be 0 for VN and 2 for other countries (SG/MY/ID/TH/PH/KH).  |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| IDR | &quot;IDR&quot; |
| MYR | &quot;MYR&quot; |
| PHP | &quot;PHP&quot; |
| SGD | &quot;SGD&quot; |
| THB | &quot;THB&quot; |
| VND | &quot;VND&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SymbolEnum

| Name | Value |
|---- | -----|
| RP | &quot;Rp&quot; |
| RM | &quot;RM&quot; |
| u | &quot;₱&quot; |
| S_ | &quot;S$&quot; |
| u2 | &quot;฿&quot; |
| u3 | &quot;₫&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



