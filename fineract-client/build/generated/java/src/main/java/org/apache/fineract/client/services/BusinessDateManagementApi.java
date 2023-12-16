package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.BusinessDateRequest;
import org.apache.fineract.client.models.BusinessDateResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface BusinessDateManagementApi {
        /**
        * Retrieve a specific Business date
        * 
            * @param type type (required)
        * @return Call&lt;BusinessDateResponse&gt;
        */
        @GET("businessdate/{type}")
        Call<BusinessDateResponse> getBusinessDate(
        @retrofit2.http.Path("type") String type
                );

        /**
        * List all business dates
        * 
        * @return Call&lt;List&lt;BusinessDateResponse&gt;&gt;
        */
        @GET("businessdate")
        Call<List<BusinessDateResponse>> getBusinessDates();
        

        /**
        * Update Business Date
        * 
            * @param businessDateRequest  (required)
        * @return Call&lt;BusinessDateRequest&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("businessdate")
        Call<BusinessDateRequest> updateBusinessDate(
        @retrofit2.http.Body BusinessDateRequest businessDateRequest
                );


            /**
            * Retrieve a specific Business date
            * 
                * @param type type (required)
            * @return Call&lt;BusinessDateResponse&gt;
            */
            @GET("businessdate/{type}")
        Call<BusinessDateResponse> getBusinessDate(
        @retrofit2.http.Path("type") String type
                , @HeaderMap Map<String, String> headers);

            /**
            * List all business dates
            * 
            * @return Call&lt;List&lt;BusinessDateResponse&gt;&gt;
            */
            @GET("businessdate")
        Call<List<BusinessDateResponse>> getBusinessDates(@HeaderMap Map<String, String> headers);
        

            /**
            * Update Business Date
            * 
                * @param businessDateRequest  (required)
            * @return Call&lt;BusinessDateRequest&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("businessdate")
        Call<BusinessDateRequest> updateBusinessDate(
        @retrofit2.http.Body BusinessDateRequest businessDateRequest
                , @HeaderMap Map<String, String> headers);

        }
