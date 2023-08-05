/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * NewMultiPaymentItemDirection - Type of payment, 'buy' or 'sell'
 */
public enum NewMultiPaymentItemDirection {
    BUY("buy"),
    SELL("sell");

    @JsonValue
    public final String value;

    private NewMultiPaymentItemDirection(String value) {
        this.value = value;
    }
}
