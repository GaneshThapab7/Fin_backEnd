package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.GetFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.PostFinancialActivityAccountsRequest;
import org.apache.fineract.client.models.PostFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.PutFinancialActivityAccountsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface MappingFinancialActivitiesToAccountsApi {
        /**
        * Create a new Financial Activity to Accounts Mapping
        * Mandatory Fields financialActivityId, glAccountId
            * @param postFinancialActivityAccountsRequest  (optional)
        * @return Call&lt;PostFinancialActivityAccountsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("financialactivityaccounts")
        Call<PostFinancialActivityAccountsResponse> createGLAccount(
        @retrofit2.http.Body PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest
                );

        /**
        * Delete a Financial Activity to Account Mapping
        * 
            * @param mappingId mappingId (required)
        * @return Call&lt;DeleteFinancialActivityAccountsResponse&gt;
        */
        @DELETE("financialactivityaccounts/{mappingId}")
        Call<DeleteFinancialActivityAccountsResponse> deleteGLAccount(
        @retrofit2.http.Path("mappingId") Long mappingId
                );

        /**
        * Retrieve a Financial Activity to Account Mapping 
        * Example Requests:  financialactivityaccounts/1
            * @param mappingId mappingId (required)
        * @return Call&lt;GetFinancialActivityAccountsResponse&gt;
        */
        @GET("financialactivityaccounts/{mappingId}")
        Call<GetFinancialActivityAccountsResponse> retreive(
        @retrofit2.http.Path("mappingId") Long mappingId
                );

        /**
        * List Financial Activities to Accounts Mappings
        * Example Requests:  financialactivityaccounts
        * @return Call&lt;List&lt;GetFinancialActivityAccountsResponse&gt;&gt;
        */
        @GET("financialactivityaccounts")
        Call<List<GetFinancialActivityAccountsResponse>> retrieveAll();
        

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("financialactivityaccounts/template")
        Call<String> retrieveTemplate();
        

        /**
        * Update a Financial Activity to Account Mapping
        * the API updates the Ledger account linked to a Financial Activity  
            * @param mappingId mappingId (required)
            * @param postFinancialActivityAccountsRequest  (optional)
        * @return Call&lt;PutFinancialActivityAccountsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("financialactivityaccounts/{mappingId}")
        Call<PutFinancialActivityAccountsResponse> updateGLAccount(
        @retrofit2.http.Path("mappingId") Long mappingId, @retrofit2.http.Body PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest
                );


            /**
            * Create a new Financial Activity to Accounts Mapping
            * Mandatory Fields financialActivityId, glAccountId
                * @param postFinancialActivityAccountsRequest  (optional)
            * @return Call&lt;PostFinancialActivityAccountsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("financialactivityaccounts")
        Call<PostFinancialActivityAccountsResponse> createGLAccount(
        @retrofit2.http.Body PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Financial Activity to Account Mapping
            * 
                * @param mappingId mappingId (required)
            * @return Call&lt;DeleteFinancialActivityAccountsResponse&gt;
            */
            @DELETE("financialactivityaccounts/{mappingId}")
        Call<DeleteFinancialActivityAccountsResponse> deleteGLAccount(
        @retrofit2.http.Path("mappingId") Long mappingId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Financial Activity to Account Mapping 
            * Example Requests:  financialactivityaccounts/1
                * @param mappingId mappingId (required)
            * @return Call&lt;GetFinancialActivityAccountsResponse&gt;
            */
            @GET("financialactivityaccounts/{mappingId}")
        Call<GetFinancialActivityAccountsResponse> retreive(
        @retrofit2.http.Path("mappingId") Long mappingId
                , @HeaderMap Map<String, String> headers);

            /**
            * List Financial Activities to Accounts Mappings
            * Example Requests:  financialactivityaccounts
            * @return Call&lt;List&lt;GetFinancialActivityAccountsResponse&gt;&gt;
            */
            @GET("financialactivityaccounts")
        Call<List<GetFinancialActivityAccountsResponse>> retrieveAll(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("financialactivityaccounts/template")
        Call<String> retrieveTemplate(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Financial Activity to Account Mapping
            * the API updates the Ledger account linked to a Financial Activity  
                * @param mappingId mappingId (required)
                * @param postFinancialActivityAccountsRequest  (optional)
            * @return Call&lt;PutFinancialActivityAccountsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("financialactivityaccounts/{mappingId}")
        Call<PutFinancialActivityAccountsResponse> updateGLAccount(
        @retrofit2.http.Path("mappingId") Long mappingId, @retrofit2.http.Body PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest
                , @HeaderMap Map<String, String> headers);

        }
