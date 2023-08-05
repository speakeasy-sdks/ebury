# webhooks

### Available Operations

* [postWebhooksGraphql](#postwebhooksgraphql) - Execute a GraphQL query over the webhooks API
* [postWebhooksPingSubscriptionId](#postwebhookspingsubscriptionid) - Ping a subscription

## postWebhooksGraphql

Execute a GraphQL query over the webhooks API

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostWebhooksGraphqlRequest;
import ebury.ebury.models.operations.PostWebhooksGraphqlResponse;
import ebury.ebury.models.shared.Security;
import ebury.ebury.models.shared.WebhooksRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("sequi") {{
                    apiKey = "";
                }})
                .build();

            PostWebhooksGraphqlRequest req = new PostWebhooksGraphqlRequest(                new WebhooksRequest("quo") {{
                                variables = "esse";
                            }};, "recusandae");            

            PostWebhooksGraphqlResponse res = sdk.webhooks.postWebhooksGraphql(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [ebury.ebury.models.operations.PostWebhooksGraphqlRequest](../../models/operations/PostWebhooksGraphqlRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[ebury.ebury.models.operations.PostWebhooksGraphqlResponse](../../models/operations/PostWebhooksGraphqlResponse.md)**


## postWebhooksPingSubscriptionId

Ping a subscription to get a realistic notification in the configured URL

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostWebhooksPingSubscriptionIdRequest;
import ebury.ebury.models.operations.PostWebhooksPingSubscriptionIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("aperiam") {{
                    apiKey = "";
                }})
                .build();

            PostWebhooksPingSubscriptionIdRequest req = new PostWebhooksPingSubscriptionIdRequest("distinctio");            

            PostWebhooksPingSubscriptionIdResponse res = sdk.webhooks.postWebhooksPingSubscriptionId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [ebury.ebury.models.operations.PostWebhooksPingSubscriptionIdRequest](../../models/operations/PostWebhooksPingSubscriptionIdRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[ebury.ebury.models.operations.PostWebhooksPingSubscriptionIdResponse](../../models/operations/PostWebhooksPingSubscriptionIdResponse.md)**

