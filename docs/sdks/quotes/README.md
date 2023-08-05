# quotes

### Available Operations

* [getQuotesFxAvailability](#getquotesfxavailability) - Get the availability for FX markets
* [postQuotes](#postquotes) - Get an estimate or firm quote

## getQuotesFxAvailability

Get if the FX markets are available at this time or not
* True if the FX market is available for creating quote and trades
* False if the FX market is not available.


### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetQuotesFxAvailabilityRequest;
import ebury.ebury.models.operations.GetQuotesFxAvailabilityResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("quisquam") {{
                    apiKey = "";
                }})
                .build();

            GetQuotesFxAvailabilityRequest req = new GetQuotesFxAvailabilityRequest("saepe") {{
                xContactID = "ea";
            }};            

            GetQuotesFxAvailabilityResponse res = sdk.quotes.getQuotesFxAvailability(req);

            if (res.fxAvailability != null) {
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
| `request`                                                                                                                 | [ebury.ebury.models.operations.GetQuotesFxAvailabilityRequest](../../models/operations/GetQuotesFxAvailabilityRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[ebury.ebury.models.operations.GetQuotesFxAvailabilityResponse](../../models/operations/GetQuotesFxAvailabilityResponse.md)**


## postQuotes

Get an estimate or firm quote. An estimate is as it's described:
* The current rates on offer within the Ebury platform with no firm quote.
* A firm quote returns a reference than can be used to book a trade.


### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostQuotesQuoteType;
import ebury.ebury.models.operations.PostQuotesRequest;
import ebury.ebury.models.operations.PostQuotesResponse;
import ebury.ebury.models.shared.QuoteRequest;
import ebury.ebury.models.shared.QuoteRequestOperation;
import ebury.ebury.models.shared.QuoteRequestTradeType;
import ebury.ebury.models.shared.Security;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("impedit") {{
                    apiKey = "";
                }})
                .build();

            PostQuotesRequest req = new PostQuotesRequest(                new QuoteRequest(3592.71d, "veniam", QuoteRequestOperation.BUY, "inventore", QuoteRequestTradeType.SPOT) {{
                                valueDate = LocalDate.parse("2022-03-24");
                            }};, "consectetur", PostQuotesQuoteType.QUOTE) {{
                xContactID = "aspernatur";
            }};            

            PostQuotesResponse res = sdk.quotes.postQuotes(req);

            if (res.estimateOrQuoteResponse != null) {
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
| `request`                                                                                       | [ebury.ebury.models.operations.PostQuotesRequest](../../models/operations/PostQuotesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[ebury.ebury.models.operations.PostQuotesResponse](../../models/operations/PostQuotesResponse.md)**

