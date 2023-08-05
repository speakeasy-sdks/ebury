/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetTransactionsResponse {
    
    public String contentType;

    public GetTransactionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Formatting, parameter or schema validation error. See error message for further details
     */
    
    public ebury.ebury.models.shared.ErrorMessage errorMessage;

    public GetTransactionsResponse withErrorMessage(ebury.ebury.models.shared.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public GetTransactionsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public Integer statusCode;

    public GetTransactionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetTransactionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A list with the client's transactions.
     */
    
    public ebury.ebury.models.shared.TransactionData[] transactionData;

    public GetTransactionsResponse withTransactionData(ebury.ebury.models.shared.TransactionData[] transactionData) {
        this.transactionData = transactionData;
        return this;
    }
    
    public GetTransactionsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
