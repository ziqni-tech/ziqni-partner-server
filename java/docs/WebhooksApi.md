# WebhooksApi

All URIs are relative to *https://your.server.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**onWebhook**](WebhooksApi.md#onWebhook) | **POST** /ziqni/webhook | Handle notifications
[**onWebhookWithHttpInfo**](WebhooksApi.md#onWebhookWithHttpInfo) | **POST** /ziqni/webhook | Handle notifications



## onWebhook

> CompletableFuture<Void> onWebhook(acceptEncoding, userAgent, xAccount, xOnEvent, xEvent, xWebhookId, body)

Handle notifications

Example server implementation used to subscribe to webhooks

### Example

```java
// Import classes:
import com.ziqni.webhook.ApiClient;
import com.ziqni.webhook.ApiException;
import com.ziqni.webhook.Configuration;
import com.ziqni.webhook.auth.*;
import com.ziqni.webhook.models.*;
import com.ziqni.webhook.api.WebhooksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://your.server.com");
        
        // Configure API key authorization: adminApiKey
        ApiKeyAuth adminApiKey = (ApiKeyAuth) defaultClient.getAuthentication("adminApiKey");
        adminApiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //adminApiKey.setApiKeyPrefix("Token");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String acceptEncoding = "gzip"; // String | gzip
        String userAgent = "ZIQNI/1.0"; // String | Strating ZIQNI/1.0.0
        String xAccount = "xAccount_example"; // String | Unique identifier of your account
        String xOnEvent = "xOnEvent_example"; // String | depending which webhook you are selecting
        String xEvent = "xEvent_example"; // String | Event type code
        String xWebhookId = "xWebhookId_example"; // String | The identifier of this webhook 
        WebhookRequestBody body = new WebhookRequestBody(); // WebhookRequestBody | Retrieve Products from Ziqni database by unique Product ID's or any other POST body parameters using the POST method
        try {
            CompletableFuture<Void> result = apiInstance.onWebhook(acceptEncoding, userAgent, xAccount, xOnEvent, xEvent, xWebhookId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#onWebhook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptEncoding** | **String**| gzip | [optional] [default to gzip]
 **userAgent** | **String**| Strating ZIQNI/1.0.0 | [optional] [default to ZIQNI/1.0]
 **xAccount** | **String**| Unique identifier of your account | [optional]
 **xOnEvent** | **String**| depending which webhook you are selecting | [optional] [enum: onAchievementCreated, onAchievementRewardIssued, onAchievementTriggered, onCompetitionCreated, onCompetitionStarted, onCompetitionFinished, onCompetitionCancelled, onCompetitionRewardIssued, onContestCreated, onContestStarted, onContestFinished, onContestFinalised, onContestCancelled, onContestRewardIssued, onNewMember, onNewProduct]
 **xEvent** | **String**| Event type code | [optional]
 **xWebhookId** | **String**| The identifier of this webhook  | [optional]
 **body** | [**WebhookRequestBody**](WebhookRequestBody.md)| Retrieve Products from Ziqni database by unique Product ID&#39;s or any other POST body parameters using the POST method | [optional]

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[adminApiKey](../README.md#adminApiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A webhook was triggered successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | The specified resource was not found |  -  |
| **405** | Method not allowed |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

## onWebhookWithHttpInfo

> CompletableFuture<ApiResponse<Void>> onWebhook onWebhookWithHttpInfo(acceptEncoding, userAgent, xAccount, xOnEvent, xEvent, xWebhookId, body)

Handle notifications

Example server implementation used to subscribe to webhooks

### Example

```java
// Import classes:
import com.ziqni.webhook.ApiClient;
import com.ziqni.webhook.ApiException;
import com.ziqni.webhook.ApiResponse;
import com.ziqni.webhook.Configuration;
import com.ziqni.webhook.auth.*;
import com.ziqni.webhook.models.*;
import com.ziqni.webhook.api.WebhooksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://your.server.com");
        
        // Configure API key authorization: adminApiKey
        ApiKeyAuth adminApiKey = (ApiKeyAuth) defaultClient.getAuthentication("adminApiKey");
        adminApiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //adminApiKey.setApiKeyPrefix("Token");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String acceptEncoding = "gzip"; // String | gzip
        String userAgent = "ZIQNI/1.0"; // String | Strating ZIQNI/1.0.0
        String xAccount = "xAccount_example"; // String | Unique identifier of your account
        String xOnEvent = "xOnEvent_example"; // String | depending which webhook you are selecting
        String xEvent = "xEvent_example"; // String | Event type code
        String xWebhookId = "xWebhookId_example"; // String | The identifier of this webhook 
        WebhookRequestBody body = new WebhookRequestBody(); // WebhookRequestBody | Retrieve Products from Ziqni database by unique Product ID's or any other POST body parameters using the POST method
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.onWebhookWithHttpInfo(acceptEncoding, userAgent, xAccount, xOnEvent, xEvent, xWebhookId, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksApi#onWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#onWebhook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptEncoding** | **String**| gzip | [optional] [default to gzip]
 **userAgent** | **String**| Strating ZIQNI/1.0.0 | [optional] [default to ZIQNI/1.0]
 **xAccount** | **String**| Unique identifier of your account | [optional]
 **xOnEvent** | **String**| depending which webhook you are selecting | [optional] [enum: onAchievementCreated, onAchievementRewardIssued, onAchievementTriggered, onCompetitionCreated, onCompetitionStarted, onCompetitionFinished, onCompetitionCancelled, onCompetitionRewardIssued, onContestCreated, onContestStarted, onContestFinished, onContestFinalised, onContestCancelled, onContestRewardIssued, onNewMember, onNewProduct]
 **xEvent** | **String**| Event type code | [optional]
 **xWebhookId** | **String**| The identifier of this webhook  | [optional]
 **body** | [**WebhookRequestBody**](WebhookRequestBody.md)| Retrieve Products from Ziqni database by unique Product ID&#39;s or any other POST body parameters using the POST method | [optional]

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[adminApiKey](../README.md#adminApiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A webhook was triggered successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | The specified resource was not found |  -  |
| **405** | Method not allowed |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

