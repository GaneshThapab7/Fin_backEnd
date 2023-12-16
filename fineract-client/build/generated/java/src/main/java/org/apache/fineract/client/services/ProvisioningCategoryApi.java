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

    public interface ProvisioningCategoryApi {
        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("provisioningcategory")
        Call<String> createProvisioningCategory(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param categoryId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("provisioningcategory/{categoryId}")
        Call<String> deleteProvisioningCategory(
        @retrofit2.http.Path("categoryId") Long categoryId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("provisioningcategory")
        Call<String> retrieveAll15();
        

        /**
        * 
        * 
            * @param categoryId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("provisioningcategory/{categoryId}")
        Call<String> updateProvisioningCategory(
        @retrofit2.http.Path("categoryId") Long categoryId, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("provisioningcategory")
        Call<String> createProvisioningCategory(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param categoryId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("provisioningcategory/{categoryId}")
        Call<String> deleteProvisioningCategory(
        @retrofit2.http.Path("categoryId") Long categoryId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("provisioningcategory")
        Call<String> retrieveAll15(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param categoryId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("provisioningcategory/{categoryId}")
        Call<String> updateProvisioningCategory(
        @retrofit2.http.Path("categoryId") Long categoryId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
