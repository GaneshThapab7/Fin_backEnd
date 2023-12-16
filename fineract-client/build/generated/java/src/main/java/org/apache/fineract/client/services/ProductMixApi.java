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

    public interface ProductMixApi {
        /**
        * 
        * 
            * @param productId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("loanproducts/{productId}/productmix")
        Call<String> createProductMix(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param productId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("loanproducts/{productId}/productmix")
        Call<String> deleteProductMix(
        @retrofit2.http.Path("productId") Long productId
                );

        /**
        * 
        * 
            * @param productId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("loanproducts/{productId}/productmix")
        Call<String> retrieveTemplate11(
        @retrofit2.http.Path("productId") Long productId
                );

        /**
        * 
        * 
            * @param productId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("loanproducts/{productId}/productmix")
        Call<String> updateProductMix(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param productId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("loanproducts/{productId}/productmix")
        Call<String> createProductMix(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param productId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("loanproducts/{productId}/productmix")
        Call<String> deleteProductMix(
        @retrofit2.http.Path("productId") Long productId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param productId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("loanproducts/{productId}/productmix")
        Call<String> retrieveTemplate11(
        @retrofit2.http.Path("productId") Long productId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param productId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("loanproducts/{productId}/productmix")
        Call<String> updateProductMix(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
