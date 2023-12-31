/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PaymentAuthorisationWorkflow - The authorisation workflow of the payment
 */
public enum PaymentAuthorisationWorkflow {
    SIMPLE("simple"),
    FOUR_EYES("4-eyes");

    @JsonValue
    public final String value;

    private PaymentAuthorisationWorkflow(String value) {
        this.value = value;
    }
}
