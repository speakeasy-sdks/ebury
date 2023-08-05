/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchAccountDetailsRequest - Payload to patch the referred account details
 */

public class PatchAccountDetailsRequest {
    /**
     * New alias for the account details
     */
    @JsonProperty("alias")
    public String alias;

    public PatchAccountDetailsRequest withAlias(String alias) {
        this.alias = alias;
        return this;
    }
    
    public PatchAccountDetailsRequest(@JsonProperty("alias") String alias) {
        this.alias = alias;
  }
}