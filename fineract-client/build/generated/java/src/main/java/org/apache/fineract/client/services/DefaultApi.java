package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.CommandProcessingResult;
import org.apache.fineract.client.models.CommandWrapper;
import java.io.File;
import org.apache.fineract.client.models.SmsCampaignData;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface DefaultApi {
        /**
        * 
        * 
            * @param resourceId  (required)
            * @param command  (optional)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("email/campaign/{resourceId}")
        Call<String> activate(
        @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param creditBureauId creditBureauId (optional)
            * @param dateFormat  (optional)
            * @param locale  (optional)
            * @param uploadedInputStream  (optional)
        * @return Call&lt;String&gt;
        */
                @retrofit2.http.Multipart
        @POST("creditBureauIntegration/addCreditReport")
        Call<String> addCreditReport(
        @retrofit2.http.Query("creditBureauId") Long creditBureauId, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                );

        /**
        * 
        * 
            * @param entity  (required)
            * @param entityId  (required)
            * @param contentLength  (optional)
            * @param dateFormat  (optional)
            * @param locale  (optional)
            * @param uploadedInputStream  (optional)
        * @return Call&lt;String&gt;
        */
                @retrofit2.http.Multipart
        @POST("{entity}/{entityId}/images")
        Call<String> addNewClientImage1(
        @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
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
        @POST("email")
        Call<String> create1(
        @retrofit2.http.Body String body
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
        @POST("email/campaign")
        Call<String> createCampaign(
        @retrofit2.http.Body String body
                );

        /**
        * Create a SMS Campaign
        * Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format
            * @param commandWrapper  (required)
        * @return Call&lt;CommandProcessingResult&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("smscampaigns")
        Call<CommandProcessingResult> createCampaign1(
        @retrofit2.http.Body CommandWrapper commandWrapper
                );

        /**
        * 
        * 
            * @param resourceId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("email/{resourceId}")
        Call<String> delete1(
        @retrofit2.http.Path("resourceId") Long resourceId
                );

        /**
        * 
        * 
            * @param resourceId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("email/campaign/{resourceId}")
        Call<String> delete2(
        @retrofit2.http.Path("resourceId") Long resourceId
                );

        /**
        * Delete a SMS Campaign
        * Note: Only closed SMS Campaigns can be deleted
            * @param campaignId  (required)
        * @return Call&lt;CommandProcessingResult&gt;
        */
        @DELETE("smscampaigns/{campaignId}")
        Call<CommandProcessingResult> delete3(
        @retrofit2.http.Path("campaignId") Long campaignId
                );

        /**
        * 
        * 
            * @param transactionId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("officetransactions/{transactionId}")
        Call<String> delete8(
        @retrofit2.http.Path("transactionId") Long transactionId
                );

        /**
        * 
        * 
            * @param entity  (required)
            * @param entityId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("{entity}/{entityId}/images")
        Call<String> deleteClientImage(
        @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId
                );

        /**
        * 
        * 
            * @param creditBureauId creditBureauId (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("creditBureauIntegration/deleteCreditReport/{creditBureauId}")
        Call<String> deleteCreditReport(
        @retrofit2.http.Path("creditBureauId") Long creditBureauId
                );

        /**
        * 
        * 
            * @param requestBody  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("creditBureauIntegration/creditReport")
        Call<String> fetchCreditReport(
        @retrofit2.http.Body Map<String, Object> requestBody
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("echo")
        Call<String> get();
        

        /**
        * 
        * 
            * @param clientId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("internal/client/{clientId}/audit")
        Call<String> getClientAuditFields(
        @retrofit2.http.Path("clientId") Long clientId
                );

        /**
        * 
        * 
            * @param path  (required)
        * @return Call&lt;Void&gt;
        */
        @GET("application.wadl/{path}")
        Call<Void> getExternalGrammar(
        @retrofit2.http.Path("path") String path
                );

        /**
        * 
        * 
            * @param loanId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("internal/loan/{loanId}/audit")
        Call<String> getLoanAuditFields(
        @retrofit2.http.Path("loanId") Long loanId
                );

        /**
        * 
        * 
            * @param loanId  (required)
            * @param transactionId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("internal/loan/{loanId}/transaction/{transactionId}/audit")
        Call<String> getLoanTransactionAuditFields(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId
                );

        /**
        * 
        * 
            * @param creditBureauId creditBureauId (required)
        * @return Call&lt;String&gt;
        */
        @GET("creditBureauIntegration/creditReport/{creditBureauId}")
        Call<String> getSavedCreditReport(
        @retrofit2.http.Path("creditBureauId") Long creditBureauId
                );

        /**
        * 
        * 
        * @return Call&lt;Void&gt;
        */
        @GET("application.wadl")
        Call<Void> getWadl();
        

        /**
        * SMS Campaign
        * Activates | Deactivates | Reactivates
            * @param campaignId  (required)
            * @param command  (optional)
        * @return Call&lt;CommandProcessingResult&gt;
        */
        @POST("smscampaigns/{campaignId}")
        Call<CommandProcessingResult> handleCommands(
        @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Query("command") String command
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("officetransactions/template")
        Call<String> newOfficeTransactionDetails();
        

        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("email/campaign/preview")
        Call<String> preview(
        @retrofit2.http.Body String body
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
        @POST("smscampaigns/preview")
        Call<String> preview1(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("email/configuration")
        Call<String> retrieveAll5();
        

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("twofactor/configure")
        Call<String> retrieveAll9();
        

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("email/campaign")
        Call<String> retrieveAllCampaign();
        

        /**
        * 
        * 
            * @param sqlSearch  (optional)
            * @param offset  (optional)
            * @param limit  (optional)
            * @param status  (optional)
            * @param orderBy  (optional)
            * @param sortOrder  (optional)
            * @param fromDate  (optional)
            * @param toDate  (optional)
            * @param locale  (optional)
            * @param dateFormat  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("email/messageByStatus")
        Call<String> retrieveAllEmailByStatus(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("status") Integer status, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("fromDate") Object fromDate, @retrofit2.http.Query("toDate") Object toDate, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("email")
        Call<String> retrieveAllEmails();
        

        /**
        * List SMS Campaigns
        * Example Requests:  smscampaigns
            * @param sqlSearch  (optional)
            * @param offset  (optional)
            * @param limit  (optional)
            * @param orderBy  (optional)
            * @param sortOrder  (optional)
        * @return Call&lt;SmsCampaignData&gt;
        */
        @GET("smscampaigns")
        Call<SmsCampaignData> retrieveAllEmails1(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                );

        /**
        * Retrieve a SMS Campaign
        * Example Requests:  smscampaigns/1 
            * @param resourceId  (required)
        * @return Call&lt;SmsCampaignData&gt;
        */
        @GET("smscampaigns/{resourceId}")
        Call<SmsCampaignData> retrieveCampaign(
        @retrofit2.http.Path("resourceId") Long resourceId
                );

        /**
        * 
        * 
            * @param sqlSearch  (optional)
            * @param offset  (optional)
            * @param limit  (optional)
            * @param orderBy  (optional)
            * @param sortOrder  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("email/failedEmail")
        Call<String> retrieveFailedEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                );

        /**
        * 
        * 
            * @param entity  (required)
            * @param entityId  (required)
            * @param maxWidth  (optional)
            * @param maxHeight  (optional)
            * @param output  (optional)
            * @param accept  (optional)
        * @return Call&lt;Void&gt;
        */
        @GET("{entity}/{entityId}/images")
        Call<Void> retrieveImage(
        @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("maxWidth") Integer maxWidth, @retrofit2.http.Query("maxHeight") Integer maxHeight, @retrofit2.http.Query("output") String output, @retrofit2.http.Header("Accept") String accept
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("officetransactions")
        Call<String> retrieveOfficeTransactions();
        

        /**
        * 
        * 
            * @param resourceId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("email/{resourceId}")
        Call<String> retrieveOne1(
        @retrofit2.http.Path("resourceId") Long resourceId
                );

        /**
        * 
        * 
            * @param resourceId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("email/campaign/{resourceId}")
        Call<String> retrieveOneCampaign(
        @retrofit2.http.Path("resourceId") Long resourceId
                );

        /**
        * 
        * 
            * @param resourceId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("email/campaign/template/{resourceId}")
        Call<String> retrieveOneTemplate(
        @retrofit2.http.Path("resourceId") Long resourceId
                );

        /**
        * 
        * 
            * @param sqlSearch  (optional)
            * @param offset  (optional)
            * @param limit  (optional)
            * @param orderBy  (optional)
            * @param sortOrder  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("email/pendingEmail")
        Call<String> retrievePendingEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                );

        /**
        * 
        * 
            * @param sqlSearch  (optional)
            * @param offset  (optional)
            * @param limit  (optional)
            * @param orderBy  (optional)
            * @param sortOrder  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("email/sentEmail")
        Call<String> retrieveSentEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                );

        /**
        * 
        * 
            * @param creditBureauId creditBureauId (optional)
            * @param nationalId nationalId (optional)
        * @return Call&lt;String&gt;
        */
        @POST("creditBureauIntegration/saveCreditReport")
        Call<String> saveCreditReport(
        @retrofit2.http.Query("creditBureauId") Long creditBureauId, @retrofit2.http.Query("nationalId") String nationalId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("email/campaign/template")
        Call<String> template1();
        

        /**
        * Retrieve a SMS Campaign
        * Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template
        * @return Call&lt;SmsCampaignData&gt;
        */
        @GET("smscampaigns/template")
        Call<SmsCampaignData> template2();
        

        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("officetransactions")
        Call<String> transferMoneyFrom(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param resourceId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("email/{resourceId}")
        Call<String> update2(
        @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param resourceId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("email/campaign/{resourceId}")
        Call<String> updateCampaign(
        @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body String body
                );

        /**
        * Update a Campaign
        * 
            * @param campaignId  (required)
            * @param commandWrapper  (required)
        * @return Call&lt;CommandProcessingResult&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("smscampaigns/{campaignId}")
        Call<CommandProcessingResult> updateCampaign1(
        @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Body CommandWrapper commandWrapper
                );

        /**
        * 
        * 
            * @param entity  (required)
            * @param entityId  (required)
            * @param contentLength  (optional)
            * @param dateFormat  (optional)
            * @param locale  (optional)
            * @param uploadedInputStream  (optional)
        * @return Call&lt;String&gt;
        */
                @retrofit2.http.Multipart
        @PUT("{entity}/{entityId}/images")
        Call<String> updateClientImage1(
        @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
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
        @PUT("email/configuration")
        Call<String> updateConfiguration(
        @retrofit2.http.Body String body
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
        @PUT("twofactor/configure")
        Call<String> updateConfiguration3(
        @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param resourceId  (required)
                * @param command  (optional)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("email/campaign/{resourceId}")
        Call<String> activate(
        @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param creditBureauId creditBureauId (optional)
                * @param dateFormat  (optional)
                * @param locale  (optional)
                * @param uploadedInputStream  (optional)
            * @return Call&lt;String&gt;
            */
                @retrofit2.http.Multipart
            @POST("creditBureauIntegration/addCreditReport")
        Call<String> addCreditReport(
        @retrofit2.http.Query("creditBureauId") Long creditBureauId, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entity  (required)
                * @param entityId  (required)
                * @param contentLength  (optional)
                * @param dateFormat  (optional)
                * @param locale  (optional)
                * @param uploadedInputStream  (optional)
            * @return Call&lt;String&gt;
            */
                @retrofit2.http.Multipart
            @POST("{entity}/{entityId}/images")
        Call<String> addNewClientImage1(
        @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
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
            @POST("email")
        Call<String> create1(
        @retrofit2.http.Body String body
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
            @POST("email/campaign")
        Call<String> createCampaign(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * Create a SMS Campaign
            * Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format
                * @param commandWrapper  (required)
            * @return Call&lt;CommandProcessingResult&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("smscampaigns")
        Call<CommandProcessingResult> createCampaign1(
        @retrofit2.http.Body CommandWrapper commandWrapper
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param resourceId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("email/{resourceId}")
        Call<String> delete1(
        @retrofit2.http.Path("resourceId") Long resourceId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param resourceId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("email/campaign/{resourceId}")
        Call<String> delete2(
        @retrofit2.http.Path("resourceId") Long resourceId
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a SMS Campaign
            * Note: Only closed SMS Campaigns can be deleted
                * @param campaignId  (required)
            * @return Call&lt;CommandProcessingResult&gt;
            */
            @DELETE("smscampaigns/{campaignId}")
        Call<CommandProcessingResult> delete3(
        @retrofit2.http.Path("campaignId") Long campaignId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param transactionId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("officetransactions/{transactionId}")
        Call<String> delete8(
        @retrofit2.http.Path("transactionId") Long transactionId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entity  (required)
                * @param entityId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("{entity}/{entityId}/images")
        Call<String> deleteClientImage(
        @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param creditBureauId creditBureauId (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("creditBureauIntegration/deleteCreditReport/{creditBureauId}")
        Call<String> deleteCreditReport(
        @retrofit2.http.Path("creditBureauId") Long creditBureauId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param requestBody  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("creditBureauIntegration/creditReport")
        Call<String> fetchCreditReport(
        @retrofit2.http.Body Map<String, Object> requestBody
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("echo")
        Call<String> get(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param clientId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("internal/client/{clientId}/audit")
        Call<String> getClientAuditFields(
        @retrofit2.http.Path("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param path  (required)
            * @return Call&lt;Void&gt;
            */
            @GET("application.wadl/{path}")
        Call<Void> getExternalGrammar(
        @retrofit2.http.Path("path") String path
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("internal/loan/{loanId}/audit")
        Call<String> getLoanAuditFields(
        @retrofit2.http.Path("loanId") Long loanId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param loanId  (required)
                * @param transactionId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("internal/loan/{loanId}/transaction/{transactionId}/audit")
        Call<String> getLoanTransactionAuditFields(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param creditBureauId creditBureauId (required)
            * @return Call&lt;String&gt;
            */
            @GET("creditBureauIntegration/creditReport/{creditBureauId}")
        Call<String> getSavedCreditReport(
        @retrofit2.http.Path("creditBureauId") Long creditBureauId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;Void&gt;
            */
            @GET("application.wadl")
        Call<Void> getWadl(@HeaderMap Map<String, String> headers);
        

            /**
            * SMS Campaign
            * Activates | Deactivates | Reactivates
                * @param campaignId  (required)
                * @param command  (optional)
            * @return Call&lt;CommandProcessingResult&gt;
            */
            @POST("smscampaigns/{campaignId}")
        Call<CommandProcessingResult> handleCommands(
        @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("officetransactions/template")
        Call<String> newOfficeTransactionDetails(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("email/campaign/preview")
        Call<String> preview(
        @retrofit2.http.Body String body
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
            @POST("smscampaigns/preview")
        Call<String> preview1(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("email/configuration")
        Call<String> retrieveAll5(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("twofactor/configure")
        Call<String> retrieveAll9(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("email/campaign")
        Call<String> retrieveAllCampaign(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param sqlSearch  (optional)
                * @param offset  (optional)
                * @param limit  (optional)
                * @param status  (optional)
                * @param orderBy  (optional)
                * @param sortOrder  (optional)
                * @param fromDate  (optional)
                * @param toDate  (optional)
                * @param locale  (optional)
                * @param dateFormat  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("email/messageByStatus")
        Call<String> retrieveAllEmailByStatus(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("status") Integer status, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("fromDate") Object fromDate, @retrofit2.http.Query("toDate") Object toDate, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("email")
        Call<String> retrieveAllEmails(@HeaderMap Map<String, String> headers);
        

            /**
            * List SMS Campaigns
            * Example Requests:  smscampaigns
                * @param sqlSearch  (optional)
                * @param offset  (optional)
                * @param limit  (optional)
                * @param orderBy  (optional)
                * @param sortOrder  (optional)
            * @return Call&lt;SmsCampaignData&gt;
            */
            @GET("smscampaigns")
        Call<SmsCampaignData> retrieveAllEmails1(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a SMS Campaign
            * Example Requests:  smscampaigns/1 
                * @param resourceId  (required)
            * @return Call&lt;SmsCampaignData&gt;
            */
            @GET("smscampaigns/{resourceId}")
        Call<SmsCampaignData> retrieveCampaign(
        @retrofit2.http.Path("resourceId") Long resourceId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param sqlSearch  (optional)
                * @param offset  (optional)
                * @param limit  (optional)
                * @param orderBy  (optional)
                * @param sortOrder  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("email/failedEmail")
        Call<String> retrieveFailedEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entity  (required)
                * @param entityId  (required)
                * @param maxWidth  (optional)
                * @param maxHeight  (optional)
                * @param output  (optional)
                * @param accept  (optional)
            * @return Call&lt;Void&gt;
            */
            @GET("{entity}/{entityId}/images")
        Call<Void> retrieveImage(
        @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("maxWidth") Integer maxWidth, @retrofit2.http.Query("maxHeight") Integer maxHeight, @retrofit2.http.Query("output") String output, @retrofit2.http.Header("Accept") String accept
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("officetransactions")
        Call<String> retrieveOfficeTransactions(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param resourceId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("email/{resourceId}")
        Call<String> retrieveOne1(
        @retrofit2.http.Path("resourceId") Long resourceId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param resourceId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("email/campaign/{resourceId}")
        Call<String> retrieveOneCampaign(
        @retrofit2.http.Path("resourceId") Long resourceId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param resourceId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("email/campaign/template/{resourceId}")
        Call<String> retrieveOneTemplate(
        @retrofit2.http.Path("resourceId") Long resourceId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param sqlSearch  (optional)
                * @param offset  (optional)
                * @param limit  (optional)
                * @param orderBy  (optional)
                * @param sortOrder  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("email/pendingEmail")
        Call<String> retrievePendingEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param sqlSearch  (optional)
                * @param offset  (optional)
                * @param limit  (optional)
                * @param orderBy  (optional)
                * @param sortOrder  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("email/sentEmail")
        Call<String> retrieveSentEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param creditBureauId creditBureauId (optional)
                * @param nationalId nationalId (optional)
            * @return Call&lt;String&gt;
            */
            @POST("creditBureauIntegration/saveCreditReport")
        Call<String> saveCreditReport(
        @retrofit2.http.Query("creditBureauId") Long creditBureauId, @retrofit2.http.Query("nationalId") String nationalId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("email/campaign/template")
        Call<String> template1(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve a SMS Campaign
            * Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template
            * @return Call&lt;SmsCampaignData&gt;
            */
            @GET("smscampaigns/template")
        Call<SmsCampaignData> template2(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("officetransactions")
        Call<String> transferMoneyFrom(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param resourceId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("email/{resourceId}")
        Call<String> update2(
        @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param resourceId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("email/campaign/{resourceId}")
        Call<String> updateCampaign(
        @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * Update a Campaign
            * 
                * @param campaignId  (required)
                * @param commandWrapper  (required)
            * @return Call&lt;CommandProcessingResult&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("smscampaigns/{campaignId}")
        Call<CommandProcessingResult> updateCampaign1(
        @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Body CommandWrapper commandWrapper
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entity  (required)
                * @param entityId  (required)
                * @param contentLength  (optional)
                * @param dateFormat  (optional)
                * @param locale  (optional)
                * @param uploadedInputStream  (optional)
            * @return Call&lt;String&gt;
            */
                @retrofit2.http.Multipart
            @PUT("{entity}/{entityId}/images")
        Call<String> updateClientImage1(
        @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
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
            @PUT("email/configuration")
        Call<String> updateConfiguration(
        @retrofit2.http.Body String body
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
            @PUT("twofactor/configure")
        Call<String> updateConfiguration3(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
