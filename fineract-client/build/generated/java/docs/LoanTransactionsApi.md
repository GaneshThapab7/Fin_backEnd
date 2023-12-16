# LoanTransactionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustLoanTransaction**](LoanTransactionsApi.md#adjustLoanTransaction) | **POST** loans/{loanId}/transactions/{transactionId} | Adjust a Transaction |
| [**executeLoanTransaction**](LoanTransactionsApi.md#executeLoanTransaction) | **POST** loans/{loanId}/transactions | Significant Loan Transactions |
| [**retrieveTransaction**](LoanTransactionsApi.md#retrieveTransaction) | **GET** loans/{loanId}/transactions/{transactionId} | Retrieve a Transaction Details |
| [**retrieveTransactionTemplate**](LoanTransactionsApi.md#retrieveTransactionTemplate) | **GET** loans/{loanId}/transactions/template | Retrieve Loan Transaction Template |
| [**undoWaiveCharge**](LoanTransactionsApi.md#undoWaiveCharge) | **PUT** loans/{loanId}/transactions/{transactionId} | Undo a Waive Charge Transaction |



## adjustLoanTransaction

> PostLoansLoanIdTransactionsTransactionIdResponse adjustLoanTransaction(loanId, transactionId, postLoansLoanIdTransactionsTransactionIdRequest)

Adjust a Transaction

Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanTransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        LoanTransactionsApi apiInstance = new LoanTransactionsApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long transactionId = 56L; // Long | transactionId
        PostLoansLoanIdTransactionsTransactionIdRequest postLoansLoanIdTransactionsTransactionIdRequest = new PostLoansLoanIdTransactionsTransactionIdRequest(); // PostLoansLoanIdTransactionsTransactionIdRequest | 
        try {
            PostLoansLoanIdTransactionsTransactionIdResponse result = apiInstance.adjustLoanTransaction(loanId, transactionId, postLoansLoanIdTransactionsTransactionIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanTransactionsApi#adjustLoanTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loanId** | **Long**| loanId | |
| **transactionId** | **Long**| transactionId | |
| **postLoansLoanIdTransactionsTransactionIdRequest** | [**PostLoansLoanIdTransactionsTransactionIdRequest**](PostLoansLoanIdTransactionsTransactionIdRequest.md)|  | |

### Return type

[**PostLoansLoanIdTransactionsTransactionIdResponse**](PostLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## executeLoanTransaction

> PostLoansLoanIdTransactionsResponse executeLoanTransaction(loanId, postLoansLoanIdTransactionsRequest, command)

Significant Loan Transactions

This API covers the major loan transaction functionality  Example Requests:  loans/1/transactions?command&#x3D;repayment | Make a Repayment |  loans/1/transactions?command&#x3D;merchantIssuedRefund | Merchant Issued Refund |  loans/1/transactions?command&#x3D;payoutRefund | Payout Refund |  loans/1/transactions?command&#x3D;goodwillCredit | Goodwil Credit |  loans/1/transactions?command&#x3D;waiveinterest | Waive Interest |  loans/1/transactions?command&#x3D;writeoff | Write-off Loan |  loans/1/transactions?command&#x3D;close-rescheduled | Close Rescheduled Loan |  loans/1/transactions?command&#x3D;close | Close Loan |  loans/1/transactions?command&#x3D;undowriteoff | Undo Loan Write-off |  loans/1/transactions?command&#x3D;recoverypayment | Make Recovery Payment |  loans/1/transactions?command&#x3D;refundByCash | Make a Refund of an Active Loan by Cash |  loans/1/transactions?command&#x3D;foreclosure | Foreclosure of an Active Loan |  loans/1/transactions?command&#x3D;creditBalanceRefund | Credit Balance Refund |   

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanTransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        LoanTransactionsApi apiInstance = new LoanTransactionsApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        PostLoansLoanIdTransactionsRequest postLoansLoanIdTransactionsRequest = new PostLoansLoanIdTransactionsRequest(); // PostLoansLoanIdTransactionsRequest | 
        String command = "command_example"; // String | command
        try {
            PostLoansLoanIdTransactionsResponse result = apiInstance.executeLoanTransaction(loanId, postLoansLoanIdTransactionsRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanTransactionsApi#executeLoanTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loanId** | **Long**| loanId | |
| **postLoansLoanIdTransactionsRequest** | [**PostLoansLoanIdTransactionsRequest**](PostLoansLoanIdTransactionsRequest.md)|  | |
| **command** | **String**| command | [optional] |

### Return type

[**PostLoansLoanIdTransactionsResponse**](PostLoansLoanIdTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTransaction

> GetLoansLoanIdTransactionsTransactionIdResponse retrieveTransaction(loanId, transactionId, fields)

Retrieve a Transaction Details

Retrieves a Transaction Details  Example Request:  loans/5/transactions/3

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanTransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        LoanTransactionsApi apiInstance = new LoanTransactionsApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long transactionId = 56L; // Long | transactionId
        String fields = "id,date,amount"; // String | Optional Loan Transaction attribute list to be in the response
        try {
            GetLoansLoanIdTransactionsTransactionIdResponse result = apiInstance.retrieveTransaction(loanId, transactionId, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanTransactionsApi#retrieveTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loanId** | **Long**| loanId | |
| **transactionId** | **Long**| transactionId | |
| **fields** | **String**| Optional Loan Transaction attribute list to be in the response | [optional] |

### Return type

[**GetLoansLoanIdTransactionsTransactionIdResponse**](GetLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTransactionTemplate

> GetLoansLoanIdTransactionsTemplateResponse retrieveTransactionTemplate(loanId, command, dateFormat, transactionDate, locale)

Retrieve Loan Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  loans/1/transactions/template?command&#x3D;repaymentloans/1/transactions/template?command&#x3D;merchantIssuedRefundloans/1/transactions/template?command&#x3D;payoutRefundloans/1/transactions/template?command&#x3D;goodwillCredit loans/1/transactions/template?command&#x3D;waiveinterest loans/1/transactions/template?command&#x3D;writeoff loans/1/transactions/template?command&#x3D;close-rescheduled loans/1/transactions/template?command&#x3D;close loans/1/transactions/template?command&#x3D;disburse loans/1/transactions/template?command&#x3D;disburseToSavings loans/1/transactions/template?command&#x3D;recoverypayment loans/1/transactions/template?command&#x3D;prepayLoan loans/1/transactions/template?command&#x3D;refundbycash loans/1/transactions/template?command&#x3D;refundbytransfer loans/1/transactions/template?command&#x3D;foreclosure loans/1/transactions/template?command&#x3D;creditBalanceRefund (returned &#39;amount&#39; field will have the overpaid value

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanTransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        LoanTransactionsApi apiInstance = new LoanTransactionsApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        String command = "command_example"; // String | command
        String dateFormat = "dateFormat_example"; // String | dateFormat
        Object transactionDate = null; // Object | transactionDate
        String locale = "locale_example"; // String | locale
        try {
            GetLoansLoanIdTransactionsTemplateResponse result = apiInstance.retrieveTransactionTemplate(loanId, command, dateFormat, transactionDate, locale);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanTransactionsApi#retrieveTransactionTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loanId** | **Long**| loanId | |
| **command** | **String**| command | [optional] |
| **dateFormat** | **String**| dateFormat | [optional] |
| **transactionDate** | [**Object**](.md)| transactionDate | [optional] |
| **locale** | **String**| locale | [optional] |

### Return type

[**GetLoansLoanIdTransactionsTemplateResponse**](GetLoansLoanIdTransactionsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## undoWaiveCharge

> PutChargeTransactionChangesResponse undoWaiveCharge(loanId, transactionId, putChargeTransactionChangesRequest)

Undo a Waive Charge Transaction

Undo a Waive Charge Transaction

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanTransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        LoanTransactionsApi apiInstance = new LoanTransactionsApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long transactionId = 56L; // Long | transactionId
        PutChargeTransactionChangesRequest putChargeTransactionChangesRequest = new PutChargeTransactionChangesRequest(); // PutChargeTransactionChangesRequest | 
        try {
            PutChargeTransactionChangesResponse result = apiInstance.undoWaiveCharge(loanId, transactionId, putChargeTransactionChangesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanTransactionsApi#undoWaiveCharge");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loanId** | **Long**| loanId | |
| **transactionId** | **Long**| transactionId | |
| **putChargeTransactionChangesRequest** | [**PutChargeTransactionChangesRequest**](PutChargeTransactionChangesRequest.md)|  | |

### Return type

[**PutChargeTransactionChangesResponse**](PutChargeTransactionChangesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

