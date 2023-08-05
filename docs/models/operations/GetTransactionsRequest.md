# GetTransactionsRequest


## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `xContactID`                                                                                             | *String*                                                                                                 | :heavy_minus_sign:                                                                                       | The ID of the contact                                                                                    |
| `clientId`                                                                                               | *String*                                                                                                 | :heavy_check_mark:                                                                                       | The ID of the client                                                                                     |
| `creditDebitIndicator`                                                                                   | [GetTransactionsCreditDebitIndicator](../../models/operations/GetTransactionsCreditDebitIndicator.md)    | :heavy_minus_sign:                                                                                       | Filter transactions by debit/credit type                                                                 |
| `currencies`                                                                                             | *String*                                                                                                 | :heavy_check_mark:                                                                                       | A comma-separated list of currency codes compliant to ISO 4217                                           |
| `fromValueDatetime`                                                                                      | *String*                                                                                                 | :heavy_minus_sign:                                                                                       | Only return transactions with value date and time after this UTC date and time. YYYY-MM-DDThh:mm format  |
| `page`                                                                                                   | *Long*                                                                                                   | :heavy_minus_sign:                                                                                       | The desired page number for pagination                                                                   |
| `pageSize`                                                                                               | *Long*                                                                                                   | :heavy_minus_sign:                                                                                       | The number of items per page for pagination                                                              |
| `toValueDatetime`                                                                                        | *String*                                                                                                 | :heavy_minus_sign:                                                                                       | Only return transactions with value date and time before this UTC date and time. YYYY-MM-DDThh:mm format |
| `transactionType`                                                                                        | [ebury.ebury.models.shared.TransactionTypeFilter](../../models/shared/TransactionTypeFilter.md)          | :heavy_minus_sign:                                                                                       | Only return transactions of the specified transaction type.                                              |