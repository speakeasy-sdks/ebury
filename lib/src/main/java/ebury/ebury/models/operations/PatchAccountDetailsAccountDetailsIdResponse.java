/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PatchAccountDetailsAccountDetailsIdResponse {
    /**
     * Account details updated
     */
    
    public ebury.ebury.models.shared.AccountDetailsDomesticInternationalResponse accountDetailsDomesticInternationalResponse;

    public PatchAccountDetailsAccountDetailsIdResponse withAccountDetailsDomesticInternationalResponse(ebury.ebury.models.shared.AccountDetailsDomesticInternationalResponse accountDetailsDomesticInternationalResponse) {
        this.accountDetailsDomesticInternationalResponse = accountDetailsDomesticInternationalResponse;
        return this;
    }
    
    
    public String contentType;

    public PatchAccountDetailsAccountDetailsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Account details not found
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public PatchAccountDetailsAccountDetailsIdResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    
    public Integer statusCode;

    public PatchAccountDetailsAccountDetailsIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PatchAccountDetailsAccountDetailsIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PatchAccountDetailsAccountDetailsIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}