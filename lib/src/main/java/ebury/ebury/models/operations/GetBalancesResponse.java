/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetBalancesResponse {
    /**
     * A list with the client's balances.
     */
    
    public ebury.ebury.models.shared.BalanceData[] balanceData;

    public GetBalancesResponse withBalanceData(ebury.ebury.models.shared.BalanceData[] balanceData) {
        this.balanceData = balanceData;
        return this;
    }
    
    
    public String contentType;

    public GetBalancesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Formatting, parameter or schema validation error. See error message for further details
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public GetBalancesResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    
    public Integer statusCode;

    public GetBalancesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetBalancesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetBalancesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
