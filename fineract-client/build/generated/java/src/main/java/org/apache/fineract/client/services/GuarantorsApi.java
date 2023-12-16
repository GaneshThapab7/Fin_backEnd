package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.io.File;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface GuarantorsApi {
        /**
        * 
        * 
            * @param loanId  (required)
            * @param clientId  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("loans/{loanId}/guarantors/accounts/template")
        Call<String> accountsTemplate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("clientId") Long clientId
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("loans/{loanId}/guarantors")
        Call<String> createGuarantor(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param guarantorId  (required)
            * @param guarantorFundingId  (optional)
        * @return Call&lt;String&gt;
        */
        @DELETE("loans/{loanId}/guarantors/{guarantorId}")
        Call<String> deleteGuarantor(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId, @retrofit2.http.Query("guarantorFundingId") Long guarantorFundingId
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param officeId  (optional)
            * @param dateFormat  (optional)
        * @return Call&lt;Void&gt;
        */
        @GET("loans/{loanId}/guarantors/downloadtemplate")
        Call<Void> getGuarantorTemplate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
                );

        /**
        * 
        * 
            * @param loanId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("loans/{loanId}/guarantors/template")
        Call<String> newGuarantorTemplate(
        @retrofit2.http.Path("loanId") Long loanId
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param dateFormat  (optional)
            * @param locale  (optional)
            * @param uploadedInputStream  (optional)
        * @return Call&lt;String&gt;
        */
                @retrofit2.http.Multipart
        @POST("loans/{loanId}/guarantors/uploadtemplate")
        Call<String> postGuarantorTemplate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                );

        /**
        * 
        * 
            * @param loanId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("loans/{loanId}/guarantors")
        Call<String> retrieveGuarantorDetails(
        @retrofit2.http.Path("loanId") Long loanId
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param guarantorId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("loans/{loanId}/guarantors/{guarantorId}")
        Call<String> retrieveGuarantorDetails1(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param guarantorId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("loans/{loanId}/guarantors/{guarantorId}")
        Call<String> updateGuarantor(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param loanId  (required)
                * @param clientId  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("loans/{loanId}/guarantors/accounts/template")
        Call<String> accountsTemplate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("loans/{loanId}/guarantors")
        Call<String> createGuarantor(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param guarantorId  (required)
                * @param guarantorFundingId  (optional)
            * @return Call&lt;String&gt;
            */
            @DELETE("loans/{loanId}/guarantors/{guarantorId}")
        Call<String> deleteGuarantor(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId, @retrofit2.http.Query("guarantorFundingId") Long guarantorFundingId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param officeId  (optional)
                * @param dateFormat  (optional)
            * @return Call&lt;Void&gt;
            */
            @GET("loans/{loanId}/guarantors/downloadtemplate")
        Call<Void> getGuarantorTemplate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("loans/{loanId}/guarantors/template")
        Call<String> newGuarantorTemplate(
        @retrofit2.http.Path("loanId") Long loanId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param dateFormat  (optional)
                * @param locale  (optional)
                * @param uploadedInputStream  (optional)
            * @return Call&lt;String&gt;
            */
                @retrofit2.http.Multipart
            @POST("loans/{loanId}/guarantors/uploadtemplate")
        Call<String> postGuarantorTemplate(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("loans/{loanId}/guarantors")
        Call<String> retrieveGuarantorDetails(
        @retrofit2.http.Path("loanId") Long loanId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param guarantorId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("loans/{loanId}/guarantors/{guarantorId}")
        Call<String> retrieveGuarantorDetails1(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param guarantorId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("loans/{loanId}/guarantors/{guarantorId}")
        Call<String> updateGuarantor(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
