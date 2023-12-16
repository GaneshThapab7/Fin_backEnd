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
import { TaxGroup } from './taxGroup';
import { GLAccount } from './gLAccount';
import { PaymentType } from './paymentType';
import { ChargeFeeOnMonthDay } from './chargeFeeOnMonthDay';


export interface Charge { 
    account?: GLAccount;
    active?: boolean;
    allowedClientChargeCalculationType?: boolean;
    allowedClientChargeTime?: boolean;
    allowedLoanChargeTime?: boolean;
    allowedSavingsChargeCalculationType?: boolean;
    allowedSavingsChargeTime?: boolean;
    amount?: number;
    annualFee?: boolean;
    chargeCalculation?: number;
    chargePaymentMode?: number;
    chargeTimeType?: number;
    clientCharge?: boolean;
    currencyCode?: string;
    deleted?: boolean;
    disbursementCharge?: boolean;
    enableFreeWithdrawal?: boolean;
    enablePaymentType?: boolean;
    feeInterval?: number;
    feeOnMonthDay?: ChargeFeeOnMonthDay;
    frequencyFreeWithdrawalCharge?: number;
    id?: number;
    incomeAccountId?: number;
    loanCharge?: boolean;
    maxCap?: number;
    minCap?: number;
    monthlyFee?: boolean;
    name?: string;
    _new?: boolean;
    overdueInstallment?: boolean;
    paymentType?: PaymentType;
    penalty?: boolean;
    percentageOfApprovedAmount?: boolean;
    percentageOfDisbursementAmount?: boolean;
    restartFrequency?: number;
    restartFrequencyEnum?: number;
    savingsCharge?: boolean;
    taxGroup?: TaxGroup;
}
