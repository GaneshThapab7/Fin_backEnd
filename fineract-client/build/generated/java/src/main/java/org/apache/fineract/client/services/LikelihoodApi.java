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

    public interface LikelihoodApi {
        /**
        * 
        * 
            * @param likelihoodId  (required)
            * @param ppiName  (required)
        * @return Call&lt;String&gt;
        */
        @GET("likelihood/{ppiName}/{likelihoodId}")
        Call<String> retrieve(
        @retrofit2.http.Path("likelihoodId") Long likelihoodId, @retrofit2.http.Path("ppiName") String ppiName
                );

        /**
        * 
        * 
            * @param ppiName  (required)
        * @return Call&lt;String&gt;
        */
        @GET("likelihood/{ppiName}")
        Call<String> retrieveAll11(
        @retrofit2.http.Path("ppiName") String ppiName
                );

        /**
        * 
        * 
            * @param likelihoodId  (required)
            * @param ppiName  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("likelihood/{ppiName}/{likelihoodId}")
        Call<String> update4(
        @retrofit2.http.Path("likelihoodId") Long likelihoodId, @retrofit2.http.Path("ppiName") String ppiName, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param likelihoodId  (required)
                * @param ppiName  (required)
            * @return Call&lt;String&gt;
            */
            @GET("likelihood/{ppiName}/{likelihoodId}")
        Call<String> retrieve(
        @retrofit2.http.Path("likelihoodId") Long likelihoodId, @retrofit2.http.Path("ppiName") String ppiName
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param ppiName  (required)
            * @return Call&lt;String&gt;
            */
            @GET("likelihood/{ppiName}")
        Call<String> retrieveAll11(
        @retrofit2.http.Path("ppiName") String ppiName
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param likelihoodId  (required)
                * @param ppiName  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("likelihood/{ppiName}/{likelihoodId}")
        Call<String> update4(
        @retrofit2.http.Path("likelihoodId") Long likelihoodId, @retrofit2.http.Path("ppiName") String ppiName, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
