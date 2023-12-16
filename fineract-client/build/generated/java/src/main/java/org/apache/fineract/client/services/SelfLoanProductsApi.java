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

    public interface SelfLoanProductsApi {
        /**
        * 
        * 
            * @param clientId  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("self/loanproducts")
        Call<String> retrieveAllLoanProducts1(
        @retrofit2.http.Query("clientId") Long clientId
                );

        /**
        * 
        * 
            * @param productId  (required)
            * @param clientId  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("self/loanproducts/{productId}")
        Call<String> retrieveLoanProductDetails1(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("clientId") Long clientId
                );


            /**
            * 
            * 
                * @param clientId  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("self/loanproducts")
        Call<String> retrieveAllLoanProducts1(
        @retrofit2.http.Query("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param productId  (required)
                * @param clientId  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("self/loanproducts/{productId}")
        Call<String> retrieveLoanProductDetails1(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

        }
