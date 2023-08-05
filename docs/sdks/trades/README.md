# trades

### Available Operations

* [getTrades](#gettrades) - Get all trades
* [getTradesTradeId](#gettradestradeid) - Get a trade
* [postTrades](#posttrades) - Create a Trade

## getTrades

Get all the trades for a given client ID

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetTradesRequest;
import ebury.ebury.models.operations.GetTradesResponse;
import ebury.ebury.models.operations.GetTradesStatus;
import ebury.ebury.models.operations.GetTradesTradeType;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("non") {{
                    apiKey = "";
                }})
                .build();

            GetTradesRequest req = new GetTradesRequest("et") {{
                xContactID = "dolorum";
                buyCurrency = "laborum";
                externalReferenceId = "placeat";
                massPaymentExternalReferenceId = "velit";
                massPaymentId = "eum";
                page = 420539;
                pageSize = 752135;
                parentTradeId = "quas";
                status = new ebury.ebury.models.operations.GetTradesStatus[]{{
                    add(GetTradesStatus.CANCELLED),
                    add(GetTradesStatus.FUNDS_IN_FULL),
                    add(GetTradesStatus.CLOSED),
                    add(GetTradesStatus.CREATED),
                }};
                tradeType = new ebury.ebury.models.operations.GetTradesTradeType[]{{
                    add(GetTradesTradeType.FORWARD),
                    add(GetTradesTradeType.SPOT),
                }};
            }};            

            GetTradesResponse res = sdk.trades.getTrades(req);

            if (res.bookedTrades != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ebury.ebury.models.operations.GetTradesRequest](../../models/operations/GetTradesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[ebury.ebury.models.operations.GetTradesResponse](../../models/operations/GetTradesResponse.md)**


## getTradesTradeId

Get a trade with a specific trade_id

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetTradesTradeIdRequest;
import ebury.ebury.models.operations.GetTradesTradeIdResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("provident") {{
                    apiKey = "";
                }})
                .build();

            GetTradesTradeIdRequest req = new GetTradesTradeIdRequest("ipsa", "molestiae") {{
                xContactID = "magnam";
            }};            

            GetTradesTradeIdResponse res = sdk.trades.getTradesTradeId(req);

            if (res.bookedTrade != null) {
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
| `request`                                                                                                   | [ebury.ebury.models.operations.GetTradesTradeIdRequest](../../models/operations/GetTradesTradeIdRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[ebury.ebury.models.operations.GetTradesTradeIdResponse](../../models/operations/GetTradesTradeIdResponse.md)**


## postTrades

Initiate a new trade. You need to have an existing quote_id to do this


### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostTradesRequest;
import ebury.ebury.models.operations.PostTradesResponse;
import ebury.ebury.models.shared.NewTrade;
import ebury.ebury.models.shared.NewTradeReason;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("odio") {{
                    apiKey = "";
                }})
                .build();

            PostTradesRequest req = new PostTradesRequest(                new NewTrade(NewTradeReason.REPATRIATION_OF_GOODS) {{
                                externalReferenceId = "esse";
                                reference = "esse";
                                tradeType = "rem";
                            }};, "fuga", "reprehenderit") {{
                xContactID = "quidem";
            }};            

            PostTradesResponse res = sdk.trades.postTrades(req);

            if (res.confirmedTrade != null) {
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
| `request`                                                                                       | [ebury.ebury.models.operations.PostTradesRequest](../../models/operations/PostTradesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[ebury.ebury.models.operations.PostTradesResponse](../../models/operations/PostTradesResponse.md)**

