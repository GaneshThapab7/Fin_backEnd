

# LoanProductRelatedDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowPartialPeriodInterestCalcualtion** | **Boolean** |  |  [optional] |
|**amortizationMethod** | [**AmortizationMethodEnum**](#AmortizationMethodEnum) |  |  [optional] |
|**annualNominalInterestRate** | **BigDecimal** |  |  [optional] |
|**arrearsTolerance** | **BigDecimal** |  |  [optional] |
|**currency** | [**MonetaryCurrency**](MonetaryCurrency.md) |  |  [optional] |
|**equalAmortization** | **Boolean** |  |  [optional] |
|**graceOnArrearsAgeing** | **Integer** |  |  [optional] |
|**graceOnDueDate** | **Integer** |  |  [optional] |
|**graceOnInterestPayment** | **Integer** |  |  [optional] |
|**graceOnPrincipalPayment** | **Integer** |  |  [optional] |
|**inArrearsTolerance** | [**Money**](Money.md) |  |  [optional] |
|**interestCalculationPeriodMethod** | [**InterestCalculationPeriodMethodEnum**](#InterestCalculationPeriodMethodEnum) |  |  [optional] |
|**interestMethod** | [**InterestMethodEnum**](#InterestMethodEnum) |  |  [optional] |
|**interestPeriodFrequencyType** | [**InterestPeriodFrequencyTypeEnum**](#InterestPeriodFrequencyTypeEnum) |  |  [optional] |
|**interestRecalculationEnabled** | **Boolean** |  |  [optional] |
|**nominalInterestRatePerPeriod** | **BigDecimal** |  |  [optional] |
|**numberOfRepayments** | **Integer** |  |  [optional] |
|**principal** | [**Money**](Money.md) |  |  [optional] |
|**repayEvery** | **Integer** |  |  [optional] |
|**repaymentPeriodFrequencyType** | [**RepaymentPeriodFrequencyTypeEnum**](#RepaymentPeriodFrequencyTypeEnum) |  |  [optional] |



## Enum: AmortizationMethodEnum

| Name | Value |
|---- | -----|
| EQUAL_PRINCIPAL | &quot;EQUAL_PRINCIPAL&quot; |
| EQUAL_INSTALLMENTS | &quot;EQUAL_INSTALLMENTS&quot; |
| INVALID | &quot;INVALID&quot; |



## Enum: InterestCalculationPeriodMethodEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| SAME_AS_REPAYMENT_PERIOD | &quot;SAME_AS_REPAYMENT_PERIOD&quot; |
| INVALID | &quot;INVALID&quot; |



## Enum: InterestMethodEnum

| Name | Value |
|---- | -----|
| DECLINING_BALANCE | &quot;DECLINING_BALANCE&quot; |
| FLAT | &quot;FLAT&quot; |
| INVALID | &quot;INVALID&quot; |



## Enum: InterestPeriodFrequencyTypeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;DAYS&quot; |
| WEEKS | &quot;WEEKS&quot; |
| MONTHS | &quot;MONTHS&quot; |
| YEARS | &quot;YEARS&quot; |
| WHOLE_TERM | &quot;WHOLE_TERM&quot; |
| INVALID | &quot;INVALID&quot; |



## Enum: RepaymentPeriodFrequencyTypeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;DAYS&quot; |
| WEEKS | &quot;WEEKS&quot; |
| MONTHS | &quot;MONTHS&quot; |
| YEARS | &quot;YEARS&quot; |
| WHOLE_TERM | &quot;WHOLE_TERM&quot; |
| INVALID | &quot;INVALID&quot; |



