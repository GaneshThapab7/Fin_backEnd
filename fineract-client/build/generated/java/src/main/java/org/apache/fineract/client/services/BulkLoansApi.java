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

    public interface BulkLoansApi {
        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("loans/loanreassignment")
        Call<String> loanReassignment(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param officeId  (optional)
            * @param fromLoanOfficerId  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("loans/loanreassignment/template")
        Call<String> loanReassignmentTemplate(
        @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("fromLoanOfficerId") Long fromLoanOfficerId
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
            @POST("loans/loanreassignment")
        Call<String> loanReassignment(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param officeId  (optional)
                * @param fromLoanOfficerId  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("loans/loanreassignment/template")
        Call<String> loanReassignmentTemplate(
        @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("fromLoanOfficerId") Long fromLoanOfficerId
                , @HeaderMap Map<String, String> headers);

        }
