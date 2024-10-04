

# OrderReadyEstimation

Information related to the order ready time estimation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowChange** | **Boolean** | A boolean value indicating if the order ready time can be changed. |  |
|**estimatedOrderReadyTime** | **OffsetDateTime** | The order ready time for this order estimated by GrabFood, based on ISO_8601/RFC3339. |  |
|**maxOrderReadyTime** | **OffsetDateTime** | The max allowed order ready time for this order, based on ISO_8601/RFC3339. |  |
|**newOrderReadyTime** | **OffsetDateTime** | The new order ready time for this order. Only present after a new order ready time is set (default will be null), based on ISO_8601/RFC3339. |  [optional] |



