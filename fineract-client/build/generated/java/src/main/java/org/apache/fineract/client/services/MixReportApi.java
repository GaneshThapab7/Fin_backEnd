package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.time.OffsetDateTime;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface MixReportApi {
        /**
        * 
        * 
            * @param startDate  (optional)
            * @param endDate  (optional)
            * @param currency  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("mixreport")
        Call<String> retrieveXBRLReport(
        @retrofit2.http.Query("startDate") OffsetDateTime startDate, @retrofit2.http.Query("endDate") OffsetDateTime endDate, @retrofit2.http.Query("currency") String currency
                );


            /**
            * 
            * 
                * @param startDate  (optional)
                * @param endDate  (optional)
                * @param currency  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("mixreport")
        Call<String> retrieveXBRLReport(
        @retrofit2.http.Query("startDate") OffsetDateTime startDate, @retrofit2.http.Query("endDate") OffsetDateTime endDate, @retrofit2.http.Query("currency") String currency
                , @HeaderMap Map<String, String> headers);

        }
