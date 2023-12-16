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

    public interface BulkImportApi {
        /**
        * 
        * 
            * @param importDocumentId  (optional)
        * @return Call&lt;Void&gt;
        */
        @GET("imports/downloadOutputTemplate")
        Call<Void> getOutputTemplate(
        @retrofit2.http.Query("importDocumentId") String importDocumentId
                );

        /**
        * 
        * 
            * @param entityType  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("imports")
        Call<String> retrieveImportDocuments(
        @retrofit2.http.Query("entityType") String entityType
                );

        /**
        * 
        * 
            * @param importDocumentId  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("imports/getOutputTemplateLocation")
        Call<String> retriveOutputTemplateLocation(
        @retrofit2.http.Query("importDocumentId") String importDocumentId
                );


            /**
            * 
            * 
                * @param importDocumentId  (optional)
            * @return Call&lt;Void&gt;
            */
            @GET("imports/downloadOutputTemplate")
        Call<Void> getOutputTemplate(
        @retrofit2.http.Query("importDocumentId") String importDocumentId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("imports")
        Call<String> retrieveImportDocuments(
        @retrofit2.http.Query("entityType") String entityType
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param importDocumentId  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("imports/getOutputTemplateLocation")
        Call<String> retriveOutputTemplateLocation(
        @retrofit2.http.Query("importDocumentId") String importDocumentId
                , @HeaderMap Map<String, String> headers);

        }
