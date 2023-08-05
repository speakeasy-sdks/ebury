# accounts

### Available Operations

* [getAccounts](#getaccounts) - Retrieve a list of accounts
* [getAccountsAccountId](#getaccountsaccountid) - Get an account

## getAccounts

Retrieve a list of accounts for a given client ID and a list of currencies


### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetAccountsRequest;
import ebury.ebury.models.operations.GetAccountsResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("optio") {{
                    apiKey = "";
                }})
                .build();

            GetAccountsRequest req = new GetAccountsRequest("totam", "beatae") {{
                xContactID = "commodi";
            }};            

            GetAccountsResponse res = sdk.accounts.getAccounts(req);

            if (res.accountData != null) {
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
| `request`                                                                                         | [ebury.ebury.models.operations.GetAccountsRequest](../../models/operations/GetAccountsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[ebury.ebury.models.operations.GetAccountsResponse](../../models/operations/GetAccountsResponse.md)**


## getAccountsAccountId

Get an account with a specific UUID

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetAccountsAccountIdRequest;
import ebury.ebury.models.operations.GetAccountsAccountIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("molestiae") {{
                    apiKey = "";
                }})
                .build();

            GetAccountsAccountIdRequest req = new GetAccountsAccountIdRequest("modi", "qui") {{
                xContactID = "impedit";
            }};            

            GetAccountsAccountIdResponse res = sdk.accounts.getAccountsAccountId(req);

            if (res.accountData != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [ebury.ebury.models.operations.GetAccountsAccountIdRequest](../../models/operations/GetAccountsAccountIdRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[ebury.ebury.models.operations.GetAccountsAccountIdResponse](../../models/operations/GetAccountsAccountIdResponse.md)**

