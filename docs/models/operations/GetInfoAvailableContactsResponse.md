# GetInfoAvailableContactsResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `authErrorMessage`                                                                                                       | [ebury.ebury.models.shared.AuthErrorMessage](../../models/shared/AuthErrorMessage.md)                                    | :heavy_minus_sign:                                                                                                       | Formatting or schema validation error or invalid data.See error message for further details.                             |
| `contactsList`                                                                                                           | [ebury.ebury.models.shared.ContactsList](../../models/shared/ContactsList.md)                                            | :heavy_minus_sign:                                                                                                       | Listf of contacts IDs that are from the given client                                                                     |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |