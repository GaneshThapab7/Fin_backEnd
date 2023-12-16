# SavingsAccountTransactionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustTransaction1**](SavingsAccountTransactionsApi.md#adjustTransaction1) | **POST** savingsaccounts/{savingsId}/transactions/{transactionId} | Undo/Reverse/Modify/Release Amount transaction API |
| [**retrieveOne23**](SavingsAccountTransactionsApi.md#retrieveOne23) | **GET** savingsaccounts/{savingsId}/transactions/{transactionId} |  |
| [**retrieveTemplate18**](SavingsAccountTransactionsApi.md#retrieveTemplate18) | **GET** savingsaccounts/{savingsId}/transactions/template |  |
| [**transaction2**](SavingsAccountTransactionsApi.md#transaction2) | **POST** savingsaccounts/{savingsId}/transactions |  |



## adjustTransaction1

> List&lt;PostSavingsAccountBulkReversalTransactionsRequest&gt; adjustTransaction1(savingsId, transactionId, postSavingsAccountBulkReversalTransactionsRequest, command)

Undo/Reverse/Modify/Release Amount transaction API

Undo/Reverse/Modify/Release Amount transaction API  Example Requests:   savingsaccounts/{savingsId}/transactions/{transactionId}?command&#x3D;reverse  Accepted command &#x3D; undo, reverse, modify, releaseAmount

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsAccountTransactionsApi;

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

        SavingsAccountTransactionsApi apiInstance = new SavingsAccountTransactionsApi(defaultClient);
        Long savingsId = 56L; // Long | 
        Long transactionId = 56L; // Long | 
        PostSavingsAccountBulkReversalTransactionsRequest postSavingsAccountBulkReversalTransactionsRequest = new PostSavingsAccountBulkReversalTransactionsRequest(); // PostSavingsAccountBulkReversalTransactionsRequest | 
        String command = "command_example"; // String | 
        try {
            List<PostSavingsAccountBulkReversalTransactionsRequest> result = apiInstance.adjustTransaction1(savingsId, transactionId, postSavingsAccountBulkReversalTransactionsRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsAccountTransactionsApi#adjustTransaction1");
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
| **savingsId** | **Long**|  | |
| **transactionId** | **Long**|  | |
| **postSavingsAccountBulkReversalTransactionsRequest** | [**PostSavingsAccountBulkReversalTransactionsRequest**](PostSavingsAccountBulkReversalTransactionsRequest.md)|  | |
| **command** | **String**|  | [optional] |

### Return type

[**List&lt;PostSavingsAccountBulkReversalTransactionsRequest&gt;**](PostSavingsAccountBulkReversalTransactionsRequest.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne23

> String retrieveOne23(savingsId, transactionId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsAccountTransactionsApi;

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

        SavingsAccountTransactionsApi apiInstance = new SavingsAccountTransactionsApi(defaultClient);
        Long savingsId = 56L; // Long | 
        Long transactionId = 56L; // Long | 
        try {
            String result = apiInstance.retrieveOne23(savingsId, transactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsAccountTransactionsApi#retrieveOne23");
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
| **savingsId** | **Long**|  | |
| **transactionId** | **Long**|  | |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retrieveTemplate18

> String retrieveTemplate18(savingsId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsAccountTransactionsApi;

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

        SavingsAccountTransactionsApi apiInstance = new SavingsAccountTransactionsApi(defaultClient);
        Long savingsId = 56L; // Long | 
        try {
            String result = apiInstance.retrieveTemplate18(savingsId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsAccountTransactionsApi#retrieveTemplate18");
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
| **savingsId** | **Long**|  | |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## transaction2

> PostSavingsAccountTransactionsResponse transaction2(savingsId, postSavingsAccountTransactionsRequest, command)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsAccountTransactionsApi;

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

        SavingsAccountTransactionsApi apiInstance = new SavingsAccountTransactionsApi(defaultClient);
        Long savingsId = 56L; // Long | 
        PostSavingsAccountTransactionsRequest postSavingsAccountTransactionsRequest = new PostSavingsAccountTransactionsRequest(); // PostSavingsAccountTransactionsRequest | 
        String command = "command_example"; // String | 
        try {
            PostSavingsAccountTransactionsResponse result = apiInstance.transaction2(savingsId, postSavingsAccountTransactionsRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsAccountTransactionsApi#transaction2");
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
| **savingsId** | **Long**|  | |
| **postSavingsAccountTransactionsRequest** | [**PostSavingsAccountTransactionsRequest**](PostSavingsAccountTransactionsRequest.md)|  | |
| **command** | **String**|  | [optional] |

### Return type

[**PostSavingsAccountTransactionsResponse**](PostSavingsAccountTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

