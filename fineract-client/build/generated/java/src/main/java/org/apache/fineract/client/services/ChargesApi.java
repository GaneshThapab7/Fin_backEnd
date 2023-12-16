package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteChargesChargeIdResponse;
import org.apache.fineract.client.models.GetChargesResponse;
import org.apache.fineract.client.models.GetChargesTemplateResponse;
import org.apache.fineract.client.models.PostChargesRequest;
import org.apache.fineract.client.models.PostChargesResponse;
import org.apache.fineract.client.models.PutChargesChargeIdRequest;
import org.apache.fineract.client.models.PutChargesChargeIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface ChargesApi {
        /**
        * Create/Define a Charge
        * Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.
            * @param postChargesRequest  (required)
        * @return Call&lt;PostChargesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("charges")
        Call<PostChargesResponse> createCharge(
        @retrofit2.http.Body PostChargesRequest postChargesRequest
                );

        /**
        * Delete a Charge
        * Deletes a Charge.
            * @param chargeId chargeId (required)
        * @return Call&lt;DeleteChargesChargeIdResponse&gt;
        */
        @DELETE("charges/{chargeId}")
        Call<DeleteChargesChargeIdResponse> deleteCharge(
        @retrofit2.http.Path("chargeId") Long chargeId
                );

        /**
        * Retrieve Charges
        * Returns the list of defined charges.  Example Requests:  charges
        * @return Call&lt;List&lt;GetChargesResponse&gt;&gt;
        */
        @GET("charges")
        Call<List<GetChargesResponse>> retrieveAllCharges();
        

        /**
        * Retrieve a Charge
        * Returns the details of a defined Charge.  Example Requests:  charges/1
            * @param chargeId chargeId (required)
        * @return Call&lt;GetChargesResponse&gt;
        */
        @GET("charges/{chargeId}")
        Call<GetChargesResponse> retrieveCharge(
        @retrofit2.http.Path("chargeId") Long chargeId
                );

        /**
        * Retrieve Charge Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  charges/template 
        * @return Call&lt;GetChargesTemplateResponse&gt;
        */
        @GET("charges/template")
        Call<GetChargesTemplateResponse> retrieveNewChargeDetails();
        

        /**
        * Update a Charge
        * Updates the details of a Charge.
            * @param chargeId chargeId (required)
            * @param putChargesChargeIdRequest  (required)
        * @return Call&lt;PutChargesChargeIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("charges/{chargeId}")
        Call<PutChargesChargeIdResponse> updateCharge(
        @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PutChargesChargeIdRequest putChargesChargeIdRequest
                );


            /**
            * Create/Define a Charge
            * Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.
                * @param postChargesRequest  (required)
            * @return Call&lt;PostChargesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("charges")
        Call<PostChargesResponse> createCharge(
        @retrofit2.http.Body PostChargesRequest postChargesRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Charge
            * Deletes a Charge.
                * @param chargeId chargeId (required)
            * @return Call&lt;DeleteChargesChargeIdResponse&gt;
            */
            @DELETE("charges/{chargeId}")
        Call<DeleteChargesChargeIdResponse> deleteCharge(
        @retrofit2.http.Path("chargeId") Long chargeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Charges
            * Returns the list of defined charges.  Example Requests:  charges
            * @return Call&lt;List&lt;GetChargesResponse&gt;&gt;
            */
            @GET("charges")
        Call<List<GetChargesResponse>> retrieveAllCharges(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve a Charge
            * Returns the details of a defined Charge.  Example Requests:  charges/1
                * @param chargeId chargeId (required)
            * @return Call&lt;GetChargesResponse&gt;
            */
            @GET("charges/{chargeId}")
        Call<GetChargesResponse> retrieveCharge(
        @retrofit2.http.Path("chargeId") Long chargeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Charge Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  charges/template 
            * @return Call&lt;GetChargesTemplateResponse&gt;
            */
            @GET("charges/template")
        Call<GetChargesTemplateResponse> retrieveNewChargeDetails(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Charge
            * Updates the details of a Charge.
                * @param chargeId chargeId (required)
                * @param putChargesChargeIdRequest  (required)
            * @return Call&lt;PutChargesChargeIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("charges/{chargeId}")
        Call<PutChargesChargeIdResponse> updateCharge(
        @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PutChargesChargeIdRequest putChargesChargeIdRequest
                , @HeaderMap Map<String, String> headers);

        }
