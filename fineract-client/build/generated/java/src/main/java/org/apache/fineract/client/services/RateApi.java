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

    public interface RateApi {
        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("rates")
        Call<String> createRate(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("rates")
        Call<String> getAllRates();
        

        /**
        * 
        * 
            * @param rateId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("rates/{rateId}")
        Call<String> retrieveRate(
        @retrofit2.http.Path("rateId") Long rateId
                );

        /**
        * 
        * 
            * @param rateId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("rates/{rateId}")
        Call<String> updateRate(
        @retrofit2.http.Path("rateId") Long rateId, @retrofit2.http.Body String body
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
            @POST("rates")
        Call<String> createRate(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("rates")
        Call<String> getAllRates(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param rateId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("rates/{rateId}")
        Call<String> retrieveRate(
        @retrofit2.http.Path("rateId") Long rateId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param rateId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("rates/{rateId}")
        Call<String> updateRate(
        @retrofit2.http.Path("rateId") Long rateId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
