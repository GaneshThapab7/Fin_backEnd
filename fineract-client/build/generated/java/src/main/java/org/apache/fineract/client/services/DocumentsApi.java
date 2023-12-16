package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteEntityTypeEntityIdDocumentsResponse;
import java.io.File;
import org.apache.fineract.client.models.GetEntityTypeEntityIdDocumentsResponse;
import org.apache.fineract.client.models.PostEntityTypeEntityIdDocumentsResponse;
import org.apache.fineract.client.models.PutEntityTypeEntityIdDocumentsResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface DocumentsApi {
        /**
        * Create a Document
        * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
            * @param entityType entityType (required)
            * @param entityId entityId (required)
            * @param contentLength Content-Length (optional)
            * @param dateFormat  (optional)
            * @param description  (optional)
            * @param locale  (optional)
            * @param name  (optional)
            * @param uploadedInputStream  (optional)
        * @return Call&lt;PostEntityTypeEntityIdDocumentsResponse&gt;
        */
                @retrofit2.http.Multipart
        @POST("{entityType}/{entityId}/documents")
        Call<PostEntityTypeEntityIdDocumentsResponse> createDocument(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("description") String description, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("name") String name, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                );

        /**
        * Remove a Document
        * 
            * @param entityType entityType (required)
            * @param entityId entityId (required)
            * @param documentId documentId (required)
        * @return Call&lt;DeleteEntityTypeEntityIdDocumentsResponse&gt;
        */
        @DELETE("{entityType}/{entityId}/documents/{documentId}")
        Call<DeleteEntityTypeEntityIdDocumentsResponse> deleteDocument(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
                );

        /**
        * Retrieve Binary File associated with Document
        * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
            * @param entityType entityType (required)
            * @param entityId entityId (required)
            * @param documentId documentId (required)
        * @return Call&lt;Void&gt;
        */
        @GET("{entityType}/{entityId}/documents/{documentId}/attachment")
        Call<Void> downloadFile(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
                );

        /**
        * Retrieve a Document
        * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
            * @param entityType entityType (required)
            * @param entityId entityId (required)
            * @param documentId documentId (required)
        * @return Call&lt;GetEntityTypeEntityIdDocumentsResponse&gt;
        */
        @GET("{entityType}/{entityId}/documents/{documentId}")
        Call<GetEntityTypeEntityIdDocumentsResponse> getDocument(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
                );

        /**
        * List documents
        * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
            * @param entityType entityType (required)
            * @param entityId entityId (required)
        * @return Call&lt;List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;&gt;
        */
        @GET("{entityType}/{entityId}/documents")
        Call<List<GetEntityTypeEntityIdDocumentsResponse>> retrieveAllDocuments(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
                );

        /**
        * Update a Document
        * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
            * @param entityType entityType (required)
            * @param entityId entityId (required)
            * @param documentId documentId (required)
            * @param contentLength Content-Length (optional)
            * @param dateFormat  (optional)
            * @param description  (optional)
            * @param locale  (optional)
            * @param name  (optional)
            * @param uploadedInputStream  (optional)
        * @return Call&lt;PutEntityTypeEntityIdDocumentsResponse&gt;
        */
                @retrofit2.http.Multipart
        @PUT("{entityType}/{entityId}/documents/{documentId}")
        Call<PutEntityTypeEntityIdDocumentsResponse> updateDocument(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("description") String description, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("name") String name, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                );


            /**
            * Create a Document
            * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
                * @param entityType entityType (required)
                * @param entityId entityId (required)
                * @param contentLength Content-Length (optional)
                * @param dateFormat  (optional)
                * @param description  (optional)
                * @param locale  (optional)
                * @param name  (optional)
                * @param uploadedInputStream  (optional)
            * @return Call&lt;PostEntityTypeEntityIdDocumentsResponse&gt;
            */
                @retrofit2.http.Multipart
            @POST("{entityType}/{entityId}/documents")
        Call<PostEntityTypeEntityIdDocumentsResponse> createDocument(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("description") String description, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("name") String name, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                , @HeaderMap Map<String, String> headers);

            /**
            * Remove a Document
            * 
                * @param entityType entityType (required)
                * @param entityId entityId (required)
                * @param documentId documentId (required)
            * @return Call&lt;DeleteEntityTypeEntityIdDocumentsResponse&gt;
            */
            @DELETE("{entityType}/{entityId}/documents/{documentId}")
        Call<DeleteEntityTypeEntityIdDocumentsResponse> deleteDocument(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve Binary File associated with Document
            * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
                * @param entityType entityType (required)
                * @param entityId entityId (required)
                * @param documentId documentId (required)
            * @return Call&lt;Void&gt;
            */
            @GET("{entityType}/{entityId}/documents/{documentId}/attachment")
        Call<Void> downloadFile(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve a Document
            * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
                * @param entityType entityType (required)
                * @param entityId entityId (required)
                * @param documentId documentId (required)
            * @return Call&lt;GetEntityTypeEntityIdDocumentsResponse&gt;
            */
            @GET("{entityType}/{entityId}/documents/{documentId}")
        Call<GetEntityTypeEntityIdDocumentsResponse> getDocument(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
                , @HeaderMap Map<String, String> headers);

            /**
            * List documents
            * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
                * @param entityType entityType (required)
                * @param entityId entityId (required)
            * @return Call&lt;List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;&gt;
            */
            @GET("{entityType}/{entityId}/documents")
        Call<List<GetEntityTypeEntityIdDocumentsResponse>> retrieveAllDocuments(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
                , @HeaderMap Map<String, String> headers);

            /**
            * Update a Document
            * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
                * @param entityType entityType (required)
                * @param entityId entityId (required)
                * @param documentId documentId (required)
                * @param contentLength Content-Length (optional)
                * @param dateFormat  (optional)
                * @param description  (optional)
                * @param locale  (optional)
                * @param name  (optional)
                * @param uploadedInputStream  (optional)
            * @return Call&lt;PutEntityTypeEntityIdDocumentsResponse&gt;
            */
                @retrofit2.http.Multipart
            @PUT("{entityType}/{entityId}/documents/{documentId}")
        Call<PutEntityTypeEntityIdDocumentsResponse> updateDocument(
        @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("dateFormat") String dateFormat, @retrofit2.http.Part("description") String description, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("name") String name, @retrofit2.http.Part MultipartBody.Part uploadedInputStream
                , @HeaderMap Map<String, String> headers);

        }
