package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetWorkingDaysResponse;
import org.apache.fineract.client.models.GetWorkingDaysTemplateResponse;
import org.apache.fineract.client.models.PutWorkingDaysRequest;
import org.apache.fineract.client.models.PutWorkingDaysResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface WorkingDaysApi {
        /**
        * List Working days
        * Example Requests:  workingdays
        * @return Call&lt;List&lt;GetWorkingDaysResponse&gt;&gt;
        */
        @GET("workingdays")
        Call<List<GetWorkingDaysResponse>> retrieveAll17();
        

        /**
        * Working Days Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
        * @return Call&lt;GetWorkingDaysTemplateResponse&gt;
        */
        @GET("workingdays/template")
        Call<GetWorkingDaysTemplateResponse> template4();
        

        /**
        * Update a Working Day
        * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
            * @param putWorkingDaysRequest  (required)
        * @return Call&lt;PutWorkingDaysResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("workingdays")
        Call<PutWorkingDaysResponse> update8(
        @retrofit2.http.Body PutWorkingDaysRequest putWorkingDaysRequest
                );


            /**
            * List Working days
            * Example Requests:  workingdays
            * @return Call&lt;List&lt;GetWorkingDaysResponse&gt;&gt;
            */
            @GET("workingdays")
        Call<List<GetWorkingDaysResponse>> retrieveAll17(@HeaderMap Map<String, String> headers);
        

            /**
            * Working Days Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
            * @return Call&lt;GetWorkingDaysTemplateResponse&gt;
            */
            @GET("workingdays/template")
        Call<GetWorkingDaysTemplateResponse> template4(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Working Day
            * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
                * @param putWorkingDaysRequest  (required)
            * @return Call&lt;PutWorkingDaysResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("workingdays")
        Call<PutWorkingDaysResponse> update8(
        @retrofit2.http.Body PutWorkingDaysRequest putWorkingDaysRequest
                , @HeaderMap Map<String, String> headers);

        }
