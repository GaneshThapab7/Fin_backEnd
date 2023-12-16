package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.ChangeInstanceModeRequest;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface InstanceModeApi {
        /**
        * Changes the Fineract instance mode
        * 
            * @param changeInstanceModeRequest  (required)
        * @return Call&lt;Void&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("instance-mode")
        Call<Void> changeMode(
        @retrofit2.http.Body ChangeInstanceModeRequest changeInstanceModeRequest
                );


            /**
            * Changes the Fineract instance mode
            * 
                * @param changeInstanceModeRequest  (required)
            * @return Call&lt;Void&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("instance-mode")
        Call<Void> changeMode(
        @retrofit2.http.Body ChangeInstanceModeRequest changeInstanceModeRequest
                , @HeaderMap Map<String, String> headers);

        }
