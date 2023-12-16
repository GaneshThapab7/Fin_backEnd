

# InteropTransferRequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  |
|**amount** | [**MoneyData**](MoneyData.md) |  |  |
|**expiration** | **OffsetDateTime** |  |  [optional] |
|**expirationLocalDate** | **LocalDate** |  |  [optional] |
|**extensionList** | [**List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional] |
|**fspCommission** | [**MoneyData**](MoneyData.md) |  |  [optional] |
|**fspFee** | [**MoneyData**](MoneyData.md) |  |  [optional] |
|**geoCode** | [**GeoCodeData**](GeoCodeData.md) |  |  [optional] |
|**note** | **String** |  |  [optional] |
|**requestCode** | **String** |  |  [optional] |
|**transactionCode** | **String** |  |  |
|**transactionRole** | [**TransactionRoleEnum**](#TransactionRoleEnum) |  |  |
|**transactionType** | [**InteropTransactionTypeData**](InteropTransactionTypeData.md) |  |  [optional] |
|**transferCode** | **String** |  |  |



## Enum: TransactionRoleEnum

| Name | Value |
|---- | -----|
| PAYER | &quot;PAYER&quot; |
| PAYEE | &quot;PAYEE&quot; |



