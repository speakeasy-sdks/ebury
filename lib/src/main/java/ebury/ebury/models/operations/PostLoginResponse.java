/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostLoginResponse {
    /**
     * Formatting or schema validation error or invalid data.See error message for further details.
     */
    
    public ebury.ebury.models.shared.AuthErrorMessage authErrorMessage;

    public PostLoginResponse withAuthErrorMessage(ebury.ebury.models.shared.AuthErrorMessage authErrorMessage) {
        this.authErrorMessage = authErrorMessage;
        return this;
    }
    
    
    public byte[] body;

    public PostLoginResponse withBody(byte[] body) {
        this.body = body;
        return this;
    }
    
    
    public String contentType;

    public PostLoginResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public PostLoginResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostLoginResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * HTML 2FA template
     */
    
    public String postLogin200ApplicationJSONString;

    public PostLoginResponse withPostLogin200ApplicationJSONString(String postLogin200ApplicationJSONString) {
        this.postLogin200ApplicationJSONString = postLogin200ApplicationJSONString;
        return this;
    }
    
    /**
     * HTML 2FA template
     */
    
    public String postLogin200TextHTMLString;

    public PostLoginResponse withPostLogin200TextHTMLString(String postLogin200TextHTMLString) {
        this.postLogin200TextHTMLString = postLogin200TextHTMLString;
        return this;
    }
    
    /**
     * Redirect to your redirect_url
     */
    
    public String postLogin302ApplicationJSONString;

    public PostLoginResponse withPostLogin302ApplicationJSONString(String postLogin302ApplicationJSONString) {
        this.postLogin302ApplicationJSONString = postLogin302ApplicationJSONString;
        return this;
    }
    
    /**
     * Redirect to your redirect_url
     */
    
    public String postLogin302TextHTMLString;

    public PostLoginResponse withPostLogin302TextHTMLString(String postLogin302TextHTMLString) {
        this.postLogin302TextHTMLString = postLogin302TextHTMLString;
        return this;
    }
    
    public PostLoginResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
