# CollateralManagementApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCollateral1**](CollateralManagementApi.md#createCollateral1) | **POST** collateral-management | Create a new collateral |
| [**deleteCollateral2**](CollateralManagementApi.md#deleteCollateral2) | **DELETE** collateral-management/{collateralId} | Delete a Collateral |
| [**getAllCollaterals**](CollateralManagementApi.md#getAllCollaterals) | **GET** collateral-management | Get All Collaterals |
| [**getCollateral**](CollateralManagementApi.md#getCollateral) | **GET** collateral-management/{collateralId} | Get Collateral |
| [**getCollateralTemplate**](CollateralManagementApi.md#getCollateralTemplate) | **GET** collateral-management/template | Get Collateral Template |
| [**updateCollateral2**](CollateralManagementApi.md#updateCollateral2) | **PUT** collateral-management/{collateralId} | Update Collateral |



## createCollateral1

> PostCollateralManagementProductResponse createCollateral1(postCollateralManagementProductRequest)

Create a new collateral

Collateral Creation

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CollateralManagementApi;

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

        CollateralManagementApi apiInstance = new CollateralManagementApi(defaultClient);
        PostCollateralManagementProductRequest postCollateralManagementProductRequest = new PostCollateralManagementProductRequest(); // PostCollateralManagementProductRequest | 
        try {
            PostCollateralManagementProductResponse result = apiInstance.createCollateral1(postCollateralManagementProductRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralManagementApi#createCollateral1");
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
| **postCollateralManagementProductRequest** | [**PostCollateralManagementProductRequest**](PostCollateralManagementProductRequest.md)|  | |

### Return type

[**PostCollateralManagementProductResponse**](PostCollateralManagementProductResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteCollateral2

> DeleteCollateralProductResponse deleteCollateral2(collateralId)

Delete a Collateral

Delete Collateral

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CollateralManagementApi;

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

        CollateralManagementApi apiInstance = new CollateralManagementApi(defaultClient);
        Long collateralId = 56L; // Long | collateralId
        try {
            DeleteCollateralProductResponse result = apiInstance.deleteCollateral2(collateralId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralManagementApi#deleteCollateral2");
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
| **collateralId** | **Long**| collateralId | |

### Return type

[**DeleteCollateralProductResponse**](DeleteCollateralProductResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAllCollaterals

> List&lt;GetCollateralManagementsResponse&gt; getAllCollaterals()

Get All Collaterals

Fetch all Collateral Products

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CollateralManagementApi;

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

        CollateralManagementApi apiInstance = new CollateralManagementApi(defaultClient);
        try {
            List<GetCollateralManagementsResponse> result = apiInstance.getAllCollaterals();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralManagementApi#getAllCollaterals");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;GetCollateralManagementsResponse&gt;**](GetCollateralManagementsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCollateral

> GetCollateralManagementsResponse getCollateral(collateralId)

Get Collateral

Fetch Collateral

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CollateralManagementApi;

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

        CollateralManagementApi apiInstance = new CollateralManagementApi(defaultClient);
        Long collateralId = 56L; // Long | collateralId
        try {
            GetCollateralManagementsResponse result = apiInstance.getCollateral(collateralId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralManagementApi#getCollateral");
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
| **collateralId** | **Long**| collateralId | |

### Return type

[**GetCollateralManagementsResponse**](GetCollateralManagementsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCollateralTemplate

> List&lt;GetCollateralProductTemplate&gt; getCollateralTemplate()

Get Collateral Template

Get Collateral Template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CollateralManagementApi;

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

        CollateralManagementApi apiInstance = new CollateralManagementApi(defaultClient);
        try {
            List<GetCollateralProductTemplate> result = apiInstance.getCollateralTemplate();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralManagementApi#getCollateralTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;GetCollateralProductTemplate&gt;**](GetCollateralProductTemplate.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateCollateral2

> PutCollateralProductResponse updateCollateral2(collateralId, putCollateralProductRequest)

Update Collateral

Update Collateral

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CollateralManagementApi;

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

        CollateralManagementApi apiInstance = new CollateralManagementApi(defaultClient);
        Long collateralId = 56L; // Long | collateralId
        PutCollateralProductRequest putCollateralProductRequest = new PutCollateralProductRequest(); // PutCollateralProductRequest | 
        try {
            PutCollateralProductResponse result = apiInstance.updateCollateral2(collateralId, putCollateralProductRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralManagementApi#updateCollateral2");
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
| **collateralId** | **Long**| collateralId | |
| **putCollateralProductRequest** | [**PutCollateralProductRequest**](PutCollateralProductRequest.md)|  | |

### Return type

[**PutCollateralProductResponse**](PutCollateralProductResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

