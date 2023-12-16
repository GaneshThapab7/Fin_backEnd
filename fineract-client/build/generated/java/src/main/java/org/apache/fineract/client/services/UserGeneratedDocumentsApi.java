package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteTemplatesTemplateIdResponse;
import org.apache.fineract.client.models.GetTemplatesResponse;
import org.apache.fineract.client.models.GetTemplatesTemplateIdResponse;
import org.apache.fineract.client.models.GetTemplatesTemplateResponse;
import org.apache.fineract.client.models.PostTemplatesRequest;
import org.apache.fineract.client.models.PostTemplatesResponse;
import org.apache.fineract.client.models.PutTemplatesTemplateIdRequest;
import org.apache.fineract.client.models.PutTemplatesTemplateIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface UserGeneratedDocumentsApi {
        /**
        * Add a UGD
        * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
            * @param postTemplatesRequest  (required)
        * @return Call&lt;PostTemplatesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("templates")
        Call<PostTemplatesResponse> createTemplate(
        @retrofit2.http.Body PostTemplatesRequest postTemplatesRequest
                );

        /**
        * Delete a UGD
        * 
            * @param templateId templateId (required)
        * @return Call&lt;DeleteTemplatesTemplateIdResponse&gt;
        */
        @DELETE("templates/{templateId}")
        Call<DeleteTemplatesTemplateIdResponse> deleteTemplate(
        @retrofit2.http.Path("templateId") Long templateId
                );

        /**
        * 
        * 
            * @param templateId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("templates/{templateId}/template")
        Call<String> getTemplateByTemplate(
        @retrofit2.http.Path("templateId") Long templateId
                );

        /**
        * 
        * 
            * @param templateId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("templates/{templateId}")
        Call<String> mergeTemplate(
        @retrofit2.http.Path("templateId") Long templateId, @retrofit2.http.Body String body
                );

        /**
        * Retrieve all UGDs
        * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
            * @param typeId typeId (optional, default to -1)
            * @param entityId entityId (optional, default to -1)
        * @return Call&lt;GetTemplatesResponse&gt;
        */
        @GET("templates")
        Call<GetTemplatesResponse> retrieveAll40(
        @retrofit2.http.Query("typeId") Integer typeId, @retrofit2.http.Query("entityId") Integer entityId
                );

        /**
        * Retrieve a UGD
        * Example Requests:  templates/1
            * @param templateId templateId (required)
        * @return Call&lt;GetTemplatesTemplateIdResponse&gt;
        */
        @GET("templates/{templateId}")
        Call<GetTemplatesTemplateIdResponse> retrieveOne28(
        @retrofit2.http.Path("templateId") Long templateId
                );

        /**
        * Update a UGD
        * 
            * @param templateId templateId (required)
            * @param putTemplatesTemplateIdRequest  (required)
        * @return Call&lt;PutTemplatesTemplateIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("templates/{templateId}")
        Call<PutTemplatesTemplateIdResponse> saveTemplate(
        @retrofit2.http.Path("templateId") Long templateId, @retrofit2.http.Body PutTemplatesTemplateIdRequest putTemplatesTemplateIdRequest
                );

        /**
        * Retrieve UGD Details Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
        * @return Call&lt;GetTemplatesTemplateResponse&gt;
        */
        @GET("templates/template")
        Call<GetTemplatesTemplateResponse> template20();
        


            /**
            * Add a UGD
            * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
                * @param postTemplatesRequest  (required)
            * @return Call&lt;PostTemplatesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("templates")
        Call<PostTemplatesResponse> createTemplate(
        @retrofit2.http.Body PostTemplatesRequest postTemplatesRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a UGD
            * 
                * @param templateId templateId (required)
            * @return Call&lt;DeleteTemplatesTemplateIdResponse&gt;
            */
            @DELETE("templates/{templateId}")
        Call<DeleteTemplatesTemplateIdResponse> deleteTemplate(
        @retrofit2.http.Path("templateId") Long templateId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param templateId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("templates/{templateId}/template")
        Call<String> getTemplateByTemplate(
        @retrofit2.http.Path("templateId") Long templateId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param templateId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("templates/{templateId}")
        Call<String> mergeTemplate(
        @retrofit2.http.Path("templateId") Long templateId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve all UGDs
            * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
                * @param typeId typeId (optional, default to -1)
                * @param entityId entityId (optional, default to -1)
            * @return Call&lt;GetTemplatesResponse&gt;
            */
            @GET("templates")
        Call<GetTemplatesResponse> retrieveAll40(
        @retrofit2.http.Query("typeId") Integer typeId, @retrofit2.http.Query("entityId") Integer entityId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a UGD
            * Example Requests:  templates/1
                * @param templateId templateId (required)
            * @return Call&lt;GetTemplatesTemplateIdResponse&gt;
            */
            @GET("templates/{templateId}")
        Call<GetTemplatesTemplateIdResponse> retrieveOne28(
        @retrofit2.http.Path("templateId") Long templateId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update a UGD
            * 
                * @param templateId templateId (required)
                * @param putTemplatesTemplateIdRequest  (required)
            * @return Call&lt;PutTemplatesTemplateIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("templates/{templateId}")
        Call<PutTemplatesTemplateIdResponse> saveTemplate(
        @retrofit2.http.Path("templateId") Long templateId, @retrofit2.http.Body PutTemplatesTemplateIdRequest putTemplatesTemplateIdRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve UGD Details Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
            * @return Call&lt;GetTemplatesTemplateResponse&gt;
            */
            @GET("templates/template")
        Call<GetTemplatesTemplateResponse> template20(@HeaderMap Map<String, String> headers);
        

        }
