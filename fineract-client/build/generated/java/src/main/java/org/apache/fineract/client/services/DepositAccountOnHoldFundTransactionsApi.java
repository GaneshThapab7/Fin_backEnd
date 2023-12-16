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

    public interface DepositAccountOnHoldFundTransactionsApi {
        /**
        * 
        * 
            * @param savingsId  (required)
            * @param guarantorFundingId  (optional)
            * @param offset  (optional)
            * @param limit  (optional)
            * @param orderBy  (optional)
            * @param sortOrder  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("savingsaccounts/{savingsId}/onholdtransactions")
        Call<String> retrieveAll28(
        @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Query("guarantorFundingId") Long guarantorFundingId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                );


            /**
            * 
            * 
                * @param savingsId  (required)
                * @param guarantorFundingId  (optional)
                * @param offset  (optional)
                * @param limit  (optional)
                * @param orderBy  (optional)
                * @param sortOrder  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("savingsaccounts/{savingsId}/onholdtransactions")
        Call<String> retrieveAll28(
        @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Query("guarantorFundingId") Long guarantorFundingId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                , @HeaderMap Map<String, String> headers);

        }
