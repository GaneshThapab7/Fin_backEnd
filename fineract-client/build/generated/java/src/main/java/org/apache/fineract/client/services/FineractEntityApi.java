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

    public interface FineractEntityApi {
        /**
        * 
        * 
            * @param relId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("entitytoentitymapping/{relId}")
        Call<String> createMap(
        @retrofit2.http.Path("relId") Long relId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param mapId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("entitytoentitymapping/{mapId}")
        Call<String> delete4(
        @retrofit2.http.Path("mapId") Long mapId
                );

        /**
        * 
        * 
            * @param mapId  (required)
            * @param fromId  (required)
            * @param toId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("entitytoentitymapping/{mapId}/{fromId}/{toId}")
        Call<String> getEntityToEntityMappings(
        @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Path("fromId") Long fromId, @retrofit2.http.Path("toId") Long toId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("entitytoentitymapping")
        Call<String> retrieveAll7();
        

        /**
        * 
        * 
            * @param mapId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("entitytoentitymapping/{mapId}")
        Call<String> retrieveOne4(
        @retrofit2.http.Path("mapId") Long mapId
                );

        /**
        * 
        * 
            * @param mapId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("entitytoentitymapping/{mapId}")
        Call<String> updateMap(
        @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param relId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("entitytoentitymapping/{relId}")
        Call<String> createMap(
        @retrofit2.http.Path("relId") Long relId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param mapId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("entitytoentitymapping/{mapId}")
        Call<String> delete4(
        @retrofit2.http.Path("mapId") Long mapId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param mapId  (required)
                * @param fromId  (required)
                * @param toId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("entitytoentitymapping/{mapId}/{fromId}/{toId}")
        Call<String> getEntityToEntityMappings(
        @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Path("fromId") Long fromId, @retrofit2.http.Path("toId") Long toId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("entitytoentitymapping")
        Call<String> retrieveAll7(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param mapId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("entitytoentitymapping/{mapId}")
        Call<String> retrieveOne4(
        @retrofit2.http.Path("mapId") Long mapId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param mapId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("entitytoentitymapping/{mapId}")
        Call<String> updateMap(
        @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
