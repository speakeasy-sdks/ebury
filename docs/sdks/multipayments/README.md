# multiPayments

### Available Operations

* [deleteMultipaymentsMultipaymentId](#deletemultipaymentsmultipaymentid) - Rejects a multi payment
* [getMassPayments](#getmasspayments) - Fetch payment instructions of a mass payment
* [getMassPaymentsMassPaymentIdErrors](#getmasspaymentsmasspaymentiderrors) - Fetch the payment instructions with errors for a mass payment
* [getMassPaymentsMassPaymentIdPaymentsReceived](#getmasspaymentsmasspaymentidpaymentsreceived) - Fetch the payment instructions submitted for a mass payment
* [patchMultipaymentsMultipaymentId](#patchmultipaymentsmultipaymentid) - Accept a multi payment
* [postMassPayments](#postmasspayments) - Create a mass payment instruction
* [postMassPaymentsDollarMassPaymentIdConfirm](#postmasspaymentsdollarmasspaymentidconfirm) - Confirm multi payment instructions
* [postMultipayments](#postmultipayments) - Create a multi payment instruction

## deleteMultipaymentsMultipaymentId

Rejects a multi payment trade and cancels the payments

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdRequest;
import ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("sint") {{
                    apiKey = "";
                }})
                .build();

            DeleteMultipaymentsMultipaymentIdRequest req = new DeleteMultipaymentsMultipaymentIdRequest("officia", "dolor") {{
                xContactID = "debitis";
            }};            

            DeleteMultipaymentsMultipaymentIdResponse res = sdk.multiPayments.deleteMultipaymentsMultipaymentId(req);

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

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdRequest](../../models/operations/DeleteMultipaymentsMultipaymentIdRequest.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdResponse](../../models/operations/DeleteMultipaymentsMultipaymentIdResponse.md)**


## getMassPayments

Fetch payment instructions of a mass payment

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetMassPaymentsRequest;
import ebury.ebury.models.operations.GetMassPaymentsResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("a") {{
                    apiKey = "";
                }})
                .build();

            GetMassPaymentsRequest req = new GetMassPaymentsRequest("dolorum") {{
                externalReferenceId = "in";
                massPaymentId = "in";
                page = 846409;
                pageSize = 978571;
                sellCurrency = "rerum";
            }};            

            GetMassPaymentsResponse res = sdk.multiPayments.getMassPayments(req);

            if (res.getMassPaymentsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ebury.ebury.models.operations.GetMassPaymentsRequest](../../models/operations/GetMassPaymentsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[ebury.ebury.models.operations.GetMassPaymentsResponse](../../models/operations/GetMassPaymentsResponse.md)**


## getMassPaymentsMassPaymentIdErrors

Fetch the payment instructions with errors for a mass payment

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsRequest;
import ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("dicta") {{
                    apiKey = "";
                }})
                .build();

            GetMassPaymentsMassPaymentIdErrorsRequest req = new GetMassPaymentsMassPaymentIdErrorsRequest("magnam", "cumque") {{
                page = 813798;
                pageSize = 411820;
                paymentCurrency = "aliquid";
            }};            

            GetMassPaymentsMassPaymentIdErrorsResponse res = sdk.multiPayments.getMassPaymentsMassPaymentIdErrors(req);

            if (res.massPaymentErrorsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsRequest](../../models/operations/GetMassPaymentsMassPaymentIdErrorsRequest.md) | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |


### Response

**[ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsResponse](../../models/operations/GetMassPaymentsMassPaymentIdErrorsResponse.md)**


## getMassPaymentsMassPaymentIdPaymentsReceived

Fetch the payment instructions submitted for a mass payment

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedRequest;
import ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("laborum") {{
                    apiKey = "";
                }})
                .build();

            GetMassPaymentsMassPaymentIdPaymentsReceivedRequest req = new GetMassPaymentsMassPaymentIdPaymentsReceivedRequest("accusamus", "non") {{
                page = 581273;
                pageSize = 313218;
            }};            

            GetMassPaymentsMassPaymentIdPaymentsReceivedResponse res = sdk.multiPayments.getMassPaymentsMassPaymentIdPaymentsReceived(req);

            if (res.massPaymentPaymentsReceivedResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                           | Type                                                                                                                                                                | Required                                                                                                                                                            | Description                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                           | [ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedRequest](../../models/operations/GetMassPaymentsMassPaymentIdPaymentsReceivedRequest.md) | :heavy_check_mark:                                                                                                                                                  | The request object to use for the request.                                                                                                                          |


### Response

**[ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedResponse](../../models/operations/GetMassPaymentsMassPaymentIdPaymentsReceivedResponse.md)**


## patchMultipaymentsMultipaymentId

Accept a multi payment generated trade and book in payments

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdRequest;
import ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("accusamus") {{
                    apiKey = "";
                }})
                .build();

            PatchMultipaymentsMultipaymentIdRequest req = new PatchMultipaymentsMultipaymentIdRequest("delectus", "quidem") {{
                xContactID = "provident";
            }};            

            PatchMultipaymentsMultipaymentIdResponse res = sdk.multiPayments.patchMultipaymentsMultipaymentId(req);

            if (res.bankAccount != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdRequest](../../models/operations/PatchMultipaymentsMultipaymentIdRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdResponse](../../models/operations/PatchMultipaymentsMultipaymentIdResponse.md)**


## postMassPayments

Submit mass payment request in async mode. Requires either a sell currency or existing trade ID to create the instruction

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostMassPaymentsRequest;
import ebury.ebury.models.operations.PostMassPaymentsResponse;
import ebury.ebury.models.shared.NewMassPayment;
import ebury.ebury.models.shared.NewMultiPaymentItem;
import ebury.ebury.models.shared.NewMultiPaymentItemDirection;
import ebury.ebury.models.shared.NewMultiPaymentItemTradeType;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("nam") {{
                    apiKey = "";
                }})
                .build();

            PostMassPaymentsRequest req = new PostMassPaymentsRequest(                new NewMassPayment(false,                 new ebury.ebury.models.shared.NewMultiPaymentItem[]{{
                                                add(new NewMultiPaymentItem("architecto", "magnam", "et", "excepturi", "ullam", "provident", "quos", "sint", NewMultiPaymentItemDirection.BUY, "mollitia", 9689.62f, "mollitia", "ad", "eum", NewMultiPaymentItemTradeType.SPOT, "dolor") {{
                                                    accountNumber = "blanditiis";
                                                    bankAddress = "deleniti";
                                                    bankCode = "sapiente";
                                                    bankCountry = "amet";
                                                    bankName = "deserunt";
                                                    beneficiaryAddress = "nisi";
                                                    beneficiaryCountry = "vel";
                                                    beneficiaryName = "natus";
                                                    beneficiaryReference = "omnis";
                                                    direction = NewMultiPaymentItemDirection.BUY;
                                                    iban = "perferendis";
                                                    inn = "nihil";
                                                    kio = "magnam";
                                                    paymentAmount = 7160.75f;
                                                    paymentCurrency = "id";
                                                    paymentReference = "labore";
                                                    purposeOfPayment = "labore";
                                                    reasonForTrade = "suscipit";
                                                    reference = "natus";
                                                    russianCentralBankAccount = "nobis";
                                                    swiftCode = "eum";
                                                    tradeType = NewMultiPaymentItemTradeType.SPOT;
                                                    valueDate = "vero";
                                                    vo = "aspernatur";
                                                }}),
                                                add(new NewMultiPaymentItem("accusantium", "consequuntur", "praesentium", "natus", "magni", "sunt", "quo", "illum", NewMultiPaymentItemDirection.SELL, "maxime", 4113.97f, "excepturi", "odit", "ea", NewMultiPaymentItemTradeType.SPOT, "accusantium") {{
                                                    accountNumber = "necessitatibus";
                                                    bankAddress = "odit";
                                                    bankCode = "nemo";
                                                    bankCountry = "quasi";
                                                    bankName = "iure";
                                                    beneficiaryAddress = "doloribus";
                                                    beneficiaryCountry = "debitis";
                                                    beneficiaryName = "eius";
                                                    beneficiaryReference = "maxime";
                                                    direction = NewMultiPaymentItemDirection.SELL;
                                                    iban = "facilis";
                                                    inn = "in";
                                                    kio = "architecto";
                                                    paymentAmount = 995.69f;
                                                    paymentCurrency = "repudiandae";
                                                    paymentReference = "ullam";
                                                    purposeOfPayment = "expedita";
                                                    reasonForTrade = "nihil";
                                                    reference = "repellat";
                                                    russianCentralBankAccount = "quibusdam";
                                                    swiftCode = "sed";
                                                    tradeType = NewMultiPaymentItemTradeType.SPOT;
                                                    valueDate = "saepe";
                                                    vo = "pariatur";
                                                }}),
                                                add(new NewMultiPaymentItem("dignissimos", "eaque", "quis", "nesciunt", "eos", "perferendis", "dolores", "minus", NewMultiPaymentItemDirection.BUY, "dolor", 8745.73f, "nostrum", "hic", "recusandae", NewMultiPaymentItemTradeType.SPOT, "omnis") {{
                                                    accountNumber = "ab";
                                                    bankAddress = "maiores";
                                                    bankCode = "quidem";
                                                    bankCountry = "ipsam";
                                                    bankName = "voluptate";
                                                    beneficiaryAddress = "autem";
                                                    beneficiaryCountry = "nam";
                                                    beneficiaryName = "eaque";
                                                    beneficiaryReference = "pariatur";
                                                    direction = NewMultiPaymentItemDirection.BUY;
                                                    iban = "voluptatibus";
                                                    inn = "perferendis";
                                                    kio = "fugiat";
                                                    paymentAmount = 2307.42f;
                                                    paymentCurrency = "aut";
                                                    paymentReference = "cumque";
                                                    purposeOfPayment = "corporis";
                                                    reasonForTrade = "hic";
                                                    reference = "libero";
                                                    russianCentralBankAccount = "nobis";
                                                    swiftCode = "dolores";
                                                    tradeType = NewMultiPaymentItemTradeType.SPOT;
                                                    valueDate = "quis";
                                                    vo = "totam";
                                                }}),
                                            }}) {{
                                externalReferenceId = "facilis";
                                sellCurrency = "perspiciatis";
                                tradeId = "voluptatem";
                            }};, "porro") {{
                xContactID = "consequuntur";
            }};            

            PostMassPaymentsResponse res = sdk.multiPayments.postMassPayments(req);

            if (res.massPaymentResponse != null) {
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
| `request`                                                                                                   | [ebury.ebury.models.operations.PostMassPaymentsRequest](../../models/operations/PostMassPaymentsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[ebury.ebury.models.operations.PostMassPaymentsResponse](../../models/operations/PostMassPaymentsResponse.md)**


## postMassPaymentsDollarMassPaymentIdConfirm

Confirm (commit) mass payment instructions, which can be hold because `auto_commit` was false, or because there were some errors.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmRequest;
import ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("blanditiis") {{
                    apiKey = "";
                }})
                .build();

            PostMassPaymentsDollarMassPaymentIdConfirmRequest req = new PostMassPaymentsDollarMassPaymentIdConfirmRequest("error") {{
                xContactID = "eaque";
            }};            

            PostMassPaymentsDollarMassPaymentIdConfirmResponse res = sdk.multiPayments.postMassPaymentsDollarMassPaymentIdConfirm(req);

            if (res.massPaymentResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                       | Type                                                                                                                                                            | Required                                                                                                                                                        | Description                                                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                       | [ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmRequest](../../models/operations/PostMassPaymentsDollarMassPaymentIdConfirmRequest.md) | :heavy_check_mark:                                                                                                                                              | The request object to use for the request.                                                                                                                      |


### Response

**[ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmResponse](../../models/operations/PostMassPaymentsDollarMassPaymentIdConfirmResponse.md)**


## postMultipayments

Create a new multi payment instruction. Requires either a sell currency or existing trade ID to create the instruction

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostMultipaymentsRequest;
import ebury.ebury.models.operations.PostMultipaymentsResponse;
import ebury.ebury.models.shared.NewMultiPaymentItem;
import ebury.ebury.models.shared.NewMultiPaymentItemDirection;
import ebury.ebury.models.shared.NewMultiPaymentItemTradeType;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("occaecati") {{
                    apiKey = "";
                }})
                .build();

            PostMultipaymentsRequest req = new PostMultipaymentsRequest(                new ebury.ebury.models.shared.NewMultiPaymentItem[]{{
                                add(new NewMultiPaymentItem("voluptate", "dignissimos", "reiciendis", "amet", "dolorum", "numquam", "veritatis", "ipsa", NewMultiPaymentItemDirection.BUY, "iure", 4878.38f, "quaerat", "accusamus", "quidem", NewMultiPaymentItemTradeType.SPOT, "voluptatibus") {{
                                    accountNumber = "adipisci";
                                    bankAddress = "asperiores";
                                    bankCode = "earum";
                                    bankCountry = "modi";
                                    bankName = "iste";
                                    beneficiaryAddress = "dolorum";
                                    beneficiaryCountry = "deleniti";
                                    beneficiaryName = "pariatur";
                                    beneficiaryReference = "provident";
                                    direction = NewMultiPaymentItemDirection.SELL;
                                    iban = "libero";
                                    inn = "delectus";
                                    kio = "quaerat";
                                    paymentAmount = 5542.42f;
                                    paymentCurrency = "aliquid";
                                    paymentReference = "dolorem";
                                    purposeOfPayment = "dolorem";
                                    reasonForTrade = "dolor";
                                    reference = "qui";
                                    russianCentralBankAccount = "ipsum";
                                    swiftCode = "hic";
                                    tradeType = NewMultiPaymentItemTradeType.SPOT;
                                    valueDate = "excepturi";
                                    vo = "cum";
                                }}),
                                add(new NewMultiPaymentItem("aspernatur", "perferendis", "amet", "optio", "accusamus", "ad", "saepe", "suscipit", NewMultiPaymentItemDirection.SELL, "provident", 3246.83f, "repellendus", "totam", "similique", NewMultiPaymentItemTradeType.SPOT, "alias") {{
                                    accountNumber = "voluptas";
                                    bankAddress = "natus";
                                    bankCode = "eos";
                                    bankCountry = "atque";
                                    bankName = "sit";
                                    beneficiaryAddress = "fugiat";
                                    beneficiaryCountry = "ab";
                                    beneficiaryName = "soluta";
                                    beneficiaryReference = "dolorum";
                                    direction = NewMultiPaymentItemDirection.BUY;
                                    iban = "voluptate";
                                    inn = "dolorum";
                                    kio = "deleniti";
                                    paymentAmount = 6070.45f;
                                    paymentCurrency = "necessitatibus";
                                    paymentReference = "distinctio";
                                    purposeOfPayment = "asperiores";
                                    reasonForTrade = "nihil";
                                    reference = "ipsum";
                                    russianCentralBankAccount = "voluptate";
                                    swiftCode = "id";
                                    tradeType = NewMultiPaymentItemTradeType.SPOT;
                                    valueDate = "saepe";
                                    vo = "eius";
                                }}),
                                add(new NewMultiPaymentItem("nihil", "sit", "expedita", "neque", "sed", "vel", "libero", "voluptas", NewMultiPaymentItemDirection.SELL, "quam", 2148.8f, "incidunt", "qui", "cupiditate", NewMultiPaymentItemTradeType.SPOT, "maxime") {{
                                    accountNumber = "at";
                                    bankAddress = "quaerat";
                                    bankCode = "tempora";
                                    bankCountry = "vel";
                                    bankName = "quod";
                                    beneficiaryAddress = "officiis";
                                    beneficiaryCountry = "qui";
                                    beneficiaryName = "dolorum";
                                    beneficiaryReference = "a";
                                    direction = NewMultiPaymentItemDirection.BUY;
                                    iban = "harum";
                                    inn = "iusto";
                                    kio = "ipsum";
                                    paymentAmount = 7887.4f;
                                    paymentCurrency = "tenetur";
                                    paymentReference = "amet";
                                    purposeOfPayment = "tempore";
                                    reasonForTrade = "accusamus";
                                    reference = "numquam";
                                    russianCentralBankAccount = "enim";
                                    swiftCode = "dolorem";
                                    tradeType = NewMultiPaymentItemTradeType.SPOT;
                                    valueDate = "sapiente";
                                    vo = "totam";
                                }}),
                            }}, false, "pariatur") {{
                xContactID = "soluta";
                acceptPartial = false;
                sellCurrency = "dicta";
                tradeId = "laborum";
            }};            

            PostMultipaymentsResponse res = sdk.multiPayments.postMultipayments(req);

            if (res.multiPaymentResponse != null) {
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
| `request`                                                                                                     | [ebury.ebury.models.operations.PostMultipaymentsRequest](../../models/operations/PostMultipaymentsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[ebury.ebury.models.operations.PostMultipaymentsResponse](../../models/operations/PostMultipaymentsResponse.md)**

