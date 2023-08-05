/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostTokenForContactResponse - Access token data
 */

public class PostTokenForContactResponse {
    /**
     * An OAuth access token that can be used to call the API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;

    public PostTokenForContactResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * Expiry period in seconds from time token returned, currently returns 3600 (1 hour).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_in")
    public String expiresIn;

    public PostTokenForContactResponse withExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    
    /**
     * A signed, base 64 encoded JSON Web Token that provides verification of the identity that authorized the request. The token includes the client identifier, which is a required parameter on the majority of API calls.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id_token")
    public String idToken;

    public PostTokenForContactResponse withIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }
    
    /**
     * The Authorization header scheme to use when making requests, will be Bearer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_type")
    public PostTokenForContactResponseTokenType tokenType;

    public PostTokenForContactResponse withTokenType(PostTokenForContactResponseTokenType tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    
    public PostTokenForContactResponse(){}
}
