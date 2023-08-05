/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetAuthenticateResponse {
    /**
     * Formatting or schema validation error or invalid data.See error message for further details.
     */
    
    public ebury.ebury.models.shared.AuthErrorMessage authErrorMessage;

    public GetAuthenticateResponse withAuthErrorMessage(ebury.ebury.models.shared.AuthErrorMessage authErrorMessage) {
        this.authErrorMessage = authErrorMessage;
        return this;
    }
    
    
    public byte[] body;

    public GetAuthenticateResponse withBody(byte[] body) {
        this.body = body;
        return this;
    }
    
    
    public String contentType;

    public GetAuthenticateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetAuthenticateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetAuthenticateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * HTML login template
     */
    
    public String getAuthenticate200ApplicationJSONString;

    public GetAuthenticateResponse withGetAuthenticate200ApplicationJSONString(String getAuthenticate200ApplicationJSONString) {
        this.getAuthenticate200ApplicationJSONString = getAuthenticate200ApplicationJSONString;
        return this;
    }
    
    /**
     * HTML login template
     */
    
    public String getAuthenticate200TextHTMLString;

    public GetAuthenticateResponse withGetAuthenticate200TextHTMLString(String getAuthenticate200TextHTMLString) {
        this.getAuthenticate200TextHTMLString = getAuthenticate200TextHTMLString;
        return this;
    }
    
    public GetAuthenticateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
