package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.PostLoansLoanIdScheduleResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface LoanReschedulingApi {
        /**
        * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
        * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
            * @param loanId loanId (required)
            * @param body  (required)
            * @param command command (optional)
        * @return Call&lt;PostLoansLoanIdScheduleResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("loans/{loanId}/schedule")
        Call<PostLoansLoanIdScheduleResponse> calculateLoanScheduleOrSubmitVariableSchedule(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body Object body, @retrofit2.http.Query("command") String command
                );


            /**
            * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
            * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
                * @param loanId loanId (required)
                * @param body  (required)
                * @param command command (optional)
            * @return Call&lt;PostLoansLoanIdScheduleResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("loans/{loanId}/schedule")
        Call<PostLoansLoanIdScheduleResponse> calculateLoanScheduleOrSubmitVariableSchedule(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body Object body, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

        }
