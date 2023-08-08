# ebury

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'ebury.ebury:ebury:1.1.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [accountDetails](docs/sdks/accountdetails/README.md)

* [getAccountDetails](docs/sdks/accountdetails/README.md#getaccountdetails) - Get the list of account details of the referred client
* [patchAccountDetailsAccountDetailsId](docs/sdks/accountdetails/README.md#patchaccountdetailsaccountdetailsid) - Update the alias of an account details
* [postAccountDetailsAccountDetailsIdMakeDefault](docs/sdks/accountdetails/README.md#postaccountdetailsaccountdetailsidmakedefault) - Mark the account as primary (default) for its holder and currency

### [accounts](docs/sdks/accounts/README.md)

* [getAccounts](docs/sdks/accounts/README.md#getaccounts) - Retrieve a list of accounts
* [getAccountsAccountId](docs/sdks/accounts/README.md#getaccountsaccountid) - Get an account

### [balances](docs/sdks/balances/README.md)

* [getAccountsAccountIdBalances](docs/sdks/balances/README.md#getaccountsaccountidbalances) - Get a balance for a single account
* [getBalances](docs/sdks/balances/README.md#getbalances) - Retrieve a list of the client's balances

### [beneficiaries](docs/sdks/beneficiaries/README.md)

* [beneficiariesGet](docs/sdks/beneficiaries/README.md#beneficiariesget) - Get beneficiaries
* [beneficiariesPost](docs/sdks/beneficiaries/README.md#beneficiariespost) - Create a new beneficiary
* [beneficiaryDelete](docs/sdks/beneficiaries/README.md#beneficiarydelete) - Delete a beneficiary
* [beneficiaryGet](docs/sdks/beneficiaries/README.md#beneficiaryget) - Get a beneficiary
* [beneficiaryPatch](docs/sdks/beneficiaries/README.md#beneficiarypatch) - Update a beneficiary

### [clients](docs/sdks/clients/README.md)

* [clientsGet](docs/sdks/clients/README.md#clientsget) - Get clients

### [contacts](docs/sdks/contacts/README.md)

* [contactGet](docs/sdks/contacts/README.md#contactget) - Get a contact
* [contactPatch](docs/sdks/contacts/README.md#contactpatch) - Update a contact
* [contactsGet](docs/sdks/contacts/README.md#contactsget) - Get contacts

### [currencies](docs/sdks/currencies/README.md)

* [getCurrencies](docs/sdks/currencies/README.md#getcurrencies) - Retrieve a list of the client's currencies

### [documents](docs/sdks/documents/README.md)

* [documentGet](docs/sdks/documents/README.md#documentget) - Get a document

### [metadata](docs/sdks/metadata/README.md)

* [getMetadataBeneficiary](docs/sdks/metadata/README.md#getmetadatabeneficiary) - Get beneficiary metadata
* [getMetadataCurrency](docs/sdks/metadata/README.md#getmetadatacurrency) - Get currency metadata

### [multiPayments](docs/sdks/multipayments/README.md)

* [deleteMultipaymentsMultipaymentId](docs/sdks/multipayments/README.md#deletemultipaymentsmultipaymentid) - Rejects a multi payment
* [getMassPayments](docs/sdks/multipayments/README.md#getmasspayments) - Fetch payment instructions of a mass payment
* [getMassPaymentsMassPaymentIdErrors](docs/sdks/multipayments/README.md#getmasspaymentsmasspaymentiderrors) - Fetch the payment instructions with errors for a mass payment
* [getMassPaymentsMassPaymentIdPaymentsReceived](docs/sdks/multipayments/README.md#getmasspaymentsmasspaymentidpaymentsreceived) - Fetch the payment instructions submitted for a mass payment
* [patchMultipaymentsMultipaymentId](docs/sdks/multipayments/README.md#patchmultipaymentsmultipaymentid) - Accept a multi payment
* [postMassPayments](docs/sdks/multipayments/README.md#postmasspayments) - Create a mass payment instruction
* [postMassPaymentsDollarMassPaymentIdConfirm](docs/sdks/multipayments/README.md#postmasspaymentsdollarmasspaymentidconfirm) - Confirm multi payment instructions
* [postMultipayments](docs/sdks/multipayments/README.md#postmultipayments) - Create a multi payment instruction

### [oAuth20](docs/sdks/oauth20/README.md)

* [getAuthenticate](docs/sdks/oauth20/README.md#getauthenticate) - Authenticate
* [getInfoAvailableContacts](docs/sdks/oauth20/README.md#getinfoavailablecontacts) - Available contacts
* [postAuthenticate](docs/sdks/oauth20/README.md#postauthenticate) - Authenticate
* [postLogin](docs/sdks/oauth20/README.md#postlogin) - Login
* [postSendVerificationCode](docs/sdks/oauth20/README.md#postsendverificationcode) - Send verification code
* [postToken](docs/sdks/oauth20/README.md#posttoken) - Token
* [postVerify](docs/sdks/oauth20/README.md#postverify) - Verify

### [payments](docs/sdks/payments/README.md)

* [deletePaymentsPaymentId](docs/sdks/payments/README.md#deletepaymentspaymentid) - Delete a payment
* [getPayments](docs/sdks/payments/README.md#getpayments) - Search or retrieve payments
* [getPaymentsFees](docs/sdks/payments/README.md#getpaymentsfees) - Get the fee of payments
* [getPaymentsFeesEstimate](docs/sdks/payments/README.md#getpaymentsfeesestimate) - Get the estimate fee of payments
* [getPaymentsPaymentId](docs/sdks/payments/README.md#getpaymentspaymentid) - Retrieve a payment
* [patchPaymentsPaymentId](docs/sdks/payments/README.md#patchpaymentspaymentid) - Authorise or reject a payment
* [postPayments](docs/sdks/payments/README.md#postpayments) - Create one or more payments

### [ping](docs/sdks/ping/README.md)

* [getPing](docs/sdks/ping/README.md#getping) - Test connectivity

### [quotes](docs/sdks/quotes/README.md)

* [getQuotesFxAvailability](docs/sdks/quotes/README.md#getquotesfxavailability) - Get the availability for FX markets
* [postQuotes](docs/sdks/quotes/README.md#postquotes) - Get an estimate or firm quote

### [statementFetch](docs/sdks/statementfetch/README.md)

* [getAccountsAccountIdStatementsStatementIdFile](docs/sdks/statementfetch/README.md#getaccountsaccountidstatementsstatementidfile) - Get an account

### [statementsCreate](docs/sdks/statementscreate/README.md)

* [postAccountsAccountIdStatementsFile](docs/sdks/statementscreate/README.md#postaccountsaccountidstatementsfile) - Create statement file for an account

### [trades](docs/sdks/trades/README.md)

* [getTrades](docs/sdks/trades/README.md#gettrades) - Get all trades
* [getTradesTradeId](docs/sdks/trades/README.md#gettradestradeid) - Get a trade
* [postTrades](docs/sdks/trades/README.md#posttrades) - Create a Trade

### [transactions](docs/sdks/transactions/README.md)

* [getAccountsAccountIdTransactions](docs/sdks/transactions/README.md#getaccountsaccountidtransactions) - Get transactions for a single account
* [getAccountsAccountIdTransactionsTransactionId](docs/sdks/transactions/README.md#getaccountsaccountidtransactionstransactionid) - Get a single transactions for an account
* [getTransactions](docs/sdks/transactions/README.md#gettransactions) - Get transactions for all client accounts

### [trustedAuthentication](docs/sdks/trustedauthentication/README.md)

* [postTokenContactId](docs/sdks/trustedauthentication/README.md#posttokencontactid) - Token for a Contact

### [webhooks](docs/sdks/webhooks/README.md)

* [postWebhooksGraphql](docs/sdks/webhooks/README.md#postwebhooksgraphql) - Execute a GraphQL query over the webhooks API
* [postWebhooksPingSubscriptionId](docs/sdks/webhooks/README.md#postwebhookspingsubscriptionid) - Ping a subscription
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
