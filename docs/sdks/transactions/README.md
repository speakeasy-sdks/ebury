# transactions

### Available Operations

* [getAccountsAccountIdTransactions](#getaccountsaccountidtransactions) - Get transactions for a single account
* [getAccountsAccountIdTransactionsTransactionId](#getaccountsaccountidtransactionstransactionid) - Get a single transactions for an account
* [getTransactions](#gettransactions) - Get transactions for all client accounts

## getAccountsAccountIdTransactions

Retrieve all transactions for a single account by account ID, optionally filtered by value date and time with pagination support

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetAccountsAccountIdTransactionsCreditDebitIndicator;
import ebury.ebury.models.operations.GetAccountsAccountIdTransactionsRequest;
import ebury.ebury.models.operations.GetAccountsAccountIdTransactionsResponse;
import ebury.ebury.models.shared.Security;
import ebury.ebury.models.shared.TransactionTypeFilter;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("fugiat") {{
                    apiKey = "";
                }})
                .build();

            GetAccountsAccountIdTransactionsRequest req = new GetAccountsAccountIdTransactionsRequest("ut", "eum") {{
                xContactID = "suscipit";
                creditDebitIndicator = GetAccountsAccountIdTransactionsCreditDebitIndicator.DEBIT;
                fromValueDatetime = "eos";
                page = 509342L;
                pageSize = 788546L;
                toValueDatetime = "veritatis";
                transactionType = TransactionTypeFilter.CREDIT;
            }};            

            GetAccountsAccountIdTransactionsResponse res = sdk.transactions.getAccountsAccountIdTransactions(req);

            if (res.transactionData != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [ebury.ebury.models.operations.GetAccountsAccountIdTransactionsRequest](../../models/operations/GetAccountsAccountIdTransactionsRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[ebury.ebury.models.operations.GetAccountsAccountIdTransactionsResponse](../../models/operations/GetAccountsAccountIdTransactionsResponse.md)**


## getAccountsAccountIdTransactionsTransactionId

Retrieve a single transaction for an account by account id and transaction id

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdRequest;
import ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("id") {{
                    apiKey = "";
                }})
                .build();

            GetAccountsAccountIdTransactionsTransactionIdRequest req = new GetAccountsAccountIdTransactionsTransactionIdRequest("quidem", "neque", "quo", "illum");            

            GetAccountsAccountIdTransactionsTransactionIdResponse res = sdk.transactions.getAccountsAccountIdTransactionsTransactionId(req);

            if (res.transactionData != null) {
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
| `request`                                                                                                                                                             | [ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdRequest](../../models/operations/GetAccountsAccountIdTransactionsTransactionIdRequest.md) | :heavy_check_mark:                                                                                                                                                    | The request object to use for the request.                                                                                                                            |


### Response

**[ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdResponse](../../models/operations/GetAccountsAccountIdTransactionsTransactionIdResponse.md)**


## getTransactions

Retrieve a list of the client's transactions, optionally filtered by currency and value date and time with pagination support

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetTransactionsCreditDebitIndicator;
import ebury.ebury.models.operations.GetTransactionsRequest;
import ebury.ebury.models.operations.GetTransactionsResponse;
import ebury.ebury.models.shared.Security;
import ebury.ebury.models.shared.TransactionTypeFilter;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("quo") {{
                    apiKey = "";
                }})
                .build();

            GetTransactionsRequest req = new GetTransactionsRequest("fuga", "eius") {{
                xContactID = "eos";
                creditDebitIndicator = GetTransactionsCreditDebitIndicator.CREDIT;
                fromValueDatetime = "ab";
                page = 587600L;
                pageSize = 9688L;
                toValueDatetime = "tempora";
                transactionType = TransactionTypeFilter.PAYMENT_RETURNED;
            }};            

            GetTransactionsResponse res = sdk.transactions.getTransactions(req);

            if (res.transactionData != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ebury.ebury.models.operations.GetTransactionsRequest](../../models/operations/GetTransactionsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[ebury.ebury.models.operations.GetTransactionsResponse](../../models/operations/GetTransactionsResponse.md)**

