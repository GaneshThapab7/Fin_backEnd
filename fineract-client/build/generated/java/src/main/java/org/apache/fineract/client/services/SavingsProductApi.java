package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteSavingsProductsProductIdResponse;
import org.apache.fineract.client.models.GetSavingsProductsProductIdResponse;
import org.apache.fineract.client.models.GetSavingsProductsResponse;
import org.apache.fineract.client.models.GetSavingsProductsTemplateResponse;
import org.apache.fineract.client.models.PostSavingsProductsRequest;
import org.apache.fineract.client.models.PostSavingsProductsResponse;
import org.apache.fineract.client.models.PutSavingsProductsProductIdRequest;
import org.apache.fineract.client.models.PutSavingsProductsProductIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SavingsProductApi {
        /**
        * Create a Savings Product
        * Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId,accountMapping, lienAllowed, maxAllowedLienLimit
            * @param postSavingsProductsRequest  (required)
        * @return Call&lt;PostSavingsProductsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("savingsproducts")
        Call<PostSavingsProductsResponse> create13(
        @retrofit2.http.Body PostSavingsProductsRequest postSavingsProductsRequest
                );

        /**
        * Delete a Savings Product
        * Deletes a Savings Product
            * @param productId productId (required)
        * @return Call&lt;DeleteSavingsProductsProductIdResponse&gt;
        */
        @DELETE("savingsproducts/{productId}")
        Call<DeleteSavingsProductsProductIdResponse> delete19(
        @retrofit2.http.Path("productId") Long productId
                );

        /**
        * List Savings Products
        * Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name
        * @return Call&lt;List&lt;GetSavingsProductsResponse&gt;&gt;
        */
        @GET("savingsproducts")
        Call<List<GetSavingsProductsResponse>> retrieveAll34();
        

        /**
        * Retrieve a Savings Product
        * Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description
            * @param productId productId (required)
        * @return Call&lt;GetSavingsProductsProductIdResponse&gt;
        */
        @GET("savingsproducts/{productId}")
        Call<GetSavingsProductsProductIdResponse> retrieveOne25(
        @retrofit2.http.Path("productId") Long productId
                );

        /**
        * Retrieve Savings Product Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request: Account Mapping:  savingsproducts/template
        * @return Call&lt;GetSavingsProductsTemplateResponse&gt;
        */
        @GET("savingsproducts/template")
        Call<GetSavingsProductsTemplateResponse> retrieveTemplate19();
        

        /**
        * Update a Savings Product
        * Updates a Savings Product
            * @param productId productId (required)
            * @param putSavingsProductsProductIdRequest  (required)
        * @return Call&lt;PutSavingsProductsProductIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("savingsproducts/{productId}")
        Call<PutSavingsProductsProductIdResponse> update20(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutSavingsProductsProductIdRequest putSavingsProductsProductIdRequest
                );


            /**
            * Create a Savings Product
            * Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId,accountMapping, lienAllowed, maxAllowedLienLimit
                * @param postSavingsProductsRequest  (required)
            * @return Call&lt;PostSavingsProductsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("savingsproducts")
        Call<PostSavingsProductsResponse> create13(
        @retrofit2.http.Body PostSavingsProductsRequest postSavingsProductsRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Savings Product
            * Deletes a Savings Product
                * @param productId productId (required)
            * @return Call&lt;DeleteSavingsProductsProductIdResponse&gt;
            */
            @DELETE("savingsproducts/{productId}")
        Call<DeleteSavingsProductsProductIdResponse> delete19(
        @retrofit2.http.Path("productId") Long productId
                , @HeaderMap Map<String, String> headers);

            /**
            * List Savings Products
            * Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name
            * @return Call&lt;List&lt;GetSavingsProductsResponse&gt;&gt;
            */
            @GET("savingsproducts")
        Call<List<GetSavingsProductsResponse>> retrieveAll34(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve a Savings Product
            * Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description
                * @param productId productId (required)
            * @return Call&lt;GetSavingsProductsProductIdResponse&gt;
            */
            @GET("savingsproducts/{productId}")
        Call<GetSavingsProductsProductIdResponse> retrieveOne25(
        @retrofit2.http.Path("productId") Long productId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Savings Product Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request: Account Mapping:  savingsproducts/template
            * @return Call&lt;GetSavingsProductsTemplateResponse&gt;
            */
            @GET("savingsproducts/template")
        Call<GetSavingsProductsTemplateResponse> retrieveTemplate19(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Savings Product
            * Updates a Savings Product
                * @param productId productId (required)
                * @param putSavingsProductsProductIdRequest  (required)
            * @return Call&lt;PutSavingsProductsProductIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("savingsproducts/{productId}")
        Call<PutSavingsProductsProductIdResponse> update20(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutSavingsProductsProductIdRequest putSavingsProductsProductIdRequest
                , @HeaderMap Map<String, String> headers);

        }
