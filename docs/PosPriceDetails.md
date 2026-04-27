

# PosPriceDetails

A JSON object containing order's price in the minor unit format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subtotal** | **Long** | Total item and modifier price  in minor units and tax-inclusive. |  [optional] |
|**tax** | **Long** | Total tax in the minor unit. &#x60;&#x60;&#x60; Formula Tax &#x3D; total item/modifier tax  |  [optional] |
|**merchantChargeFeeInMin** | **Long** | Any additional fee charged by the merchant  in minor units and tax-inclusive, which is 100% paid out to the merchant. Eg. service charge |  [optional] |
|**depositAmountInMin** | **Long** | This field represents the reservation depositAmount, which is the amount paid upfront by the diner during the reservation process. It can be applied towards the final payment when the order is completed. It’s in minor units and tax-inclusive. |  [optional] |
|**offlinePOSDiscountInMin** | **Long** | Offline discount that is provided to the diner in minor units and tax-inclusive. |  [optional] |
|**billRoundingInMin** | **Long** | The rounding amount in minor units.  &#x60;&#x60;&#x60; Round down should be in negative value Round up should be in positive value &#x60;&#x60;&#x60;  |  [optional] |
|**eaterPayment** | **Long** | The total bill value in minor units and tax-inclusive. &#x60;&#x60;&#x60; Formula:   eaterPayment &#x3D;   + subtotal   + merchantChargeFeeInMin   - depositAmountInMin   - offlinePOSDiscountInMin  |  [optional] |



