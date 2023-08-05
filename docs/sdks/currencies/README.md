# currencies

### Available Operations

* [getCurrencies](#getcurrencies) - Retrieve a list of the client's currencies

## getCurrencies

Retrieve a list of the client's currencies, optionally filtered by trade_type

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetCurrenciesRequest;
import ebury.ebury.models.operations.GetCurrenciesResponse;
import ebury.ebury.models.operations.GetCurrenciesTradeType;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("tempore") {{
                    apiKey = "";
                }})
                .build();

            GetCurrenciesRequest req = new GetCurrenciesRequest("labore") {{
                tradeType = GetCurrenciesTradeType.FORWARD;
            }};            

            GetCurrenciesResponse res = sdk.currencies.getCurrencies(req);

            if (res.currencyInfos != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ebury.ebury.models.operations.GetCurrenciesRequest](../../models/operations/GetCurrenciesRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[ebury.ebury.models.operations.GetCurrenciesResponse](../../models/operations/GetCurrenciesResponse.md)**

