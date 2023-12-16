package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteReportsResponse;
import org.apache.fineract.client.models.GetReportsResponse;
import org.apache.fineract.client.models.GetReportsTemplateResponse;
import org.apache.fineract.client.models.PostReportsResponse;
import org.apache.fineract.client.models.PostRepostRequest;
import org.apache.fineract.client.models.PutReportRequest;
import org.apache.fineract.client.models.PutReportResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface ReportsApi {
        /**
        * Create a Report
        * 
            * @param postRepostRequest  (required)
        * @return Call&lt;PostReportsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("reports")
        Call<PostReportsResponse> createReport(
        @retrofit2.http.Body PostRepostRequest postRepostRequest
                );

        /**
        * Delete a Report
        * Only non-core reports can be deleted.
            * @param id id (required)
        * @return Call&lt;DeleteReportsResponse&gt;
        */
        @DELETE("reports/{id}")
        Call<DeleteReportsResponse> deleteReport(
        @retrofit2.http.Path("id") Long id
                );

        /**
        * Retrieve Report Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Request :   reports/template
        * @return Call&lt;GetReportsTemplateResponse&gt;
        */
        @GET("reports/template")
        Call<GetReportsTemplateResponse> retrieveOfficeTemplate();
        

        /**
        * Retrieve a Report 
        * Example Requests:  reports/1   reports/1?template&#x3D;true
            * @param id id (required)
        * @return Call&lt;GetReportsResponse&gt;
        */
        @GET("reports/{id}")
        Call<GetReportsResponse> retrieveReport(
        @retrofit2.http.Path("id") Long id
                );

        /**
        * List Reports
        * Lists all reports and their parameters.  Example Request:  reports
        * @return Call&lt;List&lt;GetReportsResponse&gt;&gt;
        */
        @GET("reports")
        Call<List<GetReportsResponse>> retrieveReportList();
        

        /**
        * Update a Report
        * Only the useReport description can be updated for core reports.
            * @param id id (required)
            * @param putReportRequest  (required)
        * @return Call&lt;PutReportResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("reports/{id}")
        Call<PutReportResponse> updateReport(
        @retrofit2.http.Path("id") Long id, @retrofit2.http.Body PutReportRequest putReportRequest
                );


            /**
            * Create a Report
            * 
                * @param postRepostRequest  (required)
            * @return Call&lt;PostReportsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("reports")
        Call<PostReportsResponse> createReport(
        @retrofit2.http.Body PostRepostRequest postRepostRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Report
            * Only non-core reports can be deleted.
                * @param id id (required)
            * @return Call&lt;DeleteReportsResponse&gt;
            */
            @DELETE("reports/{id}")
        Call<DeleteReportsResponse> deleteReport(
        @retrofit2.http.Path("id") Long id
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Report Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Request :   reports/template
            * @return Call&lt;GetReportsTemplateResponse&gt;
            */
            @GET("reports/template")
        Call<GetReportsTemplateResponse> retrieveOfficeTemplate(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve a Report 
            * Example Requests:  reports/1   reports/1?template&#x3D;true
                * @param id id (required)
            * @return Call&lt;GetReportsResponse&gt;
            */
            @GET("reports/{id}")
        Call<GetReportsResponse> retrieveReport(
        @retrofit2.http.Path("id") Long id
                , @HeaderMap Map<String, String> headers);

            /**
            * List Reports
            * Lists all reports and their parameters.  Example Request:  reports
            * @return Call&lt;List&lt;GetReportsResponse&gt;&gt;
            */
            @GET("reports")
        Call<List<GetReportsResponse>> retrieveReportList(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Report
            * Only the useReport description can be updated for core reports.
                * @param id id (required)
                * @param putReportRequest  (required)
            * @return Call&lt;PutReportResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("reports/{id}")
        Call<PutReportResponse> updateReport(
        @retrofit2.http.Path("id") Long id, @retrofit2.http.Body PutReportRequest putReportRequest
                , @HeaderMap Map<String, String> headers);

        }
