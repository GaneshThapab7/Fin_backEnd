package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetShareAccountsClientIdProductIdResponse;
import org.apache.fineract.client.models.PostNewShareApplicationResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SelfShareAccountsApi {
        /**
        * Submit new share application
        * Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.
            * @param body  (optional)
        * @return Call&lt;List&lt;PostNewShareApplicationResponse&gt;&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("self/shareaccounts")
        Call<List<PostNewShareApplicationResponse>> createAccount1(
        @retrofit2.http.Body String body
                );

        /**
        * Retrieve a share application/account
        *    Example Requests:  self/shareaccounts/12 
            * @param accountId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("self/shareaccounts/{accountId}")
        Call<String> retrieveShareAccount(
        @retrofit2.http.Path("accountId") Long accountId
                );

        /**
        * Retrieve Share Account Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3 
            * @param clientId  (optional)
            * @param productId  (optional)
        * @return Call&lt;List&lt;GetShareAccountsClientIdProductIdResponse&gt;&gt;
        */
        @GET("self/shareaccounts/template")
        Call<List<GetShareAccountsClientIdProductIdResponse>> template19(
        @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId
                );


            /**
            * Submit new share application
            * Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.
                * @param body  (optional)
            * @return Call&lt;List&lt;PostNewShareApplicationResponse&gt;&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("self/shareaccounts")
        Call<List<PostNewShareApplicationResponse>> createAccount1(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a share application/account
            *    Example Requests:  self/shareaccounts/12 
                * @param accountId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("self/shareaccounts/{accountId}")
        Call<String> retrieveShareAccount(
        @retrofit2.http.Path("accountId") Long accountId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Share Account Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3 
                * @param clientId  (optional)
                * @param productId  (optional)
            * @return Call&lt;List&lt;GetShareAccountsClientIdProductIdResponse&gt;&gt;
            */
            @GET("self/shareaccounts/template")
        Call<List<GetShareAccountsClientIdProductIdResponse>> template19(
        @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId
                , @HeaderMap Map<String, String> headers);

        }
