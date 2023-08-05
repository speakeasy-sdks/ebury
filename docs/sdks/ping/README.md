# ping

### Available Operations

* [getPing](#getping) - Test connectivity

## getPing

Get a successful response, to test connectivity

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetPingResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("sapiente") {{
                    apiKey = "";
                }})
                .build();

            GetPingResponse res = sdk.ping.getPing();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[ebury.ebury.models.operations.GetPingResponse](../../models/operations/GetPingResponse.md)**

