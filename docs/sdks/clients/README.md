# clients

### Available Operations

* [clientsGet](#clientsget) - Get clients

## clientsGet

Get all clients for a contact.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.ClientsGetRequest;
import ebury.ebury.models.operations.ClientsGetResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("labore") {{
                    apiKey = "";
                }})
                .build();

            ClientsGetRequest req = new ClientsGetRequest() {{
                xContactID = "modi";
            }};            

            ClientsGetResponse res = sdk.clients.clientsGet(req);

            if (res.clients != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ebury.ebury.models.operations.ClientsGetRequest](../../models/operations/ClientsGetRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[ebury.ebury.models.operations.ClientsGetResponse](../../models/operations/ClientsGetResponse.md)**

