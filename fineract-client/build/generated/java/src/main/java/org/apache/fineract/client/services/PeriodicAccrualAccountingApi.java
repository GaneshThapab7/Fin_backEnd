package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.PostRunaccrualsRequest;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface PeriodicAccrualAccountingApi {
        /**
        * Executes Periodic Accrual Accounting
        * Mandatory Fields  tillDate 
            * @param postRunaccrualsRequest  (required)
        * @return Call&lt;Void&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("runaccruals")
        Call<Void> executePeriodicAccrualAccounting(
        @retrofit2.http.Body PostRunaccrualsRequest postRunaccrualsRequest
                );


            /**
            * Executes Periodic Accrual Accounting
            * Mandatory Fields  tillDate 
                * @param postRunaccrualsRequest  (required)
            * @return Call&lt;Void&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("runaccruals")
        Call<Void> executePeriodicAccrualAccounting(
        @retrofit2.http.Body PostRunaccrualsRequest postRunaccrualsRequest
                , @HeaderMap Map<String, String> headers);

        }
