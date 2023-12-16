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

    public interface TwoFactorApi {
        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("twofactor")
        Call<String> getOTPDeliveryMethods();
        

        /**
        * 
        * 
            * @param deliveryMethod  (optional)
            * @param extendedToken  (optional, default to false)
        * @return Call&lt;String&gt;
        */
        @POST("twofactor")
        Call<String> requestToken(
        @retrofit2.http.Query("deliveryMethod") String deliveryMethod, @retrofit2.http.Query("extendedToken") Boolean extendedToken
                );

        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
        @POST("twofactor/invalidate")
        Call<String> updateConfiguration2(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param token  (optional)
        * @return Call&lt;String&gt;
        */
        @POST("twofactor/validate")
        Call<String> validate(
        @retrofit2.http.Query("token") String token
                );


            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("twofactor")
        Call<String> getOTPDeliveryMethods(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param deliveryMethod  (optional)
                * @param extendedToken  (optional, default to false)
            * @return Call&lt;String&gt;
            */
            @POST("twofactor")
        Call<String> requestToken(
        @retrofit2.http.Query("deliveryMethod") String deliveryMethod, @retrofit2.http.Query("extendedToken") Boolean extendedToken
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
            @POST("twofactor/invalidate")
        Call<String> updateConfiguration2(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param token  (optional)
            * @return Call&lt;String&gt;
            */
            @POST("twofactor/validate")
        Call<String> validate(
        @retrofit2.http.Query("token") String token
                , @HeaderMap Map<String, String> headers);

        }
