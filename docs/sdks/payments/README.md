# payments

### Available Operations

* [deletePaymentsPaymentId](#deletepaymentspaymentid) - Delete a payment
* [getPayments](#getpayments) - Search or retrieve payments
* [getPaymentsFees](#getpaymentsfees) - Get the fee of payments
* [getPaymentsFeesEstimate](#getpaymentsfeesestimate) - Get the estimate fee of payments
* [getPaymentsPaymentId](#getpaymentspaymentid) - Retrieve a payment
* [patchPaymentsPaymentId](#patchpaymentspaymentid) - Authorise or reject a payment
* [postPayments](#postpayments) - Create one or more payments

## deletePaymentsPaymentId

Delete a payment with a given payment ID

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.DeletePaymentsPaymentIdRequest;
import ebury.ebury.models.operations.DeletePaymentsPaymentIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("cumque") {{
                    apiKey = "";
                }})
                .build();

            DeletePaymentsPaymentIdRequest req = new DeletePaymentsPaymentIdRequest("soluta", "nobis") {{
                xContactID = "et";
            }};            

            DeletePaymentsPaymentIdResponse res = sdk.payments.deletePaymentsPaymentId(req);

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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [ebury.ebury.models.operations.DeletePaymentsPaymentIdRequest](../../models/operations/DeletePaymentsPaymentIdRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[ebury.ebury.models.operations.DeletePaymentsPaymentIdResponse](../../models/operations/DeletePaymentsPaymentIdResponse.md)**


## getPayments

Search or retrieve all payments for a given client ID

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetPaymentsRequest;
import ebury.ebury.models.operations.GetPaymentsResponse;
import ebury.ebury.models.shared.Security;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("saepe") {{
                    apiKey = "";
                }})
                .build();

            GetPaymentsRequest req = new GetPaymentsRequest("ipsum") {{
                xContactID = "veritatis";
                fromCreatedDate = LocalDate.parse("2021-11-23");
                fromPaymentDate = LocalDate.parse("2021-10-31");
                massPaymentExternalReferenceId = "aperiam";
                massPaymentId = "delectus";
                page = 209157;
                pageSize = 292147;
                paymentCurrency = "labore";
                reference = "adipisci";
                toCreatedDate = LocalDate.parse("2022-10-19");
                toPaymentDate = LocalDate.parse("2022-12-26");
                tradeId = "quas";
            }};            

            GetPaymentsResponse res = sdk.payments.getPayments(req);

            if (res.payments != null) {
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
| `request`                                                                                         | [ebury.ebury.models.operations.GetPaymentsRequest](../../models/operations/GetPaymentsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[ebury.ebury.models.operations.GetPaymentsResponse](../../models/operations/GetPaymentsResponse.md)**


## getPaymentsFees

Retrieve the payment fee for sending a payment

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetPaymentsFeesRequest;
import ebury.ebury.models.operations.GetPaymentsFeesResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("itaque") {{
                    apiKey = "";
                }})
                .build();

            GetPaymentsFeesRequest req = new GetPaymentsFeesRequest("consequatur", "est", 8330.38f);            

            GetPaymentsFeesResponse res = sdk.payments.getPaymentsFees(req);

            if (res.paymentFee != null) {
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
| `request`                                                                                                 | [ebury.ebury.models.operations.GetPaymentsFeesRequest](../../models/operations/GetPaymentsFeesRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[ebury.ebury.models.operations.GetPaymentsFeesResponse](../../models/operations/GetPaymentsFeesResponse.md)**


## getPaymentsFeesEstimate

Retrieve the potential payment fee for sending a payment

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetPaymentsFeesEstimateRequest;
import ebury.ebury.models.operations.GetPaymentsFeesEstimateResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("porro") {{
                    apiKey = "";
                }})
                .build();

            GetPaymentsFeesEstimateRequest req = new GetPaymentsFeesEstimateRequest("doloribus", "ut", 7034.95f, "cupiditate") {{
                paymentCountry = "qui";
                paymentIntraEbury = false;
            }};            

            GetPaymentsFeesEstimateResponse res = sdk.payments.getPaymentsFeesEstimate(req);

            if (res.paymentFeeEstimate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [ebury.ebury.models.operations.GetPaymentsFeesEstimateRequest](../../models/operations/GetPaymentsFeesEstimateRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[ebury.ebury.models.operations.GetPaymentsFeesEstimateResponse](../../models/operations/GetPaymentsFeesEstimateResponse.md)**


## getPaymentsPaymentId

Retrieve a payment with a given payment ID

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetPaymentsPaymentIdRequest;
import ebury.ebury.models.operations.GetPaymentsPaymentIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("quae") {{
                    apiKey = "";
                }})
                .build();

            GetPaymentsPaymentIdRequest req = new GetPaymentsPaymentIdRequest("laudantium", "odio") {{
                xContactID = "occaecati";
            }};            

            GetPaymentsPaymentIdResponse res = sdk.payments.getPaymentsPaymentId(req);

            if (res.payment != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [ebury.ebury.models.operations.GetPaymentsPaymentIdRequest](../../models/operations/GetPaymentsPaymentIdRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[ebury.ebury.models.operations.GetPaymentsPaymentIdResponse](../../models/operations/GetPaymentsPaymentIdResponse.md)**


## patchPaymentsPaymentId

Authorise or reject a payment with a given payment ID (the requirement to authorise or reject payments depends on your account configuration)

Note that a **different** Contact ID to needs to be used to authorise payments


### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PatchPaymentsPaymentIdAction;
import ebury.ebury.models.operations.PatchPaymentsPaymentIdRequest;
import ebury.ebury.models.operations.PatchPaymentsPaymentIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("voluptatibus") {{
                    apiKey = "";
                }})
                .build();

            PatchPaymentsPaymentIdRequest req = new PatchPaymentsPaymentIdRequest(PatchPaymentsPaymentIdAction.REJECT, "vero", "omnis") {{
                xContactID = "quis";
            }};            

            PatchPaymentsPaymentIdResponse res = sdk.payments.patchPaymentsPaymentId(req);

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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [ebury.ebury.models.operations.PatchPaymentsPaymentIdRequest](../../models/operations/PatchPaymentsPaymentIdRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[ebury.ebury.models.operations.PatchPaymentsPaymentIdResponse](../../models/operations/PatchPaymentsPaymentIdResponse.md)**


## postPayments

Create one or more payments with an existing trade_id, beneficiary ID and account ID. Payment processing can be made asynchronous by setting the async flag in the request body.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostPaymentsRequest;
import ebury.ebury.models.operations.PostPaymentsResponse;
import ebury.ebury.models.shared.NewPayment;
import ebury.ebury.models.shared.NewPaymentPayments;
import ebury.ebury.models.shared.Security;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("ipsum") {{
                    apiKey = "";
                }})
                .build();

            PostPaymentsRequest req = new PostPaymentsRequest(                new NewPayment() {{
                                async = false;
                                payments = new ebury.ebury.models.shared.NewPaymentPayments[]{{
                                    add(new NewPaymentPayments("distinctio", 7992.03f, "odio", LocalDate.parse("2021-08-01"), "vero") {{
                                        accountId = "voluptate";
                                        amount = 2317.01f;
                                        beneficiaryId = "vero";
                                        emailBeneficiary = false;
                                        paymentDate = LocalDate.parse("2021-07-10");
                                        reference = "hic";
                                    }}),
                                    add(new NewPaymentPayments("impedit", 132.36f, "voluptatibus", LocalDate.parse("2022-02-20"), "fugit") {{
                                        accountId = "ducimus";
                                        amount = 2930.2f;
                                        beneficiaryId = "quibusdam";
                                        emailBeneficiary = false;
                                        paymentDate = LocalDate.parse("2022-06-02");
                                        reference = "natus";
                                    }}),
                                    add(new NewPaymentPayments("alias", 6394.73f, "tempora", LocalDate.parse("2022-08-04"), "aspernatur") {{
                                        accountId = "porro";
                                        amount = 9818.3f;
                                        beneficiaryId = "doloribus";
                                        emailBeneficiary = false;
                                        paymentDate = LocalDate.parse("2022-03-31");
                                        reference = "ducimus";
                                    }}),
                                    add(new NewPaymentPayments("dicta", 2243.17f, "maiores", LocalDate.parse("2022-08-05"), "nulla") {{
                                        accountId = "vel";
                                        amount = 8221.18f;
                                        beneficiaryId = "magnam";
                                        emailBeneficiary = false;
                                        paymentDate = LocalDate.parse("2022-08-07");
                                        reference = "laudantium";
                                    }}),
                                }};
                                tradeId = "excepturi";
                            }};, "voluptatibus") {{
                xContactID = "nostrum";
            }};            

            PostPaymentsResponse res = sdk.payments.postPayments(req);

            if (res.newPaymentItems != null) {
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
| `request`                                                                                           | [ebury.ebury.models.operations.PostPaymentsRequest](../../models/operations/PostPaymentsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |


### Response

**[ebury.ebury.models.operations.PostPaymentsResponse](../../models/operations/PostPaymentsResponse.md)**

