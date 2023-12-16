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

    public interface SelfServiceRegistrationApi {
        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
        @POST("self/registration")
        Call<String> createSelfServiceRegistrationRequest(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
        @POST("self/registration/user")
        Call<String> createSelfServiceUser(
        @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
            @POST("self/registration")
        Call<String> createSelfServiceRegistrationRequest(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
            @POST("self/registration/user")
        Call<String> createSelfServiceUser(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
