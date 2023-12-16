package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteCodeValueDataResponse;
import org.apache.fineract.client.models.GetCodeValuesDataResponse;
import org.apache.fineract.client.models.PostCodeValueDataResponse;
import org.apache.fineract.client.models.PostCodeValuesDataRequest;
import org.apache.fineract.client.models.PutCodeValueDataResponse;
import org.apache.fineract.client.models.PutCodeValuesDataRequest;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface CodeValuesApi {
        /**
        * Create a Code description
        * 
            * @param codeId codeId (required)
            * @param postCodeValuesDataRequest  (required)
        * @return Call&lt;PostCodeValueDataResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("codes/{codeId}/codevalues")
        Call<PostCodeValueDataResponse> createCodeValue(
        @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Body PostCodeValuesDataRequest postCodeValuesDataRequest
                );

        /**
        * Delete a Code description
        * Deletes a code description
            * @param codeId codeId (required)
            * @param codeValueId codeValueId (required)
        * @return Call&lt;DeleteCodeValueDataResponse&gt;
        */
        @DELETE("codes/{codeId}/codevalues/{codeValueId}")
        Call<DeleteCodeValueDataResponse> deleteCodeValue(
        @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Path("codeValueId") Long codeValueId
                );

        /**
        * List Code Values
        * Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues
            * @param codeId codeId (required)
        * @return Call&lt;List&lt;GetCodeValuesDataResponse&gt;&gt;
        */
        @GET("codes/{codeId}/codevalues")
        Call<List<GetCodeValuesDataResponse>> retrieveAllCodeValues(
        @retrofit2.http.Path("codeId") Long codeId
                );

        /**
        * Retrieve a Code description
        * Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1
            * @param codeValueId codeValueId (required)
            * @param codeId codeId (required)
        * @return Call&lt;GetCodeValuesDataResponse&gt;
        */
        @GET("codes/{codeId}/codevalues/{codeValueId}")
        Call<GetCodeValuesDataResponse> retrieveCodeValue(
        @retrofit2.http.Path("codeValueId") Long codeValueId, @retrofit2.http.Path("codeId") Long codeId
                );

        /**
        * Update a Code description
        * Updates the details of a code description.
            * @param codeId codeId (required)
            * @param codeValueId codeValueId (required)
            * @param putCodeValuesDataRequest  (required)
        * @return Call&lt;PutCodeValueDataResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("codes/{codeId}/codevalues/{codeValueId}")
        Call<PutCodeValueDataResponse> updateCodeValue(
        @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Path("codeValueId") Long codeValueId, @retrofit2.http.Body PutCodeValuesDataRequest putCodeValuesDataRequest
                );


            /**
            * Create a Code description
            * 
                * @param codeId codeId (required)
                * @param postCodeValuesDataRequest  (required)
            * @return Call&lt;PostCodeValueDataResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("codes/{codeId}/codevalues")
        Call<PostCodeValueDataResponse> createCodeValue(
        @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Body PostCodeValuesDataRequest postCodeValuesDataRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Code description
            * Deletes a code description
                * @param codeId codeId (required)
                * @param codeValueId codeValueId (required)
            * @return Call&lt;DeleteCodeValueDataResponse&gt;
            */
            @DELETE("codes/{codeId}/codevalues/{codeValueId}")
        Call<DeleteCodeValueDataResponse> deleteCodeValue(
        @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Path("codeValueId") Long codeValueId
                , @HeaderMap Map<String, String> headers);

            /**
            * List Code Values
            * Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues
                * @param codeId codeId (required)
            * @return Call&lt;List&lt;GetCodeValuesDataResponse&gt;&gt;
            */
            @GET("codes/{codeId}/codevalues")
        Call<List<GetCodeValuesDataResponse>> retrieveAllCodeValues(
        @retrofit2.http.Path("codeId") Long codeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Code description
            * Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1
                * @param codeValueId codeValueId (required)
                * @param codeId codeId (required)
            * @return Call&lt;GetCodeValuesDataResponse&gt;
            */
            @GET("codes/{codeId}/codevalues/{codeValueId}")
        Call<GetCodeValuesDataResponse> retrieveCodeValue(
        @retrofit2.http.Path("codeValueId") Long codeValueId, @retrofit2.http.Path("codeId") Long codeId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update a Code description
            * Updates the details of a code description.
                * @param codeId codeId (required)
                * @param codeValueId codeValueId (required)
                * @param putCodeValuesDataRequest  (required)
            * @return Call&lt;PutCodeValueDataResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("codes/{codeId}/codevalues/{codeValueId}")
        Call<PutCodeValueDataResponse> updateCodeValue(
        @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Path("codeValueId") Long codeValueId, @retrofit2.http.Body PutCodeValuesDataRequest putCodeValuesDataRequest
                , @HeaderMap Map<String, String> headers);

        }
