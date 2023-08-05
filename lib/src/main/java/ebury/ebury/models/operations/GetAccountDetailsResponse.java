/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetAccountDetailsResponse {
    
    public String contentType;

    public GetAccountDetailsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Formatting, parameter or schema validation error. See error message for further details
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public GetAccountDetailsResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    /**
     * Account details
     */
    
    public ebury.ebury.models.shared.AccountDetailsDomesticInternationalResponse[] getAccountDetailsDomesticInternationalResponse;

    public GetAccountDetailsResponse withGetAccountDetailsDomesticInternationalResponse(ebury.ebury.models.shared.AccountDetailsDomesticInternationalResponse[] getAccountDetailsDomesticInternationalResponse) {
        this.getAccountDetailsDomesticInternationalResponse = getAccountDetailsDomesticInternationalResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public GetAccountDetailsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public Integer statusCode;

    public GetAccountDetailsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetAccountDetailsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetAccountDetailsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}