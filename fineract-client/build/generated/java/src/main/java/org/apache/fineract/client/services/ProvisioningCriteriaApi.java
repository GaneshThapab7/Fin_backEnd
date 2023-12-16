package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteProvisioningCriteriaResponse;
import org.apache.fineract.client.models.GetProvisioningCriteriaCriteriaIdResponse;
import org.apache.fineract.client.models.GetProvisioningCriteriaResponse;
import org.apache.fineract.client.models.PostProvisioningCriteriaRequest;
import org.apache.fineract.client.models.PostProvisioningCriteriaResponse;
import org.apache.fineract.client.models.PutProvisioningCriteriaRequest;
import org.apache.fineract.client.models.PutProvisioningCriteriaResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface ProvisioningCriteriaApi {
        /**
        * Create a new Provisioning Criteria
        * Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts
            * @param postProvisioningCriteriaRequest  (required)
        * @return Call&lt;PostProvisioningCriteriaResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("provisioningcriteria")
        Call<PostProvisioningCriteriaResponse> createProvisioningCriteria(
        @retrofit2.http.Body PostProvisioningCriteriaRequest postProvisioningCriteriaRequest
                );

        /**
        * Deletes Provisioning Criteria
        * Deletes Provisioning Criteria
            * @param criteriaId criteriaId (required)
        * @return Call&lt;DeleteProvisioningCriteriaResponse&gt;
        */
        @DELETE("provisioningcriteria/{criteriaId}")
        Call<DeleteProvisioningCriteriaResponse> deleteProvisioningCriteria(
        @retrofit2.http.Path("criteriaId") Long criteriaId
                );

        /**
        * Retrieves all created Provisioning Criterias
        * Retrieves all created Provisioning Criterias
        * @return Call&lt;List&lt;GetProvisioningCriteriaResponse&gt;&gt;
        */
        @GET("provisioningcriteria")
        Call<List<GetProvisioningCriteriaResponse>> retrieveAllProvisioningCriterias();
        

        /**
        * Retrieves a Provisioning Criteria
        * Retrieves a Provisioning Criteria
            * @param criteriaId criteriaId (required)
        * @return Call&lt;GetProvisioningCriteriaCriteriaIdResponse&gt;
        */
        @GET("provisioningcriteria/{criteriaId}")
        Call<GetProvisioningCriteriaCriteriaIdResponse> retrieveProvisioningCriteria(
        @retrofit2.http.Path("criteriaId") Long criteriaId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("provisioningcriteria/template")
        Call<String> retrieveTemplate3();
        

        /**
        * Updates a new Provisioning Criteria
        * Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria
            * @param criteriaId criteriaId (required)
            * @param putProvisioningCriteriaRequest  (required)
        * @return Call&lt;PutProvisioningCriteriaResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("provisioningcriteria/{criteriaId}")
        Call<PutProvisioningCriteriaResponse> updateProvisioningCriteria(
        @retrofit2.http.Path("criteriaId") Long criteriaId, @retrofit2.http.Body PutProvisioningCriteriaRequest putProvisioningCriteriaRequest
                );


            /**
            * Create a new Provisioning Criteria
            * Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts
                * @param postProvisioningCriteriaRequest  (required)
            * @return Call&lt;PostProvisioningCriteriaResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("provisioningcriteria")
        Call<PostProvisioningCriteriaResponse> createProvisioningCriteria(
        @retrofit2.http.Body PostProvisioningCriteriaRequest postProvisioningCriteriaRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Deletes Provisioning Criteria
            * Deletes Provisioning Criteria
                * @param criteriaId criteriaId (required)
            * @return Call&lt;DeleteProvisioningCriteriaResponse&gt;
            */
            @DELETE("provisioningcriteria/{criteriaId}")
        Call<DeleteProvisioningCriteriaResponse> deleteProvisioningCriteria(
        @retrofit2.http.Path("criteriaId") Long criteriaId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieves all created Provisioning Criterias
            * Retrieves all created Provisioning Criterias
            * @return Call&lt;List&lt;GetProvisioningCriteriaResponse&gt;&gt;
            */
            @GET("provisioningcriteria")
        Call<List<GetProvisioningCriteriaResponse>> retrieveAllProvisioningCriterias(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieves a Provisioning Criteria
            * Retrieves a Provisioning Criteria
                * @param criteriaId criteriaId (required)
            * @return Call&lt;GetProvisioningCriteriaCriteriaIdResponse&gt;
            */
            @GET("provisioningcriteria/{criteriaId}")
        Call<GetProvisioningCriteriaCriteriaIdResponse> retrieveProvisioningCriteria(
        @retrofit2.http.Path("criteriaId") Long criteriaId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("provisioningcriteria/template")
        Call<String> retrieveTemplate3(@HeaderMap Map<String, String> headers);
        

            /**
            * Updates a new Provisioning Criteria
            * Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria
                * @param criteriaId criteriaId (required)
                * @param putProvisioningCriteriaRequest  (required)
            * @return Call&lt;PutProvisioningCriteriaResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("provisioningcriteria/{criteriaId}")
        Call<PutProvisioningCriteriaResponse> updateProvisioningCriteria(
        @retrofit2.http.Path("criteriaId") Long criteriaId, @retrofit2.http.Body PutProvisioningCriteriaRequest putProvisioningCriteriaRequest
                , @HeaderMap Map<String, String> headers);

        }
