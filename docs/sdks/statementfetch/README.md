# statementFetch

### Available Operations

* [getAccountsAccountIdStatementsStatementIdFile](#getaccountsaccountidstatementsstatementidfile) - Get an account

## getAccountsAccountIdStatementsStatementIdFile

Get a statement for a given account by UUID

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetAccountsAccountIdStatementsStatementIdFileRequest;
import ebury.ebury.models.operations.GetAccountsAccountIdStatementsStatementIdFileResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("minima") {{
                    apiKey = "";
                }})
                .build();

            GetAccountsAccountIdStatementsStatementIdFileRequest req = new GetAccountsAccountIdStatementsStatementIdFileRequest("eaque", "a", "libero") {{
                xContactID = "aut";
            }};            

            GetAccountsAccountIdStatementsStatementIdFileResponse res = sdk.statementFetch.getAccountsAccountIdStatementsStatementIdFile(req);

            if (res.statementFileStatus != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                             | Type                                                                                                                                                                  | Required                                                                                                                                                              | Description                                                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                             | [ebury.ebury.models.operations.GetAccountsAccountIdStatementsStatementIdFileRequest](../../models/operations/GetAccountsAccountIdStatementsStatementIdFileRequest.md) | :heavy_check_mark:                                                                                                                                                    | The request object to use for the request.                                                                                                                            |


### Response

**[ebury.ebury.models.operations.GetAccountsAccountIdStatementsStatementIdFileResponse](../../models/operations/GetAccountsAccountIdStatementsStatementIdFileResponse.md)**

