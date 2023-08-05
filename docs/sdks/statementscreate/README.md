# statementsCreate

### Available Operations

* [postAccountsAccountIdStatementsFile](#postaccountsaccountidstatementsfile) - Create statement file for an account

## postAccountsAccountIdStatementsFile

Generate a statement asynchronously in PDF, CSV or MT940 format for a given account.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostAccountsAccountIdStatementsFileRequest;
import ebury.ebury.models.operations.PostAccountsAccountIdStatementsFileResponse;
import ebury.ebury.models.shared.NewStatement;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("aut") {{
                    apiKey = "";
                }})
                .build();

            PostAccountsAccountIdStatementsFileRequest req = new PostAccountsAccountIdStatementsFileRequest(                new NewStatement("deleniti") {{
                                toValueDatetime = "impedit";
                            }};, "aliquam", "fugit") {{
                xContactID = "accusamus";
                format = "inventore";
            }};            

            PostAccountsAccountIdStatementsFileResponse res = sdk.statementsCreate.postAccountsAccountIdStatementsFile(req);

            if (res.statementFileData != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [ebury.ebury.models.operations.PostAccountsAccountIdStatementsFileRequest](../../models/operations/PostAccountsAccountIdStatementsFileRequest.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[ebury.ebury.models.operations.PostAccountsAccountIdStatementsFileResponse](../../models/operations/PostAccountsAccountIdStatementsFileResponse.md)**

