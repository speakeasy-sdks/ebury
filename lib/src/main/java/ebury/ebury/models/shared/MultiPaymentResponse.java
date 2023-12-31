/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultiPaymentResponse - Multi payment created, see response body for status
 */

public class MultiPaymentResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_details")
    public MultiPaymentResponseAccountDetails accountDetails;

    public MultiPaymentResponse withAccountDetails(MultiPaymentResponseAccountDetails accountDetails) {
        this.accountDetails = accountDetails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invalid_payments")
    public MultiPaymentError[] invalidPayments;

    public MultiPaymentResponse withInvalidPayments(MultiPaymentError[] invalidPayments) {
        this.invalidPayments = invalidPayments;
        return this;
    }
    
    /**
     * The multipayment ID
     */
    @JsonProperty("multipayment_id")
    public Integer multipaymentId;

    public MultiPaymentResponse withMultipaymentId(Integer multipaymentId) {
        this.multipaymentId = multipaymentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trade_details")
    public MultiPaymentResponseTradeDetails[] tradeDetails;

    public MultiPaymentResponse withTradeDetails(MultiPaymentResponseTradeDetails[] tradeDetails) {
        this.tradeDetails = tradeDetails;
        return this;
    }
    
    public MultiPaymentResponse(@JsonProperty("multipayment_id") Integer multipaymentId) {
        this.multipaymentId = multipaymentId;
  }
}
