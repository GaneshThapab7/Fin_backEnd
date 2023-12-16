

# InteropQuoteRequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  |
|**amount** | [**MoneyData**](MoneyData.md) |  |  |
|**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) |  |  |
|**expiration** | **OffsetDateTime** |  |  [optional] |
|**expirationLocalDate** | **LocalDate** |  |  [optional] |
|**extensionList** | [**List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional] |
|**fees** | [**MoneyData**](MoneyData.md) |  |  [optional] |
|**geoCode** | [**GeoCodeData**](GeoCodeData.md) |  |  [optional] |
|**note** | **String** |  |  [optional] |
|**quoteCode** | **String** |  |  |
|**requestCode** | **String** |  |  [optional] |
|**transactionCode** | **String** |  |  |
|**transactionRole** | [**TransactionRoleEnum**](#TransactionRoleEnum) |  |  |
|**transactionType** | [**InteropTransactionTypeData**](InteropTransactionTypeData.md) |  |  [optional] |



## Enum: AmountTypeEnum

| Name | Value |
|---- | -----|
| SEND | &quot;SEND&quot; |
| RECEIVE | &quot;RECEIVE&quot; |



## Enum: TransactionRoleEnum

| Name | Value |
|---- | -----|
| PAYER | &quot;PAYER&quot; |
| PAYEE | &quot;PAYEE&quot; |



