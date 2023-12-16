package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetSchedulerResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SchedulerApi {
        /**
        * Activate Scheduler Jobs | Suspend Scheduler Jobs
        * Activates the scheduler job service. | Suspends the scheduler job service.
            * @param command command (optional)
        * @return Call&lt;Void&gt;
        */
        @POST("scheduler")
        Call<Void> changeSchedulerStatus(
        @retrofit2.http.Query("command") String command
                );

        /**
        * Retrieve Scheduler Status
        * Returns the scheduler status.  Example Requests:  scheduler
        * @return Call&lt;GetSchedulerResponse&gt;
        */
        @GET("scheduler")
        Call<GetSchedulerResponse> retrieveStatus();
        


            /**
            * Activate Scheduler Jobs | Suspend Scheduler Jobs
            * Activates the scheduler job service. | Suspends the scheduler job service.
                * @param command command (optional)
            * @return Call&lt;Void&gt;
            */
            @POST("scheduler")
        Call<Void> changeSchedulerStatus(
        @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Scheduler Status
            * Returns the scheduler status.  Example Requests:  scheduler
            * @return Call&lt;GetSchedulerResponse&gt;
            */
            @GET("scheduler")
        Call<GetSchedulerResponse> retrieveStatus(@HeaderMap Map<String, String> headers);
        

        }
