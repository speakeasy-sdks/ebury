/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class DocumentGetRequest {
    /**
     * The identifier of a contact.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Contact-ID")
    public String xContactID;

    public DocumentGetRequest withXContactID(String xContactID) {
        this.xContactID = xContactID;
        return this;
    }
    
    /**
     * The identifier of a client.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public DocumentGetRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The ID of the entity that generated this document e.g. payment, trade, etc.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=id")
    public String id;

    public DocumentGetRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The document type: pi (payment instruction), pr (payment receipt), tr (trade receipt).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    public ebury.ebury.models.shared.Type type;

    public DocumentGetRequest withType(ebury.ebury.models.shared.Type type) {
        this.type = type;
        return this;
    }
    
    public DocumentGetRequest(@JsonProperty("client_id") String clientId, @JsonProperty("id") String id, @JsonProperty("type") ebury.ebury.models.shared.Type type) {
        this.clientId = clientId;
        this.id = id;
        this.type = type;
  }
}