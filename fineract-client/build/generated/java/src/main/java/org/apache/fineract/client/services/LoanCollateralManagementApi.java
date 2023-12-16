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

    public interface LoanCollateralManagementApi {
        /**
        * Delete Loan Collateral
        * Delete Loan Collateral
            * @param loanId loanId (required)
            * @param id loan collateral id (required)
        * @return Call&lt;String&gt;
        */
        @DELETE("loan-collateral-management/{id}")
        Call<String> deleteLoanCollateral(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("id") Long id
                );

        /**
        * Get Loan Collateral Details
        * Get Loan Collateral Details
            * @param collateralId collateralId (required)
        * @return Call&lt;String&gt;
        */
        @GET("loan-collateral-management/{collateralId}")
        Call<String> getLoanCollateral(
        @retrofit2.http.Path("collateralId") Long collateralId
                );


            /**
            * Delete Loan Collateral
            * Delete Loan Collateral
                * @param loanId loanId (required)
                * @param id loan collateral id (required)
            * @return Call&lt;String&gt;
            */
            @DELETE("loan-collateral-management/{id}")
        Call<String> deleteLoanCollateral(
        @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("id") Long id
                , @HeaderMap Map<String, String> headers);

            /**
            * Get Loan Collateral Details
            * Get Loan Collateral Details
                * @param collateralId collateralId (required)
            * @return Call&lt;String&gt;
            */
            @GET("loan-collateral-management/{collateralId}")
        Call<String> getLoanCollateral(
        @retrofit2.http.Path("collateralId") Long collateralId
                , @HeaderMap Map<String, String> headers);

        }
