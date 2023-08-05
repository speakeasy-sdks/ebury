# CurrencyInfoCutoff


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `day`                                                                                      | *Long*                                                                                     | :heavy_minus_sign:                                                                         | Cutoff days for the currency. The value 0 means there is not cutoff day for this currency. |
| `time`                                                                                     | *String*                                                                                   | :heavy_minus_sign:                                                                         | Cutoff time for the currency. Includes TZ data in ISO format                               |