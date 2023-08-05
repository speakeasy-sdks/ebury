# CurrencyMetadataItem


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `buy`                                                                    | [CutOffItem](../../models/shared/CutOffItem.md)                          | :heavy_minus_sign:                                                       | N/A                                                                      |
| `currency`                                                               | *String*                                                                 | :heavy_minus_sign:                                                       | The currency code, expressed as an ISO 4217 alpha code.                  |
| `invalidValueDates`                                                      | [InvalidValueDateItem](../../models/shared/InvalidValueDateItem.md)      | :heavy_minus_sign:                                                       | N/A                                                                      |
| `reasonRequired`                                                         | *Boolean*                                                                | :heavy_minus_sign:                                                       | Whether or not a reason for trade for the currency needs to be supplied. |
| `sell`                                                                   | [CutOffItem](../../models/shared/CutOffItem.md)                          | :heavy_minus_sign:                                                       | N/A                                                                      |