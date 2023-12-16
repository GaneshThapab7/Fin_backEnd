package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteClientCollateralResponse;
import org.apache.fineract.client.models.GetLoanCollateralManagementTemplate;
import org.apache.fineract.client.models.PostClientCollateralRequest;
import org.apache.fineract.client.models.PostClientCollateralResponse;
import org.apache.fineract.client.models.PutClientCollateralRequest;
import org.apache.fineract.client.models.PutClientCollateralResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface ClientCollateralManagementApi {
        /**
        * Add New Collateral For a Client
        * Add New Collateral For a Client
            * @param clientId clientId (required)
            * @param postClientCollateralRequest  (required)
        * @return Call&lt;PostClientCollateralResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("clients/{clientId}/collaterals")
        Call<PostClientCollateralResponse> addCollateral(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body PostClientCollateralRequest postClientCollateralRequest
                );

        /**
        * Delete Client Collateral
        * Delete Client Collateral
            * @param clientId clientId (required)
            * @param collateralId collateralId (required)
        * @return Call&lt;DeleteClientCollateralResponse&gt;
        */
        @DELETE("clients/{clientId}/collaterals/{collateralId}")
        Call<DeleteClientCollateralResponse> deleteCollateral1(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("collateralId") Long collateralId
                );

        /**
        * Get Clients Collateral Products
        * Get Collateral Product of a Client
            * @param clientId clientId (required)
            * @param prodId prodId (optional)
        * @return Call&lt;List&lt;Object&gt;&gt;
        */
        @GET("clients/{clientId}/collaterals")
        Call<List<Object>> getClientCollateral(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("prodId") Long prodId
                );

        /**
        * Get Client Collateral Data
        * Get Client Collateral Data
            * @param clientId clientId (required)
            * @param clientCollateralId clientCollateralId (required)
        * @return Call&lt;Object&gt;
        */
        @GET("clients/{clientId}/collaterals/{clientCollateralId}")
        Call<Object> getClientCollateralData(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("clientCollateralId") Long clientCollateralId
                );

        /**
        * Get Client Collateral Template
        * Get Client Collateral Template
            * @param clientId clientId (required)
        * @return Call&lt;List&lt;GetLoanCollateralManagementTemplate&gt;&gt;
        */
        @GET("clients/{clientId}/collaterals/template")
        Call<List<GetLoanCollateralManagementTemplate>> getClientCollateralTemplate(
        @retrofit2.http.Path("clientId") Long clientId
                );

        /**
        * Update New Collateral of a Client
        * Update New Collateral of a Client
            * @param clientId clientId (required)
            * @param collateralId collateralId (required)
            * @param putClientCollateralRequest  (required)
        * @return Call&lt;PutClientCollateralResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("clients/{clientId}/collaterals/{collateralId}")
        Call<PutClientCollateralResponse> updateCollateral1(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("collateralId") Long collateralId, @retrofit2.http.Body PutClientCollateralRequest putClientCollateralRequest
                );


            /**
            * Add New Collateral For a Client
            * Add New Collateral For a Client
                * @param clientId clientId (required)
                * @param postClientCollateralRequest  (required)
            * @return Call&lt;PostClientCollateralResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("clients/{clientId}/collaterals")
        Call<PostClientCollateralResponse> addCollateral(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body PostClientCollateralRequest postClientCollateralRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete Client Collateral
            * Delete Client Collateral
                * @param clientId clientId (required)
                * @param collateralId collateralId (required)
            * @return Call&lt;DeleteClientCollateralResponse&gt;
            */
            @DELETE("clients/{clientId}/collaterals/{collateralId}")
        Call<DeleteClientCollateralResponse> deleteCollateral1(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("collateralId") Long collateralId
                , @HeaderMap Map<String, String> headers);

            /**
            * Get Clients Collateral Products
            * Get Collateral Product of a Client
                * @param clientId clientId (required)
                * @param prodId prodId (optional)
            * @return Call&lt;List&lt;Object&gt;&gt;
            */
            @GET("clients/{clientId}/collaterals")
        Call<List<Object>> getClientCollateral(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("prodId") Long prodId
                , @HeaderMap Map<String, String> headers);

            /**
            * Get Client Collateral Data
            * Get Client Collateral Data
                * @param clientId clientId (required)
                * @param clientCollateralId clientCollateralId (required)
            * @return Call&lt;Object&gt;
            */
            @GET("clients/{clientId}/collaterals/{clientCollateralId}")
        Call<Object> getClientCollateralData(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("clientCollateralId") Long clientCollateralId
                , @HeaderMap Map<String, String> headers);

            /**
            * Get Client Collateral Template
            * Get Client Collateral Template
                * @param clientId clientId (required)
            * @return Call&lt;List&lt;GetLoanCollateralManagementTemplate&gt;&gt;
            */
            @GET("clients/{clientId}/collaterals/template")
        Call<List<GetLoanCollateralManagementTemplate>> getClientCollateralTemplate(
        @retrofit2.http.Path("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update New Collateral of a Client
            * Update New Collateral of a Client
                * @param clientId clientId (required)
                * @param collateralId collateralId (required)
                * @param putClientCollateralRequest  (required)
            * @return Call&lt;PutClientCollateralResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("clients/{clientId}/collaterals/{collateralId}")
        Call<PutClientCollateralResponse> updateCollateral1(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("collateralId") Long collateralId, @retrofit2.http.Body PutClientCollateralRequest putClientCollateralRequest
                , @HeaderMap Map<String, String> headers);

        }
