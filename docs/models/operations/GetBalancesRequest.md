# GetBalancesRequest


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `xContactID`                                                                  | *String*                                                                      | :heavy_minus_sign:                                                            | The ID of the contact                                                         |
| `balanceTypes`                                                                | [GetBalancesBalanceTypes](../../models/operations/GetBalancesBalanceTypes.md) | :heavy_minus_sign:                                                            | The balance types to be retrieved                                             |
| `clientId`                                                                    | *String*                                                                      | :heavy_check_mark:                                                            | The ID of the client                                                          |
| `currencies`                                                                  | *String*                                                                      | :heavy_check_mark:                                                            | A comma-separated list of currency codes compliant to ISO 4217                |