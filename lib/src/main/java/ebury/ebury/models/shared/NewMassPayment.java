/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NewMassPayment - Request Payload
 */

public class NewMassPayment {
    /**
     * If true, send successful instructions for payment. If false, hold until customer hits commit endpoint.
     */
    @JsonProperty("auto_commit")
    public Boolean autoCommit;

    public NewMassPayment withAutoCommit(Boolean autoCommit) {
        this.autoCommit = autoCommit;
        return this;
    }
    
    /**
     * The external reference: unique ID supplied by customer which can be used later to filter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_reference_id")
    public String externalReferenceId;

    public NewMassPayment withExternalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
        return this;
    }
    
    /**
     * Array of multiple payment instruction given by the customer.
     */
    @JsonProperty("payment_instructions")
    public NewMultiPaymentItem[] paymentInstructions;

    public NewMassPayment withPaymentInstructions(NewMultiPaymentItem[] paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
        return this;
    }
    
    /**
     * If `trade_id` omitted, `sell_currency` must be supplied.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sell_currency")
    public String sellCurrency;

    public NewMassPayment withSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
        return this;
    }
    
    /**
     * Trade ID to book payments against. If customer wants the trade to be auto booked then this parameter should not be supplied.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trade_id")
    public String tradeId;

    public NewMassPayment withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    
    public NewMassPayment(@JsonProperty("auto_commit") Boolean autoCommit, @JsonProperty("payment_instructions") NewMultiPaymentItem[] paymentInstructions) {
        this.autoCommit = autoCommit;
        this.paymentInstructions = paymentInstructions;
  }
}