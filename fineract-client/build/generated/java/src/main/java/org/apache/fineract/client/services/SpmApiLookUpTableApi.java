package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.LookupTableData;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SpmApiLookUpTableApi {
        /**
        * Create a Lookup Table entry
        * Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo
            * @param surveyId Enter surveyId (required)
            * @param lookupTableData  (optional)
        * @return Call&lt;Void&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("surveys/{surveyId}/lookuptables")
        Call<Void> createLookupTable(
        @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Body LookupTableData lookupTableData
                );

        /**
        * List all Lookup Table entries
        * List all Lookup Table entries for a survey.
            * @param surveyId Enter surveyId (required)
        * @return Call&lt;List&lt;LookupTableData&gt;&gt;
        */
        @GET("surveys/{surveyId}/lookuptables")
        Call<List<LookupTableData>> fetchLookupTables(
        @retrofit2.http.Path("surveyId") Long surveyId
                );

        /**
        * Retrieve a Lookup Table entry
        * Retrieve a Lookup Table entry for a survey.
            * @param surveyId Enter surveyId (required)
            * @param key Enter key (required)
        * @return Call&lt;LookupTableData&gt;
        */
        @GET("surveys/{surveyId}/lookuptables/{key}")
        Call<LookupTableData> findLookupTable(
        @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Path("key") String key
                );


            /**
            * Create a Lookup Table entry
            * Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo
                * @param surveyId Enter surveyId (required)
                * @param lookupTableData  (optional)
            * @return Call&lt;Void&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("surveys/{surveyId}/lookuptables")
        Call<Void> createLookupTable(
        @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Body LookupTableData lookupTableData
                , @HeaderMap Map<String, String> headers);

            /**
            * List all Lookup Table entries
            * List all Lookup Table entries for a survey.
                * @param surveyId Enter surveyId (required)
            * @return Call&lt;List&lt;LookupTableData&gt;&gt;
            */
            @GET("surveys/{surveyId}/lookuptables")
        Call<List<LookupTableData>> fetchLookupTables(
        @retrofit2.http.Path("surveyId") Long surveyId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Lookup Table entry
            * Retrieve a Lookup Table entry for a survey.
                * @param surveyId Enter surveyId (required)
                * @param key Enter key (required)
            * @return Call&lt;LookupTableData&gt;
            */
            @GET("surveys/{surveyId}/lookuptables/{key}")
        Call<LookupTableData> findLookupTable(
        @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Path("key") String key
                , @HeaderMap Map<String, String> headers);

        }
