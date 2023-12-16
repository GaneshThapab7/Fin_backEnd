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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent, HttpParameterCodec, HttpContext 
        }       from '@angular/common/http';
import { CustomHttpParameterCodec }                          from '../encoder';
import { Observable }                                        from 'rxjs';

// @ts-ignore
import { GetAccountTransfersPageItems } from '../apache-fineract-client/models/getAccountTransfersPageItems';
// @ts-ignore
import { GetAccountTransfersResponse } from '../apache-fineract-client/models/getAccountTransfersResponse';
// @ts-ignore
import { GetAccountTransfersTemplateRefundByTransferResponse } from '../apache-fineract-client/models/getAccountTransfersTemplateRefundByTransferResponse';
// @ts-ignore
import { GetAccountTransfersTemplateResponse } from '../apache-fineract-client/models/getAccountTransfersTemplateResponse';
// @ts-ignore
import { PostAccountTransfersRefundByTransferRequest } from '../apache-fineract-client/models/postAccountTransfersRefundByTransferRequest';
// @ts-ignore
import { PostAccountTransfersRefundByTransferResponse } from '../apache-fineract-client/models/postAccountTransfersRefundByTransferResponse';
// @ts-ignore
import { PostAccountTransfersRequest } from '../apache-fineract-client/models/postAccountTransfersRequest';
// @ts-ignore
import { PostAccountTransfersResponse } from '../apache-fineract-client/models/postAccountTransfersResponse';

// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { apacheFineractClientConfiguration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class AccountTransfersService {

    protected basePath = 'http://localhost/fineract-provider/api/v1';
    public defaultHeaders = new HttpHeaders();
    public configuration = new apacheFineractClientConfiguration();
    public encoder: HttpParameterCodec;

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: apacheFineractClientConfiguration) {
        if (configuration) {
            this.configuration = configuration;
        }
        if (typeof this.configuration.basePath !== 'string') {
            if (typeof basePath !== 'string') {
                basePath = this.basePath;
            }
            this.configuration.basePath = basePath;
        }
        this.encoder = this.configuration.encoder || new CustomHttpParameterCodec();
    }


    // @ts-ignore
    private addToHttpParams(httpParams: HttpParams, value: any, key?: string): HttpParams {
        if (typeof value === "object" && value instanceof Date === false) {
            httpParams = this.addToHttpParamsRecursive(httpParams, value);
        } else {
            httpParams = this.addToHttpParamsRecursive(httpParams, value, key);
        }
        return httpParams;
    }

    private addToHttpParamsRecursive(httpParams: HttpParams, value?: any, key?: string): HttpParams {
        if (value == null) {
            return httpParams;
        }

        if (typeof value === "object") {
            if (Array.isArray(value)) {
                (value as any[]).forEach( elem => httpParams = this.addToHttpParamsRecursive(httpParams, elem, key));
            } else if (value instanceof Date) {
                if (key != null) {
                    httpParams = httpParams.append(key, (value as Date).toISOString().substr(0, 10));
                } else {
                   throw Error("key may not be null if value is Date");
                }
            } else {
                Object.keys(value).forEach( k => httpParams = this.addToHttpParamsRecursive(
                    httpParams, value[k], key != null ? `${key}.${k}` : k));
            }
        } else if (key != null) {
            httpParams = httpParams.append(key, value);
        } else {
            throw Error("key may not be null if value is not object or array");
        }
        return httpParams;
    }

    /**
     * Create new Transfer
     * Ability to create new transfer of monetary funds from one account to another.
     * @param postAccountTransfersRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public create4(postAccountTransfersRequest: PostAccountTransfersRequest, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<PostAccountTransfersResponse>;
    public create4(postAccountTransfersRequest: PostAccountTransfersRequest, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<PostAccountTransfersResponse>>;
    public create4(postAccountTransfersRequest: PostAccountTransfersRequest, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<PostAccountTransfersResponse>>;
    public create4(postAccountTransfersRequest: PostAccountTransfersRequest, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (postAccountTransfersRequest === null || postAccountTransfersRequest === undefined) {
            throw new Error('Required parameter postAccountTransfersRequest was null or undefined when calling create4.');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (basicAuth) required
        localVarCredential = this.configuration.lookupCredential('basicAuth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Basic ' + localVarCredential);
        }

        // authentication (tenantid) required
        localVarCredential = this.configuration.lookupCredential('tenantid');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('fineract-platform-tenantid', localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }

        let localVarHttpContext: HttpContext | undefined = options && options.context;
        if (localVarHttpContext === undefined) {
            localVarHttpContext = new HttpContext();
        }


        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Content-Type', httpContentTypeSelected);
        }

        let responseType_: 'text' | 'json' | 'blob' = 'json';
        if (localVarHttpHeaderAcceptSelected) {
            if (localVarHttpHeaderAcceptSelected.startsWith('text')) {
                responseType_ = 'text';
            } else if (this.configuration.isJsonMime(localVarHttpHeaderAcceptSelected)) {
                responseType_ = 'json';
            } else {
                responseType_ = 'blob';
            }
        }

        return this.httpClient.post<PostAccountTransfersResponse>(`${this.configuration.basePath}/accounttransfers`,
            postAccountTransfersRequest,
            {
                context: localVarHttpContext,
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * List account transfers
     * Lists account\&#39;s transfers  Example Requests:    accounttransfers
     * @param sqlSearch sqlSearch
     * @param externalId externalId
     * @param offset offset
     * @param limit 
     * @param orderBy orderBy
     * @param sortOrder sortOrder
     * @param accountDetailId accountDetailId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public retrieveAll18(sqlSearch?: string, externalId?: string, offset?: number, limit?: number, orderBy?: string, sortOrder?: string, accountDetailId?: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<GetAccountTransfersResponse>;
    public retrieveAll18(sqlSearch?: string, externalId?: string, offset?: number, limit?: number, orderBy?: string, sortOrder?: string, accountDetailId?: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<GetAccountTransfersResponse>>;
    public retrieveAll18(sqlSearch?: string, externalId?: string, offset?: number, limit?: number, orderBy?: string, sortOrder?: string, accountDetailId?: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<GetAccountTransfersResponse>>;
    public retrieveAll18(sqlSearch?: string, externalId?: string, offset?: number, limit?: number, orderBy?: string, sortOrder?: string, accountDetailId?: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {

        let localVarQueryParameters = new HttpParams({encoder: this.encoder});
        if (sqlSearch !== undefined && sqlSearch !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>sqlSearch, 'sqlSearch');
        }
        if (externalId !== undefined && externalId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>externalId, 'externalId');
        }
        if (offset !== undefined && offset !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>offset, 'offset');
        }
        if (limit !== undefined && limit !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>limit, 'limit');
        }
        if (orderBy !== undefined && orderBy !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>orderBy, 'orderBy');
        }
        if (sortOrder !== undefined && sortOrder !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>sortOrder, 'sortOrder');
        }
        if (accountDetailId !== undefined && accountDetailId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>accountDetailId, 'accountDetailId');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (basicAuth) required
        localVarCredential = this.configuration.lookupCredential('basicAuth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Basic ' + localVarCredential);
        }

        // authentication (tenantid) required
        localVarCredential = this.configuration.lookupCredential('tenantid');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('fineract-platform-tenantid', localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }

        let localVarHttpContext: HttpContext | undefined = options && options.context;
        if (localVarHttpContext === undefined) {
            localVarHttpContext = new HttpContext();
        }


        let responseType_: 'text' | 'json' | 'blob' = 'json';
        if (localVarHttpHeaderAcceptSelected) {
            if (localVarHttpHeaderAcceptSelected.startsWith('text')) {
                responseType_ = 'text';
            } else if (this.configuration.isJsonMime(localVarHttpHeaderAcceptSelected)) {
                responseType_ = 'json';
            } else {
                responseType_ = 'blob';
            }
        }

        return this.httpClient.get<GetAccountTransfersResponse>(`${this.configuration.basePath}/accounttransfers`,
            {
                context: localVarHttpContext,
                params: localVarQueryParameters,
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Retrieve account transfer
     * Retrieves account transfer  Example Requests :    accounttransfers/1
     * @param transferId transferId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public retrieveOne9(transferId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<GetAccountTransfersPageItems>;
    public retrieveOne9(transferId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<GetAccountTransfersPageItems>>;
    public retrieveOne9(transferId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<GetAccountTransfersPageItems>>;
    public retrieveOne9(transferId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (transferId === null || transferId === undefined) {
            throw new Error('Required parameter transferId was null or undefined when calling retrieveOne9.');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (basicAuth) required
        localVarCredential = this.configuration.lookupCredential('basicAuth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Basic ' + localVarCredential);
        }

        // authentication (tenantid) required
        localVarCredential = this.configuration.lookupCredential('tenantid');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('fineract-platform-tenantid', localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }

        let localVarHttpContext: HttpContext | undefined = options && options.context;
        if (localVarHttpContext === undefined) {
            localVarHttpContext = new HttpContext();
        }


        let responseType_: 'text' | 'json' | 'blob' = 'json';
        if (localVarHttpHeaderAcceptSelected) {
            if (localVarHttpHeaderAcceptSelected.startsWith('text')) {
                responseType_ = 'text';
            } else if (this.configuration.isJsonMime(localVarHttpHeaderAcceptSelected)) {
                responseType_ = 'json';
            } else {
                responseType_ = 'blob';
            }
        }

        return this.httpClient.get<GetAccountTransfersPageItems>(`${this.configuration.basePath}/accounttransfers/${encodeURIComponent(String(transferId))}`,
            {
                context: localVarHttpContext,
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Retrieve Account Transfer Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1
     * @param fromOfficeId fromOfficeId
     * @param fromClientId fromClientId
     * @param fromAccountId fromAccountId
     * @param fromAccountType fromAccountType
     * @param toOfficeId toOfficeId
     * @param toClientId toClientId
     * @param toAccountId toAccountId
     * @param toAccountType toAccountType
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public template5(fromOfficeId?: number, fromClientId?: number, fromAccountId?: number, fromAccountType?: number, toOfficeId?: number, toClientId?: number, toAccountId?: number, toAccountType?: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<GetAccountTransfersTemplateResponse>;
    public template5(fromOfficeId?: number, fromClientId?: number, fromAccountId?: number, fromAccountType?: number, toOfficeId?: number, toClientId?: number, toAccountId?: number, toAccountType?: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<GetAccountTransfersTemplateResponse>>;
    public template5(fromOfficeId?: number, fromClientId?: number, fromAccountId?: number, fromAccountType?: number, toOfficeId?: number, toClientId?: number, toAccountId?: number, toAccountType?: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<GetAccountTransfersTemplateResponse>>;
    public template5(fromOfficeId?: number, fromClientId?: number, fromAccountId?: number, fromAccountType?: number, toOfficeId?: number, toClientId?: number, toAccountId?: number, toAccountType?: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {

        let localVarQueryParameters = new HttpParams({encoder: this.encoder});
        if (fromOfficeId !== undefined && fromOfficeId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>fromOfficeId, 'fromOfficeId');
        }
        if (fromClientId !== undefined && fromClientId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>fromClientId, 'fromClientId');
        }
        if (fromAccountId !== undefined && fromAccountId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>fromAccountId, 'fromAccountId');
        }
        if (fromAccountType !== undefined && fromAccountType !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>fromAccountType, 'fromAccountType');
        }
        if (toOfficeId !== undefined && toOfficeId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>toOfficeId, 'toOfficeId');
        }
        if (toClientId !== undefined && toClientId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>toClientId, 'toClientId');
        }
        if (toAccountId !== undefined && toAccountId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>toAccountId, 'toAccountId');
        }
        if (toAccountType !== undefined && toAccountType !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>toAccountType, 'toAccountType');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (basicAuth) required
        localVarCredential = this.configuration.lookupCredential('basicAuth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Basic ' + localVarCredential);
        }

        // authentication (tenantid) required
        localVarCredential = this.configuration.lookupCredential('tenantid');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('fineract-platform-tenantid', localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }

        let localVarHttpContext: HttpContext | undefined = options && options.context;
        if (localVarHttpContext === undefined) {
            localVarHttpContext = new HttpContext();
        }


        let responseType_: 'text' | 'json' | 'blob' = 'json';
        if (localVarHttpHeaderAcceptSelected) {
            if (localVarHttpHeaderAcceptSelected.startsWith('text')) {
                responseType_ = 'text';
            } else if (this.configuration.isJsonMime(localVarHttpHeaderAcceptSelected)) {
                responseType_ = 'json';
            } else {
                responseType_ = 'blob';
            }
        }

        return this.httpClient.get<GetAccountTransfersTemplateResponse>(`${this.configuration.basePath}/accounttransfers/template`,
            {
                context: localVarHttpContext,
                params: localVarQueryParameters,
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Retrieve Refund of an Active Loan by Transfer Template
     * Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1
     * @param fromOfficeId fromOfficeId
     * @param fromClientId fromClientId
     * @param fromAccountId fromAccountId
     * @param fromAccountType fromAccountType
     * @param toOfficeId toOfficeId
     * @param toClientId toClientId
     * @param toAccountId toAccountId
     * @param toAccountType toAccountType
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public templateRefundByTransfer(fromOfficeId?: number, fromClientId?: number, fromAccountId?: number, fromAccountType?: number, toOfficeId?: number, toClientId?: number, toAccountId?: number, toAccountType?: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<GetAccountTransfersTemplateRefundByTransferResponse>;
    public templateRefundByTransfer(fromOfficeId?: number, fromClientId?: number, fromAccountId?: number, fromAccountType?: number, toOfficeId?: number, toClientId?: number, toAccountId?: number, toAccountType?: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<GetAccountTransfersTemplateRefundByTransferResponse>>;
    public templateRefundByTransfer(fromOfficeId?: number, fromClientId?: number, fromAccountId?: number, fromAccountType?: number, toOfficeId?: number, toClientId?: number, toAccountId?: number, toAccountType?: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<GetAccountTransfersTemplateRefundByTransferResponse>>;
    public templateRefundByTransfer(fromOfficeId?: number, fromClientId?: number, fromAccountId?: number, fromAccountType?: number, toOfficeId?: number, toClientId?: number, toAccountId?: number, toAccountType?: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {

        let localVarQueryParameters = new HttpParams({encoder: this.encoder});
        if (fromOfficeId !== undefined && fromOfficeId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>fromOfficeId, 'fromOfficeId');
        }
        if (fromClientId !== undefined && fromClientId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>fromClientId, 'fromClientId');
        }
        if (fromAccountId !== undefined && fromAccountId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>fromAccountId, 'fromAccountId');
        }
        if (fromAccountType !== undefined && fromAccountType !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>fromAccountType, 'fromAccountType');
        }
        if (toOfficeId !== undefined && toOfficeId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>toOfficeId, 'toOfficeId');
        }
        if (toClientId !== undefined && toClientId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>toClientId, 'toClientId');
        }
        if (toAccountId !== undefined && toAccountId !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>toAccountId, 'toAccountId');
        }
        if (toAccountType !== undefined && toAccountType !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>toAccountType, 'toAccountType');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (basicAuth) required
        localVarCredential = this.configuration.lookupCredential('basicAuth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Basic ' + localVarCredential);
        }

        // authentication (tenantid) required
        localVarCredential = this.configuration.lookupCredential('tenantid');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('fineract-platform-tenantid', localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }

        let localVarHttpContext: HttpContext | undefined = options && options.context;
        if (localVarHttpContext === undefined) {
            localVarHttpContext = new HttpContext();
        }


        let responseType_: 'text' | 'json' | 'blob' = 'json';
        if (localVarHttpHeaderAcceptSelected) {
            if (localVarHttpHeaderAcceptSelected.startsWith('text')) {
                responseType_ = 'text';
            } else if (this.configuration.isJsonMime(localVarHttpHeaderAcceptSelected)) {
                responseType_ = 'json';
            } else {
                responseType_ = 'blob';
            }
        }

        return this.httpClient.get<GetAccountTransfersTemplateRefundByTransferResponse>(`${this.configuration.basePath}/accounttransfers/templateRefundByTransfer`,
            {
                context: localVarHttpContext,
                params: localVarQueryParameters,
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Refund of an Active Loan by Transfer
     * Ability to refund an active loan by transferring to a savings account.
     * @param postAccountTransfersRefundByTransferRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public templateRefundByTransferPost(postAccountTransfersRefundByTransferRequest: PostAccountTransfersRefundByTransferRequest, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<PostAccountTransfersRefundByTransferResponse>;
    public templateRefundByTransferPost(postAccountTransfersRefundByTransferRequest: PostAccountTransfersRefundByTransferRequest, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<PostAccountTransfersRefundByTransferResponse>>;
    public templateRefundByTransferPost(postAccountTransfersRefundByTransferRequest: PostAccountTransfersRefundByTransferRequest, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<PostAccountTransfersRefundByTransferResponse>>;
    public templateRefundByTransferPost(postAccountTransfersRefundByTransferRequest: PostAccountTransfersRefundByTransferRequest, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (postAccountTransfersRefundByTransferRequest === null || postAccountTransfersRefundByTransferRequest === undefined) {
            throw new Error('Required parameter postAccountTransfersRefundByTransferRequest was null or undefined when calling templateRefundByTransferPost.');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (basicAuth) required
        localVarCredential = this.configuration.lookupCredential('basicAuth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Basic ' + localVarCredential);
        }

        // authentication (tenantid) required
        localVarCredential = this.configuration.lookupCredential('tenantid');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('fineract-platform-tenantid', localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }

        let localVarHttpContext: HttpContext | undefined = options && options.context;
        if (localVarHttpContext === undefined) {
            localVarHttpContext = new HttpContext();
        }


        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Content-Type', httpContentTypeSelected);
        }

        let responseType_: 'text' | 'json' | 'blob' = 'json';
        if (localVarHttpHeaderAcceptSelected) {
            if (localVarHttpHeaderAcceptSelected.startsWith('text')) {
                responseType_ = 'text';
            } else if (this.configuration.isJsonMime(localVarHttpHeaderAcceptSelected)) {
                responseType_ = 'json';
            } else {
                responseType_ = 'blob';
            }
        }

        return this.httpClient.post<PostAccountTransfersRefundByTransferResponse>(`${this.configuration.basePath}/accounttransfers/refundByTransfer`,
            postAccountTransfersRefundByTransferRequest,
            {
                context: localVarHttpContext,
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
