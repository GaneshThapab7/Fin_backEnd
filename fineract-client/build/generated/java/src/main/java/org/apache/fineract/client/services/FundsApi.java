package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetFundsResponse;
import org.apache.fineract.client.models.PostFundsRequest;
import org.apache.fineract.client.models.PostFundsResponse;
import org.apache.fineract.client.models.PutFundsFundIdRequest;
import org.apache.fineract.client.models.PutFundsFundIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface FundsApi {
        /**
        * Create a Fund
        * Creates a Fund
            * @param postFundsRequest  (required)
        * @return Call&lt;PostFundsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("funds")
        Call<PostFundsResponse> createFund(
        @retrofit2.http.Body PostFundsRequest postFundsRequest
                );

        /**
        * Retrieve a Fund
        * Returns the details of a Fund.  Example Requests:  funds/1
            * @param fundId fundId (required)
        * @return Call&lt;GetFundsResponse&gt;
        */
        @GET("funds/{fundId}")
        Call<GetFundsResponse> retreiveFund(
        @retrofit2.http.Path("fundId") Long fundId
                );

        /**
        * Retrieve Funds
        * Returns the list of funds.  Example Requests:  funds
        * @return Call&lt;List&lt;GetFundsResponse&gt;&gt;
        */
        @GET("funds")
        Call<List<GetFundsResponse>> retrieveFunds();
        

        /**
        * Update a Fund
        * Updates the details of a fund.
            * @param fundId fundId (required)
            * @param putFundsFundIdRequest  (required)
        * @return Call&lt;PutFundsFundIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("funds/{fundId}")
        Call<PutFundsFundIdResponse> updateFund(
        @retrofit2.http.Path("fundId") Long fundId, @retrofit2.http.Body PutFundsFundIdRequest putFundsFundIdRequest
                );


            /**
            * Create a Fund
            * Creates a Fund
                * @param postFundsRequest  (required)
            * @return Call&lt;PostFundsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("funds")
        Call<PostFundsResponse> createFund(
        @retrofit2.http.Body PostFundsRequest postFundsRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Fund
            * Returns the details of a Fund.  Example Requests:  funds/1
                * @param fundId fundId (required)
            * @return Call&lt;GetFundsResponse&gt;
            */
            @GET("funds/{fundId}")
        Call<GetFundsResponse> retreiveFund(
        @retrofit2.http.Path("fundId") Long fundId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Funds
            * Returns the list of funds.  Example Requests:  funds
            * @return Call&lt;List&lt;GetFundsResponse&gt;&gt;
            */
            @GET("funds")
        Call<List<GetFundsResponse>> retrieveFunds(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Fund
            * Updates the details of a fund.
                * @param fundId fundId (required)
                * @param putFundsFundIdRequest  (required)
            * @return Call&lt;PutFundsFundIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("funds/{fundId}")
        Call<PutFundsFundIdResponse> updateFund(
        @retrofit2.http.Path("fundId") Long fundId, @retrofit2.http.Body PutFundsFundIdRequest putFundsFundIdRequest
                , @HeaderMap Map<String, String> headers);

        }
