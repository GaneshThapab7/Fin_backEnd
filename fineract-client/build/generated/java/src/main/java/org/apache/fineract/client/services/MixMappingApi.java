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

    public interface MixMappingApi {
        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("mixmapping")
        Call<String> retrieveTaxonomyMapping();
        

        /**
        * 
        * 
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("mixmapping")
        Call<String> updateTaxonomyMapping(
        @retrofit2.http.Body String body
                );


            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("mixmapping")
        Call<String> retrieveTaxonomyMapping(@HeaderMap Map<String, String> headers);
        

            /**
            * 
            * 
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("mixmapping")
        Call<String> updateTaxonomyMapping(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
