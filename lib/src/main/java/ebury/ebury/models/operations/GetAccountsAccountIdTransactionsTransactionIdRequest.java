/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class GetAccountsAccountIdTransactionsTransactionIdRequest {
    /**
     * The ID of the contact
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Contact-ID")
    public String xContactID;

    public GetAccountsAccountIdTransactionsTransactionIdRequest withXContactID(String xContactID) {
        this.xContactID = xContactID;
        return this;
    }
    
    /**
     * The UUID of the account
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=account_id")
    public String accountId;

    public GetAccountsAccountIdTransactionsTransactionIdRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    /**
     * The ID of the client
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public GetAccountsAccountIdTransactionsTransactionIdRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The UUID of the transaction
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transaction_id")
    public String transactionId;

    public GetAccountsAccountIdTransactionsTransactionIdRequest withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    
    public GetAccountsAccountIdTransactionsTransactionIdRequest(@JsonProperty("X-Contact-ID") String xContactID, @JsonProperty("account_id") String accountId, @JsonProperty("client_id") String clientId, @JsonProperty("transaction_id") String transactionId) {
        this.xContactID = xContactID;
        this.accountId = accountId;
        this.clientId = clientId;
        this.transactionId = transactionId;
  }
}
