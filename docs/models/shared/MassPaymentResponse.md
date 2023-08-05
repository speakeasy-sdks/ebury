# MassPaymentResponse

Masspayment request accepted, see response body for status


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `externalReferenceId`                                                 | *String*                                                              | :heavy_minus_sign:                                                    | The external reference for the MassPayment, if supplied               |
| `massPaymentId`                                                       | *String*                                                              | :heavy_minus_sign:                                                    | The UUID of the MassPayment just created                              |
| `massPaymentStatus`                                                   | [EnumMassPaymentStatus](../../models/shared/EnumMassPaymentStatus.md) | :heavy_minus_sign:                                                    | This is an enumeration of the status of a MassPayment                 |