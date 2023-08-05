/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContactsList - A contact list
 */

public class ContactsList {
    /**
     * The code for the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public String[] data;

    public ContactsList withData(String[] data) {
        this.data = data;
        return this;
    }
    
    public ContactsList(){}
}