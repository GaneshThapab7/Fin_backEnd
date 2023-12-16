package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.AccountingRuleData;
import org.apache.fineract.client.models.DeleteAccountingRulesResponse;
import org.apache.fineract.client.models.GetAccountRulesResponse;
import org.apache.fineract.client.models.GetAccountRulesTemplateResponse;
import org.apache.fineract.client.models.PostAccountingRulesRequest;
import org.apache.fineract.client.models.PostAccountingRulesResponse;
import org.apache.fineract.client.models.PutAccountingRulesRequest;
import org.apache.fineract.client.models.PutAccountingRulesResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface AccountingRulesApi {
        /**
        * Create/Define a Accounting rule
        * Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description
            * @param postAccountingRulesRequest  (optional)
        * @return Call&lt;PostAccountingRulesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("accountingrules")
        Call<PostAccountingRulesResponse> createAccountingRule(
        @retrofit2.http.Body PostAccountingRulesRequest postAccountingRulesRequest
                );

        /**
        * Delete a Accounting Rule
        * Deletes a Accounting rule.
            * @param accountingRuleId accountingRuleId (required)
        * @return Call&lt;DeleteAccountingRulesResponse&gt;
        */
        @DELETE("accountingrules/{accountingRuleId}")
        Call<DeleteAccountingRulesResponse> deleteAccountingRule(
        @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
                );

        /**
        * Retrieve a Accounting rule
        * Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1
            * @param accountingRuleId accountingRuleId (required)
        * @return Call&lt;AccountingRuleData&gt;
        */
        @GET("accountingrules/{accountingRuleId}")
        Call<AccountingRuleData> retreiveAccountingRule(
        @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
                );

        /**
        * Retrieve Accounting Rules
        * Returns the list of defined accounting rules.  Example Requests:  accountingrules
        * @return Call&lt;List&lt;GetAccountRulesResponse&gt;&gt;
        */
        @GET("accountingrules")
        Call<List<GetAccountRulesResponse>> retrieveAllAccountingRules();
        

        /**
        * Retrieve Accounting Rule Details Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template
        * @return Call&lt;GetAccountRulesTemplateResponse&gt;
        */
        @GET("accountingrules/template")
        Call<GetAccountRulesTemplateResponse> retrieveTemplate1();
        

        /**
        * Update a Accounting Rule
        * Updates the details of a Accounting rule.
            * @param accountingRuleId accountingRuleId (required)
            * @param putAccountingRulesRequest  (optional)
        * @return Call&lt;PutAccountingRulesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("accountingrules/{accountingRuleId}")
        Call<PutAccountingRulesResponse> updateAccountingRule(
        @retrofit2.http.Path("accountingRuleId") Long accountingRuleId, @retrofit2.http.Body PutAccountingRulesRequest putAccountingRulesRequest
                );


            /**
            * Create/Define a Accounting rule
            * Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description
                * @param postAccountingRulesRequest  (optional)
            * @return Call&lt;PostAccountingRulesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("accountingrules")
        Call<PostAccountingRulesResponse> createAccountingRule(
        @retrofit2.http.Body PostAccountingRulesRequest postAccountingRulesRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Accounting Rule
            * Deletes a Accounting rule.
                * @param accountingRuleId accountingRuleId (required)
            * @return Call&lt;DeleteAccountingRulesResponse&gt;
            */
            @DELETE("accountingrules/{accountingRuleId}")
        Call<DeleteAccountingRulesResponse> deleteAccountingRule(
        @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Accounting rule
            * Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1
                * @param accountingRuleId accountingRuleId (required)
            * @return Call&lt;AccountingRuleData&gt;
            */
            @GET("accountingrules/{accountingRuleId}")
        Call<AccountingRuleData> retreiveAccountingRule(
        @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Accounting Rules
            * Returns the list of defined accounting rules.  Example Requests:  accountingrules
            * @return Call&lt;List&lt;GetAccountRulesResponse&gt;&gt;
            */
            @GET("accountingrules")
        Call<List<GetAccountRulesResponse>> retrieveAllAccountingRules(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve Accounting Rule Details Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template
            * @return Call&lt;GetAccountRulesTemplateResponse&gt;
            */
            @GET("accountingrules/template")
        Call<GetAccountRulesTemplateResponse> retrieveTemplate1(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Accounting Rule
            * Updates the details of a Accounting rule.
                * @param accountingRuleId accountingRuleId (required)
                * @param putAccountingRulesRequest  (optional)
            * @return Call&lt;PutAccountingRulesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("accountingrules/{accountingRuleId}")
        Call<PutAccountingRulesResponse> updateAccountingRule(
        @retrofit2.http.Path("accountingRuleId") Long accountingRuleId, @retrofit2.http.Body PutAccountingRulesRequest putAccountingRulesRequest
                , @HeaderMap Map<String, String> headers);

        }
