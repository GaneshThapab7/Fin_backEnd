package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetClientsClientIdTransactionsResponse;
import org.apache.fineract.client.models.GetClientsClientIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PostClientsClientIdTransactionsTransactionIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface ClientTransactionApi {
        /**
        * List Client Transactions
        * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
            * @param clientId clientId (required)
            * @param offset offset (optional)
            * @param limit limit (optional)
        * @return Call&lt;GetClientsClientIdTransactionsResponse&gt;
        */
        @GET("clients/{clientId}/transactions")
        Call<GetClientsClientIdTransactionsResponse> retrieveAllClientTransactions(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
                );

        /**
        * Retrieve a Client Transaction
        * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
            * @param clientId clientId (required)
            * @param transactionId transactionId (required)
        * @return Call&lt;GetClientsClientIdTransactionsTransactionIdResponse&gt;
        */
        @GET("clients/{clientId}/transactions/{transactionId}")
        Call<GetClientsClientIdTransactionsTransactionIdResponse> retrieveClientTransaction(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId
                );

        /**
        * Undo a Client Transaction
        * Undoes a Client Transaction
            * @param clientId clientId (required)
            * @param transactionId transactionId (required)
            * @param command command (optional)
        * @return Call&lt;PostClientsClientIdTransactionsTransactionIdResponse&gt;
        */
        @POST("clients/{clientId}/transactions/{transactionId}")
        Call<PostClientsClientIdTransactionsTransactionIdResponse> undoClientTransaction(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("command") String command
                );


            /**
            * List Client Transactions
            * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
                * @param clientId clientId (required)
                * @param offset offset (optional)
                * @param limit limit (optional)
            * @return Call&lt;GetClientsClientIdTransactionsResponse&gt;
            */
            @GET("clients/{clientId}/transactions")
        Call<GetClientsClientIdTransactionsResponse> retrieveAllClientTransactions(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Client Transaction
            * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
                * @param clientId clientId (required)
                * @param transactionId transactionId (required)
            * @return Call&lt;GetClientsClientIdTransactionsTransactionIdResponse&gt;
            */
            @GET("clients/{clientId}/transactions/{transactionId}")
        Call<GetClientsClientIdTransactionsTransactionIdResponse> retrieveClientTransaction(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId
                , @HeaderMap Map<String, String> headers);

            /**
            * Undo a Client Transaction
            * Undoes a Client Transaction
                * @param clientId clientId (required)
                * @param transactionId transactionId (required)
                * @param command command (optional)
            * @return Call&lt;PostClientsClientIdTransactionsTransactionIdResponse&gt;
            */
            @POST("clients/{clientId}/transactions/{transactionId}")
        Call<PostClientsClientIdTransactionsTransactionIdResponse> undoClientTransaction(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

        }
