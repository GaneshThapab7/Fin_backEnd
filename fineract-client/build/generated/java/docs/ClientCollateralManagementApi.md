# ClientCollateralManagementApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCollateral**](ClientCollateralManagementApi.md#addCollateral) | **POST** clients/{clientId}/collaterals | Add New Collateral For a Client |
| [**deleteCollateral1**](ClientCollateralManagementApi.md#deleteCollateral1) | **DELETE** clients/{clientId}/collaterals/{collateralId} | Delete Client Collateral |
| [**getClientCollateral**](ClientCollateralManagementApi.md#getClientCollateral) | **GET** clients/{clientId}/collaterals | Get Clients Collateral Products |
| [**getClientCollateralData**](ClientCollateralManagementApi.md#getClientCollateralData) | **GET** clients/{clientId}/collaterals/{clientCollateralId} | Get Client Collateral Data |
| [**getClientCollateralTemplate**](ClientCollateralManagementApi.md#getClientCollateralTemplate) | **GET** clients/{clientId}/collaterals/template | Get Client Collateral Template |
| [**updateCollateral1**](ClientCollateralManagementApi.md#updateCollateral1) | **PUT** clients/{clientId}/collaterals/{collateralId} | Update New Collateral of a Client |



## addCollateral

> PostClientCollateralResponse addCollateral(clientId, postClientCollateralRequest)

Add New Collateral For a Client

Add New Collateral For a Client

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientCollateralManagementApi;

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

        ClientCollateralManagementApi apiInstance = new ClientCollateralManagementApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        PostClientCollateralRequest postClientCollateralRequest = new PostClientCollateralRequest(); // PostClientCollateralRequest | 
        try {
            PostClientCollateralResponse result = apiInstance.addCollateral(clientId, postClientCollateralRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientCollateralManagementApi#addCollateral");
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
| **clientId** | **Long**| clientId | |
| **postClientCollateralRequest** | [**PostClientCollateralRequest**](PostClientCollateralRequest.md)|  | |

### Return type

[**PostClientCollateralResponse**](PostClientCollateralResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteCollateral1

> DeleteClientCollateralResponse deleteCollateral1(clientId, collateralId)

Delete Client Collateral

Delete Client Collateral

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientCollateralManagementApi;

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

        ClientCollateralManagementApi apiInstance = new ClientCollateralManagementApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long collateralId = 56L; // Long | collateralId
        try {
            DeleteClientCollateralResponse result = apiInstance.deleteCollateral1(clientId, collateralId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientCollateralManagementApi#deleteCollateral1");
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
| **clientId** | **Long**| clientId | |
| **collateralId** | **Long**| collateralId | |

### Return type

[**DeleteClientCollateralResponse**](DeleteClientCollateralResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getClientCollateral

> List&lt;Object&gt; getClientCollateral(clientId, prodId)

Get Clients Collateral Products

Get Collateral Product of a Client

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientCollateralManagementApi;

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

        ClientCollateralManagementApi apiInstance = new ClientCollateralManagementApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long prodId = 56L; // Long | prodId
        try {
            List<Object> result = apiInstance.getClientCollateral(clientId, prodId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientCollateralManagementApi#getClientCollateral");
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
| **clientId** | **Long**| clientId | |
| **prodId** | **Long**| prodId | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getClientCollateralData

> Object getClientCollateralData(clientId, clientCollateralId)

Get Client Collateral Data

Get Client Collateral Data

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientCollateralManagementApi;

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

        ClientCollateralManagementApi apiInstance = new ClientCollateralManagementApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long clientCollateralId = 56L; // Long | clientCollateralId
        try {
            Object result = apiInstance.getClientCollateralData(clientId, clientCollateralId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientCollateralManagementApi#getClientCollateralData");
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
| **clientId** | **Long**| clientId | |
| **clientCollateralId** | **Long**| clientCollateralId | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getClientCollateralTemplate

> List&lt;GetLoanCollateralManagementTemplate&gt; getClientCollateralTemplate(clientId)

Get Client Collateral Template

Get Client Collateral Template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientCollateralManagementApi;

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

        ClientCollateralManagementApi apiInstance = new ClientCollateralManagementApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        try {
            List<GetLoanCollateralManagementTemplate> result = apiInstance.getClientCollateralTemplate(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientCollateralManagementApi#getClientCollateralTemplate");
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
| **clientId** | **Long**| clientId | |

### Return type

[**List&lt;GetLoanCollateralManagementTemplate&gt;**](GetLoanCollateralManagementTemplate.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateCollateral1

> PutClientCollateralResponse updateCollateral1(clientId, collateralId, putClientCollateralRequest)

Update New Collateral of a Client

Update New Collateral of a Client

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientCollateralManagementApi;

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

        ClientCollateralManagementApi apiInstance = new ClientCollateralManagementApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long collateralId = 56L; // Long | collateralId
        PutClientCollateralRequest putClientCollateralRequest = new PutClientCollateralRequest(); // PutClientCollateralRequest | 
        try {
            PutClientCollateralResponse result = apiInstance.updateCollateral1(clientId, collateralId, putClientCollateralRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientCollateralManagementApi#updateCollateral1");
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
| **clientId** | **Long**| clientId | |
| **collateralId** | **Long**| collateralId | |
| **putClientCollateralRequest** | [**PutClientCollateralRequest**](PutClientCollateralRequest.md)|  | |

### Return type

[**PutClientCollateralResponse**](PutClientCollateralResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

