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
import { GetAccountsChargeTimeType } from './getAccountsChargeTimeType';
import { GetAccountsChargesCurrency } from './getAccountsChargesCurrency';
import { GetAccountsChargeCalculationType } from './getAccountsChargeCalculationType';


export interface GetAccountsCharges { 
    accountId?: number;
    amount?: number;
    amountOrPercentage?: number;
    amountOutstanding?: number;
    amountPaid?: number;
    amountPercentageAppliedTo?: number;
    amountWaived?: number;
    amountWrittenOff?: number;
    chargeCalculationType?: GetAccountsChargeCalculationType;
    chargeId?: number;
    chargeTimeType?: GetAccountsChargeTimeType;
    currency?: GetAccountsChargesCurrency;
    id?: number;
    isActive?: boolean;
    name?: string;
    percentage?: number;
}

