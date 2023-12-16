package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetFieldConfigurationEntityResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface EntityFieldConfigurationApi {
        /**
        * Retrieves the Entity Field Configuration
        * It retrieves all the Entity Field Configuration
            * @param entity entity (required)
        * @return Call&lt;List&lt;GetFieldConfigurationEntityResponse&gt;&gt;
        */
        @GET("fieldconfiguration/{entity}")
        Call<List<GetFieldConfigurationEntityResponse>> getAddresses(
        @retrofit2.http.Path("entity") String entity
                );


            /**
            * Retrieves the Entity Field Configuration
            * It retrieves all the Entity Field Configuration
                * @param entity entity (required)
            * @return Call&lt;List&lt;GetFieldConfigurationEntityResponse&gt;&gt;
            */
            @GET("fieldconfiguration/{entity}")
        Call<List<GetFieldConfigurationEntityResponse>> getAddresses(
        @retrofit2.http.Path("entity") String entity
                , @HeaderMap Map<String, String> headers);

        }
