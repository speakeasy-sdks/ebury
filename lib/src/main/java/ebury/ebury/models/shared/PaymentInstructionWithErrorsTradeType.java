/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PaymentInstructionWithErrorsTradeType - Type of trade. 'spot' is the only supported value at the moment
 */
public enum PaymentInstructionWithErrorsTradeType {
    SPOT("spot");

    @JsonValue
    public final String value;

    private PaymentInstructionWithErrorsTradeType(String value) {
        this.value = value;
    }
}