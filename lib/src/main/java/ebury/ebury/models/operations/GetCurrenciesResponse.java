/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetCurrenciesResponse {
    
    public String contentType;

    public GetCurrenciesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A list with the client's currencies.
     */
    
    public ebury.ebury.models.shared.CurrencyInfo[] currencyInfos;

    public GetCurrenciesResponse withCurrencyInfos(ebury.ebury.models.shared.CurrencyInfo[] currencyInfos) {
        this.currencyInfos = currencyInfos;
        return this;
    }
    
    /**
     * Formatting, parameter or schema validation error. See error message for further details
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public GetCurrenciesResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    
    public Integer statusCode;

    public GetCurrenciesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetCurrenciesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetCurrenciesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
