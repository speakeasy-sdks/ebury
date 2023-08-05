/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LinksGetMassPaymentItem {
    /**
     * Funding account URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("funding_account_href")
    public String fundingAccountHref;

    public LinksGetMassPaymentItem withFundingAccountHref(String fundingAccountHref) {
        this.fundingAccountHref = fundingAccountHref;
        return this;
    }
    
    /**
     * Payments created URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payments_created_href")
    public String paymentsCreatedHref;

    public LinksGetMassPaymentItem withPaymentsCreatedHref(String paymentsCreatedHref) {
        this.paymentsCreatedHref = paymentsCreatedHref;
        return this;
    }
    
    /**
     * Payments errored URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payments_errored_href")
    public String paymentsErroredHref;

    public LinksGetMassPaymentItem withPaymentsErroredHref(String paymentsErroredHref) {
        this.paymentsErroredHref = paymentsErroredHref;
        return this;
    }
    
    /**
     * Payment trades URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trades_href")
    public String tradesHref;

    public LinksGetMassPaymentItem withTradesHref(String tradesHref) {
        this.tradesHref = tradesHref;
        return this;
    }
    
    public LinksGetMassPaymentItem(){}
}
