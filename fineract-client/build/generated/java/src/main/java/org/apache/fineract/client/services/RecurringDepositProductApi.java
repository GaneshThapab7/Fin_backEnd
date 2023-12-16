package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteRecurringDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositProductsResponse;
import org.apache.fineract.client.models.PostRecurringDepositProductsRequest;
import org.apache.fineract.client.models.PostRecurringDepositProductsResponse;
import org.apache.fineract.client.models.PutRecurringDepositProductsRequest;
import org.apache.fineract.client.models.PutRecurringDepositProductsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface RecurringDepositProductApi {
        /**
        * Create a Recurring Deposit Product
        * Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId
            * @param postRecurringDepositProductsRequest  (required)
        * @return Call&lt;PostRecurringDepositProductsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("recurringdepositproducts")
        Call<PostRecurringDepositProductsResponse> create12(
        @retrofit2.http.Body PostRecurringDepositProductsRequest postRecurringDepositProductsRequest
                );

        /**
        * Delete a Recurring Deposit Product
        * Deletes a Recurring Deposit Product
            * @param productId productId (required)
        * @return Call&lt;DeleteRecurringDepositProductsProductIdResponse&gt;
        */
        @DELETE("recurringdepositproducts/{productId}")
        Call<DeleteRecurringDepositProductsProductIdResponse> delete17(
        @retrofit2.http.Path("productId") Long productId
                );

        /**
        * List Recuring Deposit Products
        * Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name
        * @return Call&lt;List&lt;GetRecurringDepositProductsResponse&gt;&gt;
        */
        @GET("recurringdepositproducts")
        Call<List<GetRecurringDepositProductsResponse>> retrieveAll32();
        

        /**
        * Retrieve a Recurring Deposit Product
        * Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description
            * @param productId productId (required)
        * @return Call&lt;GetRecurringDepositProductsProductIdResponse&gt;
        */
        @GET("recurringdepositproducts/{productId}")
        Call<GetRecurringDepositProductsProductIdResponse> retrieveOne22(
        @retrofit2.http.Path("productId") Long productId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("recurringdepositproducts/template")
        Call<String> retrieveTemplate16();
        

        /**
        * Update a Recurring Deposit Product
        * Updates a Recurring Deposit Product
            * @param productId productId (required)
            * @param putRecurringDepositProductsRequest  (required)
        * @return Call&lt;PutRecurringDepositProductsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("recurringdepositproducts/{productId}")
        Call<PutRecurringDepositProductsResponse> update18(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutRecurringDepositProductsRequest putRecurringDepositProductsRequest
                );


            /**
            * Create a Recurring Deposit Product
            * Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId
                * @param postRecurringDepositProductsRequest  (required)
            * @return Call&lt;PostRecurringDepositProductsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("recurringdepositproducts")
        Call<PostRecurringDepositProductsResponse> create12(
        @retrofit2.http.Body PostRecurringDepositProductsRequest postRecurringDepositProductsRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Recurring Deposit Product
            * Deletes a Recurring Deposit Product
                * @param productId productId (required)
            * @return Call&lt;DeleteRecurringDepositProductsProductIdResponse&gt;
            */
            @DELETE("recurringdepositproducts/{productId}")
        Call<DeleteRecurringDepositProductsProductIdResponse> delete17(
        @retrofit2.http.Path("productId") Long productId
                , @HeaderMap Map<String, String> headers);

            /**
            * List Recuring Deposit Products
            * Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name
            * @return Call&lt;List&lt;GetRecurringDepositProductsResponse&gt;&gt;
            */
            @GET("recurringdepositproducts")
        Call<List<GetRecurringDepositProductsResponse>> retrieveAll32(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve a Recurring Deposit Product
            * Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description
                * @param productId productId (required)
            * @return Call&lt;GetRecurringDepositProductsProductIdResponse&gt;
            */
            @GET("recurringdepositproducts/{productId}")
        Call<GetRecurringDepositProductsProductIdResponse> retrieveOne22(
        @retrofit2.http.Path("productId") Long productId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("recurringdepositproducts/template")
        Call<String> retrieveTemplate16(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Recurring Deposit Product
            * Updates a Recurring Deposit Product
                * @param productId productId (required)
                * @param putRecurringDepositProductsRequest  (required)
            * @return Call&lt;PutRecurringDepositProductsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("recurringdepositproducts/{productId}")
        Call<PutRecurringDepositProductsResponse> update18(
        @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutRecurringDepositProductsRequest putRecurringDepositProductsRequest
                , @HeaderMap Map<String, String> headers);

        }
