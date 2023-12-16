package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.ExternalServicesPropertiesData;
import org.apache.fineract.client.models.PutExternalServiceRequest;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface ExternalServicesApi {
        /**
        * Retrieve External Services Configuration
        * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
            * @param servicename servicename (required)
        * @return Call&lt;ExternalServicesPropertiesData&gt;
        */
        @GET("externalservice/{servicename}")
        Call<ExternalServicesPropertiesData> retrieveOne2(
        @retrofit2.http.Path("servicename") String servicename
                );

        /**
        * Update External Service
        * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
            * @param servicename servicename (required)
            * @param putExternalServiceRequest  (required)
        * @return Call&lt;Void&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("externalservice/{servicename}")
        Call<Void> updateExternalServiceProperties(
        @retrofit2.http.Path("servicename") String servicename, @retrofit2.http.Body PutExternalServiceRequest putExternalServiceRequest
                );


            /**
            * Retrieve External Services Configuration
            * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
                * @param servicename servicename (required)
            * @return Call&lt;ExternalServicesPropertiesData&gt;
            */
            @GET("externalservice/{servicename}")
        Call<ExternalServicesPropertiesData> retrieveOne2(
        @retrofit2.http.Path("servicename") String servicename
                , @HeaderMap Map<String, String> headers);

            /**
            * Update External Service
            * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
                * @param servicename servicename (required)
                * @param putExternalServiceRequest  (required)
            * @return Call&lt;Void&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("externalservice/{servicename}")
        Call<Void> updateExternalServiceProperties(
        @retrofit2.http.Path("servicename") String servicename, @retrofit2.http.Body PutExternalServiceRequest putExternalServiceRequest
                , @HeaderMap Map<String, String> headers);

        }
