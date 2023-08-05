# GetMassPaymentsRequest


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `clientId`                                                     | *String*                                                       | :heavy_check_mark:                                             | The ID of the client                                           |
| `externalReferenceId`                                          | *String*                                                       | :heavy_minus_sign:                                             | The external reference of the multipayment                     |
| `massPaymentId`                                                | *String*                                                       | :heavy_minus_sign:                                             | The ID of the multipayment                                     |
| `page`                                                         | *Integer*                                                      | :heavy_minus_sign:                                             | The desired page number for pagination. By default is 1.       |
| `pageSize`                                                     | *Integer*                                                      | :heavy_minus_sign:                                             | The number of items per page for pagination. By default is 50. |
| `sellCurrency`                                                 | *String*                                                       | :heavy_minus_sign:                                             | The sell currency of the multipayment                          |