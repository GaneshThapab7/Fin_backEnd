package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetGlobalConfigurationsResponse;
import org.apache.fineract.client.models.GlobalConfigurationPropertyData;
import org.apache.fineract.client.models.PutGlobalConfigurationsRequest;
import org.apache.fineract.client.models.PutGlobalConfigurationsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface GlobalConfigurationApi {
        /**
        * Retrieve Global Configuration | Retrieve Global Configuration for surveys
        * Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey
            * @param survey survey (optional, default to false)
        * @return Call&lt;GetGlobalConfigurationsResponse&gt;
        */
        @GET("configurations")
        Call<GetGlobalConfigurationsResponse> retrieveConfiguration(
        @retrofit2.http.Query("survey") Boolean survey
                );

        /**
        * Retrieve Global Configuration
        * Returns a global enable/disable configurations.  Example Requests:  configurations/1
            * @param configId configId (required)
        * @return Call&lt;GetGlobalConfigurationsResponse&gt;
        */
        @GET("configurations/{configId}")
        Call<GetGlobalConfigurationsResponse> retrieveOne3(
        @retrofit2.http.Path("configId") Long configId
                );

        /**
        * Retrieve Global Configuration
        * Returns a global enable/disable configuration.  Example Requests:  configurations/name/Enable-Address
            * @param name name (required)
        * @return Call&lt;GlobalConfigurationPropertyData&gt;
        */
        @GET("configurations/name/{name}")
        Call<GlobalConfigurationPropertyData> retrieveOneByName(
        @retrofit2.http.Path("name") String name
                );

        /**
        * Update Global Configuration
        * Updates an enable/disable global configuration item.
            * @param configId configId (required)
            * @param putGlobalConfigurationsRequest  (required)
        * @return Call&lt;PutGlobalConfigurationsResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("configurations/{configId}")
        Call<PutGlobalConfigurationsResponse> updateConfiguration1(
        @retrofit2.http.Path("configId") Long configId, @retrofit2.http.Body PutGlobalConfigurationsRequest putGlobalConfigurationsRequest
                );


            /**
            * Retrieve Global Configuration | Retrieve Global Configuration for surveys
            * Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey
                * @param survey survey (optional, default to false)
            * @return Call&lt;GetGlobalConfigurationsResponse&gt;
            */
            @GET("configurations")
        Call<GetGlobalConfigurationsResponse> retrieveConfiguration(
        @retrofit2.http.Query("survey") Boolean survey
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Global Configuration
            * Returns a global enable/disable configurations.  Example Requests:  configurations/1
                * @param configId configId (required)
            * @return Call&lt;GetGlobalConfigurationsResponse&gt;
            */
            @GET("configurations/{configId}")
        Call<GetGlobalConfigurationsResponse> retrieveOne3(
        @retrofit2.http.Path("configId") Long configId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Global Configuration
            * Returns a global enable/disable configuration.  Example Requests:  configurations/name/Enable-Address
                * @param name name (required)
            * @return Call&lt;GlobalConfigurationPropertyData&gt;
            */
            @GET("configurations/name/{name}")
        Call<GlobalConfigurationPropertyData> retrieveOneByName(
        @retrofit2.http.Path("name") String name
                , @HeaderMap Map<String, String> headers);

            /**
            * Update Global Configuration
            * Updates an enable/disable global configuration item.
                * @param configId configId (required)
                * @param putGlobalConfigurationsRequest  (required)
            * @return Call&lt;PutGlobalConfigurationsResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("configurations/{configId}")
        Call<PutGlobalConfigurationsResponse> updateConfiguration1(
        @retrofit2.http.Path("configId") Long configId, @retrofit2.http.Body PutGlobalConfigurationsRequest putGlobalConfigurationsRequest
                , @HeaderMap Map<String, String> headers);

        }
