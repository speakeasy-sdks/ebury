# trustedAuthentication

### Available Operations

* [postTokenContactId](#posttokencontactid) - Token for a Contact

## postTokenContactId

Get an access token or refresh an existing one. The access token is passed in the Authorization header parameter in endpoints that require authentication.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostTokenContactIdRequest;
import ebury.ebury.models.operations.PostTokenContactIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("ipsam") {{
                    apiKey = "";
                }})
                .build();

            PostTokenContactIdRequest req = new PostTokenContactIdRequest("aspernatur");            

            PostTokenContactIdResponse res = sdk.trustedAuthentication.postTokenContactId(req);

            if (res.postTokenForContactResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [ebury.ebury.models.operations.PostTokenContactIdRequest](../../models/operations/PostTokenContactIdRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[ebury.ebury.models.operations.PostTokenContactIdResponse](../../models/operations/PostTokenContactIdResponse.md)**

