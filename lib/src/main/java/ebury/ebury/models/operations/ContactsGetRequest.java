/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class ContactsGetRequest {
    /**
     * The identifier of a contact.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Contact-ID")
    public String xContactID;

    public ContactsGetRequest withXContactID(String xContactID) {
        this.xContactID = xContactID;
        return this;
    }
    
    /**
     * The identifier of a client.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public ContactsGetRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    public ContactsGetRequest(@JsonProperty("client_id") String clientId) {
        this.clientId = clientId;
  }
}
