

# LoanProductInterestRecalculationDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arrearsBasedOnOriginalSchedule** | **Boolean** |  |  [optional] |
|**compoundingFrequencyNthDay** | **Integer** |  |  [optional] |
|**compoundingFrequencyOnDay** | **Integer** |  |  [optional] |
|**compoundingFrequencyType** | [**CompoundingFrequencyTypeEnum**](#CompoundingFrequencyTypeEnum) |  |  [optional] |
|**compoundingFrequencyWeekday** | **Integer** |  |  [optional] |
|**compoundingInterval** | **Integer** |  |  [optional] |
|**id** | **Long** |  |  [optional] |
|**interestRecalculationCompoundingMethod** | **Integer** |  |  [optional] |
|**isCompoundingToBePostedAsTransaction** | **Boolean** |  |  [optional] |
|**_new** | **Boolean** |  |  [optional] |
|**rescheduleStrategyMethod** | **Integer** |  |  [optional] |
|**restFrequencyNthDay** | **Integer** |  |  [optional] |
|**restFrequencyOnDay** | **Integer** |  |  [optional] |
|**restFrequencyType** | [**RestFrequencyTypeEnum**](#RestFrequencyTypeEnum) |  |  [optional] |
|**restFrequencyWeekday** | **Integer** |  |  [optional] |
|**restInterval** | **Integer** |  |  [optional] |



## Enum: CompoundingFrequencyTypeEnum

| Name | Value |
|---- | -----|
| INVALID | &quot;INVALID&quot; |
| SAME_AS_REPAYMENT_PERIOD | &quot;SAME_AS_REPAYMENT_PERIOD&quot; |
| DAILY | &quot;DAILY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |



## Enum: RestFrequencyTypeEnum

| Name | Value |
|---- | -----|
| INVALID | &quot;INVALID&quot; |
| SAME_AS_REPAYMENT_PERIOD | &quot;SAME_AS_REPAYMENT_PERIOD&quot; |
| DAILY | &quot;DAILY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |



