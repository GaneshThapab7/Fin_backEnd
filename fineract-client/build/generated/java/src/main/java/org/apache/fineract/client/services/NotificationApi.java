package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetNotificationsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface NotificationApi {
        /**
        * 
        * 
            * @param orderBy orderBy (optional)
            * @param limit limit (optional)
            * @param offset offset (optional)
            * @param sortOrder sortOrder (optional)
            * @param isRead isRead (optional)
        * @return Call&lt;GetNotificationsResponse&gt;
        */
        @GET("notifications")
        Call<GetNotificationsResponse> getAllNotifications(
        @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("isRead") Boolean isRead
                );

        /**
        * 
        * 
        * @return Call&lt;Void&gt;
        */
        @PUT("notifications")
        Call<Void> update5();
        


            /**
            * 
            * 
                * @param orderBy orderBy (optional)
                * @param limit limit (optional)
                * @param offset offset (optional)
                * @param sortOrder sortOrder (optional)
                * @param isRead isRead (optional)
            * @return Call&lt;GetNotificationsResponse&gt;
            */
            @GET("notifications")
        Call<GetNotificationsResponse> getAllNotifications(
        @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("isRead") Boolean isRead
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
            * @return Call&lt;Void&gt;
            */
            @PUT("notifications")
        Call<Void> update5(@HeaderMap Map<String, String> headers);
        

        }
