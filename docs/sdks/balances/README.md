# balances

### Available Operations

* [getAccountsAccountIdBalances](#getaccountsaccountidbalances) - Get a balance for a single account
* [getBalances](#getbalances) - Retrieve a list of the client's balances

## getAccountsAccountIdBalances

Retrieve all balances for a single account by account ID

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetAccountsAccountIdBalancesBalanceTypes;
import ebury.ebury.models.operations.GetAccountsAccountIdBalancesRequest;
import ebury.ebury.models.operations.GetAccountsAccountIdBalancesResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("cum") {{
                    apiKey = "";
                }})
                .build();

            GetAccountsAccountIdBalancesRequest req = new GetAccountsAccountIdBalancesRequest("esse", "ipsum") {{
                xContactID = "excepturi";
                balanceTypes = GetAccountsAccountIdBalancesBalanceTypes.REQUIRED_FUNDS;
            }};            

            GetAccountsAccountIdBalancesResponse res = sdk.balances.getAccountsAccountIdBalances(req);

            if (res.balanceData != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [ebury.ebury.models.operations.GetAccountsAccountIdBalancesRequest](../../models/operations/GetAccountsAccountIdBalancesRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[ebury.ebury.models.operations.GetAccountsAccountIdBalancesResponse](../../models/operations/GetAccountsAccountIdBalancesResponse.md)**


## getBalances

Retrieve a list of the client's balances, optionally filtered by currency

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetBalancesBalanceTypes;
import ebury.ebury.models.operations.GetBalancesRequest;
import ebury.ebury.models.operations.GetBalancesResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("perferendis") {{
                    apiKey = "";
                }})
                .build();

            GetBalancesRequest req = new GetBalancesRequest("ad", "natus") {{
                xContactID = "sed";
                balanceTypes = GetBalancesBalanceTypes.INTERIM_AVAILABLE;
            }};            

            GetBalancesResponse res = sdk.balances.getBalances(req);

            if (res.balanceData != null) {
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
| `request`                                                                                         | [ebury.ebury.models.operations.GetBalancesRequest](../../models/operations/GetBalancesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[ebury.ebury.models.operations.GetBalancesResponse](../../models/operations/GetBalancesResponse.md)**

