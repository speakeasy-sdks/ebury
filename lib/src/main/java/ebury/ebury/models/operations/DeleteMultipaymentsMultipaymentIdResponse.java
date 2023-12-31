/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteMultipaymentsMultipaymentIdResponse {
    
    public String contentType;

    public DeleteMultipaymentsMultipaymentIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Formatting, parameter or schema validation error. See error message for further details
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public DeleteMultipaymentsMultipaymentIdResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteMultipaymentsMultipaymentIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteMultipaymentsMultipaymentIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DeleteMultipaymentsMultipaymentIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
