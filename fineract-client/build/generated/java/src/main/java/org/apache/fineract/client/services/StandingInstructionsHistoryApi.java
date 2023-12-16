package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetStandingInstructionRunHistoryResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface StandingInstructionsHistoryApi {
        /**
        * Standing Instructions Logged History
        * The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50
            * @param sqlSearch sqlSearch (optional)
            * @param externalId externalId (optional)
            * @param offset offset (optional)
            * @param limit limit (optional)
            * @param orderBy orderBy (optional)
            * @param sortOrder sortOrder (optional)
            * @param transferType transferType (optional)
            * @param clientName clientName (optional)
            * @param clientId clientId (optional)
            * @param fromAccountId fromAccountId (optional)
            * @param fromAccountType fromAccountType (optional)
            * @param locale locale (optional)
            * @param dateFormat dateFormat (optional)
            * @param fromDate fromDate (optional)
            * @param toDate toDate (optional)
        * @return Call&lt;GetStandingInstructionRunHistoryResponse&gt;
        */
        @GET("standinginstructionrunhistory")
        Call<GetStandingInstructionRunHistoryResponse> retrieveAll20(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("transferType") Integer transferType, @retrofit2.http.Query("clientName") String clientName, @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("fromAccountId") Long fromAccountId, @retrofit2.http.Query("fromAccountType") Integer fromAccountType, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("fromDate") Object fromDate, @retrofit2.http.Query("toDate") Object toDate
                );


            /**
            * Standing Instructions Logged History
            * The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50
                * @param sqlSearch sqlSearch (optional)
                * @param externalId externalId (optional)
                * @param offset offset (optional)
                * @param limit limit (optional)
                * @param orderBy orderBy (optional)
                * @param sortOrder sortOrder (optional)
                * @param transferType transferType (optional)
                * @param clientName clientName (optional)
                * @param clientId clientId (optional)
                * @param fromAccountId fromAccountId (optional)
                * @param fromAccountType fromAccountType (optional)
                * @param locale locale (optional)
                * @param dateFormat dateFormat (optional)
                * @param fromDate fromDate (optional)
                * @param toDate toDate (optional)
            * @return Call&lt;GetStandingInstructionRunHistoryResponse&gt;
            */
            @GET("standinginstructionrunhistory")
        Call<GetStandingInstructionRunHistoryResponse> retrieveAll20(
        @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("transferType") Integer transferType, @retrofit2.http.Query("clientName") String clientName, @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("fromAccountId") Long fromAccountId, @retrofit2.http.Query("fromAccountType") Integer fromAccountType, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("fromDate") Object fromDate, @retrofit2.http.Query("toDate") Object toDate
                , @HeaderMap Map<String, String> headers);

        }
