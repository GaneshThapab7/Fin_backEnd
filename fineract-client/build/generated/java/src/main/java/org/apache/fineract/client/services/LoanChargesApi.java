package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteLoansLoanIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetLoansLoanIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetLoansLoanIdChargesTemplateResponse;
import org.apache.fineract.client.models.PostLoansLoanIdChargesChargeIdRequest;
import org.apache.fineract.client.models.PostLoansLoanIdChargesChargeIdResponse;
import org.apache.fineract.client.models.PostLoansLoanIdChargesRequest;
import org.apache.fineract.client.models.PostLoansLoanIdChargesResponse;
import org.apache.fineract.client.models.PutLoansLoanIdChargesChargeIdRequest;
import org.apache.fineract.client.models.PutLoansLoanIdChargesChargeIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface LoanChargesApi {
        /**
        * Delete a Loan Charge
        * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
            * @param loanId loanId (required)
            * @param chargeId chargeId (required)
        * @return Call&lt;DeleteLoansLoanIdChargesChargeIdResponse&gt;
        */
        @DELETE("loans/{loanId}/charges/{chargeId}")
        Call<DeleteLoansLoanIdChargesChargeIdResponse> deleteLoanCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId
                );

        /**
        * Create a Loan Charge
        * It Creates a Loan Charge
            * @param loanId loanId (required)
            * @param postLoansLoanIdChargesRequest  (required)
            * @param command command (optional)
        * @return Call&lt;PostLoansLoanIdChargesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("loans/{loanId}/charges")
        Call<PostLoansLoanIdChargesResponse> executeLoanCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdChargesRequest postLoansLoanIdChargesRequest, @retrofit2.http.Query("command") String command
                );

        /**
        * Pay Loan Charge
        * Loan Charge will be paid if the loan is linked with a savings account
            * @param loanId loanId (required)
            * @param chargeId chargeId (required)
            * @param postLoansLoanIdChargesChargeIdRequest  (required)
            * @param command command (optional)
        * @return Call&lt;PostLoansLoanIdChargesChargeIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("loans/{loanId}/charges/{chargeId}")
        Call<PostLoansLoanIdChargesChargeIdResponse> executeLoanCharge1(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PostLoansLoanIdChargesChargeIdRequest postLoansLoanIdChargesChargeIdRequest, @retrofit2.http.Query("command") String command
                );

        /**
        * List Loan Charges
        * It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage
            * @param loanId loanId (required)
        * @return Call&lt;List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;&gt;
        */
        @GET("loans/{loanId}/charges")
        Call<List<GetLoansLoanIdChargesChargeIdResponse>> retrieveAllLoanCharges(
        @retrofit2.http.Path("loanId") Long loanId
                );

        /**
        * Retrieve a Loan Charge
        * Retrieves Loan Charge according to the Loan ID and Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
            * @param loanId loanId (required)
            * @param chargeId chargeId (required)
        * @return Call&lt;GetLoansLoanIdChargesChargeIdResponse&gt;
        */
        @GET("loans/{loanId}/charges/{chargeId}")
        Call<GetLoansLoanIdChargesChargeIdResponse> retrieveLoanCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId
                );

        /**
        * Retrieve Loan Charges Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template  
            * @param loanId loanId (required)
        * @return Call&lt;GetLoansLoanIdChargesTemplateResponse&gt;
        */
        @GET("loans/{loanId}/charges/template")
        Call<GetLoansLoanIdChargesTemplateResponse> retrieveTemplate8(
        @retrofit2.http.Path("loanId") Long loanId
                );

        /**
        * Update a Loan Charge
        * Currently Loan Charges may be updated only if the Loan is not yet approved
            * @param loanId loanId (required)
            * @param chargeId chargeId (required)
            * @param putLoansLoanIdChargesChargeIdRequest  (required)
        * @return Call&lt;PutLoansLoanIdChargesChargeIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("loans/{loanId}/charges/{chargeId}")
        Call<PutLoansLoanIdChargesChargeIdResponse> updateLoanCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PutLoansLoanIdChargesChargeIdRequest putLoansLoanIdChargesChargeIdRequest
                );


            /**
            * Delete a Loan Charge
            * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
                * @param loanId loanId (required)
                * @param chargeId chargeId (required)
            * @return Call&lt;DeleteLoansLoanIdChargesChargeIdResponse&gt;
            */
            @DELETE("loans/{loanId}/charges/{chargeId}")
        Call<DeleteLoansLoanIdChargesChargeIdResponse> deleteLoanCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Create a Loan Charge
            * It Creates a Loan Charge
                * @param loanId loanId (required)
                * @param postLoansLoanIdChargesRequest  (required)
                * @param command command (optional)
            * @return Call&lt;PostLoansLoanIdChargesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("loans/{loanId}/charges")
        Call<PostLoansLoanIdChargesResponse> executeLoanCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdChargesRequest postLoansLoanIdChargesRequest, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * Pay Loan Charge
            * Loan Charge will be paid if the loan is linked with a savings account
                * @param loanId loanId (required)
                * @param chargeId chargeId (required)
                * @param postLoansLoanIdChargesChargeIdRequest  (required)
                * @param command command (optional)
            * @return Call&lt;PostLoansLoanIdChargesChargeIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("loans/{loanId}/charges/{chargeId}")
        Call<PostLoansLoanIdChargesChargeIdResponse> executeLoanCharge1(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PostLoansLoanIdChargesChargeIdRequest postLoansLoanIdChargesChargeIdRequest, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * List Loan Charges
            * It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage
                * @param loanId loanId (required)
            * @return Call&lt;List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;&gt;
            */
            @GET("loans/{loanId}/charges")
        Call<List<GetLoansLoanIdChargesChargeIdResponse>> retrieveAllLoanCharges(
        @retrofit2.http.Path("loanId") Long loanId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Loan Charge
            * Retrieves Loan Charge according to the Loan ID and Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
                * @param loanId loanId (required)
                * @param chargeId chargeId (required)
            * @return Call&lt;GetLoansLoanIdChargesChargeIdResponse&gt;
            */
            @GET("loans/{loanId}/charges/{chargeId}")
        Call<GetLoansLoanIdChargesChargeIdResponse> retrieveLoanCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Loan Charges Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template  
                * @param loanId loanId (required)
            * @return Call&lt;GetLoansLoanIdChargesTemplateResponse&gt;
            */
            @GET("loans/{loanId}/charges/template")
        Call<GetLoansLoanIdChargesTemplateResponse> retrieveTemplate8(
        @retrofit2.http.Path("loanId") Long loanId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update a Loan Charge
            * Currently Loan Charges may be updated only if the Loan is not yet approved
                * @param loanId loanId (required)
                * @param chargeId chargeId (required)
                * @param putLoansLoanIdChargesChargeIdRequest  (required)
            * @return Call&lt;PutLoansLoanIdChargesChargeIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("loans/{loanId}/charges/{chargeId}")
        Call<PutLoansLoanIdChargesChargeIdResponse> updateLoanCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PutLoansLoanIdChargesChargeIdRequest putLoansLoanIdChargesChargeIdRequest
                , @HeaderMap Map<String, String> headers);

        }
