# DocumentGetResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `errorMessage`                                                                                                           | [ebury.ebury.models.shared.ErrorMessage](../../models/shared/ErrorMessage.md)                                            | :heavy_minus_sign:                                                                                                       | Formatting, parameter or schema validation error. See error message for further details.                                 |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `documentGet200ApplicationJSONByteString`                                                                                | *String*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Base 64 encoded document content.                                                                                        |