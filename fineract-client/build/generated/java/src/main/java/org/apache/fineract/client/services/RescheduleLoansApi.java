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

    public interface RescheduleLoansApi {
        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("rescheduleloans")
        Call<String> createLoanRescheduleRequest(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param scheduleId  (required)
            * @param command  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("rescheduleloans/{scheduleId}")
        Call<String> readLoanRescheduleRequest(
        @retrofit2.http.Path("scheduleId") Long scheduleId, @retrofit2.http.Query("command") String command
                );

        /**
        * 
        * 
            * @param command  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("rescheduleloans")
        Call<String> retrieveAllRescheduleRequest(
        @retrofit2.http.Query("command") String command
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("rescheduleloans/template")
        Call<String> retrieveTemplate9();
        

        /**
        * 
        * 
            * @param scheduleId  (required)
            * @param command  (optional)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("rescheduleloans/{scheduleId}")
        Call<String> updateLoanRescheduleRequest(
        @retrofit2.http.Path("scheduleId") Long scheduleId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
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
            @POST("rescheduleloans")
        Call<String> createLoanRescheduleRequest(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param scheduleId  (required)
                * @param command  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("rescheduleloans/{scheduleId}")
        Call<String> readLoanRescheduleRequest(
        @retrofit2.http.Path("scheduleId") Long scheduleId, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param command  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("rescheduleloans")
        Call<String> retrieveAllRescheduleRequest(
        @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("rescheduleloans/template")
        Call<String> retrieveTemplate9(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param scheduleId  (required)
                * @param command  (optional)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("rescheduleloans/{scheduleId}")
        Call<String> updateLoanRescheduleRequest(
        @retrofit2.http.Path("scheduleId") Long scheduleId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
