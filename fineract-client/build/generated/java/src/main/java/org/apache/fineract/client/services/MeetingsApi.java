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

    public interface MeetingsApi {
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
        @POST("{entityType}/{entityId}/meetings")
        Call<String> createMeeting(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param meetingId  (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("{entityType}/{entityId}/meetings/{meetingId}")
        Call<String> deleteMeeting(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param meetingId  (required)
            * @param command  (optional)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("{entityType}/{entityId}/meetings/{meetingId}")
        Call<String> performMeetingCommands(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                );

        /**
        * 
        * 
            * @param meetingId  (required)
            * @param entityType  (required)
            * @param entityId  (required)
        * @return Call&lt;String&gt;
        */
        @GET("{entityType}/{entityId}/meetings/{meetingId}")
        Call<String> retrieveMeeting(
        @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param limit  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("{entityType}/{entityId}/meetings")
        Call<String> retrieveMeetings(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("limit") Integer limit
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param calendarId  (optional)
        * @return Call&lt;String&gt;
        */
        @GET("{entityType}/{entityId}/meetings/template")
        Call<String> template11(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("calendarId") Long calendarId
                );

        /**
        * 
        * 
            * @param entityType  (required)
            * @param entityId  (required)
            * @param meetingId  (required)
            * @param body  (optional)
        * @return Call&lt;String&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("{entityType}/{entityId}/meetings/{meetingId}")
        Call<String> updateMeeting(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Body String body
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
            @POST("{entityType}/{entityId}/meetings")
        Call<String> createMeeting(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param meetingId  (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("{entityType}/{entityId}/meetings/{meetingId}")
        Call<String> deleteMeeting(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param meetingId  (required)
                * @param command  (optional)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("{entityType}/{entityId}/meetings/{meetingId}")
        Call<String> performMeetingCommands(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param meetingId  (required)
                * @param entityType  (required)
                * @param entityId  (required)
            * @return Call&lt;String&gt;
            */
            @GET("{entityType}/{entityId}/meetings/{meetingId}")
        Call<String> retrieveMeeting(
        @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param limit  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("{entityType}/{entityId}/meetings")
        Call<String> retrieveMeetings(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("limit") Integer limit
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param calendarId  (optional)
            * @return Call&lt;String&gt;
            */
            @GET("{entityType}/{entityId}/meetings/template")
        Call<String> template11(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("calendarId") Long calendarId
                , @HeaderMap Map<String, String> headers);

            /**
            * 
            * 
                * @param entityType  (required)
                * @param entityId  (required)
                * @param meetingId  (required)
                * @param body  (optional)
            * @return Call&lt;String&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("{entityType}/{entityId}/meetings/{meetingId}")
        Call<String> updateMeeting(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

        }
