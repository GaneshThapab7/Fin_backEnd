package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteGlClosuresResponse;
import org.apache.fineract.client.models.GetGlClosureResponse;
import org.apache.fineract.client.models.PostGlClosuresRequest;
import org.apache.fineract.client.models.PostGlClosuresResponse;
import org.apache.fineract.client.models.PutGlClosuresRequest;
import org.apache.fineract.client.models.PutGlClosuresResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface AccountingClosureApi {
        /**
        * Create an Accounting Closure
        * Mandatory Fields officeId,closingDate
            * @param postGlClosuresRequest  (required)
        * @return Call&lt;PostGlClosuresResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("glclosures")
        Call<PostGlClosuresResponse> createGLClosure(
        @retrofit2.http.Body PostGlClosuresRequest postGlClosuresRequest
                );

        /**
        * Delete an accounting closure
        * Note: Only the latest accounting closure associated with a branch may be deleted.
            * @param glClosureId glclosureId (required)
        * @return Call&lt;DeleteGlClosuresResponse&gt;
        */
        @DELETE("glclosures/{glClosureId}")
        Call<DeleteGlClosuresResponse> deleteGLClosure(
        @retrofit2.http.Path("glClosureId") Long glClosureId
                );

        /**
        * Retrieve an Accounting Closure
        * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
            * @param glClosureId glClosureId (required)
        * @return Call&lt;GetGlClosureResponse&gt;
        */
        @GET("glclosures/{glClosureId}")
        Call<GetGlClosureResponse> retreiveClosure(
        @retrofit2.http.Path("glClosureId") Long glClosureId
                );

        /**
        * List Accounting closures
        * Example Requests:  glclosures
            * @param officeId  (optional)
        * @return Call&lt;List&lt;GetGlClosureResponse&gt;&gt;
        */
        @GET("glclosures")
        Call<List<GetGlClosureResponse>> retrieveAllClosures(
        @retrofit2.http.Query("officeId") Long officeId
                );

        /**
        * Update an Accounting closure
        * Once an accounting closure is created, only the comments associated with it may be edited
            * @param glClosureId glClosureId (required)
            * @param putGlClosuresRequest  (optional)
        * @return Call&lt;PutGlClosuresResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("glclosures/{glClosureId}")
        Call<PutGlClosuresResponse> updateGLClosure(
        @retrofit2.http.Path("glClosureId") Long glClosureId, @retrofit2.http.Body PutGlClosuresRequest putGlClosuresRequest
                );


            /**
            * Create an Accounting Closure
            * Mandatory Fields officeId,closingDate
                * @param postGlClosuresRequest  (required)
            * @return Call&lt;PostGlClosuresResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("glclosures")
        Call<PostGlClosuresResponse> createGLClosure(
        @retrofit2.http.Body PostGlClosuresRequest postGlClosuresRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete an accounting closure
            * Note: Only the latest accounting closure associated with a branch may be deleted.
                * @param glClosureId glclosureId (required)
            * @return Call&lt;DeleteGlClosuresResponse&gt;
            */
            @DELETE("glclosures/{glClosureId}")
        Call<DeleteGlClosuresResponse> deleteGLClosure(
        @retrofit2.http.Path("glClosureId") Long glClosureId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve an Accounting Closure
            * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
                * @param glClosureId glClosureId (required)
            * @return Call&lt;GetGlClosureResponse&gt;
            */
            @GET("glclosures/{glClosureId}")
        Call<GetGlClosureResponse> retreiveClosure(
        @retrofit2.http.Path("glClosureId") Long glClosureId
                , @HeaderMap Map<String, String> headers);

            /**
            * List Accounting closures
            * Example Requests:  glclosures
                * @param officeId  (optional)
            * @return Call&lt;List&lt;GetGlClosureResponse&gt;&gt;
            */
            @GET("glclosures")
        Call<List<GetGlClosureResponse>> retrieveAllClosures(
        @retrofit2.http.Query("officeId") Long officeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update an Accounting closure
            * Once an accounting closure is created, only the comments associated with it may be edited
                * @param glClosureId glClosureId (required)
                * @param putGlClosuresRequest  (optional)
            * @return Call&lt;PutGlClosuresResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("glclosures/{glClosureId}")
        Call<PutGlClosuresResponse> updateGLClosure(
        @retrofit2.http.Path("glClosureId") Long glClosureId, @retrofit2.http.Body PutGlClosuresRequest putGlClosuresRequest
                , @HeaderMap Map<String, String> headers);

        }
