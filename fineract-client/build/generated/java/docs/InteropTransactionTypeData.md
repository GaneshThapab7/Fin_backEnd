

# InteropTransactionTypeData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**initiator** | [**InitiatorEnum**](#InitiatorEnum) |  |  |
|**initiatorType** | [**InitiatorTypeEnum**](#InitiatorTypeEnum) |  |  |
|**scenario** | [**ScenarioEnum**](#ScenarioEnum) |  |  |
|**subScenario** | **String** |  |  [optional] |



## Enum: InitiatorEnum

| Name | Value |
|---- | -----|
| PAYER | &quot;PAYER&quot; |
| PAYEE | &quot;PAYEE&quot; |



## Enum: InitiatorTypeEnum

| Name | Value |
|---- | -----|
| CONSUMER | &quot;CONSUMER&quot; |
| AGENT | &quot;AGENT&quot; |
| BUSINESS | &quot;BUSINESS&quot; |
| DEVICE | &quot;DEVICE&quot; |



## Enum: ScenarioEnum

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;DEPOSIT&quot; |
| WITHDRAWAL | &quot;WITHDRAWAL&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| PAYMENT | &quot;PAYMENT&quot; |
| REFUND | &quot;REFUND&quot; |



