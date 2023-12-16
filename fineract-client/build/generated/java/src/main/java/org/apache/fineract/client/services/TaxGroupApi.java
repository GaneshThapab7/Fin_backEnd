package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetTaxesGroupResponse;
import org.apache.fineract.client.models.PostTaxesGroupRequest;
import org.apache.fineract.client.models.PostTaxesGroupResponse;
import org.apache.fineract.client.models.PutTaxesGroupTaxGroupIdRequest;
import org.apache.fineract.client.models.PutTaxesGroupTaxGroupIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface TaxGroupApi {
        /**
        * Create a new Tax Group
        * Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate
            * @param postTaxesGroupRequest  (required)
        * @return Call&lt;PostTaxesGroupResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("taxes/group")
        Call<PostTaxesGroupResponse> createTaxGroup(
        @retrofit2.http.Body PostTaxesGroupRequest postTaxesGroupRequest
                );

        /**
        * List Tax Group
        * List Tax Group
        * @return Call&lt;List&lt;GetTaxesGroupResponse&gt;&gt;
        */
        @GET("taxes/group")
        Call<List<GetTaxesGroupResponse>> retrieveAllTaxGroups();
        

        /**
        * Retrieve Tax Group
        * Retrieve Tax Group
            * @param taxGroupId taxGroupId (required)
        * @return Call&lt;GetTaxesGroupResponse&gt;
        */
        @GET("taxes/group/{taxGroupId}")
        Call<GetTaxesGroupResponse> retrieveTaxGroup(
        @retrofit2.http.Path("taxGroupId") Long taxGroupId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("taxes/group/template")
        Call<String> retrieveTemplate21();
        

        /**
        * Update Tax Group
        * Updates Tax Group. Only end date can be up-datable and can insert new tax components.
            * @param taxGroupId taxGroupId (required)
            * @param putTaxesGroupTaxGroupIdRequest  (required)
        * @return Call&lt;PutTaxesGroupTaxGroupIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("taxes/group/{taxGroupId}")
        Call<PutTaxesGroupTaxGroupIdResponse> updateTaxGroup(
        @retrofit2.http.Path("taxGroupId") Long taxGroupId, @retrofit2.http.Body PutTaxesGroupTaxGroupIdRequest putTaxesGroupTaxGroupIdRequest
                );


            /**
            * Create a new Tax Group
            * Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate
                * @param postTaxesGroupRequest  (required)
            * @return Call&lt;PostTaxesGroupResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("taxes/group")
        Call<PostTaxesGroupResponse> createTaxGroup(
        @retrofit2.http.Body PostTaxesGroupRequest postTaxesGroupRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * List Tax Group
            * List Tax Group
            * @return Call&lt;List&lt;GetTaxesGroupResponse&gt;&gt;
            */
            @GET("taxes/group")
        Call<List<GetTaxesGroupResponse>> retrieveAllTaxGroups(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve Tax Group
            * Retrieve Tax Group
                * @param taxGroupId taxGroupId (required)
            * @return Call&lt;GetTaxesGroupResponse&gt;
            */
            @GET("taxes/group/{taxGroupId}")
        Call<GetTaxesGroupResponse> retrieveTaxGroup(
        @retrofit2.http.Path("taxGroupId") Long taxGroupId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("taxes/group/template")
        Call<String> retrieveTemplate21(@HeaderMap Map<String, String> headers);
        

            /**
            * Update Tax Group
            * Updates Tax Group. Only end date can be up-datable and can insert new tax components.
                * @param taxGroupId taxGroupId (required)
                * @param putTaxesGroupTaxGroupIdRequest  (required)
            * @return Call&lt;PutTaxesGroupTaxGroupIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("taxes/group/{taxGroupId}")
        Call<PutTaxesGroupTaxGroupIdResponse> updateTaxGroup(
        @retrofit2.http.Path("taxGroupId") Long taxGroupId, @retrofit2.http.Body PutTaxesGroupTaxGroupIdRequest putTaxesGroupTaxGroupIdRequest
                , @HeaderMap Map<String, String> headers);

        }
