# MixReportApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**retrieveXBRLReport**](MixReportApi.md#retrieveXBRLReport) | **GET** mixreport |  |



## retrieveXBRLReport

> String retrieveXBRLReport(startDate, endDate, currency)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MixReportApi;

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

        MixReportApi apiInstance = new MixReportApi(defaultClient);
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
        String currency = "currency_example"; // String | 
        try {
            String result = apiInstance.retrieveXBRLReport(startDate, endDate, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MixReportApi#retrieveXBRLReport");
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
| **startDate** | **OffsetDateTime**|  | [optional] |
| **endDate** | **OffsetDateTime**|  | [optional] |
| **currency** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

