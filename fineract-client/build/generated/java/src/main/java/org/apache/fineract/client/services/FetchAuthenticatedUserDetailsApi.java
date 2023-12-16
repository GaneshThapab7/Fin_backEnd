package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetUserDetailsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface FetchAuthenticatedUserDetailsApi {
        /**
        * Fetch authenticated user details 
        * checks the Authentication and returns the set roles and permissions allowed.
        * @return Call&lt;GetUserDetailsResponse&gt;
        */
        @GET("userdetails")
        Call<GetUserDetailsResponse> fetchAuthenticatedUserData();
        


            /**
            * Fetch authenticated user details 
            * checks the Authentication and returns the set roles and permissions allowed.
            * @return Call&lt;GetUserDetailsResponse&gt;
            */
            @GET("userdetails")
        Call<GetUserDetailsResponse> fetchAuthenticatedUserData(@HeaderMap Map<String, String> headers);
        

        }
