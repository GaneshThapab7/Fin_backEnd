package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteCollateralProductResponse;
import org.apache.fineract.client.models.GetCollateralManagementsResponse;
import org.apache.fineract.client.models.GetCollateralProductTemplate;
import org.apache.fineract.client.models.PostCollateralManagementProductRequest;
import org.apache.fineract.client.models.PostCollateralManagementProductResponse;
import org.apache.fineract.client.models.PutCollateralProductRequest;
import org.apache.fineract.client.models.PutCollateralProductResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface CollateralManagementApi {
        /**
        * Create a new collateral
        * Collateral Creation
            * @param postCollateralManagementProductRequest  (required)
        * @return Call&lt;PostCollateralManagementProductResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("collateral-management")
        Call<PostCollateralManagementProductResponse> createCollateral1(
        @retrofit2.http.Body PostCollateralManagementProductRequest postCollateralManagementProductRequest
                );

        /**
        * Delete a Collateral
        * Delete Collateral
            * @param collateralId collateralId (required)
        * @return Call&lt;DeleteCollateralProductResponse&gt;
        */
        @DELETE("collateral-management/{collateralId}")
        Call<DeleteCollateralProductResponse> deleteCollateral2(
        @retrofit2.http.Path("collateralId") Long collateralId
                );

        /**
        * Get All Collaterals
        * Fetch all Collateral Products
        * @return Call&lt;List&lt;GetCollateralManagementsResponse&gt;&gt;
        */
        @GET("collateral-management")
        Call<List<GetCollateralManagementsResponse>> getAllCollaterals();
        

        /**
        * Get Collateral
        * Fetch Collateral
            * @param collateralId collateralId (required)
        * @return Call&lt;GetCollateralManagementsResponse&gt;
        */
        @GET("collateral-management/{collateralId}")
        Call<GetCollateralManagementsResponse> getCollateral(
        @retrofit2.http.Path("collateralId") Long collateralId
                );

        /**
        * Get Collateral Template
        * Get Collateral Template
        * @return Call&lt;List&lt;GetCollateralProductTemplate&gt;&gt;
        */
        @GET("collateral-management/template")
        Call<List<GetCollateralProductTemplate>> getCollateralTemplate();
        

        /**
        * Update Collateral
        * Update Collateral
            * @param collateralId collateralId (required)
            * @param putCollateralProductRequest  (required)
        * @return Call&lt;PutCollateralProductResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("collateral-management/{collateralId}")
        Call<PutCollateralProductResponse> updateCollateral2(
        @retrofit2.http.Path("collateralId") Long collateralId, @retrofit2.http.Body PutCollateralProductRequest putCollateralProductRequest
                );


            /**
            * Create a new collateral
            * Collateral Creation
                * @param postCollateralManagementProductRequest  (required)
            * @return Call&lt;PostCollateralManagementProductResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("collateral-management")
        Call<PostCollateralManagementProductResponse> createCollateral1(
        @retrofit2.http.Body PostCollateralManagementProductRequest postCollateralManagementProductRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Collateral
            * Delete Collateral
                * @param collateralId collateralId (required)
            * @return Call&lt;DeleteCollateralProductResponse&gt;
            */
            @DELETE("collateral-management/{collateralId}")
        Call<DeleteCollateralProductResponse> deleteCollateral2(
        @retrofit2.http.Path("collateralId") Long collateralId
                , @HeaderMap Map<String, String> headers);

            /**
            * Get All Collaterals
            * Fetch all Collateral Products
            * @return Call&lt;List&lt;GetCollateralManagementsResponse&gt;&gt;
            */
            @GET("collateral-management")
        Call<List<GetCollateralManagementsResponse>> getAllCollaterals(@HeaderMap Map<String, String> headers);
        

            /**
            * Get Collateral
            * Fetch Collateral
                * @param collateralId collateralId (required)
            * @return Call&lt;GetCollateralManagementsResponse&gt;
            */
            @GET("collateral-management/{collateralId}")
        Call<GetCollateralManagementsResponse> getCollateral(
        @retrofit2.http.Path("collateralId") Long collateralId
                , @HeaderMap Map<String, String> headers);

            /**
            * Get Collateral Template
            * Get Collateral Template
            * @return Call&lt;List&lt;GetCollateralProductTemplate&gt;&gt;
            */
            @GET("collateral-management/template")
        Call<List<GetCollateralProductTemplate>> getCollateralTemplate(@HeaderMap Map<String, String> headers);
        

            /**
            * Update Collateral
            * Update Collateral
                * @param collateralId collateralId (required)
                * @param putCollateralProductRequest  (required)
            * @return Call&lt;PutCollateralProductResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("collateral-management/{collateralId}")
        Call<PutCollateralProductResponse> updateCollateral2(
        @retrofit2.http.Path("collateralId") Long collateralId, @retrofit2.http.Body PutCollateralProductRequest putCollateralProductRequest
                , @HeaderMap Map<String, String> headers);

        }
