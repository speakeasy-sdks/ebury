/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PaymentStatus - The current status of the payment
 */
public enum PaymentStatus {
    NEED_MORE_BENEFICIARY_INFORMATION("Need more beneficiary information"),
    VALIDATING_BENEFICIARY_INFORMATION("Validating beneficiary information"),
    WAITING_FOR_PAYMENT_DATE("Waiting for payment date"),
    PAYMENT_COMPLETE("Payment complete"),
    EXECUTING_PAYMENT("Executing Payment"),
    PAYMENT_PENDING_OF_AUTHORIZATION("Payment pending of authorization"),
    PAYMENT_REJECTED("Payment rejected"),
    PAYMENT_CANCELLED("Payment cancelled");

    @JsonValue
    public final String value;

    private PaymentStatus(String value) {
        this.value = value;
    }
}
