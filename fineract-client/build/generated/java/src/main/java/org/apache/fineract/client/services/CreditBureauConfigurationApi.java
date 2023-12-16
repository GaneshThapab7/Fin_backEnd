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

    public interface CreditBureauConfigurationApi {
        /**
        * 
        * 
            * @param organisationCreditBureauId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId}")
        Call<String> addOrganisationCreditBureau(
        @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param creditBureauId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("CreditBureauConfiguration/configuration/{creditBureauId}")
        Call<String> createCreditBureauConfiguration(
        @retrofit2.http.Path("creditBureauId") Long creditBureauId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param organisationCreditBureauId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("CreditBureauConfiguration/mappings/{organisationCreditBureauId}")
        Call<String> createCreditBureauLoanProductMapping(
        @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("CreditBureauConfiguration/loanProduct")
        Call<String> fetchLoanProducts();
        

        /**
        * 
        * 
            * @param loanProductId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("CreditBureauConfiguration/loanProduct/{loanProductId}")
        Call<String> fetchMappingByLoanProductId(
        @retrofit2.http.Path("loanProductId") Long loanProductId
                );

        /**
        * 
        * 
            * @param organisationCreditBureauId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("CreditBureauConfiguration/config/{organisationCreditBureauId}")
        Call<String> getConfiguration(
        @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("CreditBureauConfiguration")
        Call<String> getCreditBureau();
        

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("CreditBureauConfiguration/mappings")
        Call<String> getCreditBureauLoanProductMapping();
        

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("CreditBureauConfiguration/organisationCreditBureau")
        Call<String> getOrganisationCreditBureau();
        

        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("CreditBureauConfiguration/organisationCreditBureau")
        Call<String> updateCreditBureau(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param configurationId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("CreditBureauConfiguration/configuration/{configurationId}")
        Call<String> updateCreditBureauConfiguration(
        @retrofit2.http.Path("configurationId") Long configurationId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("CreditBureauConfiguration/mappings")
        Call<String> updateCreditBureauLoanProductMapping(
        @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param organisationCreditBureauId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId}")
        Call<String> addOrganisationCreditBureau(
        @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param creditBureauId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("CreditBureauConfiguration/configuration/{creditBureauId}")
        Call<String> createCreditBureauConfiguration(
        @retrofit2.http.Path("creditBureauId") Long creditBureauId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param organisationCreditBureauId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("CreditBureauConfiguration/mappings/{organisationCreditBureauId}")
        Call<String> createCreditBureauLoanProductMapping(
        @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("CreditBureauConfiguration/loanProduct")
        Call<String> fetchLoanProducts(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param loanProductId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("CreditBureauConfiguration/loanProduct/{loanProductId}")
        Call<String> fetchMappingByLoanProductId(
        @retrofit2.http.Path("loanProductId") Long loanProductId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param organisationCreditBureauId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("CreditBureauConfiguration/config/{organisationCreditBureauId}")
        Call<String> getConfiguration(
        @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("CreditBureauConfiguration")
        Call<String> getCreditBureau(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("CreditBureauConfiguration/mappings")
        Call<String> getCreditBureauLoanProductMapping(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("CreditBureauConfiguration/organisationCreditBureau")
        Call<String> getOrganisationCreditBureau(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("CreditBureauConfiguration/organisationCreditBureau")
        Call<String> updateCreditBureau(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param configurationId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("CreditBureauConfiguration/configuration/{configurationId}")
        Call<String> updateCreditBureauConfiguration(
        @retrofit2.http.Path("configurationId") Long configurationId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("CreditBureauConfiguration/mappings")
        Call<String> updateCreditBureauLoanProductMapping(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
