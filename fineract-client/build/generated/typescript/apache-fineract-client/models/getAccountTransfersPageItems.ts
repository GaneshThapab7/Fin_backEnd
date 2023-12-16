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
import { GetAccountTransfersPageItemsFromAccount } from './getAccountTransfersPageItemsFromAccount';
import { GetAccountTransfersPageItemsCurrency } from './getAccountTransfersPageItemsCurrency';
import { GetAccountTransfersFromClientOptions } from './getAccountTransfersFromClientOptions';
import { GetAccountTransfersPageItemsToAccountType } from './getAccountTransfersPageItemsToAccountType';
import { GetAccountTransfersPageItemsFromOffice } from './getAccountTransfersPageItemsFromOffice';
import { GetAccountTransfersFromAccountType } from './getAccountTransfersFromAccountType';


export interface GetAccountTransfersPageItems { 
    currency?: GetAccountTransfersPageItemsCurrency;
    fromAccount?: GetAccountTransfersPageItemsFromAccount;
    fromAccountType?: GetAccountTransfersFromAccountType;
    fromClient?: GetAccountTransfersFromClientOptions;
    fromOffice?: GetAccountTransfersPageItemsFromOffice;
    id?: number;
    reversed?: boolean;
    toAccount?: GetAccountTransfersPageItemsFromAccount;
    toAccountType?: GetAccountTransfersPageItemsToAccountType;
    toClient?: GetAccountTransfersFromClientOptions;
    toOffice?: GetAccountTransfersPageItemsFromOffice;
    transferAmount?: number;
    transferDate?: string;
    transferDescription?: string;
}

