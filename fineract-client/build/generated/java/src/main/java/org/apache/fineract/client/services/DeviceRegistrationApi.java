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

    public interface DeviceRegistrationApi {
        /**
        * 
        * 
            * @param id  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("self/device/registration/{id}")
        Call<String> delete5(
        @retrofit2.http.Path("id") Long id
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
        @POST("self/device/registration")
        Call<String> registerDevice(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("self/device/registration")
        Call<String> retrieveAllDeviceRegistrations();
        

        /**
        * 
        * 
            * @param id  (required)
        * @return Call&lt;String&gt;
        */
        @GET("self/device/registration/{id}")
        Call<String> retrieveDeviceRegiistration(
        @retrofit2.http.Path("id") Long id
                );

        /**
        * 
        * 
            * @param clientId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("self/device/registration/client/{clientId}")
        Call<String> retrieveDeviceRegistrationByClientId(
        @retrofit2.http.Path("clientId") Long clientId
                );

        /**
        * 
        * 
            * @param id  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("self/device/registration/{id}")
        Call<String> updateDeviceRegistration(
        @retrofit2.http.Path("id") Long id, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param id  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("self/device/registration/{id}")
        Call<String> delete5(
        @retrofit2.http.Path("id") Long id
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("self/device/registration")
        Call<String> registerDevice(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("self/device/registration")
        Call<String> retrieveAllDeviceRegistrations(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param id  (required)
            * @return Call&lt;String&gt;
            */
            @GET("self/device/registration/{id}")
        Call<String> retrieveDeviceRegiistration(
        @retrofit2.http.Path("id") Long id
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param clientId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("self/device/registration/client/{clientId}")
        Call<String> retrieveDeviceRegistrationByClientId(
        @retrofit2.http.Path("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param id  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("self/device/registration/{id}")
        Call<String> updateDeviceRegistration(
        @retrofit2.http.Path("id") Long id, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
