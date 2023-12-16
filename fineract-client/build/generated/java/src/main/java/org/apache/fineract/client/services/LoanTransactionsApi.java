package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetLoansLoanIdTransactionsTemplateResponse;
import org.apache.fineract.client.models.GetLoansLoanIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsRequest;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsResponse;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsTransactionIdRequest;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PutChargeTransactionChangesRequest;
import org.apache.fineract.client.models.PutChargeTransactionChangesResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface LoanTransactionsApi {
        /**
        * Adjust a Transaction
        * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
            * @param loanId loanId (required)
            * @param transactionId transactionId (required)
            * @param postLoansLoanIdTransactionsTransactionIdRequest  (required)
        * @return Call&lt;PostLoansLoanIdTransactionsTransactionIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("loans/{loanId}/transactions/{transactionId}")
        Call<PostLoansLoanIdTransactionsTransactionIdResponse> adjustLoanTransaction(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PostLoansLoanIdTransactionsTransactionIdRequest postLoansLoanIdTransactionsTransactionIdRequest
                );

        /**
        * Significant Loan Transactions
        * This API covers the major loan transaction functionality  Example Requests:  loans/1/transactions?command&#x3D;repayment | Make a Repayment |  loans/1/transactions?command&#x3D;merchantIssuedRefund | Merchant Issued Refund |  loans/1/transactions?command&#x3D;payoutRefund | Payout Refund |  loans/1/transactions?command&#x3D;goodwillCredit | Goodwil Credit |  loans/1/transactions?command&#x3D;waiveinterest | Waive Interest |  loans/1/transactions?command&#x3D;writeoff | Write-off Loan |  loans/1/transactions?command&#x3D;close-rescheduled | Close Rescheduled Loan |  loans/1/transactions?command&#x3D;close | Close Loan |  loans/1/transactions?command&#x3D;undowriteoff | Undo Loan Write-off |  loans/1/transactions?command&#x3D;recoverypayment | Make Recovery Payment |  loans/1/transactions?command&#x3D;refundByCash | Make a Refund of an Active Loan by Cash |  loans/1/transactions?command&#x3D;foreclosure | Foreclosure of an Active Loan |  loans/1/transactions?command&#x3D;creditBalanceRefund | Credit Balance Refund |   
            * @param loanId loanId (required)
            * @param postLoansLoanIdTransactionsRequest  (required)
            * @param command command (optional)
        * @return Call&lt;PostLoansLoanIdTransactionsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("loans/{loanId}/transactions")
        Call<PostLoansLoanIdTransactionsResponse> executeLoanTransaction(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdTransactionsRequest postLoansLoanIdTransactionsRequest, @retrofit2.http.Query("command") String command
                );

        /**
        * Retrieve a Transaction Details
        * Retrieves a Transaction Details  Example Request:  loans/5/transactions/3
            * @param loanId loanId (required)
            * @param transactionId transactionId (required)
            * @param fields Optional Loan Transaction attribute list to be in the response (optional)
        * @return Call&lt;GetLoansLoanIdTransactionsTransactionIdResponse&gt;
        */
        @GET("loans/{loanId}/transactions/{transactionId}")
        Call<GetLoansLoanIdTransactionsTransactionIdResponse> retrieveTransaction(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("fields") String fields
                );

        /**
        * Retrieve Loan Transaction Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  loans/1/transactions/template?command&#x3D;repaymentloans/1/transactions/template?command&#x3D;merchantIssuedRefundloans/1/transactions/template?command&#x3D;payoutRefundloans/1/transactions/template?command&#x3D;goodwillCredit loans/1/transactions/template?command&#x3D;waiveinterest loans/1/transactions/template?command&#x3D;writeoff loans/1/transactions/template?command&#x3D;close-rescheduled loans/1/transactions/template?command&#x3D;close loans/1/transactions/template?command&#x3D;disburse loans/1/transactions/template?command&#x3D;disburseToSavings loans/1/transactions/template?command&#x3D;recoverypayment loans/1/transactions/template?command&#x3D;prepayLoan loans/1/transactions/template?command&#x3D;refundbycash loans/1/transactions/template?command&#x3D;refundbytransfer loans/1/transactions/template?command&#x3D;foreclosure loans/1/transactions/template?command&#x3D;creditBalanceRefund (returned &#39;amount&#39; field will have the overpaid value
            * @param loanId loanId (required)
            * @param command command (optional)
            * @param dateFormat dateFormat (optional)
            * @param transactionDate transactionDate (optional)
            * @param locale locale (optional)
        * @return Call&lt;GetLoansLoanIdTransactionsTemplateResponse&gt;
        */
        @GET("loans/{loanId}/transactions/template")
        Call<GetLoansLoanIdTransactionsTemplateResponse> retrieveTransactionTemplate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("command") String command, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("transactionDate") Object transactionDate, @retrofit2.http.Query("locale") String locale
                );

        /**
        * Undo a Waive Charge Transaction
        * Undo a Waive Charge Transaction
            * @param loanId loanId (required)
            * @param transactionId transactionId (required)
            * @param putChargeTransactionChangesRequest  (required)
        * @return Call&lt;PutChargeTransactionChangesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("loans/{loanId}/transactions/{transactionId}")
        Call<PutChargeTransactionChangesResponse> undoWaiveCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PutChargeTransactionChangesRequest putChargeTransactionChangesRequest
                );


            /**
            * Adjust a Transaction
            * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
                * @param loanId loanId (required)
                * @param transactionId transactionId (required)
                * @param postLoansLoanIdTransactionsTransactionIdRequest  (required)
            * @return Call&lt;PostLoansLoanIdTransactionsTransactionIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("loans/{loanId}/transactions/{transactionId}")
        Call<PostLoansLoanIdTransactionsTransactionIdResponse> adjustLoanTransaction(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PostLoansLoanIdTransactionsTransactionIdRequest postLoansLoanIdTransactionsTransactionIdRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Significant Loan Transactions
            * This API covers the major loan transaction functionality  Example Requests:  loans/1/transactions?command&#x3D;repayment | Make a Repayment |  loans/1/transactions?command&#x3D;merchantIssuedRefund | Merchant Issued Refund |  loans/1/transactions?command&#x3D;payoutRefund | Payout Refund |  loans/1/transactions?command&#x3D;goodwillCredit | Goodwil Credit |  loans/1/transactions?command&#x3D;waiveinterest | Waive Interest |  loans/1/transactions?command&#x3D;writeoff | Write-off Loan |  loans/1/transactions?command&#x3D;close-rescheduled | Close Rescheduled Loan |  loans/1/transactions?command&#x3D;close | Close Loan |  loans/1/transactions?command&#x3D;undowriteoff | Undo Loan Write-off |  loans/1/transactions?command&#x3D;recoverypayment | Make Recovery Payment |  loans/1/transactions?command&#x3D;refundByCash | Make a Refund of an Active Loan by Cash |  loans/1/transactions?command&#x3D;foreclosure | Foreclosure of an Active Loan |  loans/1/transactions?command&#x3D;creditBalanceRefund | Credit Balance Refund |   
                * @param loanId loanId (required)
                * @param postLoansLoanIdTransactionsRequest  (required)
                * @param command command (optional)
            * @return Call&lt;PostLoansLoanIdTransactionsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("loans/{loanId}/transactions")
        Call<PostLoansLoanIdTransactionsResponse> executeLoanTransaction(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdTransactionsRequest postLoansLoanIdTransactionsRequest, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Transaction Details
            * Retrieves a Transaction Details  Example Request:  loans/5/transactions/3
                * @param loanId loanId (required)
                * @param transactionId transactionId (required)
                * @param fields Optional Loan Transaction attribute list to be in the response (optional)
            * @return Call&lt;GetLoansLoanIdTransactionsTransactionIdResponse&gt;
            */
            @GET("loans/{loanId}/transactions/{transactionId}")
        Call<GetLoansLoanIdTransactionsTransactionIdResponse> retrieveTransaction(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("fields") String fields
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Loan Transaction Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  loans/1/transactions/template?command&#x3D;repaymentloans/1/transactions/template?command&#x3D;merchantIssuedRefundloans/1/transactions/template?command&#x3D;payoutRefundloans/1/transactions/template?command&#x3D;goodwillCredit loans/1/transactions/template?command&#x3D;waiveinterest loans/1/transactions/template?command&#x3D;writeoff loans/1/transactions/template?command&#x3D;close-rescheduled loans/1/transactions/template?command&#x3D;close loans/1/transactions/template?command&#x3D;disburse loans/1/transactions/template?command&#x3D;disburseToSavings loans/1/transactions/template?command&#x3D;recoverypayment loans/1/transactions/template?command&#x3D;prepayLoan loans/1/transactions/template?command&#x3D;refundbycash loans/1/transactions/template?command&#x3D;refundbytransfer loans/1/transactions/template?command&#x3D;foreclosure loans/1/transactions/template?command&#x3D;creditBalanceRefund (returned &#39;amount&#39; field will have the overpaid value
                * @param loanId loanId (required)
                * @param command command (optional)
                * @param dateFormat dateFormat (optional)
                * @param transactionDate transactionDate (optional)
                * @param locale locale (optional)
            * @return Call&lt;GetLoansLoanIdTransactionsTemplateResponse&gt;
            */
            @GET("loans/{loanId}/transactions/template")
        Call<GetLoansLoanIdTransactionsTemplateResponse> retrieveTransactionTemplate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("command") String command, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("transactionDate") Object transactionDate, @retrofit2.http.Query("locale") String locale
                , @HeaderMap Map<String, String> headers);

            /**
            * Undo a Waive Charge Transaction
            * Undo a Waive Charge Transaction
                * @param loanId loanId (required)
                * @param transactionId transactionId (required)
                * @param putChargeTransactionChangesRequest  (required)
            * @return Call&lt;PutChargeTransactionChangesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("loans/{loanId}/transactions/{transactionId}")
        Call<PutChargeTransactionChangesResponse> undoWaiveCharge(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PutChargeTransactionChangesRequest putChargeTransactionChangesRequest
                , @HeaderMap Map<String, String> headers);

        }
