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
import org.apache.fineract.client.models.GetOfficesResponse;
import org.apache.fineract.client.models.GetOfficesTemplateResponse;
import org.apache.fineract.client.models.PostOfficesRequest;
import org.apache.fineract.client.models.PostOfficesResponse;
import org.apache.fineract.client.models.PutOfficesOfficeIdRequest;
import org.apache.fineract.client.models.PutOfficesOfficeIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface OfficesApi {
        /**
        * Create an Office
        * Mandatory Fields name, openingDate, parentId
            * @param postOfficesRequest  (required)
        * @return Call&lt;PostOfficesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("offices")
        Call<PostOfficesResponse> createOffice(
        @retrofit2.http.Body PostOfficesRequest postOfficesRequest
                );

        /**
        * 
        * 
            * @param dateFormat  (optional)
        * @return Call&lt;Void&gt;
        */
        @GET("offices/downloadtemplate")
        Call<Void> getOfficeTemplate(
        @retrofit2.http.Query("dateFormat") String dateFormat
                );

        /**
        * 
        * 
            * @param dateFormat  (optional)
            * @param locale  (optional)
            * @param uploadedInputStream  (optional)
        * @return Call&lt;String&gt;
        */
                @retrofit2.http.Multipart
        @POST("offices/uploadtemplate")
        Call<String> postOfficeTemplate(
        @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                );

        /**
        * Retrieve an Office
        * Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName
            * @param officeId officeId (required)
        * @return Call&lt;GetOfficesResponse&gt;
        */
        @GET("offices/{officeId}")
        Call<GetOfficesResponse> retreiveOffice(
        @retrofit2.http.Path("officeId") Long officeId
                );

        /**
        * Retrieve Office Details Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  offices/template
        * @return Call&lt;GetOfficesTemplateResponse&gt;
        */
        @GET("offices/template")
        Call<GetOfficesTemplateResponse> retrieveOfficeTemplate1();
        

        /**
        * List Offices
        * Example Requests:  offices   offices?fields&#x3D;id,name,openingDate
            * @param includeAllOffices includeAllOffices (optional, default to false)
            * @param orderBy orderBy (optional)
            * @param sortOrder sortOrder (optional)
        * @return Call&lt;List&lt;GetOfficesResponse&gt;&gt;
        */
        @GET("offices")
        Call<List<GetOfficesResponse>> retrieveOffices(
        @retrofit2.http.Query("includeAllOffices") Boolean includeAllOffices, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                );

        /**
        * Update Office
        * 
            * @param officeId officeId (required)
            * @param putOfficesOfficeIdRequest  (required)
        * @return Call&lt;PutOfficesOfficeIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("offices/{officeId}")
        Call<PutOfficesOfficeIdResponse> updateOffice(
        @retrofit2.http.Path("officeId") Long officeId, @retrofit2.http.Body PutOfficesOfficeIdRequest putOfficesOfficeIdRequest
                );


            /**
            * Create an Office
            * Mandatory Fields name, openingDate, parentId
                * @param postOfficesRequest  (required)
            * @return Call&lt;PostOfficesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("offices")
        Call<PostOfficesResponse> createOffice(
        @retrofit2.http.Body PostOfficesRequest postOfficesRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param dateFormat  (optional)
            * @return Call&lt;Void&gt;
            */
            @GET("offices/downloadtemplate")
        Call<Void> getOfficeTemplate(
        @retrofit2.http.Query("dateFormat") String dateFormat
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param dateFormat  (optional)
                * @param locale  (optional)
                * @param uploadedInputStream  (optional)
            * @return Call&lt;String&gt;
            */
                @retrofit2.http.Multipart
            @POST("offices/uploadtemplate")
        Call<String> postOfficeTemplate(
        @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve an Office
            * Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName
                * @param officeId officeId (required)
            * @return Call&lt;GetOfficesResponse&gt;
            */
            @GET("offices/{officeId}")
        Call<GetOfficesResponse> retreiveOffice(
        @retrofit2.http.Path("officeId") Long officeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Office Details Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  offices/template
            * @return Call&lt;GetOfficesTemplateResponse&gt;
            */
            @GET("offices/template")
        Call<GetOfficesTemplateResponse> retrieveOfficeTemplate1(@HeaderMap Map<String, String> headers);
        

            /**
            * List Offices
            * Example Requests:  offices   offices?fields&#x3D;id,name,openingDate
                * @param includeAllOffices includeAllOffices (optional, default to false)
                * @param orderBy orderBy (optional)
                * @param sortOrder sortOrder (optional)
            * @return Call&lt;List&lt;GetOfficesResponse&gt;&gt;
            */
            @GET("offices")
        Call<List<GetOfficesResponse>> retrieveOffices(
        @retrofit2.http.Query("includeAllOffices") Boolean includeAllOffices, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
                , @HeaderMap Map<String, String> headers);

            /**
            * Update Office
            * 
                * @param officeId officeId (required)
                * @param putOfficesOfficeIdRequest  (required)
            * @return Call&lt;PutOfficesOfficeIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("offices/{officeId}")
        Call<PutOfficesOfficeIdResponse> updateOffice(
        @retrofit2.http.Path("officeId") Long officeId, @retrofit2.http.Body PutOfficesOfficeIdRequest putOfficesOfficeIdRequest
                , @HeaderMap Map<String, String> headers);

        }
