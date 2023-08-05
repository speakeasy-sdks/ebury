# PaymentFee

This model is a representation of a payment fee.


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `beneficiaryId`                                          | *String*                                                 | :heavy_check_mark:                                       | Beneficiary identifier                                   |
| `feeAmount`                                              | *Float*                                                  | :heavy_check_mark:                                       | Fee amount                                               |
| `feeCurrency`                                            | *String*                                                 | :heavy_check_mark:                                       | Fee currency                                             |
| `paymentAmount`                                          | *Float*                                                  | :heavy_minus_sign:                                       | Payment amount                                           |
| `paymentCountry`                                         | *String*                                                 | :heavy_check_mark:                                       | The destination country of the payment                   |
| `paymentCurrency`                                        | *String*                                                 | :heavy_check_mark:                                       | Currency the payment was made in                         |
| `paymentIsIntra`                                         | *Boolean*                                                | :heavy_minus_sign:                                       | True if payment is Ebury intra payments, False otherwise |