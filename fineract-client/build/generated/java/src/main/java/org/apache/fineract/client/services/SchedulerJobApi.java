package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetJobsJobIDJobRunHistoryResponse;
import org.apache.fineract.client.models.GetJobsResponse;
import org.apache.fineract.client.models.PutJobsJobIDRequest;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SchedulerJobApi {
        /**
        * Run a Job
        * Manually Execute Specific Job.
            * @param jobId jobId (required)
            * @param command command (optional)
        * @return Call&lt;Void&gt;
        */
        @POST("jobs/{jobId}")
        Call<Void> executeJob(
        @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Query("command") String command
                );

        /**
        * Retrieve Scheduler Jobs
        * Returns the list of jobs.  Example Requests:  jobs
        * @return Call&lt;List&lt;GetJobsResponse&gt;&gt;
        */
        @GET("jobs")
        Call<List<GetJobsResponse>> retrieveAll8();
        

        /**
        * Retrieve Job Run History
        * Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200
            * @param jobId jobId (required)
            * @param offset offset (optional)
            * @param limit limit (optional)
            * @param orderBy orderBy (optional)
            * @param sortOrder sortOrder (optional)
        * @return Call&lt;GetJobsJobIDJobRunHistoryResponse&gt;
        */
        @GET("jobs/{jobId}/runhistory")
        Call<GetJobsJobIDJobRunHistoryResponse> retrieveHistory(
        @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                );

        /**
        * Retrieve a Job
        * Returns the details of a Job.  Example Requests:  jobs/5
            * @param jobId jobId (required)
        * @return Call&lt;GetJobsResponse&gt;
        */
        @GET("jobs/{jobId}")
        Call<GetJobsResponse> retrieveOne5(
        @retrofit2.http.Path("jobId") Long jobId
                );

        /**
        * Update a Job
        * Updates the details of a job.
            * @param jobId jobId (required)
            * @param putJobsJobIDRequest  (required)
        * @return Call&lt;Void&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("jobs/{jobId}")
        Call<Void> updateJobDetail(
        @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Body PutJobsJobIDRequest putJobsJobIDRequest
                );


            /**
            * Run a Job
            * Manually Execute Specific Job.
                * @param jobId jobId (required)
                * @param command command (optional)
            * @return Call&lt;Void&gt;
            */
            @POST("jobs/{jobId}")
        Call<Void> executeJob(
        @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Scheduler Jobs
            * Returns the list of jobs.  Example Requests:  jobs
            * @return Call&lt;List&lt;GetJobsResponse&gt;&gt;
            */
            @GET("jobs")
        Call<List<GetJobsResponse>> retrieveAll8(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve Job Run History
            * Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200
                * @param jobId jobId (required)
                * @param offset offset (optional)
                * @param limit limit (optional)
                * @param orderBy orderBy (optional)
                * @param sortOrder sortOrder (optional)
            * @return Call&lt;GetJobsJobIDJobRunHistoryResponse&gt;
            */
            @GET("jobs/{jobId}/runhistory")
        Call<GetJobsJobIDJobRunHistoryResponse> retrieveHistory(
        @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Job
            * Returns the details of a Job.  Example Requests:  jobs/5
                * @param jobId jobId (required)
            * @return Call&lt;GetJobsResponse&gt;
            */
            @GET("jobs/{jobId}")
        Call<GetJobsResponse> retrieveOne5(
        @retrofit2.http.Path("jobId") Long jobId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update a Job
            * Updates the details of a job.
                * @param jobId jobId (required)
                * @param putJobsJobIDRequest  (required)
            * @return Call&lt;Void&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("jobs/{jobId}")
        Call<Void> updateJobDetail(
        @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Body PutJobsJobIDRequest putJobsJobIDRequest
                , @HeaderMap Map<String, String> headers);

        }
