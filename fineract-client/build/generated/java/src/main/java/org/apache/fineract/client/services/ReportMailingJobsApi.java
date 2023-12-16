package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteReportMailingJobsResponse;
import org.apache.fineract.client.models.GetReportMailingJobsResponse;
import org.apache.fineract.client.models.GetReportMailingJobsTemplate;
import org.apache.fineract.client.models.PostReportMailingJobsRequest;
import org.apache.fineract.client.models.PostReportMailingJobsResponse;
import org.apache.fineract.client.models.PutReportMailingJobsRequest;
import org.apache.fineract.client.models.PutReportMailingJobsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface ReportMailingJobsApi {
        /**
        * Create a Report Mailing Job
        * Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap
            * @param postReportMailingJobsRequest  (required)
        * @return Call&lt;PostReportMailingJobsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("reportmailingjobs")
        Call<PostReportMailingJobsResponse> createReportMailingJob(
        @retrofit2.http.Body PostReportMailingJobsRequest postReportMailingJobsRequest
                );

        /**
        * Delete a Report Mailing Job
        * 
            * @param entityId entityId (required)
            * @param body  (required)
        * @return Call&lt;DeleteReportMailingJobsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @DELETE("reportmailingjobs/{entityId}")
        Call<DeleteReportMailingJobsResponse> deleteReportMailingJob(
        @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body Object body
                );

        /**
        * List Report Mailing Jobs
        * Example Requests:  reportmailingjobs
            * @param offset offset (optional)
            * @param limit limit (optional)
            * @param orderBy orderBy (optional)
            * @param sortOrder sortOrder (optional)
        * @return Call&lt;List&lt;GetReportMailingJobsResponse&gt;&gt;
        */
        @GET("reportmailingjobs")
        Call<List<GetReportMailingJobsResponse>> retrieveAllReportMailingJobs(
        @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                );

        /**
        * Retrieve a Report Mailing Job
        * Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true
            * @param entityId entityId (required)
        * @return Call&lt;GetReportMailingJobsResponse&gt;
        */
        @GET("reportmailingjobs/{entityId}")
        Call<GetReportMailingJobsResponse> retrieveReportMailingJob(
        @retrofit2.http.Path("entityId") Long entityId
                );

        /**
        * Retrieve Report Mailing Job Details Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  reportmailingjobs/template
        * @return Call&lt;GetReportMailingJobsTemplate&gt;
        */
        @GET("reportmailingjobs/template")
        Call<GetReportMailingJobsTemplate> retrieveReportMailingJobTemplate();
        

        /**
        * Update a Report Mailing Job 
        * 
            * @param entityId entityId (required)
            * @param putReportMailingJobsRequest  (required)
        * @return Call&lt;PutReportMailingJobsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("reportmailingjobs/{entityId}")
        Call<PutReportMailingJobsResponse> updateReportMailingJob(
        @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body PutReportMailingJobsRequest putReportMailingJobsRequest
                );


            /**
            * Create a Report Mailing Job
            * Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap
                * @param postReportMailingJobsRequest  (required)
            * @return Call&lt;PostReportMailingJobsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("reportmailingjobs")
        Call<PostReportMailingJobsResponse> createReportMailingJob(
        @retrofit2.http.Body PostReportMailingJobsRequest postReportMailingJobsRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Report Mailing Job
            * 
                * @param entityId entityId (required)
                * @param body  (required)
            * @return Call&lt;DeleteReportMailingJobsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @DELETE("reportmailingjobs/{entityId}")
        Call<DeleteReportMailingJobsResponse> deleteReportMailingJob(
        @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body Object body
                , @HeaderMap Map<String, String> headers);

            /**
            * List Report Mailing Jobs
            * Example Requests:  reportmailingjobs
                * @param offset offset (optional)
                * @param limit limit (optional)
                * @param orderBy orderBy (optional)
                * @param sortOrder sortOrder (optional)
            * @return Call&lt;List&lt;GetReportMailingJobsResponse&gt;&gt;
            */
            @GET("reportmailingjobs")
        Call<List<GetReportMailingJobsResponse>> retrieveAllReportMailingJobs(
        @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Report Mailing Job
            * Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true
                * @param entityId entityId (required)
            * @return Call&lt;GetReportMailingJobsResponse&gt;
            */
            @GET("reportmailingjobs/{entityId}")
        Call<GetReportMailingJobsResponse> retrieveReportMailingJob(
        @retrofit2.http.Path("entityId") Long entityId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Report Mailing Job Details Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  reportmailingjobs/template
            * @return Call&lt;GetReportMailingJobsTemplate&gt;
            */
            @GET("reportmailingjobs/template")
        Call<GetReportMailingJobsTemplate> retrieveReportMailingJobTemplate(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Report Mailing Job 
            * 
                * @param entityId entityId (required)
                * @param putReportMailingJobsRequest  (required)
            * @return Call&lt;PutReportMailingJobsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("reportmailingjobs/{entityId}")
        Call<PutReportMailingJobsResponse> updateReportMailingJob(
        @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body PutReportMailingJobsRequest putReportMailingJobsRequest
                , @HeaderMap Map<String, String> headers);

        }
