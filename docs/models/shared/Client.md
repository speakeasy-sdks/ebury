# Client


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `addressLine1`                                      | *String*                                            | :heavy_minus_sign:                                  | The first address line of a client.                 |
| `addressLine2`                                      | *String*                                            | :heavy_minus_sign:                                  | The second address line of a client.                |
| `brandName`                                         | *String*                                            | :heavy_check_mark:                                  | Brand name of the client.                           |
| `city`                                              | *String*                                            | :heavy_minus_sign:                                  | The city name of a client.                          |
| `clientId`                                          | *String*                                            | :heavy_check_mark:                                  | Identifier of the client.                           |
| `clientName`                                        | *String*                                            | :heavy_check_mark:                                  | Name of the client.                                 |
| `postCode`                                          | *String*                                            | :heavy_minus_sign:                                  | The post code of the client.                        |
| `stateProvince`                                     | *String*                                            | :heavy_minus_sign:                                  | The state or province of the client.                |
| `status`                                            | [ClientStatus](../../models/shared/ClientStatus.md) | :heavy_check_mark:                                  | Status of the client.                               |