/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NewTrade - Request Payload
 */

public class NewTrade {
    /**
     * API external reference id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_reference_id")
    public String externalReferenceId;

    public NewTrade withExternalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
        return this;
    }
    
    /**
     * Reason for trade. The 'not_related_to_goods_or_services' reason is only for spot type.
     */
    @JsonProperty("reason")
    public NewTradeReason reason;

    public NewTrade withReason(NewTradeReason reason) {
        this.reason = reason;
        return this;
    }
    
    /**
     * Reference for the trade.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;

    public NewTrade withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    /**
     * Currently ignored (DEPRECATED)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trade_type")
    public String tradeType;

    public NewTrade withTradeType(String tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    
    public NewTrade(@JsonProperty("reason") NewTradeReason reason) {
        this.reason = reason;
  }
}