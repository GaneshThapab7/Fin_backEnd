package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetSelfUserDetailsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface SelfUserDetailsApi {
        /**
        * Fetch authenticated user details
        * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#selfoauth
        * @return Call&lt;GetSelfUserDetailsResponse&gt;
        */
        @GET("self/userdetails")
        Call<GetSelfUserDetailsResponse> fetchAuthenticatedUserData1();
        


            /**
            * Fetch authenticated user details
            * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#selfoauth
            * @return Call&lt;GetSelfUserDetailsResponse&gt;
            */
            @GET("self/userdetails")
        Call<GetSelfUserDetailsResponse> fetchAuthenticatedUserData1(@HeaderMap Map<String, String> headers);
        

        }
