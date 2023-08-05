# GetPaymentsFeesEstimateRequest


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `xContactID`                                          | *String*                                              | :heavy_check_mark:                                    | The ID of the contact                                 |
| `clientId`                                            | *String*                                              | :heavy_check_mark:                                    | The ID of the client                                  |
| `paymentAmount`                                       | *Float*                                               | :heavy_check_mark:                                    | The amount of the payment                             |
| `paymentCountry`                                      | *String*                                              | :heavy_minus_sign:                                    | The destination country of the payment                |
| `paymentCurrency`                                     | *String*                                              | :heavy_check_mark:                                    | The currency of the payment                           |
| `paymentIntraEbury`                                   | *Boolean*                                             | :heavy_minus_sign:                                    | boolean flag to filter by Ebury intra payments or not |