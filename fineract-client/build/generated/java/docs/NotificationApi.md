# NotificationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllNotifications**](NotificationApi.md#getAllNotifications) | **GET** notifications |  |
| [**update5**](NotificationApi.md#update5) | **PUT** notifications |  |



## getAllNotifications

> GetNotificationsResponse getAllNotifications(orderBy, limit, offset, sortOrder, isRead)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.NotificationApi;

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

        NotificationApi apiInstance = new NotificationApi(defaultClient);
        String orderBy = "orderBy_example"; // String | orderBy
        Integer limit = 56; // Integer | limit
        Integer offset = 56; // Integer | offset
        String sortOrder = "sortOrder_example"; // String | sortOrder
        Boolean isRead = true; // Boolean | isRead
        try {
            GetNotificationsResponse result = apiInstance.getAllNotifications(orderBy, limit, offset, sortOrder, isRead);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationApi#getAllNotifications");
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
| **orderBy** | **String**| orderBy | [optional] |
| **limit** | **Integer**| limit | [optional] |
| **offset** | **Integer**| offset | [optional] |
| **sortOrder** | **String**| sortOrder | [optional] |
| **isRead** | **Boolean**| isRead | [optional] |

### Return type

[**GetNotificationsResponse**](GetNotificationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update5

> update5()



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.NotificationApi;

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

        NotificationApi apiInstance = new NotificationApi(defaultClient);
        try {
            apiInstance.update5();
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationApi#update5");
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

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

