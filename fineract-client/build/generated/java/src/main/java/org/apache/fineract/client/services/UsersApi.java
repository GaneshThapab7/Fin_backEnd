package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteUsersUserIdResponse;
import java.io.File;
import org.apache.fineract.client.models.GetUsersResponse;
import org.apache.fineract.client.models.GetUsersTemplateResponse;
import org.apache.fineract.client.models.GetUsersUserIdResponse;
import org.apache.fineract.client.models.PostUsersRequest;
import org.apache.fineract.client.models.PostUsersResponse;
import org.apache.fineract.client.models.PutUsersUserIdRequest;
import org.apache.fineract.client.models.PutUsersUserIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface UsersApi {
        /**
        * Create a User
        * Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients
            * @param postUsersRequest  (required)
        * @return Call&lt;PostUsersResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("users")
        Call<PostUsersResponse> create15(
        @retrofit2.http.Body PostUsersRequest postUsersRequest
                );

        /**
        * Delete a User
        * Removes the user and the associated roles and permissions.
            * @param userId userId (required)
        * @return Call&lt;DeleteUsersUserIdResponse&gt;
        */
        @DELETE("users/{userId}")
        Call<DeleteUsersUserIdResponse> delete21(
        @retrofit2.http.Path("userId") Long userId
                );

        /**
        * 
        * 
            * @param officeId  (optional)
            * @param staffId  (optional)
            * @param dateFormat  (optional)
        * @return Call&lt;Void&gt;
        */
        @GET("users/downloadtemplate")
        Call<Void> getUserTemplate(
        @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
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
        @POST("users/uploadtemplate")
        Call<String> postUsersTemplate(
        @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                );

        /**
        * Retrieve list of users
        * Example Requests:  users   users?fields&#x3D;id,username,email,officeName
        * @return Call&lt;List&lt;GetUsersResponse&gt;&gt;
        */
        @GET("users")
        Call<List<GetUsersResponse>> retrieveAll41();
        

        /**
        * Retrieve a User
        * Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName
            * @param userId userId (required)
        * @return Call&lt;GetUsersUserIdResponse&gt;
        */
        @GET("users/{userId}")
        Call<GetUsersUserIdResponse> retrieveOne29(
        @retrofit2.http.Path("userId") Long userId
                );

        /**
        * Retrieve User Details Template
        * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  users/template
        * @return Call&lt;GetUsersTemplateResponse&gt;
        */
        @GET("users/template")
        Call<GetUsersTemplateResponse> template22();
        

        /**
        * Update a User
        * When updating a password you must provide the repeatPassword parameter also.
            * @param userId userId (required)
            * @param putUsersUserIdRequest  (required)
        * @return Call&lt;PutUsersUserIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("users/{userId}")
        Call<PutUsersUserIdResponse> update24(
        @retrofit2.http.Path("userId") Long userId, @retrofit2.http.Body PutUsersUserIdRequest putUsersUserIdRequest
                );


            /**
            * Create a User
            * Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients
                * @param postUsersRequest  (required)
            * @return Call&lt;PostUsersResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("users")
        Call<PostUsersResponse> create15(
        @retrofit2.http.Body PostUsersRequest postUsersRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a User
            * Removes the user and the associated roles and permissions.
                * @param userId userId (required)
            * @return Call&lt;DeleteUsersUserIdResponse&gt;
            */
            @DELETE("users/{userId}")
        Call<DeleteUsersUserIdResponse> delete21(
        @retrofit2.http.Path("userId") Long userId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param officeId  (optional)
                * @param staffId  (optional)
                * @param dateFormat  (optional)
            * @return Call&lt;Void&gt;
            */
            @GET("users/downloadtemplate")
        Call<Void> getUserTemplate(
        @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
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
            @POST("users/uploadtemplate")
        Call<String> postUsersTemplate(
        @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve list of users
            * Example Requests:  users   users?fields&#x3D;id,username,email,officeName
            * @return Call&lt;List&lt;GetUsersResponse&gt;&gt;
            */
            @GET("users")
        Call<List<GetUsersResponse>> retrieveAll41(@HeaderMap Map<String, String> headers);
        

            /**
            * Retrieve a User
            * Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName
                * @param userId userId (required)
            * @return Call&lt;GetUsersUserIdResponse&gt;
            */
            @GET("users/{userId}")
        Call<GetUsersUserIdResponse> retrieveOne29(
        @retrofit2.http.Path("userId") Long userId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve User Details Template
            * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  users/template
            * @return Call&lt;GetUsersTemplateResponse&gt;
            */
            @GET("users/template")
        Call<GetUsersTemplateResponse> template22(@HeaderMap Map<String, String> headers);
        

            /**
            * Update a User
            * When updating a password you must provide the repeatPassword parameter also.
                * @param userId userId (required)
                * @param putUsersUserIdRequest  (required)
            * @return Call&lt;PutUsersUserIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("users/{userId}")
        Call<PutUsersUserIdResponse> update24(
        @retrofit2.http.Path("userId") Long userId, @retrofit2.http.Body PutUsersUserIdRequest putUsersUserIdRequest
                , @HeaderMap Map<String, String> headers);

        }
