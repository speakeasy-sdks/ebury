# documents

### Available Operations

* [documentGet](#documentget) - Get a document

## documentGet

Get a document for a given client.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.DocumentGetRequest;
import ebury.ebury.models.operations.DocumentGetResponse;
import ebury.ebury.models.shared.Security;
import ebury.ebury.models.shared.Type;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("eum") {{
                    apiKey = "";
                }})
                .build();

            DocumentGetRequest req = new DocumentGetRequest("non", "eligendi", Type.PR) {{
                xContactID = "aliquid";
            }};            

            DocumentGetResponse res = sdk.documents.documentGet(req);

            if (res.documentGet200ApplicationJSONByteString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ebury.ebury.models.operations.DocumentGetRequest](../../models/operations/DocumentGetRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[ebury.ebury.models.operations.DocumentGetResponse](../../models/operations/DocumentGetResponse.md)**

