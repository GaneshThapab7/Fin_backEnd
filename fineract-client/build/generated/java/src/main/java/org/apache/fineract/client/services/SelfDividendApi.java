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

    public interface SelfDividendApi {
        /**
        * 
        * 
            * @param productId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("shareproduct/{productId}/dividend")
        Call<String> createDividendDetail(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param productId  (required)
            * @param dividendId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("shareproduct/{productId}/dividend/{dividendId}")
        Call<String> deleteDividendDetail(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("dividendId") Long dividendId
                );

        /**
        * 
        * 
            * @param productId  (required)
            * @param offset  (optional)
            * @param limit  (optional)
            * @param orderBy  (optional)
            * @param sortOrder  (optional)
            * @param status  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("shareproduct/{productId}/dividend")
        Call<String> retrieveAll39(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("status") Integer status
                );

        /**
        * 
        * 
            * @param dividendId  (required)
            * @param productId  (required)
            * @param offset  (optional)
            * @param limit  (optional)
            * @param orderBy  (optional)
            * @param sortOrder  (optional)
            * @param accountNo  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("shareproduct/{productId}/dividend/{dividendId}")
        Call<String> retrieveDividendDetails(
        @retrofit2.http.Path("dividendId") Long dividendId, @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("accountNo") String accountNo
                );

        /**
        * 
        * 
            * @param productId  (required)
            * @param dividendId  (required)
            * @param command  (optional)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("shareproduct/{productId}/dividend/{dividendId}")
        Call<String> updateDividendDetail(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("dividendId") Long dividendId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param productId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("shareproduct/{productId}/dividend")
        Call<String> createDividendDetail(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param productId  (required)
                * @param dividendId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("shareproduct/{productId}/dividend/{dividendId}")
        Call<String> deleteDividendDetail(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("dividendId") Long dividendId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param productId  (required)
                * @param offset  (optional)
                * @param limit  (optional)
                * @param orderBy  (optional)
                * @param sortOrder  (optional)
                * @param status  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("shareproduct/{productId}/dividend")
        Call<String> retrieveAll39(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("status") Integer status
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param dividendId  (required)
                * @param productId  (required)
                * @param offset  (optional)
                * @param limit  (optional)
                * @param orderBy  (optional)
                * @param sortOrder  (optional)
                * @param accountNo  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("shareproduct/{productId}/dividend/{dividendId}")
        Call<String> retrieveDividendDetails(
        @retrofit2.http.Path("dividendId") Long dividendId, @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("accountNo") String accountNo
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param productId  (required)
                * @param dividendId  (required)
                * @param command  (optional)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("shareproduct/{productId}/dividend/{dividendId}")
        Call<String> updateDividendDetail(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("dividendId") Long dividendId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
