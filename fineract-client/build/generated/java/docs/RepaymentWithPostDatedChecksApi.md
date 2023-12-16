# RepaymentWithPostDatedChecksApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePostDatedCheck**](RepaymentWithPostDatedChecksApi.md#deletePostDatedCheck) | **DELETE** loans/{loanId}/postdatedchecks/{postDatedCheckId} | Delete Post Dated Check |
| [**getPostDatedCheck**](RepaymentWithPostDatedChecksApi.md#getPostDatedCheck) | **GET** loans/{loanId}/postdatedchecks/{installmentId} | Get Post Dated Check |
| [**getPostDatedChecks**](RepaymentWithPostDatedChecksApi.md#getPostDatedChecks) | **GET** loans/{loanId}/postdatedchecks | Get All Post Dated Checks |
| [**updatePostDatedChecks**](RepaymentWithPostDatedChecksApi.md#updatePostDatedChecks) | **PUT** loans/{loanId}/postdatedchecks/{postDatedCheckId} | Update Post Dated Check, Bounced Check |



## deletePostDatedCheck

> List&lt;DeletePostDatedCheck&gt; deletePostDatedCheck(postDatedCheckId, loanId)

Delete Post Dated Check

Delete Post Dated Check

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RepaymentWithPostDatedChecksApi;

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

        RepaymentWithPostDatedChecksApi apiInstance = new RepaymentWithPostDatedChecksApi(defaultClient);
        Long postDatedCheckId = 56L; // Long | postDatedCheckId
        Long loanId = 56L; // Long | loanId
        try {
            List<DeletePostDatedCheck> result = apiInstance.deletePostDatedCheck(postDatedCheckId, loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepaymentWithPostDatedChecksApi#deletePostDatedCheck");
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
| **postDatedCheckId** | **Long**| postDatedCheckId | |
| **loanId** | **Long**| loanId | |

### Return type

[**List&lt;DeletePostDatedCheck&gt;**](DeletePostDatedCheck.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getPostDatedCheck

> List&lt;GetPostDatedChecks&gt; getPostDatedCheck(installmentId, loanId)

Get Post Dated Check

Get Post Dated Check

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RepaymentWithPostDatedChecksApi;

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

        RepaymentWithPostDatedChecksApi apiInstance = new RepaymentWithPostDatedChecksApi(defaultClient);
        Integer installmentId = 56; // Integer | installmentId
        Long loanId = 56L; // Long | loanId
        try {
            List<GetPostDatedChecks> result = apiInstance.getPostDatedCheck(installmentId, loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepaymentWithPostDatedChecksApi#getPostDatedCheck");
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
| **installmentId** | **Integer**| installmentId | |
| **loanId** | **Long**| loanId | |

### Return type

[**List&lt;GetPostDatedChecks&gt;**](GetPostDatedChecks.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getPostDatedChecks

> List&lt;GetPostDatedChecks&gt; getPostDatedChecks(loanId)

Get All Post Dated Checks

Get All Post dated Checks

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RepaymentWithPostDatedChecksApi;

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

        RepaymentWithPostDatedChecksApi apiInstance = new RepaymentWithPostDatedChecksApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        try {
            List<GetPostDatedChecks> result = apiInstance.getPostDatedChecks(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepaymentWithPostDatedChecksApi#getPostDatedChecks");
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

### Return type

[**List&lt;GetPostDatedChecks&gt;**](GetPostDatedChecks.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updatePostDatedChecks

> List&lt;UpdatePostDatedCheckResponse&gt; updatePostDatedChecks(postDatedCheckId, loanId, updatePostDatedCheckRequest, editType)

Update Post Dated Check, Bounced Check

Update Post Dated Check, Bounced Check

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RepaymentWithPostDatedChecksApi;

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

        RepaymentWithPostDatedChecksApi apiInstance = new RepaymentWithPostDatedChecksApi(defaultClient);
        Long postDatedCheckId = 56L; // Long | postDatedCheckId
        Long loanId = 56L; // Long | loanId
        UpdatePostDatedCheckRequest updatePostDatedCheckRequest = new UpdatePostDatedCheckRequest(); // UpdatePostDatedCheckRequest | 
        String editType = "editType_example"; // String | editType
        try {
            List<UpdatePostDatedCheckResponse> result = apiInstance.updatePostDatedChecks(postDatedCheckId, loanId, updatePostDatedCheckRequest, editType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RepaymentWithPostDatedChecksApi#updatePostDatedChecks");
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
| **postDatedCheckId** | **Long**| postDatedCheckId | |
| **loanId** | **Long**| loanId | |
| **updatePostDatedCheckRequest** | [**UpdatePostDatedCheckRequest**](UpdatePostDatedCheckRequest.md)|  | |
| **editType** | **String**| editType | [optional] |

### Return type

[**List&lt;UpdatePostDatedCheckResponse&gt;**](UpdatePostDatedCheckResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

