<!-- Start SDK Example Usage -->


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
                .setSecurity(new Security("corrupti") {{
                    apiKey = "";
                }})
                .build();

            GetAccountDetailsRequest req = new GetAccountDetailsRequest("provident") {{
                accountDetailsType = GetAccountDetailsAccountDetailsType.POOLED;
                accountId = "quibusdam";
                alias = "unde";
                country = "Sweden";
                currency = "corrupti";
                page = 847252L;
                pageSize = 423655L;
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
<!-- End SDK Example Usage -->