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

    public interface CashiersApi {
        /**
        * 
        * 
            * @param officeId  (optional)
            * @param tellerId  (optional)
            * @param staffId  (optional)
            * @param date  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("cashiers")
        Call<String> getCashierData(
        @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("tellerId") Long tellerId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("date") String date
                );


            /**
            * 
            * 
                * @param officeId  (optional)
                * @param tellerId  (optional)
                * @param staffId  (optional)
                * @param date  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("cashiers")
        Call<String> getCashierData(
        @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("tellerId") Long tellerId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("date") String date
                , @HeaderMap Map<String, String> headers);

        }
