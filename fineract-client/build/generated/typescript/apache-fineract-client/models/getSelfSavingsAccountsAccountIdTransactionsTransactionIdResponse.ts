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
import { GetSelfSavingsPaymentDetailData } from './getSelfSavingsPaymentDetailData';
import { GetSelfSavingsTransactionType } from './getSelfSavingsTransactionType';
import { GetSelfSavingsTransactionCurrency } from './getSelfSavingsTransactionCurrency';


/**
 * GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse
 */
export interface GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse { 
    accountId?: number;
    accountNo?: number;
    amount?: number;
    currency?: GetSelfSavingsTransactionCurrency;
    date?: string;
    id?: number;
    paymentDetailData?: GetSelfSavingsPaymentDetailData;
    reversed?: boolean;
    runningBalance?: number;
    transactionType?: GetSelfSavingsTransactionType;
}
