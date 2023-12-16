package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeletePaymentTypesPaymentTypeIdResponse;
import org.apache.fineract.client.models.GetPaymentTypesPaymentTypeIdResponse;
import org.apache.fineract.client.models.GetPaymentTypesResponse;
import org.apache.fineract.client.models.PostPaymentTypesRequest;
import org.apache.fineract.client.models.PostPaymentTypesResponse;
import org.apache.fineract.client.models.PutPaymentTypesPaymentTypeIdRequest;
import org.apache.fineract.client.models.PutPaymentTypesPaymentTypeIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface PaymentTypeApi {
        /**
        * Create a Payment Type
        * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
            * @param postPaymentTypesRequest  (required)
        * @return Call&lt;PostPaymentTypesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("paymenttypes")
        Call<PostPaymentTypesResponse> createPaymentType(
        @retrofit2.http.Body PostPaymentTypesRequest postPaymentTypesRequest
                );

        /**
        * Delete a Payment Type
        * Deletes payment type
            * @param paymentTypeId paymentTypeId (required)
        * @return Call&lt;DeletePaymentTypesPaymentTypeIdResponse&gt;
        */
        @DELETE("paymenttypes/{paymentTypeId}")
        Call<DeletePaymentTypesPaymentTypeIdResponse> deleteCode1(
        @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
                );

        /**
        * Retrieve all Payment Types
        * Retrieve list of payment types
        * @return Call&lt;List&lt;GetPaymentTypesResponse&gt;&gt;
        */
        @GET("paymenttypes")
        Call<List<GetPaymentTypesResponse>> getAllPaymentTypes();
        

        /**
        * Retrieve a Payment Type
        * Retrieves a payment type
            * @param paymentTypeId paymentTypeId (required)
        * @return Call&lt;GetPaymentTypesPaymentTypeIdResponse&gt;
        */
        @GET("paymenttypes/{paymentTypeId}")
        Call<GetPaymentTypesPaymentTypeIdResponse> retrieveOnePaymentType(
        @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
                );

        /**
        * Update a Payment Type
        * Updates a Payment Type
            * @param paymentTypeId paymentTypeId (required)
            * @param putPaymentTypesPaymentTypeIdRequest  (required)
        * @return Call&lt;PutPaymentTypesPaymentTypeIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("paymenttypes/{paymentTypeId}")
        Call<PutPaymentTypesPaymentTypeIdResponse> updatePaymentType(
        @retrofit2.http.Path("paymentTypeId") Long paymentTypeId, @retrofit2.http.Body PutPaymentTypesPaymentTypeIdRequest putPaymentTypesPaymentTypeIdRequest
                );


            /**
            * Create a Payment Type
            * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
                * @param postPaymentTypesRequest  (required)
            * @return Call&lt;PostPaymentTypesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("paymenttypes")
        Call<PostPaymentTypesResponse> createPaymentType(
        @retrofit2.http.Body PostPaymentTypesRequest postPaymentTypesRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Payment Type
            * Deletes payment type
                * @param paymentTypeId paymentTypeId (required)
            * @return Call&lt;DeletePaymentTypesPaymentTypeIdResponse&gt;
            */
            @DELETE("paymenttypes/{paymentTypeId}")
        Call<DeletePaymentTypesPaymentTypeIdResponse> deleteCode1(
        @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve all Payment Types
            * Retrieve list of payment types
            * @return Call&lt;List&lt;GetPaymentTypesResponse&gt;&gt;
            */
            @GET("paymenttypes")
        Call<List<GetPaymentTypesResponse>> getAllPaymentTypes(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve a Payment Type
            * Retrieves a payment type
                * @param paymentTypeId paymentTypeId (required)
            * @return Call&lt;GetPaymentTypesPaymentTypeIdResponse&gt;
            */
            @GET("paymenttypes/{paymentTypeId}")
        Call<GetPaymentTypesPaymentTypeIdResponse> retrieveOnePaymentType(
        @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update a Payment Type
            * Updates a Payment Type
                * @param paymentTypeId paymentTypeId (required)
                * @param putPaymentTypesPaymentTypeIdRequest  (required)
            * @return Call&lt;PutPaymentTypesPaymentTypeIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("paymenttypes/{paymentTypeId}")
        Call<PutPaymentTypesPaymentTypeIdResponse> updatePaymentType(
        @retrofit2.http.Path("paymentTypeId") Long paymentTypeId, @retrofit2.http.Body PutPaymentTypesPaymentTypeIdRequest putPaymentTypesPaymentTypeIdRequest
                , @HeaderMap Map<String, String> headers);

        }
