# SelfUserDetailsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchAuthenticatedUserData1**](SelfUserDetailsApi.md#fetchAuthenticatedUserData1) | **GET** self/userdetails | Fetch authenticated user details |



## fetchAuthenticatedUserData1

> GetSelfUserDetailsResponse fetchAuthenticatedUserData1()

Fetch authenticated user details

Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#selfoauth

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfUserDetailsApi;

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

        SelfUserDetailsApi apiInstance = new SelfUserDetailsApi(defaultClient);
        try {
            GetSelfUserDetailsResponse result = apiInstance.fetchAuthenticatedUserData1();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfUserDetailsApi#fetchAuthenticatedUserData1");
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

[**GetSelfUserDetailsResponse**](GetSelfUserDetailsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

