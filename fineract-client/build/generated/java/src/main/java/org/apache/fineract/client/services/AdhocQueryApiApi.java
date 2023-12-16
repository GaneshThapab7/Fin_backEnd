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

    public interface AdhocQueryApiApi {
        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("adhocquery")
        Call<String> createAdHocQuery(
        @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param adHocId adHocId (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("adhocquery/{adHocId}")
        Call<String> deleteAdHocQuery(
        @retrofit2.http.Path("adHocId") Long adHocId
                );

        /**
        * 
        * 
            * @param adHocId adHocId (required)
        * @return Call&lt;String&gt;
        */
        @GET("adhocquery/{adHocId}")
        Call<String> retrieveAdHocQuery(
        @retrofit2.http.Path("adHocId") Long adHocId
                );

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("adhocquery")
        Call<String> retrieveAll2();
        

        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("adhocquery/template")
        Call<String> template();
        

        /**
        * 
        * 
            * @param adHocId adHocId (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("adhocquery/{adHocId}")
        Call<String> update(
        @retrofit2.http.Path("adHocId") Long adHocId, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("adhocquery")
        Call<String> createAdHocQuery(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param adHocId adHocId (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("adhocquery/{adHocId}")
        Call<String> deleteAdHocQuery(
        @retrofit2.http.Path("adHocId") Long adHocId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param adHocId adHocId (required)
            * @return Call&lt;String&gt;
            */
            @GET("adhocquery/{adHocId}")
        Call<String> retrieveAdHocQuery(
        @retrofit2.http.Path("adHocId") Long adHocId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("adhocquery")
        Call<String> retrieveAll2(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("adhocquery/template")
        Call<String> template(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param adHocId adHocId (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("adhocquery/{adHocId}")
        Call<String> update(
        @retrofit2.http.Path("adHocId") Long adHocId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
