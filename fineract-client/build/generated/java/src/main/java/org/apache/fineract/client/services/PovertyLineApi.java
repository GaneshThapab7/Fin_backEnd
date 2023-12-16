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

    public interface PovertyLineApi {
        /**
        * 
        * 
            * @param ppiName  (required)
        * @return Call&lt;String&gt;
        */
        @GET("povertyLine/{ppiName}")
        Call<String> retrieveAll12(
        @retrofit2.http.Path("ppiName") String ppiName
                );

        /**
        * 
        * 
            * @param ppiName  (required)
            * @param likelihoodId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("povertyLine/{ppiName}/{likelihoodId}")
        Call<String> retrieveAll13(
        @retrofit2.http.Path("ppiName") String ppiName, @retrofit2.http.Path("likelihoodId") Long likelihoodId
                );


            /**
            * 
            * 
                * @param ppiName  (required)
            * @return Call&lt;String&gt;
            */
            @GET("povertyLine/{ppiName}")
        Call<String> retrieveAll12(
        @retrofit2.http.Path("ppiName") String ppiName
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param ppiName  (required)
                * @param likelihoodId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("povertyLine/{ppiName}/{likelihoodId}")
        Call<String> retrieveAll13(
        @retrofit2.http.Path("ppiName") String ppiName, @retrofit2.http.Path("likelihoodId") Long likelihoodId
                , @HeaderMap Map<String, String> headers);

        }
