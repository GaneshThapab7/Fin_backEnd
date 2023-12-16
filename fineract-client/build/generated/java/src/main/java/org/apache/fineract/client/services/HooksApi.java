package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteHookResponse;
import org.apache.fineract.client.models.GetHookResponse;
import org.apache.fineract.client.models.GetHookTemplateResponse;
import org.apache.fineract.client.models.PostHookRequest;
import org.apache.fineract.client.models.PostHookResponse;
import org.apache.fineract.client.models.PutHookRequest;
import org.apache.fineract.client.models.PutHookResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface HooksApi {
        /**
        * Create a Hook
        * The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).
            * @param postHookRequest  (required)
        * @return Call&lt;PostHookResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("hooks")
        Call<PostHookResponse> createHook(
        @retrofit2.http.Body PostHookRequest postHookRequest
                );

        /**
        * Delete a Hook
        * Deletes a hook.
            * @param hookId hookId (required)
        * @return Call&lt;DeleteHookResponse&gt;
        */
        @DELETE("hooks/{hookId}")
        Call<DeleteHookResponse> deleteHook(
        @retrofit2.http.Path("hookId") Long hookId
                );

        /**
        * Retrieve a Hook
        * Returns the details of a Hook.  Example Requests:  hooks/1
            * @param hookId hookId (required)
        * @return Call&lt;GetHookResponse&gt;
        */
        @GET("hooks/{hookId}")
        Call<GetHookResponse> retrieveHook(
        @retrofit2.http.Path("hookId") Long hookId
                );

        /**
        * Retrieve Hooks
        * Returns the list of hooks.  Example Requests:  hooks
        * @return Call&lt;List&lt;GetHookResponse&gt;&gt;
        */
        @GET("hooks")
        Call<List<GetHookResponse>> retrieveHooks();
        

        /**
        * Retrieve Hooks Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  hooks/template
        * @return Call&lt;GetHookTemplateResponse&gt;
        */
        @GET("hooks/template")
        Call<GetHookTemplateResponse> template3();
        

        /**
        * Update a Hook
        * Updates the details of a hook.
            * @param hookId hookId (required)
            * @param putHookRequest  (required)
        * @return Call&lt;PutHookResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("hooks/{hookId}")
        Call<PutHookResponse> updateHook(
        @retrofit2.http.Path("hookId") Long hookId, @retrofit2.http.Body PutHookRequest putHookRequest
                );


            /**
            * Create a Hook
            * The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).
                * @param postHookRequest  (required)
            * @return Call&lt;PostHookResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("hooks")
        Call<PostHookResponse> createHook(
        @retrofit2.http.Body PostHookRequest postHookRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Hook
            * Deletes a hook.
                * @param hookId hookId (required)
            * @return Call&lt;DeleteHookResponse&gt;
            */
            @DELETE("hooks/{hookId}")
        Call<DeleteHookResponse> deleteHook(
        @retrofit2.http.Path("hookId") Long hookId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Hook
            * Returns the details of a Hook.  Example Requests:  hooks/1
                * @param hookId hookId (required)
            * @return Call&lt;GetHookResponse&gt;
            */
            @GET("hooks/{hookId}")
        Call<GetHookResponse> retrieveHook(
        @retrofit2.http.Path("hookId") Long hookId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Hooks
            * Returns the list of hooks.  Example Requests:  hooks
            * @return Call&lt;List&lt;GetHookResponse&gt;&gt;
            */
            @GET("hooks")
        Call<List<GetHookResponse>> retrieveHooks(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve Hooks Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  hooks/template
            * @return Call&lt;GetHookTemplateResponse&gt;
            */
            @GET("hooks/template")
        Call<GetHookTemplateResponse> template3(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a Hook
            * Updates the details of a hook.
                * @param hookId hookId (required)
                * @param putHookRequest  (required)
            * @return Call&lt;PutHookResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("hooks/{hookId}")
        Call<PutHookResponse> updateHook(
        @retrofit2.http.Path("hookId") Long hookId, @retrofit2.http.Body PutHookRequest putHookRequest
                , @HeaderMap Map<String, String> headers);

        }
