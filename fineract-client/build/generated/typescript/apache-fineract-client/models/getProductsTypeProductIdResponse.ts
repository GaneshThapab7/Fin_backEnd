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
import { GetLockPeriodTypeEnum } from './getLockPeriodTypeEnum';
import { GetProductsCharges } from './getProductsCharges';
import { GetProductsAccountingMappingOptions } from './getProductsAccountingMappingOptions';
import { GetProductsCurrency } from './getProductsCurrency';
import { GetProductsMinimumActivePeriodFrequencyTypeOptions } from './getProductsMinimumActivePeriodFrequencyTypeOptions';
import { GetChargesCurrency } from './getChargesCurrency';
import { GetProductsAccountingRule } from './getProductsAccountingRule';
import { GetProductsAccountingMappings } from './getProductsAccountingMappings';
import { GetProductsMarketPrice } from './getProductsMarketPrice';


/**
 * GetProductsTypeProductIdResponse
 */
export interface GetProductsTypeProductIdResponse { 
    accountingMappingOptions?: GetProductsAccountingMappingOptions;
    accountingMappings?: GetProductsAccountingMappings;
    accountingRule?: GetProductsAccountingRule;
    allowDividendCalculationForInactiveClients?: boolean;
    chargeOptions?: Set<GetProductsCharges>;
    charges?: Set<GetProductsCharges>;
    currency?: GetProductsCurrency;
    currencyOptions?: Set<GetChargesCurrency>;
    description?: string;
    id?: number;
    lockPeriodTypeEnum?: GetLockPeriodTypeEnum;
    lockinPeriod?: number;
    lockinPeriodFrequencyTypeOptions?: Set<GetProductsMinimumActivePeriodFrequencyTypeOptions>;
    marketPrice?: Set<GetProductsMarketPrice>;
    maximumShares?: number;
    minimumActivePeriod?: number;
    minimumActivePeriodForDividendsTypeEnum?: GetLockPeriodTypeEnum;
    minimumActivePeriodFrequencyTypeOptions?: Set<GetProductsMinimumActivePeriodFrequencyTypeOptions>;
    minimumShares?: number;
    name?: string;
    nominalShares?: number;
    shareCapital?: number;
    shortName?: string;
    totalShares?: number;
    totalSharesIssued?: number;
    unitPrice?: number;
}

