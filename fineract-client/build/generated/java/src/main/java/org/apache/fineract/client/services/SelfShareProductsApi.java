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

    public interface SelfShareProductsApi {
        /**
        * 
        * 
            * @param clientId  (optional)
            * @param offset  (optional)
            * @param limit  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("self/products/share")
        Call<String> retrieveAllProducts1(
        @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
                );

        /**
        * 
        * 
            * @param productId  (required)
            * @param type  (required)
            * @param clientId  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("self/products/share/{productId}")
        Call<String> retrieveProduct1(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("type") String type, @retrofit2.http.Query("clientId") Long clientId
                );


            /**
            * 
            * 
                * @param clientId  (optional)
                * @param offset  (optional)
                * @param limit  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("self/products/share")
        Call<String> retrieveAllProducts1(
        @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param productId  (required)
                * @param type  (required)
                * @param clientId  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("self/products/share/{productId}")
        Call<String> retrieveProduct1(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("type") String type, @retrofit2.http.Query("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

        }
