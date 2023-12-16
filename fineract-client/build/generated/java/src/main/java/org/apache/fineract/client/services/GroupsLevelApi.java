package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;


    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface GroupsLevelApi {
        /**
        * 
        * 
        * @return Call&lt;String&gt;
        */
        @GET("grouplevels")
        Call<String> retrieveAllGroups();
        


            /**
            * 
            * 
            * @return Call&lt;String&gt;
            */
            @GET("grouplevels")
        Call<String> retrieveAllGroups(@HeaderMap Map<String, String> headers);
        

        }
