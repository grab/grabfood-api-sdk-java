

# MerchantEarning

A JSON object reflects the real money the merchant receives. Only applicable for Dine out STO case. `null` if not applicable. Only present in submitOrder webhook. Not present in [ListOrder](#tag/list-order/operation/list-orders) response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**revenue** | **Long** | The revenue of merchant should receive. revenue &#x3D; price.eaterpayment - mexfunddiscount |  [optional] |
|**netEarning** | **Long** | The netEarning of merchant should receive. netEarning &#x3D; revenue - commission |  [optional] |
|**mexFundDiscount** | **Long** | The mexFundDiscount that user applied from grab app in this payment |  [optional] |
|**commission** | **Long** | The commission that grab need charge from this pay merchant transaction. |  [optional] |



