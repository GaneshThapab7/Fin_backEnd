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
import { Office } from './office';
import { Group } from './group';
import { Staff } from './staff';
import { Image } from './image';


export interface Client { 
    accountNumberRequiresAutoGeneration?: boolean;
    activationLocalDate?: string;
    active?: boolean;
    closed?: boolean;
    closureDate?: string;
    createdBy?: number;
    createdDate?: string;
    displayName?: string;
    emailAddress?: string;
    externalId?: string;
    firstname?: string;
    groups?: Set<Group>;
    id?: number;
    image?: Image;
    lastModifiedBy?: number;
    lastModifiedDate?: string;
    lastname?: string;
    legalForm?: number;
    middlename?: string;
    mobileNo?: string;
    _new?: boolean;
    notActive?: boolean;
    notPending?: boolean;
    notStaff?: boolean;
    office?: Office;
    officeJoiningLocalDate?: string;
    pending?: boolean;
    proposedTransferDate?: string;
    rejected?: boolean;
    rejectedDate?: string;
    reopenedDate?: string;
    staff?: Staff;
    status?: number;
    submittedOnDate?: string;
    transferInProgress?: boolean;
    transferInProgressOrOnHold?: boolean;
    transferOnHold?: boolean;
    transferToOffice?: Office;
    withdrawalDate?: string;
    withdrawn?: boolean;
}

