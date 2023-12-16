package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteEntityDatatableChecksTemplateResponse;
import org.apache.fineract.client.models.GetEntityDatatableChecksResponse;
import org.apache.fineract.client.models.GetEntityDatatableChecksTemplateResponse;
import org.apache.fineract.client.models.PostEntityDatatableChecksTemplateRequest;
import org.apache.fineract.client.models.PostEntityDatatableChecksTemplateResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface EntityDataTableApi {
        /**
        * Create Entity-Datatable Checks
        * Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId
            * @param postEntityDatatableChecksTemplateRequest  (required)
        * @return Call&lt;PostEntityDatatableChecksTemplateResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("entityDatatableChecks")
        Call<PostEntityDatatableChecksTemplateResponse> createEntityDatatableCheck(
        @retrofit2.http.Body PostEntityDatatableChecksTemplateRequest postEntityDatatableChecksTemplateRequest
                );

        /**
        * Delete Entity-Datatable Checks
        * Deletes an existing Entity-Datatable Check
            * @param entityDatatableCheckId entityDatatableCheckId (required)
            * @param body  (optional)
        * @return Call&lt;DeleteEntityDatatableChecksTemplateResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @DELETE("entityDatatableChecks/{entityDatatableCheckId}")
        Call<DeleteEntityDatatableChecksTemplateResponse> deleteDatatable1(
        @retrofit2.http.Path("entityDatatableCheckId") Long entityDatatableCheckId, @retrofit2.http.Body String body
                );

        /**
        * Retrieve Entity-Datatable Checks Template
        * This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed description Lists Example Request:  entityDatatableChecks/template
        * @return Call&lt;GetEntityDatatableChecksTemplateResponse&gt;
        */
        @GET("entityDatatableChecks/template")
        Call<GetEntityDatatableChecksTemplateResponse> getTemplate();
        

        /**
        * List Entity-Datatable Checks
        * The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15
            * @param status status (optional)
            * @param entity entity (optional)
            * @param productId productId (optional)
            * @param offset offset (optional)
            * @param limit limit (optional)
        * @return Call&lt;List&lt;GetEntityDatatableChecksResponse&gt;&gt;
        */
        @GET("entityDatatableChecks")
        Call<List<GetEntityDatatableChecksResponse>> retrieveAll6(
        @retrofit2.http.Query("status") Long status, @retrofit2.http.Query("entity") String entity, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
                );


            /**
            * Create Entity-Datatable Checks
            * Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId
                * @param postEntityDatatableChecksTemplateRequest  (required)
            * @return Call&lt;PostEntityDatatableChecksTemplateResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("entityDatatableChecks")
        Call<PostEntityDatatableChecksTemplateResponse> createEntityDatatableCheck(
        @retrofit2.http.Body PostEntityDatatableChecksTemplateRequest postEntityDatatableChecksTemplateRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete Entity-Datatable Checks
            * Deletes an existing Entity-Datatable Check
                * @param entityDatatableCheckId entityDatatableCheckId (required)
                * @param body  (optional)
            * @return Call&lt;DeleteEntityDatatableChecksTemplateResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @DELETE("entityDatatableChecks/{entityDatatableCheckId}")
        Call<DeleteEntityDatatableChecksTemplateResponse> deleteDatatable1(
        @retrofit2.http.Path("entityDatatableCheckId") Long entityDatatableCheckId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Entity-Datatable Checks Template
            * This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed description Lists Example Request:  entityDatatableChecks/template
            * @return Call&lt;GetEntityDatatableChecksTemplateResponse&gt;
            */
            @GET("entityDatatableChecks/template")
        Call<GetEntityDatatableChecksTemplateResponse> getTemplate(@HeaderMap Map<String, String> headers);
        

            /**
            * List Entity-Datatable Checks
            * The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15
                * @param status status (optional)
                * @param entity entity (optional)
                * @param productId productId (optional)
                * @param offset offset (optional)
                * @param limit limit (optional)
            * @return Call&lt;List&lt;GetEntityDatatableChecksResponse&gt;&gt;
            */
            @GET("entityDatatableChecks")
        Call<List<GetEntityDatatableChecksResponse>> retrieveAll6(
        @retrofit2.http.Query("status") Long status, @retrofit2.http.Query("entity") String entity, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
                , @HeaderMap Map<String, String> headers);

        }
