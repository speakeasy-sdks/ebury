/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class PostTradesRequest {
    /**
     * Request Payload
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public ebury.ebury.models.shared.NewTrade newTrade;

    public PostTradesRequest withNewTrade(ebury.ebury.models.shared.NewTrade newTrade) {
        this.newTrade = newTrade;
        return this;
    }
    
    /**
     * The ID of the contact
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Contact-ID")
    public String xContactID;

    public PostTradesRequest withXContactID(String xContactID) {
        this.xContactID = xContactID;
        return this;
    }
    
    /**
     * The ID of the client
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public PostTradesRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The identifier of the quote
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=quote_id")
    public String quoteId;

    public PostTradesRequest withQuoteId(String quoteId) {
        this.quoteId = quoteId;
        return this;
    }
    
    public PostTradesRequest(@JsonProperty("NewTrade") ebury.ebury.models.shared.NewTrade newTrade, @JsonProperty("client_id") String clientId, @JsonProperty("quote_id") String quoteId) {
        this.newTrade = newTrade;
        this.clientId = clientId;
        this.quoteId = quoteId;
  }
}
