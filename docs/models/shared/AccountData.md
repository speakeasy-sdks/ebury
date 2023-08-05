# AccountData

Returns the requested account


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `accountDetails`                                              | List<[AccountDetails](../../models/shared/AccountDetails.md)> | :heavy_check_mark:                                            | The list of `AccountDetail`s for this `currency`              |
| `accountId`                                                   | *String*                                                      | :heavy_check_mark:                                            | The UUID of the account                                       |
| `accountSubtype`                                              | [AccountSubType](../../models/shared/AccountSubType.md)       | :heavy_check_mark:                                            | The sub-type of the account.                                  |
| `accountType`                                                 | [AccountType](../../models/shared/AccountType.md)             | :heavy_check_mark:                                            | The type of the account.                                      |
| `currency`                                                    | *String*                                                      | :heavy_check_mark:                                            | Identification of the currency in which the account is held   |
| `status`                                                      | [AccountStatus](../../models/shared/AccountStatus.md)         | :heavy_check_mark:                                            | The status of the account.                                    |