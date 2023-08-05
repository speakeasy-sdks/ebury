/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class GetPaymentsPaymentIdRequest {
    /**
     * The ID of the contact
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Contact-ID")
    public String xContactID;

    public GetPaymentsPaymentIdRequest withXContactID(String xContactID) {
        this.xContactID = xContactID;
        return this;
    }
    
    /**
     * The ID of the client
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public GetPaymentsPaymentIdRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Unique idenifier for payment
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=payment_id")
    public String paymentId;

    public GetPaymentsPaymentIdRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    public GetPaymentsPaymentIdRequest(@JsonProperty("client_id") String clientId, @JsonProperty("payment_id") String paymentId) {
        this.clientId = clientId;
        this.paymentId = paymentId;
  }
}