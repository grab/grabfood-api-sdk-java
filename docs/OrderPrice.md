

# OrderPrice

A JSON object containing order's price in the minor unit format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subtotal** | **Long** | Total item and modifier price (tax-inclusive) in the minor unit. &#x60;Sum of all (Item price * quantity) | 2550*1&#x3D;2550&#x60;. |  |
|**tax** | **Long** | GrabFood&#39;s tax in the minor unit. &#x60;(subtotal-merchantFundPromo)* Tax /(1+Tax) | (2550-475)*0.06/1.06&#x3D;117&#x60;. Refer to FAQs for more details about [tax](#section/Order/How-is-tax-calculated). |  [optional] |
|**merchantChargeFee** | **Long** | Any additional fee charged by merchant, which is 100% paid out to the merchant. Eg. Takeaway, packaging costs, dine-in charge. |  [optional] |
|**grabFundPromo** | **Long** | GrabFood&#39;s promo fund in the minor unit. Calculated based on funded ratio. |  [optional] |
|**merchantFundPromo** | **Long** | The merchant&#39;s promo fund in the minor unit. Calculated based on funded ratio. |  [optional] |
|**basketPromo** | **Long** | The total amount promo applied to the basket items only (item level/order level) in the minor unit. Delivery fee is excluded. &#x60;(grabFundPromo + merchantFundPromo) | 300 + 475 &#x3D; 775&#x60;  |  [optional] |
|**deliveryFee** | **Long** | The delivery fee in the minor unit. |  [optional] |
|**eaterPayment** | **Long** | The total amount consumer paid in the minor unit. &#x60;(subtotal + deliveryFee) - (sum of all promo) | (2550+400)-775&#x3D;2175&#x60; |  |



