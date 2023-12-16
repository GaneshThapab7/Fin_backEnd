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
import { DeleteLoansLoanIdChargesChargeIdResponse } from '../apache-fineract-client/models/deleteLoansLoanIdChargesChargeIdResponse';
// @ts-ignore
import { GetLoansLoanIdChargesChargeIdResponse } from '../apache-fineract-client/models/getLoansLoanIdChargesChargeIdResponse';
// @ts-ignore
import { GetLoansLoanIdChargesTemplateResponse } from '../apache-fineract-client/models/getLoansLoanIdChargesTemplateResponse';
// @ts-ignore
import { PostLoansLoanIdChargesChargeIdRequest } from '../apache-fineract-client/models/postLoansLoanIdChargesChargeIdRequest';
// @ts-ignore
import { PostLoansLoanIdChargesChargeIdResponse } from '../apache-fineract-client/models/postLoansLoanIdChargesChargeIdResponse';
// @ts-ignore
import { PostLoansLoanIdChargesRequest } from '../apache-fineract-client/models/postLoansLoanIdChargesRequest';
// @ts-ignore
import { PostLoansLoanIdChargesResponse } from '../apache-fineract-client/models/postLoansLoanIdChargesResponse';
// @ts-ignore
import { PutLoansLoanIdChargesChargeIdRequest } from '../apache-fineract-client/models/putLoansLoanIdChargesChargeIdRequest';
// @ts-ignore
import { PutLoansLoanIdChargesChargeIdResponse } from '../apache-fineract-client/models/putLoansLoanIdChargesChargeIdResponse';

// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { apacheFineractClientConfiguration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class LoanChargesService {

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
     * Delete a Loan Charge
     * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
     * @param loanId loanId
     * @param chargeId chargeId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteLoanCharge(loanId: number, chargeId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<DeleteLoansLoanIdChargesChargeIdResponse>;
    public deleteLoanCharge(loanId: number, chargeId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<DeleteLoansLoanIdChargesChargeIdResponse>>;
    public deleteLoanCharge(loanId: number, chargeId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<DeleteLoansLoanIdChargesChargeIdResponse>>;
    public deleteLoanCharge(loanId: number, chargeId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling deleteLoanCharge.');
        }
        if (chargeId === null || chargeId === undefined) {
            throw new Error('Required parameter chargeId was null or undefined when calling deleteLoanCharge.');
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

        return this.httpClient.delete<DeleteLoansLoanIdChargesChargeIdResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/charges/${encodeURIComponent(String(chargeId))}`,
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
     * Create a Loan Charge
     * It Creates a Loan Charge
     * @param loanId loanId
     * @param postLoansLoanIdChargesRequest 
     * @param command command
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public executeLoanCharge(loanId: number, postLoansLoanIdChargesRequest: PostLoansLoanIdChargesRequest, command?: string, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<PostLoansLoanIdChargesResponse>;
    public executeLoanCharge(loanId: number, postLoansLoanIdChargesRequest: PostLoansLoanIdChargesRequest, command?: string, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<PostLoansLoanIdChargesResponse>>;
    public executeLoanCharge(loanId: number, postLoansLoanIdChargesRequest: PostLoansLoanIdChargesRequest, command?: string, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<PostLoansLoanIdChargesResponse>>;
    public executeLoanCharge(loanId: number, postLoansLoanIdChargesRequest: PostLoansLoanIdChargesRequest, command?: string, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling executeLoanCharge.');
        }
        if (postLoansLoanIdChargesRequest === null || postLoansLoanIdChargesRequest === undefined) {
            throw new Error('Required parameter postLoansLoanIdChargesRequest was null or undefined when calling executeLoanCharge.');
        }

        let localVarQueryParameters = new HttpParams({encoder: this.encoder});
        if (command !== undefined && command !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>command, 'command');
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

        return this.httpClient.post<PostLoansLoanIdChargesResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/charges`,
            postLoansLoanIdChargesRequest,
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
     * Pay Loan Charge
     * Loan Charge will be paid if the loan is linked with a savings account
     * @param loanId loanId
     * @param chargeId chargeId
     * @param postLoansLoanIdChargesChargeIdRequest 
     * @param command command
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public executeLoanCharge1(loanId: number, chargeId: number, postLoansLoanIdChargesChargeIdRequest: PostLoansLoanIdChargesChargeIdRequest, command?: string, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<PostLoansLoanIdChargesChargeIdResponse>;
    public executeLoanCharge1(loanId: number, chargeId: number, postLoansLoanIdChargesChargeIdRequest: PostLoansLoanIdChargesChargeIdRequest, command?: string, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<PostLoansLoanIdChargesChargeIdResponse>>;
    public executeLoanCharge1(loanId: number, chargeId: number, postLoansLoanIdChargesChargeIdRequest: PostLoansLoanIdChargesChargeIdRequest, command?: string, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<PostLoansLoanIdChargesChargeIdResponse>>;
    public executeLoanCharge1(loanId: number, chargeId: number, postLoansLoanIdChargesChargeIdRequest: PostLoansLoanIdChargesChargeIdRequest, command?: string, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling executeLoanCharge1.');
        }
        if (chargeId === null || chargeId === undefined) {
            throw new Error('Required parameter chargeId was null or undefined when calling executeLoanCharge1.');
        }
        if (postLoansLoanIdChargesChargeIdRequest === null || postLoansLoanIdChargesChargeIdRequest === undefined) {
            throw new Error('Required parameter postLoansLoanIdChargesChargeIdRequest was null or undefined when calling executeLoanCharge1.');
        }

        let localVarQueryParameters = new HttpParams({encoder: this.encoder});
        if (command !== undefined && command !== null) {
          localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
            <any>command, 'command');
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

        return this.httpClient.post<PostLoansLoanIdChargesChargeIdResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/charges/${encodeURIComponent(String(chargeId))}`,
            postLoansLoanIdChargesChargeIdRequest,
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
     * List Loan Charges
     * It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage
     * @param loanId loanId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public retrieveAllLoanCharges(loanId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<Array<GetLoansLoanIdChargesChargeIdResponse>>;
    public retrieveAllLoanCharges(loanId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<Array<GetLoansLoanIdChargesChargeIdResponse>>>;
    public retrieveAllLoanCharges(loanId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<Array<GetLoansLoanIdChargesChargeIdResponse>>>;
    public retrieveAllLoanCharges(loanId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling retrieveAllLoanCharges.');
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

        return this.httpClient.get<Array<GetLoansLoanIdChargesChargeIdResponse>>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/charges`,
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
     * Retrieve a Loan Charge
     * Retrieves Loan Charge according to the Loan ID and Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     * @param loanId loanId
     * @param chargeId chargeId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public retrieveLoanCharge(loanId: number, chargeId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<GetLoansLoanIdChargesChargeIdResponse>;
    public retrieveLoanCharge(loanId: number, chargeId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<GetLoansLoanIdChargesChargeIdResponse>>;
    public retrieveLoanCharge(loanId: number, chargeId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<GetLoansLoanIdChargesChargeIdResponse>>;
    public retrieveLoanCharge(loanId: number, chargeId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling retrieveLoanCharge.');
        }
        if (chargeId === null || chargeId === undefined) {
            throw new Error('Required parameter chargeId was null or undefined when calling retrieveLoanCharge.');
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

        return this.httpClient.get<GetLoansLoanIdChargesChargeIdResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/charges/${encodeURIComponent(String(chargeId))}`,
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
     * Retrieve Loan Charges Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template  
     * @param loanId loanId
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public retrieveTemplate8(loanId: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<GetLoansLoanIdChargesTemplateResponse>;
    public retrieveTemplate8(loanId: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<GetLoansLoanIdChargesTemplateResponse>>;
    public retrieveTemplate8(loanId: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<GetLoansLoanIdChargesTemplateResponse>>;
    public retrieveTemplate8(loanId: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling retrieveTemplate8.');
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

        return this.httpClient.get<GetLoansLoanIdChargesTemplateResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/charges/template`,
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
     * Update a Loan Charge
     * Currently Loan Charges may be updated only if the Loan is not yet approved
     * @param loanId loanId
     * @param chargeId chargeId
     * @param putLoansLoanIdChargesChargeIdRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateLoanCharge(loanId: number, chargeId: number, putLoansLoanIdChargesChargeIdRequest: PutLoansLoanIdChargesChargeIdRequest, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<PutLoansLoanIdChargesChargeIdResponse>;
    public updateLoanCharge(loanId: number, chargeId: number, putLoansLoanIdChargesChargeIdRequest: PutLoansLoanIdChargesChargeIdRequest, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpResponse<PutLoansLoanIdChargesChargeIdResponse>>;
    public updateLoanCharge(loanId: number, chargeId: number, putLoansLoanIdChargesChargeIdRequest: PutLoansLoanIdChargesChargeIdRequest, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<HttpEvent<PutLoansLoanIdChargesChargeIdResponse>>;
    public updateLoanCharge(loanId: number, chargeId: number, putLoansLoanIdChargesChargeIdRequest: PutLoansLoanIdChargesChargeIdRequest, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json', context?: HttpContext}): Observable<any> {
        if (loanId === null || loanId === undefined) {
            throw new Error('Required parameter loanId was null or undefined when calling updateLoanCharge.');
        }
        if (chargeId === null || chargeId === undefined) {
            throw new Error('Required parameter chargeId was null or undefined when calling updateLoanCharge.');
        }
        if (putLoansLoanIdChargesChargeIdRequest === null || putLoansLoanIdChargesChargeIdRequest === undefined) {
            throw new Error('Required parameter putLoansLoanIdChargesChargeIdRequest was null or undefined when calling updateLoanCharge.');
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

        return this.httpClient.put<PutLoansLoanIdChargesChargeIdResponse>(`${this.configuration.basePath}/loans/${encodeURIComponent(String(loanId))}/charges/${encodeURIComponent(String(chargeId))}`,
            putLoansLoanIdChargesChargeIdRequest,
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
