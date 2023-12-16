package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;


    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface ClientFamilyMemberApi {
        /**
        * 
        * 
            * @param clientId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("clients/{clientId}/familymembers")
        Call<String> addClientFamilyMembers(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param familyMemberId  (required)
            * @param clientId clientId (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @DELETE("clients/{clientId}/familymembers/{familyMemberId}")
        Call<String> deleteClientFamilyMembers(
        @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param familyMemberId  (required)
            * @param clientId clientId (required)
        * @return Call&lt;String&gt;
        */
        @GET("clients/{clientId}/familymembers/{familyMemberId}")
        Call<String> getFamilyMember(
        @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId
                );

        /**
        * 
        * 
            * @param clientId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("clients/{clientId}/familymembers")
        Call<String> getFamilyMembers(
        @retrofit2.http.Path("clientId") Long clientId
                );

        /**
        * 
        * 
            * @param clientId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("clients/{clientId}/familymembers/template")
        Call<String> getTemplate2(
        @retrofit2.http.Path("clientId") Long clientId
                );

        /**
        * 
        * 
            * @param familyMemberId  (required)
            * @param clientId clientId (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("clients/{clientId}/familymembers/{familyMemberId}")
        Call<String> updateClientFamilyMembers(
        @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param clientId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("clients/{clientId}/familymembers")
        Call<String> addClientFamilyMembers(
        @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param familyMemberId  (required)
                * @param clientId clientId (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @DELETE("clients/{clientId}/familymembers/{familyMemberId}")
        Call<String> deleteClientFamilyMembers(
        @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param familyMemberId  (required)
                * @param clientId clientId (required)
            * @return Call&lt;String&gt;
            */
            @GET("clients/{clientId}/familymembers/{familyMemberId}")
        Call<String> getFamilyMember(
        @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param clientId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("clients/{clientId}/familymembers")
        Call<String> getFamilyMembers(
        @retrofit2.http.Path("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param clientId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("clients/{clientId}/familymembers/template")
        Call<String> getTemplate2(
        @retrofit2.http.Path("clientId") Long clientId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param familyMemberId  (required)
                * @param clientId clientId (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("clients/{clientId}/familymembers/{familyMemberId}")
        Call<String> updateClientFamilyMembers(
        @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
