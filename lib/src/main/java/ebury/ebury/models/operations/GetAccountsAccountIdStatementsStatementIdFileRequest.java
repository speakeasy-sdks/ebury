/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class GetAccountsAccountIdStatementsStatementIdFileRequest {
    /**
     * The ID of the contact
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Contact-ID")
    public String xContactID;

    public GetAccountsAccountIdStatementsStatementIdFileRequest withXContactID(String xContactID) {
        this.xContactID = xContactID;
        return this;
    }
    
    /**
     * Account UUID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=account_id")
    public String accountId;

    public GetAccountsAccountIdStatementsStatementIdFileRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    /**
     * The ID of the client
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public GetAccountsAccountIdStatementsStatementIdFileRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Statement UUID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=statement_id")
    public String statementId;

    public GetAccountsAccountIdStatementsStatementIdFileRequest withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }
    
    public GetAccountsAccountIdStatementsStatementIdFileRequest(@JsonProperty("account_id") String accountId, @JsonProperty("client_id") String clientId, @JsonProperty("statement_id") String statementId) {
        this.accountId = accountId;
        this.clientId = clientId;
        this.statementId = statementId;
  }
}
