/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class DeleteMultipaymentsMultipaymentIdRequest {
    /**
     * The ID of the contact
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Contact-ID")
    public String xContactID;

    public DeleteMultipaymentsMultipaymentIdRequest withXContactID(String xContactID) {
        this.xContactID = xContactID;
        return this;
    }
    
    /**
     * The ID of the client
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public DeleteMultipaymentsMultipaymentIdRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The multi payment ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=multipayment_id")
    public String multipaymentId;

    public DeleteMultipaymentsMultipaymentIdRequest withMultipaymentId(String multipaymentId) {
        this.multipaymentId = multipaymentId;
        return this;
    }
    
    public DeleteMultipaymentsMultipaymentIdRequest(@JsonProperty("client_id") String clientId, @JsonProperty("multipayment_id") String multipaymentId) {
        this.clientId = clientId;
        this.multipaymentId = multipaymentId;
  }
}
