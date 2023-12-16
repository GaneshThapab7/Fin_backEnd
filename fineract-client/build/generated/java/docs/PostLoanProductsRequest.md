

# PostLoanProductsRequest

PostLoanProductsRequest

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountMovesOutOfNPAOnlyOnArrearsCompletion** | **Boolean** |  |  [optional] |
|**accountingRule** | **Integer** |  |  [optional] |
|**allowApprovedDisbursedAmountsOverApplied** | **Boolean** |  |  [optional] |
|**allowAttributeOverrides** | [**AllowAttributeOverrides**](AllowAttributeOverrides.md) |  |  [optional] |
|**allowPartialPeriodInterestCalcualtion** | **Boolean** |  |  [optional] |
|**allowVariableInstallments** | **Boolean** |  |  [optional] |
|**amortizationType** | **Integer** |  |  [optional] |
|**canDefineInstallmentAmount** | **Boolean** |  |  [optional] |
|**canUseForTopup** | **Boolean** |  |  [optional] |
|**charges** | [**List&lt;ChargeId&gt;**](ChargeId.md) |  |  [optional] |
|**closeDate** | **String** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**dateFormat** | **String** |  |  [optional] |
|**daysInMonthType** | **Integer** |  |  [optional] |
|**daysInYearType** | **Integer** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**digitsAfterDecimal** | **Integer** |  |  [optional] |
|**disallowExpectedDisbursements** | **Boolean** |  |  [optional] |
|**feeToIncomeAccountMappings** | [**Set&lt;GetLoanFeeToIncomeAccountMappings&gt;**](GetLoanFeeToIncomeAccountMappings.md) |  |  [optional] |
|**fixedPrincipalPercentagePerInstallment** | **BigDecimal** |  |  [optional] |
|**fundId** | **Long** |  |  [optional] |
|**fundSourceAccountId** | **Integer** |  |  [optional] |
|**graceOnArrearsAgeing** | **Integer** |  |  [optional] |
|**holdGuaranteeFunds** | **Boolean** |  |  [optional] |
|**inMultiplesOf** | **Integer** |  |  [optional] |
|**includeInBorrowerCycle** | **Boolean** |  |  [optional] |
|**incomeFromFeeAccountId** | **Integer** |  |  [optional] |
|**incomeFromPenaltyAccountId** | **Integer** |  |  [optional] |
|**incomeFromRecoveryAccountId** | **Long** |  |  [optional] |
|**installmentAmountInMultiplesOf** | **Integer** |  |  [optional] |
|**interestCalculationPeriodType** | **Integer** |  |  [optional] |
|**interestOnLoanAccountId** | **Integer** |  |  [optional] |
|**interestRateFrequencyType** | **Integer** |  |  [optional] |
|**interestRatePerPeriod** | **Double** |  |  [optional] |
|**interestRateVariationsForBorrowerCycle** | **List&lt;Integer&gt;** |  |  [optional] |
|**interestRecalculationCompoundingMethod** | **Integer** |  |  [optional] |
|**interestType** | **Integer** |  |  [optional] |
|**isEqualAmortization** | **Boolean** |  |  [optional] |
|**isInterestRecalculationEnabled** | **Boolean** |  |  [optional] |
|**isLinkedToFloatingInterestRates** | **Boolean** |  |  [optional] |
|**loanPortfolioAccountId** | **Integer** |  |  [optional] |
|**locale** | **String** |  |  [optional] |
|**maxInterestRatePerPeriod** | **Double** |  |  [optional] |
|**maxNumberOfRepayments** | **Integer** |  |  [optional] |
|**maxPrincipal** | **Double** |  |  [optional] |
|**maxTrancheCount** | **Integer** |  |  [optional] |
|**minInterestRatePerPeriod** | **Double** |  |  [optional] |
|**minNumberOfRepayments** | **Integer** |  |  [optional] |
|**minPrincipal** | **Double** |  |  [optional] |
|**minimumDaysBetweenDisbursalAndFirstRepayment** | **Integer** |  |  [optional] |
|**multiDisburseLoan** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**numberOfRepaymentVariationsForBorrowerCycle** | **List&lt;Integer&gt;** |  |  [optional] |
|**numberOfRepayments** | **Integer** |  |  [optional] |
|**outstandingLoanBalance** | **Double** |  |  [optional] |
|**overAppliedCalculationType** | **String** |  |  [optional] |
|**overAppliedNumber** | **Integer** |  |  [optional] |
|**overdueDaysForNPA** | **Integer** |  |  [optional] |
|**overpaymentLiabilityAccountId** | **Integer** |  |  [optional] |
|**paymentChannelToFundSourceMappings** | [**Set&lt;GetLoanPaymentChannelToFundSourceMappings&gt;**](GetLoanPaymentChannelToFundSourceMappings.md) |  |  [optional] |
|**penaltyToIncomeAccountMappings** | [**List&lt;ChargeToGLAccountMapper&gt;**](ChargeToGLAccountMapper.md) |  |  [optional] |
|**preClosureInterestCalculationStrategy** | **Integer** |  |  [optional] |
|**principal** | **Double** |  |  [optional] |
|**principalThresholdForLastInstallment** | **Integer** |  |  [optional] |
|**principalVariationsForBorrowerCycle** | **List&lt;Integer&gt;** |  |  [optional] |
|**rates** | [**List&lt;RateData&gt;**](RateData.md) |  |  [optional] |
|**recalculationRestFrequencyType** | **Integer** |  |  [optional] |
|**receivableFeeAccountId** | **Integer** |  |  [optional] |
|**receivableInterestAccountId** | **Integer** |  |  [optional] |
|**receivablePenaltyAccountId** | **Integer** |  |  [optional] |
|**repaymentEvery** | **Integer** |  |  [optional] |
|**repaymentFrequencyType** | **Integer** |  |  [optional] |
|**rescheduleStrategyMethod** | **Integer** |  |  [optional] |
|**shortName** | **String** |  |  [optional] |
|**startDate** | **String** |  |  [optional] |
|**transactionProcessingStrategyId** | **Integer** |  |  [optional] |
|**transfersInSuspenseAccountId** | **Long** |  |  [optional] |
|**useBorrowerCycle** | **Boolean** |  |  [optional] |
|**writeOffAccountId** | **Integer** |  |  [optional] |



