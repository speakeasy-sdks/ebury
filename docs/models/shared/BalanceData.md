# BalanceData


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `accountId`                                                         | *String*                                                            | :heavy_check_mark:                                                  | The UUID of the account.                                            |
| `amount`                                                            | [BalanceAmount](../../models/shared/BalanceAmount.md)               | :heavy_check_mark:                                                  | N/A                                                                 |
| `creditDebitIndicator`                                              | [CreditDebitIndicator](../../models/shared/CreditDebitIndicator.md) | :heavy_check_mark:                                                  | Whether the balance is credit or debit                              |
| `datetime`                                                          | *String*                                                            | :heavy_check_mark:                                                  | The date and time when the balance was calculated.                  |
| `type`                                                              | [BalanceType](../../models/shared/BalanceType.md)                   | :heavy_check_mark:                                                  | This is an enumeration of the balance types of an account.          |