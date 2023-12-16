/**
 * Apache Fineract REST API
 * Apache Fineract is a secure, multi-tenanted microfinance platform. The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The https://cui.fineract.dev[reference app] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation. Until we complete the new REST API documentation you still have the legacy documentation available https://fineract.apache.org/legacy-docs/apiLive.htm[here]. Please check https://fineract.apache.org/docs/current[the Fineract documentation] for more information.
 *
 * The version of the OpenAPI document: 0.0.0-NOT_A_GIT_REPOSITORY
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { GetLoansLoanIdStatus } from './getLoansLoanIdStatus';
import { GetLoansLoanIdInterestRateFrequencyType } from './getLoansLoanIdInterestRateFrequencyType';
import { GetLoansLoanIdInterestType } from './getLoansLoanIdInterestType';
import { GetLoansLoanIdRepaymentFrequencyType } from './getLoansLoanIdRepaymentFrequencyType';
import { GetLoansLoanIdRepaymentSchedule } from './getLoansLoanIdRepaymentSchedule';
import { GetLoansLoanIdSummary } from './getLoansLoanIdSummary';
import { GetLoansLoanIdLoanType } from './getLoansLoanIdLoanType';
import { GetLoansLoanIdTimeline } from './getLoansLoanIdTimeline';
import { GetLoansLoanIdAmortizationType } from './getLoansLoanIdAmortizationType';
import { GetLoansLoanIdTermPeriodFrequencyType } from './getLoansLoanIdTermPeriodFrequencyType';
import { GetLoansLoanIdCurrency } from './getLoansLoanIdCurrency';
import { GetLoansLoanIdInterestCalculationPeriodType } from './getLoansLoanIdInterestCalculationPeriodType';


/**
 * GetLoansLoanIdResponse
 */
export interface GetLoansLoanIdResponse { 
    accountNo?: number;
    amortizationType?: GetLoansLoanIdAmortizationType;
    annualInterestRate?: number;
    approvedPrincipal?: number;
    clientId?: number;
    clientName?: string;
    clientOfficeId?: number;
    currency?: GetLoansLoanIdCurrency;
    fixedPrincipalPercentagePerInstallment?: number;
    id?: number;
    interestCalculationPeriodType?: GetLoansLoanIdInterestCalculationPeriodType;
    interestRateFrequencyType?: GetLoansLoanIdInterestRateFrequencyType;
    interestRatePerPeriod?: number;
    interestType?: GetLoansLoanIdInterestType;
    loanOfficerId?: number;
    loanOfficerName?: string;
    loanProductDescription?: string;
    loanProductId?: number;
    loanProductName?: string;
    loanPurposeId?: number;
    loanPurposeName?: string;
    loanType?: GetLoansLoanIdLoanType;
    netDisbursalAmount?: number;
    numberOfRepayments?: number;
    principal?: number;
    repaymentEvery?: number;
    repaymentFrequencyType?: GetLoansLoanIdRepaymentFrequencyType;
    repaymentSchedule?: GetLoansLoanIdRepaymentSchedule;
    status?: GetLoansLoanIdStatus;
    summary?: GetLoansLoanIdSummary;
    termFrequency?: number;
    termPeriodFrequencyType?: GetLoansLoanIdTermPeriodFrequencyType;
    timeline?: GetLoansLoanIdTimeline;
    transactionProcessingStrategyId?: number;
}

