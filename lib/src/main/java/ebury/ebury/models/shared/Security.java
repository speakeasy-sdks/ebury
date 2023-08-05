/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=x-api-key")
    public String apiKey;

    public Security withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    public Security(@JsonProperty("api_key") String apiKey) {
        this.apiKey = apiKey;
  }
}