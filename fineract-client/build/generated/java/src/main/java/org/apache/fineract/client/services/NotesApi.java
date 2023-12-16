package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteResourceTypeResourceIdNotesNoteIdResponse;
import org.apache.fineract.client.models.GetResourceTypeResourceIdNotesNoteIdResponse;
import org.apache.fineract.client.models.GetResourceTypeResourceIdNotesResponse;
import org.apache.fineract.client.models.PostResourceTypeResourceIdNotesRequest;
import org.apache.fineract.client.models.PostResourceTypeResourceIdNotesResponse;
import org.apache.fineract.client.models.PutResourceTypeResourceIdNotesNoteIdRequest;
import org.apache.fineract.client.models.PutResourceTypeResourceIdNotesNoteIdResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface NotesApi {
        /**
        * Add a Resource Note
        * Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes
            * @param resourceType resourceType (required)
            * @param resourceId resourceId (required)
            * @param postResourceTypeResourceIdNotesRequest  (required)
        * @return Call&lt;PostResourceTypeResourceIdNotesResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("{resourceType}/{resourceId}/notes")
        Call<PostResourceTypeResourceIdNotesResponse> addNewNote(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body PostResourceTypeResourceIdNotesRequest postResourceTypeResourceIdNotesRequest
                );

        /**
        * Delete a Resource Note
        * Deletes a Resource Note
            * @param resourceType resourceType (required)
            * @param resourceId resourceId (required)
            * @param noteId noteId (required)
        * @return Call&lt;DeleteResourceTypeResourceIdNotesNoteIdResponse&gt;
        */
        @DELETE("{resourceType}/{resourceId}/notes/{noteId}")
        Call<DeleteResourceTypeResourceIdNotesNoteIdResponse> deleteNote(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId
                );

        /**
        * Retrieve a Resource Note
        * Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername
            * @param resourceType resourceType (required)
            * @param resourceId resourceId (required)
            * @param noteId noteId (required)
        * @return Call&lt;GetResourceTypeResourceIdNotesNoteIdResponse&gt;
        */
        @GET("{resourceType}/{resourceId}/notes/{noteId}")
        Call<GetResourceTypeResourceIdNotesNoteIdResponse> retrieveNote(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId
                );

        /**
        * Retrieve a Resource&#39;s description
        * Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername
            * @param resourceType resourceType (required)
            * @param resourceId resourceId (required)
        * @return Call&lt;List&lt;GetResourceTypeResourceIdNotesResponse&gt;&gt;
        */
        @GET("{resourceType}/{resourceId}/notes")
        Call<List<GetResourceTypeResourceIdNotesResponse>> retrieveNotesByResource(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId
                );

        /**
        * Update a Resource Note
        * Updates a Resource Note
            * @param resourceType resourceType (required)
            * @param resourceId resourceId (required)
            * @param noteId noteId (required)
            * @param putResourceTypeResourceIdNotesNoteIdRequest  (required)
        * @return Call&lt;PutResourceTypeResourceIdNotesNoteIdResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @PUT("{resourceType}/{resourceId}/notes/{noteId}")
        Call<PutResourceTypeResourceIdNotesNoteIdResponse> updateNote(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId, @retrofit2.http.Body PutResourceTypeResourceIdNotesNoteIdRequest putResourceTypeResourceIdNotesNoteIdRequest
                );


            /**
            * Add a Resource Note
            * Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes
                * @param resourceType resourceType (required)
                * @param resourceId resourceId (required)
                * @param postResourceTypeResourceIdNotesRequest  (required)
            * @return Call&lt;PostResourceTypeResourceIdNotesResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("{resourceType}/{resourceId}/notes")
        Call<PostResourceTypeResourceIdNotesResponse> addNewNote(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body PostResourceTypeResourceIdNotesRequest postResourceTypeResourceIdNotesRequest
                , @HeaderMap Map<String, String> headers);

            /**
            * Delete a Resource Note
            * Deletes a Resource Note
                * @param resourceType resourceType (required)
                * @param resourceId resourceId (required)
                * @param noteId noteId (required)
            * @return Call&lt;DeleteResourceTypeResourceIdNotesNoteIdResponse&gt;
            */
            @DELETE("{resourceType}/{resourceId}/notes/{noteId}")
        Call<DeleteResourceTypeResourceIdNotesNoteIdResponse> deleteNote(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Resource Note
            * Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername
                * @param resourceType resourceType (required)
                * @param resourceId resourceId (required)
                * @param noteId noteId (required)
            * @return Call&lt;GetResourceTypeResourceIdNotesNoteIdResponse&gt;
            */
            @GET("{resourceType}/{resourceId}/notes/{noteId}")
        Call<GetResourceTypeResourceIdNotesNoteIdResponse> retrieveNote(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Resource&#39;s description
            * Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername
                * @param resourceType resourceType (required)
                * @param resourceId resourceId (required)
            * @return Call&lt;List&lt;GetResourceTypeResourceIdNotesResponse&gt;&gt;
            */
            @GET("{resourceType}/{resourceId}/notes")
        Call<List<GetResourceTypeResourceIdNotesResponse>> retrieveNotesByResource(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update a Resource Note
            * Updates a Resource Note
                * @param resourceType resourceType (required)
                * @param resourceId resourceId (required)
                * @param noteId noteId (required)
                * @param putResourceTypeResourceIdNotesNoteIdRequest  (required)
            * @return Call&lt;PutResourceTypeResourceIdNotesNoteIdResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @PUT("{resourceType}/{resourceId}/notes/{noteId}")
        Call<PutResourceTypeResourceIdNotesNoteIdResponse> updateNote(
        @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId, @retrofit2.http.Body PutResourceTypeResourceIdNotesNoteIdRequest putResourceTypeResourceIdNotesNoteIdRequest
                , @HeaderMap Map<String, String> headers);

        }
