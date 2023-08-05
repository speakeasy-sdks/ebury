# accountDetails

### Available Operations

* [getAccountDetails](#getaccountdetails) - Get the list of account details of the referred client
* [patchAccountDetailsAccountDetailsId](#patchaccountdetailsaccountdetailsid) - Update the alias of an account details
* [postAccountDetailsAccountDetailsIdMakeDefault](#postaccountdetailsaccountdetailsidmakedefault) - Mark the account as primary (default) for its holder and currency

## getAccountDetails

Retrieve the account details of the client, possibly filtered by some criteria


### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetAccountDetailsAccountDetailsType;
import ebury.ebury.models.operations.GetAccountDetailsRequest;
import ebury.ebury.models.operations.GetAccountDetailsResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("error") {{
                    apiKey = "";
                }})
                .build();

            GetAccountDetailsRequest req = new GetAccountDetailsRequest("deserunt") {{
                accountDetailsType = GetAccountDetailsAccountDetailsType.DEDICATED;
                accountId = "iure";
                alias = "magnam";
                country = "Togo";
                currency = "ipsa";
                page = 963663L;
                pageSize = 272656L;
            }};            

            GetAccountDetailsResponse res = sdk.accountDetails.getAccountDetails(req);

            if (res.getAccountDetailsDomesticInternationalResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ebury.ebury.models.operations.GetAccountDetailsRequest](../../models/operations/GetAccountDetailsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[ebury.ebury.models.operations.GetAccountDetailsResponse](../../models/operations/GetAccountDetailsResponse.md)**


## patchAccountDetailsAccountDetailsId

Change the alias of the referred account details.
Only dedicated accounts can be patched, trying to patch a pooled account will return an error.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdRequest;
import ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdResponse;
import ebury.ebury.models.shared.PatchAccountDetailsRequest;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("suscipit") {{
                    apiKey = "";
                }})
                .build();

            PatchAccountDetailsAccountDetailsIdRequest req = new PatchAccountDetailsAccountDetailsIdRequest(                new PatchAccountDetailsRequest("molestiae");, "minus", "placeat");            

            PatchAccountDetailsAccountDetailsIdResponse res = sdk.accountDetails.patchAccountDetailsAccountDetailsId(req);

            if (res.accountDetailsDomesticInternationalResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdRequest](../../models/operations/PatchAccountDetailsAccountDetailsIdRequest.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdResponse](../../models/operations/PatchAccountDetailsAccountDetailsIdResponse.md)**


## postAccountDetailsAccountDetailsIdMakeDefault

Mark the account as primary (default) for its holder and currency.
Only dedicated accounts can be set as primary, trying this operation for a pooled account will return an error.


### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultRequest;
import ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("voluptatum") {{
                    apiKey = "";
                }})
                .build();

            PostAccountDetailsAccountDetailsIdMakeDefaultRequest req = new PostAccountDetailsAccountDetailsIdMakeDefaultRequest("796ed151-a05d-4fc2-9df7-cc78ca1ba928", "hic");            

            PostAccountDetailsAccountDetailsIdMakeDefaultResponse res = sdk.accountDetails.postAccountDetailsAccountDetailsIdMakeDefault(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                             | Type                                                                                                                                                                  | Required                                                                                                                                                              | Description                                                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                             | [ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultRequest](../../models/operations/PostAccountDetailsAccountDetailsIdMakeDefaultRequest.md) | :heavy_check_mark:                                                                                                                                                    | The request object to use for the request.                                                                                                                            |


### Response

**[ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultResponse](../../models/operations/PostAccountDetailsAccountDetailsIdMakeDefaultResponse.md)**

