package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetTaxesComponentsResponse;
import org.apache.fineract.client.models.PostTaxesComponentsRequest;
import org.apache.fineract.client.models.PostTaxesComponentsResponse;
import org.apache.fineract.client.models.PutTaxesComponentsTaxComponentIdRequest;
import org.apache.fineract.client.models.PutTaxesComponentsTaxComponentIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface TaxComponentsApi {
        /**
        * Create a new Tax Component
        * Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate
            * @param postTaxesComponentsRequest  (required)
        * @return Call&lt;PostTaxesComponentsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("taxes/component")
        Call<PostTaxesComponentsResponse> createTaxCompoent(
        @retrofit2.http.Body PostTaxesComponentsRequest postTaxesComponentsRequest
                );

        /**
        * List Tax Components
        * List Tax Components
        * @return Call&lt;List&lt;GetTaxesComponentsResponse&gt;&gt;
        */
        @GET("taxes/component")
        Call<List<GetTaxesComponentsResponse>> retrieveAllTaxComponents();
        

        /**
        * Retrieve Tax Component
        * Retrieve Tax Component
            * @param taxComponentId taxComponentId (required)
        * @return Call&lt;GetTaxesComponentsResponse&gt;
        */
        @GET("taxes/component/{taxComponentId}")
        Call<GetTaxesComponentsResponse> retrieveTaxComponent(
        @retrofit2.http.Path("taxComponentId") Long taxComponentId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("taxes/component/template")
        Call<String> retrieveTemplate20();
        

        /**
        * Update Tax Component
        * Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.
            * @param taxComponentId taxComponentId (required)
            * @param putTaxesComponentsTaxComponentIdRequest  (required)
        * @return Call&lt;PutTaxesComponentsTaxComponentIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("taxes/component/{taxComponentId}")
        Call<PutTaxesComponentsTaxComponentIdResponse> updateTaxCompoent(
        @retrofit2.http.Path("taxComponentId") Long taxComponentId, @retrofit2.http.Body PutTaxesComponentsTaxComponentIdRequest putTaxesComponentsTaxComponentIdRequest
                );


            /**
            * Create a new Tax Component
            * Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate
                * @param postTaxesComponentsRequest  (required)
            * @return Call&lt;PostTaxesComponentsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("taxes/component")
        Call<PostTaxesComponentsResponse> createTaxCompoent(
        @retrofit2.http.Body PostTaxesComponentsRequest postTaxesComponentsRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * List Tax Components
            * List Tax Components
            * @return Call&lt;List&lt;GetTaxesComponentsResponse&gt;&gt;
            */
            @GET("taxes/component")
        Call<List<GetTaxesComponentsResponse>> retrieveAllTaxComponents(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve Tax Component
            * Retrieve Tax Component
                * @param taxComponentId taxComponentId (required)
            * @return Call&lt;GetTaxesComponentsResponse&gt;
            */
            @GET("taxes/component/{taxComponentId}")
        Call<GetTaxesComponentsResponse> retrieveTaxComponent(
        @retrofit2.http.Path("taxComponentId") Long taxComponentId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("taxes/component/template")
        Call<String> retrieveTemplate20(@HeaderMap Map<String, String> headers);
        

            /**
            * Update Tax Component
            * Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.
                * @param taxComponentId taxComponentId (required)
                * @param putTaxesComponentsTaxComponentIdRequest  (required)
            * @return Call&lt;PutTaxesComponentsTaxComponentIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("taxes/component/{taxComponentId}")
        Call<PutTaxesComponentsTaxComponentIdResponse> updateTaxCompoent(
        @retrofit2.http.Path("taxComponentId") Long taxComponentId, @retrofit2.http.Body PutTaxesComponentsTaxComponentIdRequest putTaxesComponentsTaxComponentIdRequest
                , @HeaderMap Map<String, String> headers);

        }
