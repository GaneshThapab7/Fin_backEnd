package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetCachesResponse;
import org.apache.fineract.client.models.PutCachesRequest;
import org.apache.fineract.client.models.PutCachesResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface CacheApi {
        /**
        * Retrieve Cache Types
        * Returns the list of caches.  Example Requests:  caches
        * @return Call&lt;List&lt;GetCachesResponse&gt;&gt;
        */
        @GET("caches")
        Call<List<GetCachesResponse>> retrieveAll4();
        

        /**
        * Switch Cache
        * Switches the cache to chosen one.
            * @param putCachesRequest  (required)
        * @return Call&lt;PutCachesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("caches")
        Call<PutCachesResponse> switchCache(
        @retrofit2.http.Body PutCachesRequest putCachesRequest
                );


            /**
            * Retrieve Cache Types
            * Returns the list of caches.  Example Requests:  caches
            * @return Call&lt;List&lt;GetCachesResponse&gt;&gt;
            */
            @GET("caches")
        Call<List<GetCachesResponse>> retrieveAll4(@HeaderMap Map<String, String> headers);
        

            /**
            * Switch Cache
            * Switches the cache to chosen one.
                * @param putCachesRequest  (required)
            * @return Call&lt;PutCachesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("caches")
        Call<PutCachesResponse> switchCache(
        @retrofit2.http.Body PutCachesRequest putCachesRequest
                , @HeaderMap Map<String, String> headers);

        }
