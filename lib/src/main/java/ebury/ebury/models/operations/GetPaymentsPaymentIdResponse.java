/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetPaymentsPaymentIdResponse {
    
    public String contentType;

    public GetPaymentsPaymentIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Formatting, parameter or schema validation error. See error message for further details
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public GetPaymentsPaymentIdResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    /**
     * The client payment
     */
    
    public ebury.ebury.models.shared.Payment payment;

    public GetPaymentsPaymentIdResponse withPayment(ebury.ebury.models.shared.Payment payment) {
        this.payment = payment;
        return this;
    }
    
    
    public Integer statusCode;

    public GetPaymentsPaymentIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetPaymentsPaymentIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetPaymentsPaymentIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
