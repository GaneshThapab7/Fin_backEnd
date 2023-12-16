package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

    import io.reactivex.Observable;
        import io.reactivex.Completable;
    import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetAccountsLinkedToPocketResponse;
import org.apache.fineract.client.models.PostLinkDelinkAccountsToFromPocketResponse;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public interface PocketApi {
        /**
        * Link/delink accounts to/from pocket
        * Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts
            * @param command command (optional)
            * @param body  (optional)
        * @return Call&lt;PostLinkDelinkAccountsToFromPocketResponse&gt;
        */
                    @Headers({
                    "Content-Type:application/json"
                    })
        @POST("self/pockets")
        Call<PostLinkDelinkAccountsToFromPocketResponse> handleCommands7(
        @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                );

        /**
        * Retrieve accounts linked to pocket
        * All linked loan  Example Requests:   self/pockets
        * @return Call&lt;GetAccountsLinkedToPocketResponse&gt;
        */
        @GET("self/pockets")
        Call<GetAccountsLinkedToPocketResponse> retrieveAll37();
        


            /**
            * Link/delink accounts to/from pocket
            * Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts
                * @param command command (optional)
                * @param body  (optional)
            * @return Call&lt;PostLinkDelinkAccountsToFromPocketResponse&gt;
            */
                        @Headers({
                        "Content-Type:application/json"
                        })
            @POST("self/pockets")
        Call<PostLinkDelinkAccountsToFromPocketResponse> handleCommands7(
        @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
                , @HeaderMap Map<String, String> headers);

            /**
            * Retrieve accounts linked to pocket
            * All linked loan  Example Requests:   self/pockets
            * @return Call&lt;GetAccountsLinkedToPocketResponse&gt;
            */
            @GET("self/pockets")
        Call<GetAccountsLinkedToPocketResponse> retrieveAll37(@HeaderMap Map<String, String> headers);
        

        }
