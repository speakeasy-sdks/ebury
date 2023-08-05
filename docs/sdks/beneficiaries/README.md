# beneficiaries

### Available Operations

* [beneficiariesGet](#beneficiariesget) - Get beneficiaries
* [beneficiariesPost](#beneficiariespost) - Create a new beneficiary
* [beneficiaryDelete](#beneficiarydelete) - Delete a beneficiary
* [beneficiaryGet](#beneficiaryget) - Get a beneficiary
* [beneficiaryPatch](#beneficiarypatch) - Update a beneficiary

## beneficiariesGet

Get all beneficiaries for a given client.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.BeneficiariesGetRequest;
import ebury.ebury.models.operations.BeneficiariesGetResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("dolor") {{
                    apiKey = "";
                }})
                .build();

            BeneficiariesGetRequest req = new BeneficiariesGetRequest("natus") {{
                xContactID = "laboriosam";
                accountNumber = "hic";
                bankIdentifier = "saepe";
                iban = "fuga";
                page = 449950;
                pageSize = 359508;
            }};            

            BeneficiariesGetResponse res = sdk.beneficiaries.beneficiariesGet(req);

            if (res.beneficiaries != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [ebury.ebury.models.operations.BeneficiariesGetRequest](../../models/operations/BeneficiariesGetRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[ebury.ebury.models.operations.BeneficiariesGetResponse](../../models/operations/BeneficiariesGetResponse.md)**


## beneficiariesPost

Create a new beneficiary. Beneficiary will require verification before payments can be made.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.BeneficiariesPostRequest;
import ebury.ebury.models.operations.BeneficiariesPostResponse;
import ebury.ebury.models.shared.NewBeneficiary;
import ebury.ebury.models.shared.NewBeneficiaryPurposeOfPayment;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("iste") {{
                    apiKey = "";
                }})
                .build();

            BeneficiariesPostRequest req = new BeneficiariesPostRequest(                new NewBeneficiary("iure", "saepe", "quidem", false, "architecto") {{
                                accountNumber = "ipsa";
                                addressLine1 = "reiciendis";
                                bankAddressLine1 = "est";
                                bankIdentifier = "mollitia";
                                bankName = "laborum";
                                beneficiaryReference = "dolores";
                                correspondentAccount = "dolorem";
                                correspondentSwiftCode = "corporis";
                                emailAddresses = new String[]{{
                                    add("Emerald.Mohr@hotmail.com"),
                                }};
                                iban = "excepturi";
                                inn = "accusantium";
                                kbk = "iure";
                                kio = "culpa";
                                kpp = "doloribus";
                                postCode = "16261-9652";
                                purposeOfPayment = NewBeneficiaryPurposeOfPayment.OVT;
                                reasonForTrade = "quam";
                                referenceInformation = "molestiae";
                                russianCentralBankAccount = "velit";
                                swiftCode = "error";
                                vo = "quia";
                            }};, "quis") {{
                xContactID = "vitae";
            }};            

            BeneficiariesPostResponse res = sdk.beneficiaries.beneficiariesPost(req);

            if (res.beneficiary != null) {
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
| `request`                                                                                                     | [ebury.ebury.models.operations.BeneficiariesPostRequest](../../models/operations/BeneficiariesPostRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[ebury.ebury.models.operations.BeneficiariesPostResponse](../../models/operations/BeneficiariesPostResponse.md)**


## beneficiaryDelete

Delete a beneficiary by beneficiary's identifier.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.BeneficiaryDeleteRequest;
import ebury.ebury.models.operations.BeneficiaryDeleteResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("laborum") {{
                    apiKey = "";
                }})
                .build();

            BeneficiaryDeleteRequest req = new BeneficiaryDeleteRequest("animi", "enim") {{
                xContactID = "odit";
            }};            

            BeneficiaryDeleteResponse res = sdk.beneficiaries.beneficiaryDelete(req);

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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ebury.ebury.models.operations.BeneficiaryDeleteRequest](../../models/operations/BeneficiaryDeleteRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[ebury.ebury.models.operations.BeneficiaryDeleteResponse](../../models/operations/BeneficiaryDeleteResponse.md)**


## beneficiaryGet

Get a beneficiary by beneficiary's identifier.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.BeneficiaryGetRequest;
import ebury.ebury.models.operations.BeneficiaryGetResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("quo") {{
                    apiKey = "";
                }})
                .build();

            BeneficiaryGetRequest req = new BeneficiaryGetRequest("sequi", "tenetur") {{
                xContactID = "ipsam";
            }};            

            BeneficiaryGetResponse res = sdk.beneficiaries.beneficiaryGet(req);

            if (res.beneficiary != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ebury.ebury.models.operations.BeneficiaryGetRequest](../../models/operations/BeneficiaryGetRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[ebury.ebury.models.operations.BeneficiaryGetResponse](../../models/operations/BeneficiaryGetResponse.md)**


## beneficiaryPatch

Update a beneficiary by beneficiary's identifier.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.BeneficiaryPatchRequest;
import ebury.ebury.models.operations.BeneficiaryPatchResponse;
import ebury.ebury.models.shared.Security;
import ebury.ebury.models.shared.UpdateBeneficiary;
import ebury.ebury.models.shared.UpdateBeneficiaryPurposeOfPayment;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("id") {{
                    apiKey = "";
                }})
                .build();

            BeneficiaryPatchRequest req = new BeneficiaryPatchRequest(                new UpdateBeneficiary("possimus", "aut") {{
                                accountNumber = "quasi";
                                addressLine1 = "error";
                                bankAddressLine1 = "temporibus";
                                bankIdentifier = "laborum";
                                bankName = "quasi";
                                beneficiaryReference = "reiciendis";
                                correspondentAccount = "voluptatibus";
                                correspondentSwiftCode = "vero";
                                countryCode = "KH";
                                emailAddresses = new String[]{{
                                    add("Ana_Moen@hotmail.com"),
                                    add("Alison97@gmail.com"),
                                    add("Floy.Gulgowski@gmail.com"),
                                }};
                                emailNotification = false;
                                iban = "harum";
                                inn = "enim";
                                kbk = "accusamus";
                                kio = "commodi";
                                kpp = "repudiandae";
                                name = "Edna Pouros";
                                postCode = "25590-9509";
                                purposeOfPayment = UpdateBeneficiaryPurposeOfPayment.IGD;
                                reasonForTrade = "enim";
                                referenceInformation = "consequatur";
                                russianCentralBankAccount = "est";
                                swiftCode = "quibusdam";
                                vo = "explicabo";
                            }};, "deserunt", "distinctio") {{
                xContactID = "quibusdam";
            }};            

            BeneficiaryPatchResponse res = sdk.beneficiaries.beneficiaryPatch(req);

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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [ebury.ebury.models.operations.BeneficiaryPatchRequest](../../models/operations/BeneficiaryPatchRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[ebury.ebury.models.operations.BeneficiaryPatchResponse](../../models/operations/BeneficiaryPatchResponse.md)**

