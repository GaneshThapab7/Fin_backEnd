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

    public interface CalendarApi {
        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("{entityType}/{entityId}/calendars")
        Call<String> createCalendar(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param calendarId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("{entityType}/{entityId}/calendars/{calendarId}")
        Call<String> deleteCalendar(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("calendarId") Long calendarId
                );

        /**
        * 
        * 
            * @param calendarId  (required)
            * @param entityType  (required)
            * @param entityId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("{entityType}/{entityId}/calendars/{calendarId}")
        Call<String> retrieveCalendar(
        @retrofit2.http.Path("calendarId") Long calendarId, @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param calendarType  (optional, default to all)
        * @return Call&lt;String&gt;
        */
        @GET("{entityType}/{entityId}/calendars")
        Call<String> retrieveCalendarsByEntity(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("calendarType") String calendarType
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("{entityType}/{entityId}/calendars/template")
        Call<String> retrieveNewCalendarDetails(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param calendarId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("{entityType}/{entityId}/calendars/{calendarId}")
        Call<String> updateCalendar(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("calendarId") Long calendarId, @retrofit2.http.Body String body
                );


            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("{entityType}/{entityId}/calendars")
        Call<String> createCalendar(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param calendarId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("{entityType}/{entityId}/calendars/{calendarId}")
        Call<String> deleteCalendar(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("calendarId") Long calendarId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param calendarId  (required)
                * @param entityType  (required)
                * @param entityId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("{entityType}/{entityId}/calendars/{calendarId}")
        Call<String> retrieveCalendar(
        @retrofit2.http.Path("calendarId") Long calendarId, @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param calendarType  (optional, default to all)
            * @return Call&lt;String&gt;
            */
            @GET("{entityType}/{entityId}/calendars")
        Call<String> retrieveCalendarsByEntity(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("calendarType") String calendarType
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("{entityType}/{entityId}/calendars/template")
        Call<String> retrieveNewCalendarDetails(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param calendarId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("{entityType}/{entityId}/calendars/{calendarId}")
        Call<String> updateCalendar(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("calendarId") Long calendarId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
