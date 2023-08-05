/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class PostVerifyRequest {
    /**
     * 2FA code to verify
     */
    @SpeakeasyMetadata("request:mediaType=*/*")
    public byte[] requestBody;

    public PostVerifyRequest withRequestBody(byte[] requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Your Authorization Client ID, identifies your application to the Authorisation Server
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public PostVerifyRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Your Authorization Client ID, identifies your application to the Authorisation Server
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=code")
    public String code;

    public PostVerifyRequest withCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * The redirect URL that is registered for your application. This must match the value we hold.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=redirect_uri")
    public String redirectUri;

    public PostVerifyRequest withRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    
    public PostVerifyRequest(@JsonProperty("RequestBody") byte[] requestBody, @JsonProperty("client_id") String clientId, @JsonProperty("code") String code, @JsonProperty("redirect_uri") String redirectUri) {
        this.requestBody = requestBody;
        this.clientId = clientId;
        this.code = code;
        this.redirectUri = redirectUri;
  }
}
