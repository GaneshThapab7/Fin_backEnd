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


/**
 * GetClientClientIdAddressesResponse
 */
export interface GetClientClientIdAddressesResponse { 
    addressId?: number;
    addressLine1?: string;
    addressLine2?: string;
    addressLine3?: string;
    addressType?: string;
    addressTypeId?: number;
    city?: string;
    client_id?: number;
    countryId?: number;
    countryName?: string;
    countyDistrict?: string;
    createdBy?: string;
    isActive?: boolean;
    postalCode?: number;
    stateName?: string;
    stateProvinceId?: number;
    street?: string;
    townVillage?: string;
    updatedBy?: string;
}

