

# Receiver

A JSON object containing the receiver information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the receiver. |  [optional] |
|**phones** | **String** | The receiver&#39;s phone number. Only applicable for orders that are delivered by the restaurant. &#x60;null&#x60; if not applicable.  &gt; Note: The &#x60;phones&#x60; field will be deprecated once the virtualContact feature is fully rolled out.  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**virtualContact** | [**VirtualContact**](VirtualContact.md) |  |  [optional] |



