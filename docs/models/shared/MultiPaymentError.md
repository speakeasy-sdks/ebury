# MultiPaymentError

A list of payments with known beneficiary/bank account IDs.


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `async`                                                                              | *Boolean*                                                                            | :heavy_minus_sign:                                                                   | Create the payment(s) asynchronously. Payments are created synchronously by default. |
| `payments`                                                                           | List<[MultiPaymentErrorPayments](../../models/shared/MultiPaymentErrorPayments.md)>  | :heavy_minus_sign:                                                                   | A list of payments                                                                   |
| `tradeId`                                                                            | *String*                                                                             | :heavy_minus_sign:                                                                   | Unique identifier of the trade the payment is allocated to                           |