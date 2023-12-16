package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.PostSelfAuthenticationResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SelfAuthenticationApi {
        /**
        * Verify authentication
        * Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://fineract.apache.org/legacy-docs/apiLive.htm#selfbasicauth
            * @param body  (optional)
        * @return Call&lt;PostSelfAuthenticationResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("self/authentication")
        Call<PostSelfAuthenticationResponse> authenticate1(
        @retrofit2.http.Body String body
                );


            /**
            * Verify authentication
            * Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://fineract.apache.org/legacy-docs/apiLive.htm#selfbasicauth
                * @param body  (optional)
            * @return Call&lt;PostSelfAuthenticationResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("self/authentication")
        Call<PostSelfAuthenticationResponse> authenticate1(
        @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
