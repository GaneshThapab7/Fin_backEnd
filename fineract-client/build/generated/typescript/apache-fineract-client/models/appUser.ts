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
import { Role } from './role';
import { GrantedAuthority } from './grantedAuthority';
import { Staff } from './staff';
import { AppUserClientMapping } from './appUserClientMapping';


export interface AppUser { 
    accountNonExpired?: boolean;
    accountNonLocked?: boolean;
    appUserClientMappings?: Set<AppUserClientMapping>;
    authorities?: Array<GrantedAuthority>;
    credentialsNonExpired?: boolean;
    deleted?: boolean;
    displayName?: string;
    email?: string;
    enabled?: boolean;
    firstname?: string;
    id?: number;
    lastTimePasswordUpdated?: string;
    lastname?: string;
    _new?: boolean;
    notEnabled?: boolean;
    office?: Office;
    password?: string;
    passwordNeverExpires?: boolean;
    roles?: Set<Role>;
    selfServiceUser?: boolean;
    staff?: Staff;
    staffDisplayName?: string;
    staffId?: number;
    systemUser?: boolean;
    username?: string;
}

