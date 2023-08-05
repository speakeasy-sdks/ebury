# contacts

### Available Operations

* [contactGet](#contactget) - Get a contact
* [contactPatch](#contactpatch) - Update a contact
* [contactsGet](#contactsget) - Get contacts

## contactGet

Get a contact by contact's identifier.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.ContactGetRequest;
import ebury.ebury.models.operations.ContactGetResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("qui") {{
                    apiKey = "";
                }})
                .build();

            ContactGetRequest req = new ContactGetRequest("aliquid", "cupiditate") {{
                xContactID = "quos";
            }};            

            ContactGetResponse res = sdk.contacts.contactGet(req);

            if (res.contact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ebury.ebury.models.operations.ContactGetRequest](../../models/operations/ContactGetRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[ebury.ebury.models.operations.ContactGetResponse](../../models/operations/ContactGetResponse.md)**


## contactPatch

Update a contact by contact's identifier.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.ContactPatchRequest;
import ebury.ebury.models.operations.ContactPatchResponse;
import ebury.ebury.models.shared.ContactUpdate;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("perferendis") {{
                    apiKey = "";
                }})
                .build();

            ContactPatchRequest req = new ContactPatchRequest(                new ContactUpdate() {{
                                canAuthorisePayments = false;
                                canMakeSameCurrencyPayments = false;
                                canManageBeneficiaries = false;
                                canManageBeneficiariesGroups = false;
                                canManageContacts = false;
                                canManageFixForwards = false;
                                canManageMultipayments = false;
                                canManagePayments = false;
                                canManagePermissions = false;
                                canTrade = false;
                                hasOnlineAccess = false;
                                language = "magni";
                                locale = "assumenda";
                                timeZone = "ipsam";
                            }};, "alias", "fugit") {{
                xContactID = "dolorum";
            }};            

            ContactPatchResponse res = sdk.contacts.contactPatch(req);

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

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ebury.ebury.models.operations.ContactPatchRequest](../../models/operations/ContactPatchRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |


### Response

**[ebury.ebury.models.operations.ContactPatchResponse](../../models/operations/ContactPatchResponse.md)**


## contactsGet

Get all contacts for a given client.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.ContactsGetRequest;
import ebury.ebury.models.operations.ContactsGetResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("excepturi") {{
                    apiKey = "";
                }})
                .build();

            ContactsGetRequest req = new ContactsGetRequest("tempora") {{
                xContactID = "facilis";
            }};            

            ContactsGetResponse res = sdk.contacts.contactsGet(req);

            if (res.contacts != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ebury.ebury.models.operations.ContactsGetRequest](../../models/operations/ContactsGetRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[ebury.ebury.models.operations.ContactsGetResponse](../../models/operations/ContactsGetResponse.md)**

