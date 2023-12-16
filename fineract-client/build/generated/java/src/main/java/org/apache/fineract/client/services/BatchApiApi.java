package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.BatchRequest;
import org.apache.fineract.client.models.BatchResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface BatchApiApi {
        /**
        * Batch requests in a single transaction
        * The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.
            * @param batchRequest  (required)
            * @param enclosingTransaction enclosingTransaction (optional, default to false)
        * @return Call&lt;List&lt;BatchResponse&gt;&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("batches")
        Call<List<BatchResponse>> handleBatchRequests(
        @retrofit2.http.Body List<BatchRequest> batchRequest, @retrofit2.http.Query("enclosingTransaction") Boolean enclosingTransaction
                );


            /**
            * Batch requests in a single transaction
            * The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.
                * @param batchRequest  (required)
                * @param enclosingTransaction enclosingTransaction (optional, default to false)
            * @return Call&lt;List&lt;BatchResponse&gt;&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("batches")
        Call<List<BatchResponse>> handleBatchRequests(
        @retrofit2.http.Body List<BatchRequest> batchRequest, @retrofit2.http.Query("enclosingTransaction") Boolean enclosingTransaction
                , @HeaderMap Map<String, String> headers);

        }
