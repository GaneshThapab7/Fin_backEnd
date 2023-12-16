package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.PostCollectionSheetRequest;
import org.apache.fineract.client.models.PostCollectionSheetResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface CollectionSheetApi {
        /**
        * Generate Individual Collection Sheet | Save Collection Sheet
        * Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.
            * @param postCollectionSheetRequest  (required)
            * @param command command (optional)
        * @return Call&lt;PostCollectionSheetResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("collectionsheet")
        Call<PostCollectionSheetResponse> generateCollectionSheet(
        @retrofit2.http.Body PostCollectionSheetRequest postCollectionSheetRequest, @retrofit2.http.Query("command") String command
                );


            /**
            * Generate Individual Collection Sheet | Save Collection Sheet
            * Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.
                * @param postCollectionSheetRequest  (required)
                * @param command command (optional)
            * @return Call&lt;PostCollectionSheetResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("collectionsheet")
        Call<PostCollectionSheetResponse> generateCollectionSheet(
        @retrofit2.http.Body PostCollectionSheetRequest postCollectionSheetRequest, @retrofit2.http.Query("command") String command
                , @HeaderMap Map<String, String> headers);

        }
