# NewTrade

Request Payload


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `externalReferenceId`                                                                  | *String*                                                                               | :heavy_minus_sign:                                                                     | API external reference id                                                              |
| `reason`                                                                               | [NewTradeReason](../../models/shared/NewTradeReason.md)                                | :heavy_check_mark:                                                                     | Reason for trade. The 'not_related_to_goods_or_services' reason is only for spot type. |
| `reference`                                                                            | *String*                                                                               | :heavy_minus_sign:                                                                     | Reference for the trade.                                                               |
| `tradeType`                                                                            | *String*                                                                               | :heavy_minus_sign:                                                                     | Currently ignored (DEPRECATED)                                                         |