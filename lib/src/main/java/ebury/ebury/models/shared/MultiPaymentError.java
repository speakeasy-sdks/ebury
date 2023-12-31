/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultiPaymentError - A list of payments with known beneficiary/bank account IDs.
 */

public class MultiPaymentError {
    /**
     * Create the payment(s) asynchronously. Payments are created synchronously by default.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("async")
    public Boolean async;

    public MultiPaymentError withAsync(Boolean async) {
        this.async = async;
        return this;
    }
    
    /**
     * A list of payments
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payments")
    public MultiPaymentErrorPayments[] payments;

    public MultiPaymentError withPayments(MultiPaymentErrorPayments[] payments) {
        this.payments = payments;
        return this;
    }
    
    /**
     * Unique identifier of the trade the payment is allocated to
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trade_id")
    public String tradeId;

    public MultiPaymentError withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    
    public MultiPaymentError(){}
}
