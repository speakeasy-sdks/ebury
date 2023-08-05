# metadata

### Available Operations

* [getMetadataBeneficiary](#getmetadatabeneficiary) - Get beneficiary metadata
* [getMetadataCurrency](#getmetadatacurrency) - Get currency metadata

## getMetadataBeneficiary

Describe a new beneficiary.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetMetadataBeneficiaryResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("provident") {{
                    apiKey = "";
                }})
                .build();

            GetMetadataBeneficiaryResponse res = sdk.metadata.getMetadataBeneficiary();

            if (res.beneficiaryMetadata != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[ebury.ebury.models.operations.GetMetadataBeneficiaryResponse](../../models/operations/GetMetadataBeneficiaryResponse.md)**


## getMetadataCurrency

Describe a currency.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetMetadataCurrencyRequest;
import ebury.ebury.models.operations.GetMetadataCurrencyResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("necessitatibus") {{
                    apiKey = "";
                }})
                .build();

            GetMetadataCurrencyRequest req = new GetMetadataCurrencyRequest() {{
                dataOnly = false;
            }};            

            GetMetadataCurrencyResponse res = sdk.metadata.getMetadataCurrency(req);

            if (res.currencyMetadata != null) {
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
| `request`                                                                                                         | [ebury.ebury.models.operations.GetMetadataCurrencyRequest](../../models/operations/GetMetadataCurrencyRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[ebury.ebury.models.operations.GetMetadataCurrencyResponse](../../models/operations/GetMetadataCurrencyResponse.md)**

