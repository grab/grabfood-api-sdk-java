

# OrderPrice

A JSON object containing order's price in the minor unit format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subtotal** | **Long** | Total item and modifier price (tax-inclusive) in the minor unit. &#x60;&#x60;&#x60; subtotal &#x3D; Sum of all (item price * quantity) | 2550*1&#x3D;2550  |  |
|**tax** | **Long** | GrabFood&#39;s tax in the minor unit. Refer to FAQs for more details about [tax](#section/Order/How-is-tax-calculated). &#x60;&#x60;&#x60; tax &#x3D; (subtotal + merchantChargeFee - merchantFundPromo) * Tax / (1+Tax) | (2550-475)*0.06/1.06&#x3D;117  |  [optional] |
|**merchantChargeFee** | **Long** | Any additional fee charged by merchant (tax-inclusive), which is 100% paid out to the merchant. Reach out to your integration support team for the configuration. Eg. Takeaway, packaging costs, dine-in charge.  |  [optional] |
|**serviceChargeFee** | **Long** | Additional service charge fee charged by merchant (tax-inclusive), which is 100% paid out to the merchant. Reach out to your integration support team for the configuration.  |  [optional] |
|**grabFundPromo** | **Long** | GrabFood&#39;s promo fund in the minor unit. Calculated based on funded ratio. Only present when &#x60;paymentType:CASH&#x60; or &#x60;orderType:DeliveredByRestaurant&#x60;. Otherwise, it will be set to &#x60;0&#x60;. |  [optional] |
|**merchantFundPromo** | **Long** | The merchant&#39;s promo fund in the minor unit. Calculated based on funded ratio. |  [optional] |
|**basketPromo** | **Long** | The total amount promo applied to the basket items only (item level/order level) in the minor unit, excluding delivery fee. Only present when &#x60;paymentType: CASH&#x60; or &#x60;orderType: DeliveredByRestaurant&#x60;. Otherwise, it will be set to &#x60;0&#x60;.  &#x60;&#x60;&#x60; basketPromo &#x3D; (grabFundPromo + merchantFundPromo) | 300 + 475 &#x3D; 775  |  [optional] |
|**deliveryFee** | **Long** | The delivery fee in the minor unit. Only present when &#x60;paymentType:CASH&#x60; or &#x60;orderType:DeliveredByRestaurant&#x60;. Otherwise, it will be set to &#x60;0&#x60;. |  [optional] |
|**smallOrderFee** | **Long** | The fee charged by GrabFood for order that does not meet a certain minimum order value. Only present when &#x60;paymentType:CASH&#x60; and &#x60;orderType:DeliveredByRestaurant&#x60;. |  [optional] |
|**bcrsDepositFeeInMin** | **Long** | The total BCRS (Beverage Container Return Scheme) deposit in the minor unit. A Singapore government-mandated refundable deposit charged to the consumer for eligible beverage containers (plastic bottles and metal cans). This is a non-taxable, non-commissionable pass-through — collected from consumers and not part of net sales. Only present when the order contains BCRS-eligible items; omitted otherwise.  |  [optional] |
|**eaterPayment** | **Long** | The total amount paid by the consumer in the minor unit, excluding some additional fees charged by GrabFood. Only present when &#x60;paymentType:CASH&#x60; or &#x60;orderType:DeliveredByRestaurant&#x60;. Otherwise, it will be set to &#x60;0&#x60;. &#x60;&#x60;&#x60; eaterPayment &#x3D; (subtotal + merchantChargeFee + deliveryFee + bcrsDepositFeeInMin) - (sum of all promo) | (2550+0+400+0)-775&#x3D;2175  |  [optional] |
|**total** | **Long** | The total merchant-related amount calculated exclusive of commission charges. Formulae is the same for all delivery method.  &#x60;&#x60;&#x60; total &#x3D; subtotal + merchantChargeFee - merchantFundPromo | 2550+0-475&#x3D;2075  |  [optional] |
|**merchantEarning** | [**MerchantEarning**](MerchantEarning.md) |  |  [optional] |



