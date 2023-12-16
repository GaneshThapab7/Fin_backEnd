

# LoanProduct


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountingDisabled** | **Boolean** |  |  [optional] |
|**accountingType** | **Integer** |  |  [optional] |
|**accrualBasedAccountingEnabled** | **Boolean** |  |  [optional] |
|**allowApprovedDisbursedAmountsOverApplied** | **Boolean** |  |  [optional] |
|**arrearsBasedOnOriginalSchedule** | **Boolean** |  |  [optional] |
|**cashBasedAccountingEnabled** | **Boolean** |  |  [optional] |
|**closeDate** | **LocalDate** |  |  [optional] |
|**currency** | [**MonetaryCurrency**](MonetaryCurrency.md) |  |  [optional] |
|**disallowExpectedDisbursements** | **Boolean** |  |  [optional] |
|**equalAmortization** | **Boolean** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**fixedPrincipalPercentagePerInstallment** | **BigDecimal** |  |  [optional] |
|**floatingRates** | [**LoanProductFloatingRates**](LoanProductFloatingRates.md) |  |  [optional] |
|**holdGuaranteeFundsEnabled** | **Boolean** |  |  [optional] |
|**id** | **Long** |  |  [optional] |
|**includeInBorrowerCycle** | **Boolean** |  |  [optional] |
|**installmentAmountInMultiplesOf** | **Integer** |  |  [optional] |
|**interestPeriodFrequencyType** | [**InterestPeriodFrequencyTypeEnum**](#InterestPeriodFrequencyTypeEnum) |  |  [optional] |
|**interestRecalculationEnabled** | **Boolean** |  |  [optional] |
|**linkedToFloatingInterestRate** | **Boolean** |  |  [optional] |
|**loanProducTrancheDetails** | [**LoanProductTrancheDetails**](LoanProductTrancheDetails.md) |  |  [optional] |
|**loanProductCharges** | [**List&lt;Charge&gt;**](Charge.md) |  |  [optional] |
|**loanProductConfigurableAttributes** | [**LoanProductConfigurableAttributes**](LoanProductConfigurableAttributes.md) |  |  [optional] |
|**loanProductGuaranteeDetails** | [**LoanProductGuaranteeDetails**](LoanProductGuaranteeDetails.md) |  |  [optional] |
|**loanProductRelatedDetail** | [**LoanProductRelatedDetail**](LoanProductRelatedDetail.md) |  |  [optional] |
|**maxNominalInterestRatePerPeriod** | **BigDecimal** |  |  [optional] |
|**maxNumberOfRepayments** | **Integer** |  |  [optional] |
|**maxPrincipalAmount** | [**Money**](Money.md) |  |  [optional] |
|**minNominalInterestRatePerPeriod** | **BigDecimal** |  |  [optional] |
|**minNumberOfRepayments** | **Integer** |  |  [optional] |
|**minPrincipalAmount** | [**Money**](Money.md) |  |  [optional] |
|**minimumDaysBetweenDisbursalAndFirstRepayment** | **Integer** |  |  [optional] |
|**multiDisburseLoan** | **Boolean** |  |  [optional] |
|**_new** | **Boolean** |  |  [optional] |
|**nominalInterestRatePerPeriod** | **BigDecimal** |  |  [optional] |
|**numberOfRepayments** | **Integer** |  |  [optional] |
|**overAppliedCalculationType** | **String** |  |  [optional] |
|**overAppliedNumber** | **Integer** |  |  [optional] |
|**periodicAccrualAccountingEnabled** | **Boolean** |  |  [optional] |
|**principalAmount** | [**Money**](Money.md) |  |  [optional] |
|**principalThresholdForLastInstallment** | **BigDecimal** |  |  [optional] |
|**productInterestRecalculationDetails** | [**LoanProductInterestRecalculationDetails**](LoanProductInterestRecalculationDetails.md) |  |  [optional] |
|**rates** | [**List&lt;Rate&gt;**](Rate.md) |  |  [optional] |
|**repaymentStrategy** | [**LoanTransactionProcessingStrategy**](LoanTransactionProcessingStrategy.md) |  |  [optional] |
|**shortName** | **String** |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**syncExpectedWithDisbursementDate** | **Boolean** |  |  [optional] |
|**upfrontAccrualAccountingEnabled** | **Boolean** |  |  [optional] |



## Enum: InterestPeriodFrequencyTypeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;DAYS&quot; |
| WEEKS | &quot;WEEKS&quot; |
| MONTHS | &quot;MONTHS&quot; |
| YEARS | &quot;YEARS&quot; |
| WHOLE_TERM | &quot;WHOLE_TERM&quot; |
| INVALID | &quot;INVALID&quot; |



