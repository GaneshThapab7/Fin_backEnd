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
import { GetLoansLoanIdLinkedAccount } from './getLoansLoanIdLinkedAccount';
import { GetLoansLoanIdDisbursementDetails } from './getLoansLoanIdDisbursementDetails';
import { GetLoansLoanIdOverdueCharges } from './getLoansLoanIdOverdueCharges';
import { GetLoansLoanIdCurrency } from './getLoansLoanIdCurrency';


export interface GetLoansLoanIdSummary { 
    canDisburse?: boolean;
    currency?: GetLoansLoanIdCurrency;
    disbursementDetails?: Set<GetLoansLoanIdDisbursementDetails>;
    emiAmountVariations?: Set<object>;
    feeChargesCharged?: number;
    feeChargesDueAtDisbursementCharged?: number;
    feeChargesOutstanding?: number;
    feeChargesOverdue?: number;
    feeChargesPaid?: number;
    feeChargesWaived?: number;
    feeChargesWrittenOff?: number;
    fixedEmiAmount?: number;
    inArrears?: boolean;
    interestCharged?: number;
    interestOutstanding?: number;
    interestOverdue?: number;
    interestPaid?: number;
    interestWaived?: number;
    interestWrittenOff?: number;
    isNPA?: boolean;
    linkedAccount?: GetLoansLoanIdLinkedAccount;
    maxOutstandingLoanBalance?: number;
    overdueCharges?: Set<GetLoansLoanIdOverdueCharges>;
    overdueSinceDate?: string;
    penaltyChargesCharged?: number;
    penaltyChargesOutstanding?: number;
    penaltyChargesOverdue?: number;
    penaltyChargesPaid?: number;
    penaltyChargesWaived?: number;
    penaltyChargesWrittenOff?: number;
    principalDisbursed?: number;
    principalOutstanding?: number;
    principalOverdue?: number;
    principalPaid?: number;
    principalWrittenOff?: number;
    totalCostOfLoan?: number;
    totalExpectedCostOfLoan?: number;
    totalExpectedRepayment?: number;
    totalOutstanding?: number;
    totalOverdue?: number;
    totalRepayment?: number;
    totalWaived?: number;
    totalWrittenOff?: number;
}

