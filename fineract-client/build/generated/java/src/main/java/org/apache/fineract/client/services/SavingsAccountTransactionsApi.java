package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.PostSavingsAccountBulkReversalTransactionsRequest;
import org.apache.fineract.client.models.PostSavingsAccountTransactionsRequest;
import org.apache.fineract.client.models.PostSavingsAccountTransactionsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SavingsAccountTransactionsApi {
        /**
        * Undo/Reverse/Modify/Release Amount transaction API
        * Undo/Reverse/Modify/Release Amount transaction API  Example Requests:   savingsaccounts/{savingsId}/transactions/{transactionId}?command&#x3D;reverse  Accepted command &#x3D; undo, reverse, modify, releaseAmount
            * @param savingsId  (required)
            * @param transactionId  (required)
            * @param postSavingsAccountBulkReversalTransactionsRequest  (required)
            * @param command  (optional)
        * @return Call&lt;List&lt;PostSavingsAccountBulkReversalTransactionsRequest&gt;&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("savingsaccounts/{savingsId}/transactions/{transactionId}")
        Call<List<PostSavingsAccountBulkReversalTransactionsRequest>> adjustTransaction1(
        @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PostSavingsAccountBulkReversalTransactionsRequest postSavingsAccountBulkReversalTransactionsRequest, @retrofit2.http.Query("command") String command
                );

        /**
        * 
        * 
            * @param savingsId  (required)
            * @param transactionId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("savingsaccounts/{savingsId}/transactions/{transactionId}")
        Call<String> retrieveOne23(
        @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Path("transactionId") Long transactionId
                );

        /**
        * 
        * 
            * @param savingsId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("savingsaccounts/{savingsId}/transactions/template")
        Call<String> retrieveTemplate18(
        @retrofit2.http.Path("savingsId") Long savingsId
                );

        /**
        * 
        * 
            * @param savingsId  (required)
            * @param postSavingsAccountTransactionsRequest  (required)
            * @param command  (optional)
        * @return Call&lt;PostSavingsAccountTransactionsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("savingsaccounts/{savingsId}/transactions")
        Call<PostSavingsAccountTransactionsResponse> transaction2(
        @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Body PostSavingsAccountTransactionsRequest postSavingsAccountTransactionsRequest, @retrofit2.http.Query("command") String command
                );


            /**
            * Undo/Reverse/Modify/Release Amount transaction API
            * Undo/Reverse/Modify/Release Amount transaction API  Example Requests:   savingsaccounts/{savingsId}/transactions/{transactionId}?command&#x3D;reverse  Accepted command &#x3D; undo, reverse, modify, releaseAmount
                * @param savingsId  (required)
                * @param transactionId  (required)
                * @param postSavingsAccountBulkReversalTransactionsRequest  (required)
                * @param command  (optional)
            * @return Call&lt;List&lt;PostSavingsAccountBulkReversalTransactionsRequest&gt;&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("savingsaccounts/{savingsId}/transactions/{transactionId}")
        Call<List<PostSavingsAccountBulkReversalTransactionsRequest>> adjustTransaction1(
        @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PostSavingsAccountBulkReversalTransactionsRequest postSavingsAccountBulkReversalTransactionsRequest, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param savingsId  (required)
                * @param transactionId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("savingsaccounts/{savingsId}/transactions/{transactionId}")
        Call<String> retrieveOne23(
        @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Path("transactionId") Long transactionId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param savingsId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("savingsaccounts/{savingsId}/transactions/template")
        Call<String> retrieveTemplate18(
        @retrofit2.http.Path("savingsId") Long savingsId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param savingsId  (required)
                * @param postSavingsAccountTransactionsRequest  (required)
                * @param command  (optional)
            * @return Call&lt;PostSavingsAccountTransactionsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("savingsaccounts/{savingsId}/transactions")
        Call<PostSavingsAccountTransactionsResponse> transaction2(
        @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Body PostSavingsAccountTransactionsRequest postSavingsAccountTransactionsRequest, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

        }
