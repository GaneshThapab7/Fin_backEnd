package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetAccountTransferTemplateResponse;
import org.apache.fineract.client.models.PostNewTransferResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SelfAccountTransferApi {
        /**
        * Create new Transfer
        * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 
            * @param type  (optional, default to )
            * @param body  (optional)
        * @return Call&lt;List&lt;PostNewTransferResponse&gt;&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("self/accounttransfers")
        Call<List<PostNewTransferResponse>> create14(
        @retrofit2.http.Query("type") String type, @retrofit2.http.Body String body
                );

        /**
        * Retrieve Account Transfer Template
        * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 
            * @param type  (optional, default to )
        * @return Call&lt;List&lt;GetAccountTransferTemplateResponse&gt;&gt;
        */
        @GET("self/accounttransfers/template")
        Call<List<GetAccountTransferTemplateResponse>> template15(
        @retrofit2.http.Query("type") String type
                );


            /**
            * Create new Transfer
            * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 
                * @param type  (optional, default to )
                * @param body  (optional)
            * @return Call&lt;List&lt;PostNewTransferResponse&gt;&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("self/accounttransfers")
        Call<List<PostNewTransferResponse>> create14(
        @retrofit2.http.Query("type") String type, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Account Transfer Template
            * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 
                * @param type  (optional, default to )
            * @return Call&lt;List&lt;GetAccountTransferTemplateResponse&gt;&gt;
            */
            @GET("self/accounttransfers/template")
        Call<List<GetAccountTransferTemplateResponse>> template15(
        @retrofit2.http.Query("type") String type
                , @HeaderMap Map<String, String> headers);

        }
