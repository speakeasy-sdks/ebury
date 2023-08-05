# GetMassPaymentsMassPaymentIdPaymentsReceivedRequest


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `clientId`                                                     | *String*                                                       | :heavy_check_mark:                                             | The ID of the client                                           |
| `massPaymentId`                                                | *String*                                                       | :heavy_check_mark:                                             | The mass payment ID                                            |
| `page`                                                         | *Integer*                                                      | :heavy_minus_sign:                                             | The desired page number for pagination. By default is 1.       |
| `pageSize`                                                     | *Integer*                                                      | :heavy_minus_sign:                                             | The number of items per page for pagination. By default is 50. |