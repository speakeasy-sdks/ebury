/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ClientStatus - Status of the client.
 */
public enum ClientStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    CLOSED("Closed"),
    BLOCKED("Blocked");

    @JsonValue
    public final String value;

    private ClientStatus(String value) {
        this.value = value;
    }
}
