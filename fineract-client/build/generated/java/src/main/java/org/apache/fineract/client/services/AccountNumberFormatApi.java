package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteAccountNumberFormatsResponse;
import org.apache.fineract.client.models.GetAccountNumberFormatsIdResponse;
import org.apache.fineract.client.models.GetAccountNumberFormatsResponseTemplate;
import org.apache.fineract.client.models.PostAccountNumberFormatsRequest;
import org.apache.fineract.client.models.PostAccountNumberFormatsResponse;
import org.apache.fineract.client.models.PutAccountNumberFormatsRequest;
import org.apache.fineract.client.models.PutAccountNumberFormatsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface AccountNumberFormatApi {
        /**
        * Create an Account number format
        * Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType
            * @param postAccountNumberFormatsRequest  (optional)
        * @return Call&lt;PostAccountNumberFormatsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("accountnumberformats")
        Call<PostAccountNumberFormatsResponse> create(
        @retrofit2.http.Body PostAccountNumberFormatsRequest postAccountNumberFormatsRequest
                );

        /**
        * Delete an Account number format
        * Note: Account numbers created while this format was active would remain unchanged.
            * @param accountNumberFormatId accountNumberFormatId (required)
        * @return Call&lt;DeleteAccountNumberFormatsResponse&gt;
        */
        @DELETE("accountnumberformats/{accountNumberFormatId}")
        Call<DeleteAccountNumberFormatsResponse> delete(
        @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId
                );

        /**
        * List Account number formats
        * Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType
        * @return Call&lt;List&lt;GetAccountNumberFormatsIdResponse&gt;&gt;
        */
        @GET("accountnumberformats")
        Call<List<GetAccountNumberFormatsIdResponse>> retrieveAll3();
        

        /**
        * Retrieve an Account number format
        * Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType
            * @param accountNumberFormatId accountNumberFormatId (required)
        * @return Call&lt;GetAccountNumberFormatsIdResponse&gt;
        */
        @GET("accountnumberformats/{accountNumberFormatId}")
        Call<GetAccountNumberFormatsIdResponse> retrieveOne(
        @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId
                );

        /**
        * Retrieve Account number format Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template
        * @return Call&lt;GetAccountNumberFormatsResponseTemplate&gt;
        */
        @GET("accountnumberformats/template")
        Call<GetAccountNumberFormatsResponseTemplate> retrieveTemplate2();
        

        /**
        * Update an Account number format
        * 
            * @param accountNumberFormatId accountNumberFormatId (required)
            * @param putAccountNumberFormatsRequest  (required)
        * @return Call&lt;PutAccountNumberFormatsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("accountnumberformats/{accountNumberFormatId}")
        Call<PutAccountNumberFormatsResponse> update1(
        @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId, @retrofit2.http.Body PutAccountNumberFormatsRequest putAccountNumberFormatsRequest
                );


            /**
            * Create an Account number format
            * Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType
                * @param postAccountNumberFormatsRequest  (optional)
            * @return Call&lt;PostAccountNumberFormatsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("accountnumberformats")
        Call<PostAccountNumberFormatsResponse> create(
        @retrofit2.http.Body PostAccountNumberFormatsRequest postAccountNumberFormatsRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete an Account number format
            * Note: Account numbers created while this format was active would remain unchanged.
                * @param accountNumberFormatId accountNumberFormatId (required)
            * @return Call&lt;DeleteAccountNumberFormatsResponse&gt;
            */
            @DELETE("accountnumberformats/{accountNumberFormatId}")
        Call<DeleteAccountNumberFormatsResponse> delete(
        @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId
                , @HeaderMap Map<String, String> headers);

            /**
            * List Account number formats
            * Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType
            * @return Call&lt;List&lt;GetAccountNumberFormatsIdResponse&gt;&gt;
            */
            @GET("accountnumberformats")
        Call<List<GetAccountNumberFormatsIdResponse>> retrieveAll3(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve an Account number format
            * Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType
                * @param accountNumberFormatId accountNumberFormatId (required)
            * @return Call&lt;GetAccountNumberFormatsIdResponse&gt;
            */
            @GET("accountnumberformats/{accountNumberFormatId}")
        Call<GetAccountNumberFormatsIdResponse> retrieveOne(
        @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Account number format Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template
            * @return Call&lt;GetAccountNumberFormatsResponseTemplate&gt;
            */
            @GET("accountnumberformats/template")
        Call<GetAccountNumberFormatsResponseTemplate> retrieveTemplate2(@HeaderMap Map<String, String> headers);
        

            /**
            * Update an Account number format
            * 
                * @param accountNumberFormatId accountNumberFormatId (required)
                * @param putAccountNumberFormatsRequest  (required)
            * @return Call&lt;PutAccountNumberFormatsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("accountnumberformats/{accountNumberFormatId}")
        Call<PutAccountNumberFormatsResponse> update1(
        @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId, @retrofit2.http.Body PutAccountNumberFormatsRequest putAccountNumberFormatsRequest
                , @HeaderMap Map<String, String> headers);

        }
