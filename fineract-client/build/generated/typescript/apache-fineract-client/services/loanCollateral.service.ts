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
import { DeleteLoansLoanIdCollateralsCollateralIdResponse } from '../apache-fineract-client/models/deleteLoansLoanIdCollateralsCollateralIdResponse';
// @ts-ignore
import { GetLoansLoanIdCollateralsResponse } from '../apache-fineract-client/models/getLoansLoanIdCollateralsResponse';
// @ts-ignore
import { GetLoansLoanIdCollateralsTemplateResponse } from '../apache-fineract-client/models/getLoansLoanIdCollateralsTemplateResponse';
// @ts-ignore
import { PostLoansLoanIdCollateralsRequest } from '../apache-fineract-client/models/postLoansLoanIdCollateralsRequest';
// @ts-ignore
import { PostLoansLoanIdCollateralsResponse } from '../apache-fineract-client/models/postLoansLoanIdCollateralsResponse';
// @ts-ignore
import { PutLoansLoanIdCollateralsCollateralIdResponse } from '../apache-fineract-client/models/putLoansLoanIdCollateralsCollateralIdResponse';
// @ts-ignore
import { PutLoansLoandIdCollateralsCollateralIdRequest } from '../apache-fineract-client/models/putLoansLoandIdCollateralsCollateralIdRequest';

// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { apacheFineractClientConfiguration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class LoanCollateralService {

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
     * Create a Collateral
     * Note: Currently, Collaterals may be added only before a Loan is approved
     * @param loanId loanId
     * @param postLoansLoanIdCollateralsRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createCollateral(loanId: number, postLoansLoanIdCollateralsRequest: PostLoansLoanIdCollateralsRequest, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<PostLoansLoanIdCollateralsResponse>;
    public createCollateral(loanId: number, postLoansLoanIdCollateralsRequest: PostLoansLoanIdCollateralsRequest, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<PostLoansLoanIdCollateralsResponse>>;
    public createCollateral(loanId: number, postLoansLoanIdCollateralsRequest: PostLoansLoanIdCollateralsRequest, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<PostLoansLoanIdCollateralsResponse>>;
    public createCollateral(loanId: number, postLoansLoanIdCollateralsRequest: PostLoansLoanIdCollateralsRequest, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling createCollateral.');
        }
        if (postLoansLoanIdCollateralsRequest === null || postLoansLoanIdCollateralsRequest === undefined) {
            throw new Error('Required parameter postLoansLoanIdCollateralsRequest was null or undefined when calling createCollateral.');
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

        return this.httpClient.post<PostLoansLoanIdCollateralsResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/collaterals`,
            postLoansLoanIdCollateralsRequest,
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
     * Remove a Collateral
     * Note: A collateral can only be removed from Loans that are not yet approved.
     * @param loanId loanId
     * @param collateralId collateralId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteCollateral(loanId: number, collateralId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<DeleteLoansLoanIdCollateralsCollateralIdResponse>;
    public deleteCollateral(loanId: number, collateralId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<DeleteLoansLoanIdCollateralsCollateralIdResponse>>;
    public deleteCollateral(loanId: number, collateralId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<DeleteLoansLoanIdCollateralsCollateralIdResponse>>;
    public deleteCollateral(loanId: number, collateralId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling deleteCollateral.');
        }
        if (collateralId === null || collateralId === undefined) {
            throw new Error('Required parameter collateralId was null or undefined when calling deleteCollateral.');
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

        return this.httpClient.delete<DeleteLoansLoanIdCollateralsCollateralIdResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/collaterals/${encodeURIComponent(String(collateralId))}`,
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
     * Retrieve Collateral Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template
     * @param loanId loanId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public newCollateralTemplate(loanId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<GetLoansLoanIdCollateralsTemplateResponse>;
    public newCollateralTemplate(loanId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<GetLoansLoanIdCollateralsTemplateResponse>>;
    public newCollateralTemplate(loanId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<GetLoansLoanIdCollateralsTemplateResponse>>;
    public newCollateralTemplate(loanId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling newCollateralTemplate.');
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

        return this.httpClient.get<GetLoansLoanIdCollateralsTemplateResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/collaterals/template`,
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
     * List Loan Collaterals
     * Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description
     * @param loanId loanId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public retrieveCollateralDetails(loanId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<Array<GetLoansLoanIdCollateralsResponse>>;
    public retrieveCollateralDetails(loanId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<Array<GetLoansLoanIdCollateralsResponse>>>;
    public retrieveCollateralDetails(loanId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<Array<GetLoansLoanIdCollateralsResponse>>>;
    public retrieveCollateralDetails(loanId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling retrieveCollateralDetails.');
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

        return this.httpClient.get<Array<GetLoansLoanIdCollateralsResponse>>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/collaterals`,
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
     * Retrieve a Collateral
     * Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;description,description
     * @param loanId loanId
     * @param collateralId collateralId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public retrieveCollateralDetails1(loanId: number, collateralId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<GetLoansLoanIdCollateralsResponse>;
    public retrieveCollateralDetails1(loanId: number, collateralId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<GetLoansLoanIdCollateralsResponse>>;
    public retrieveCollateralDetails1(loanId: number, collateralId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<GetLoansLoanIdCollateralsResponse>>;
    public retrieveCollateralDetails1(loanId: number, collateralId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling retrieveCollateralDetails1.');
        }
        if (collateralId === null || collateralId === undefined) {
            throw new Error('Required parameter collateralId was null or undefined when calling retrieveCollateralDetails1.');
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

        return this.httpClient.get<GetLoansLoanIdCollateralsResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/collaterals/${encodeURIComponent(String(collateralId))}`,
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
     * Update a Collateral
     * @param loanId loanId
     * @param collateralId collateralId
     * @param putLoansLoandIdCollateralsCollateralIdRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateCollateral(loanId: number, collateralId: number, putLoansLoandIdCollateralsCollateralIdRequest: PutLoansLoandIdCollateralsCollateralIdRequest, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<PutLoansLoanIdCollateralsCollateralIdResponse>;
    public updateCollateral(loanId: number, collateralId: number, putLoansLoandIdCollateralsCollateralIdRequest: PutLoansLoandIdCollateralsCollateralIdRequest, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<PutLoansLoanIdCollateralsCollateralIdResponse>>;
    public updateCollateral(loanId: number, collateralId: number, putLoansLoandIdCollateralsCollateralIdRequest: PutLoansLoandIdCollateralsCollateralIdRequest, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<PutLoansLoanIdCollateralsCollateralIdResponse>>;
    public updateCollateral(loanId: number, collateralId: number, putLoansLoandIdCollateralsCollateralIdRequest: PutLoansLoandIdCollateralsCollateralIdRequest, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling updateCollateral.');
        }
        if (collateralId === null || collateralId === undefined) {
            throw new Error('Required parameter collateralId was null or undefined when calling updateCollateral.');
        }
        if (putLoansLoandIdCollateralsCollateralIdRequest === null || putLoansLoandIdCollateralsCollateralIdRequest === undefined) {
            throw new Error('Required parameter putLoansLoandIdCollateralsCollateralIdRequest was null or undefined when calling updateCollateral.');
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

        return this.httpClient.put<PutLoansLoanIdCollateralsCollateralIdResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/collaterals/${encodeURIComponent(String(collateralId))}`,
            putLoansLoandIdCollateralsCollateralIdRequest,
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