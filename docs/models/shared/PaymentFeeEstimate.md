# PaymentFeeEstimate

This model is a representation of a payment fee estimate.


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `feeAmount`                                              | *Float*                                                  | :heavy_check_mark:                                       | Fee amount                                               |
| `feeCurrency`                                            | *String*                                                 | :heavy_check_mark:                                       | Fee currency                                             |
| `paymentAmount`                                          | *Float*                                                  | :heavy_minus_sign:                                       | Payment amount                                           |
| `paymentCountry`                                         | *String*                                                 | :heavy_check_mark:                                       | The destination country of the payment                   |
| `paymentCurrency`                                        | *String*                                                 | :heavy_check_mark:                                       | Currency the payment was made in                         |
| `paymentInstruction`                                     | *String*                                                 | :heavy_check_mark:                                       | payment instruction                                      |
| `paymentIsIntra`                                         | *Boolean*                                                | :heavy_minus_sign:                                       | True if payment is Ebury intra payments, False otherwise |