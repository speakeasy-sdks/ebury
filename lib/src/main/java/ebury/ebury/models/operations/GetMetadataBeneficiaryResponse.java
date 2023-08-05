/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetMetadataBeneficiaryResponse {
    /**
     * Beneficiary metadata.
     */
    
    public ebury.ebury.models.shared.BeneficiaryMetadataItem[] beneficiaryMetadata;

    public GetMetadataBeneficiaryResponse withBeneficiaryMetadata(ebury.ebury.models.shared.BeneficiaryMetadataItem[] beneficiaryMetadata) {
        this.beneficiaryMetadata = beneficiaryMetadata;
        return this;
    }
    
    
    public String contentType;

    public GetMetadataBeneficiaryResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Formatting, parameter or schema validation error. See error message for further details.
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public GetMetadataBeneficiaryResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    
    public Integer statusCode;

    public GetMetadataBeneficiaryResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetMetadataBeneficiaryResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetMetadataBeneficiaryResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}