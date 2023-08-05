/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostTokenResponse {
    /**
     * Formatting or schema validation error or invalid data.See error message for further details.
     */
    
    public ebury.ebury.models.shared.AuthErrorMessage authErrorMessage;

    public PostTokenResponse withAuthErrorMessage(ebury.ebury.models.shared.AuthErrorMessage authErrorMessage) {
        this.authErrorMessage = authErrorMessage;
        return this;
    }
    
    
    public String contentType;

    public PostTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Listf of contacts IDs that are from the given client
     */
    
    public ebury.ebury.models.shared.PostTokenResponse postTokenResponse;

    public PostTokenResponse withPostTokenResponse(ebury.ebury.models.shared.PostTokenResponse postTokenResponse) {
        this.postTokenResponse = postTokenResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public PostTokenResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostTokenResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostTokenResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
