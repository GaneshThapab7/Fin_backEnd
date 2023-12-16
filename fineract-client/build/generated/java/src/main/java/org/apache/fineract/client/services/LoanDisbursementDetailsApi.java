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

    public interface LoanDisbursementDetailsApi {
        /**
        * 
        * 
            * @param loanId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("loans/{loanId}/disbursements/editDisbursements")
        Call<String> addAndDeleteDisbursementDetail(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param disbursementId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("loans/{loanId}/disbursements/{disbursementId}")
        Call<String> retriveDetail(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("disbursementId") Long disbursementId
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param disbursementId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("loans/{loanId}/disbursements/{disbursementId}")
        Call<String> updateDisbursementDate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("disbursementId") Long disbursementId, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param loanId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("loans/{loanId}/disbursements/editDisbursements")
        Call<String> addAndDeleteDisbursementDetail(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param disbursementId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("loans/{loanId}/disbursements/{disbursementId}")
        Call<String> retriveDetail(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("disbursementId") Long disbursementId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param disbursementId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("loans/{loanId}/disbursements/{disbursementId}")
        Call<String> updateDisbursementDate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("disbursementId") Long disbursementId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
