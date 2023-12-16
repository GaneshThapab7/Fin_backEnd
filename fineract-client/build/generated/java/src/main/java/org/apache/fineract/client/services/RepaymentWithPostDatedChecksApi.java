package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeletePostDatedCheck;
import org.apache.fineract.client.models.GetPostDatedChecks;
import org.apache.fineract.client.models.UpdatePostDatedCheckRequest;
import org.apache.fineract.client.models.UpdatePostDatedCheckResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface RepaymentWithPostDatedChecksApi {
        /**
        * Delete Post Dated Check
        * Delete Post Dated Check
            * @param postDatedCheckId postDatedCheckId (required)
            * @param loanId loanId (required)
        * @return Call&lt;List&lt;DeletePostDatedCheck&gt;&gt;
        */
        @DELETE("loans/{loanId}/postdatedchecks/{postDatedCheckId}")
        Call<List<DeletePostDatedCheck>> deletePostDatedCheck(
        @retrofit2.http.Path("postDatedCheckId") Long postDatedCheckId, @retrofit2.http.Path("loanId") Long loanId
                );

        /**
        * Get Post Dated Check
        * Get Post Dated Check
            * @param installmentId installmentId (required)
            * @param loanId loanId (required)
        * @return Call&lt;List&lt;GetPostDatedChecks&gt;&gt;
        */
        @GET("loans/{loanId}/postdatedchecks/{installmentId}")
        Call<List<GetPostDatedChecks>> getPostDatedCheck(
        @retrofit2.http.Path("installmentId") Integer installmentId, @retrofit2.http.Path("loanId") Long loanId
                );

        /**
        * Get All Post Dated Checks
        * Get All Post dated Checks
            * @param loanId loanId (required)
        * @return Call&lt;List&lt;GetPostDatedChecks&gt;&gt;
        */
        @GET("loans/{loanId}/postdatedchecks")
        Call<List<GetPostDatedChecks>> getPostDatedChecks(
        @retrofit2.http.Path("loanId") Long loanId
                );

        /**
        * Update Post Dated Check, Bounced Check
        * Update Post Dated Check, Bounced Check
            * @param postDatedCheckId postDatedCheckId (required)
            * @param loanId loanId (required)
            * @param updatePostDatedCheckRequest  (required)
            * @param editType editType (optional)
        * @return Call&lt;List&lt;UpdatePostDatedCheckResponse&gt;&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("loans/{loanId}/postdatedchecks/{postDatedCheckId}")
        Call<List<UpdatePostDatedCheckResponse>> updatePostDatedChecks(
        @retrofit2.http.Path("postDatedCheckId") Long postDatedCheckId, @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body UpdatePostDatedCheckRequest updatePostDatedCheckRequest, @retrofit2.http.Query("editType") String editType
                );


            /**
            * Delete Post Dated Check
            * Delete Post Dated Check
                * @param postDatedCheckId postDatedCheckId (required)
                * @param loanId loanId (required)
            * @return Call&lt;List&lt;DeletePostDatedCheck&gt;&gt;
            */
            @DELETE("loans/{loanId}/postdatedchecks/{postDatedCheckId}")
        Call<List<DeletePostDatedCheck>> deletePostDatedCheck(
        @retrofit2.http.Path("postDatedCheckId") Long postDatedCheckId, @retrofit2.http.Path("loanId") Long loanId
                , @HeaderMap Map<String, String> headers);

            /**
            * Get Post Dated Check
            * Get Post Dated Check
                * @param installmentId installmentId (required)
                * @param loanId loanId (required)
            * @return Call&lt;List&lt;GetPostDatedChecks&gt;&gt;
            */
            @GET("loans/{loanId}/postdatedchecks/{installmentId}")
        Call<List<GetPostDatedChecks>> getPostDatedCheck(
        @retrofit2.http.Path("installmentId") Integer installmentId, @retrofit2.http.Path("loanId") Long loanId
                , @HeaderMap Map<String, String> headers);

            /**
            * Get All Post Dated Checks
            * Get All Post dated Checks
                * @param loanId loanId (required)
            * @return Call&lt;List&lt;GetPostDatedChecks&gt;&gt;
            */
            @GET("loans/{loanId}/postdatedchecks")
        Call<List<GetPostDatedChecks>> getPostDatedChecks(
        @retrofit2.http.Path("loanId") Long loanId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update Post Dated Check, Bounced Check
            * Update Post Dated Check, Bounced Check
                * @param postDatedCheckId postDatedCheckId (required)
                * @param loanId loanId (required)
                * @param updatePostDatedCheckRequest  (required)
                * @param editType editType (optional)
            * @return Call&lt;List&lt;UpdatePostDatedCheckResponse&gt;&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("loans/{loanId}/postdatedchecks/{postDatedCheckId}")
        Call<List<UpdatePostDatedCheckResponse>> updatePostDatedChecks(
        @retrofit2.http.Path("postDatedCheckId") Long postDatedCheckId, @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body UpdatePostDatedCheckRequest updatePostDatedCheckRequest, @retrofit2.http.Query("editType") String editType
                , @HeaderMap Map<String, String> headers);

        }
