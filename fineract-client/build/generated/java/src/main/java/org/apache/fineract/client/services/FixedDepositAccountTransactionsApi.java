package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;


    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface FixedDepositAccountTransactionsApi {
        /**
        * 
        * 
            * @param fixedDepositAccountId  (required)
            * @param transactionId  (required)
            * @param command  (optional)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
        Call<String> adjustTransaction(
        @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param fixedDepositAccountId  (required)
            * @param transactionId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
        Call<String> retrieveOne17(
        @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId
                );

        /**
        * 
        * 
            * @param fixedDepositAccountId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("fixeddepositaccounts/{fixedDepositAccountId}/transactions/template")
        Call<String> retrieveTemplate13(
        @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId
                );

        /**
        * 
        * 
            * @param fixedDepositAccountId  (required)
            * @param command  (optional)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("fixeddepositaccounts/{fixedDepositAccountId}/transactions")
        Call<String> transaction(
        @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param fixedDepositAccountId  (required)
                * @param transactionId  (required)
                * @param command  (optional)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
        Call<String> adjustTransaction(
        @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param fixedDepositAccountId  (required)
                * @param transactionId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
        Call<String> retrieveOne17(
        @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param fixedDepositAccountId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("fixeddepositaccounts/{fixedDepositAccountId}/transactions/template")
        Call<String> retrieveTemplate13(
        @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param fixedDepositAccountId  (required)
                * @param command  (optional)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("fixeddepositaccounts/{fixedDepositAccountId}/transactions")
        Call<String> transaction(
        @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
