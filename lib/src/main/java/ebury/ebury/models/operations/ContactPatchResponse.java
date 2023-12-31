/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ContactPatchResponse {
    
    public String contentType;

    public ContactPatchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Formatting, parameter or schema validation error. See error message for further details.
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public ContactPatchResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    
    public Integer statusCode;

    public ContactPatchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ContactPatchResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ContactPatchResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
