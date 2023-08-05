/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreditDebitIndicator - Whether the balance is credit or debit
 */
public enum CreditDebitIndicator {
    CREDIT("Credit"),
    DEBIT("Debit");

    @JsonValue
    public final String value;

    private CreditDebitIndicator(String value) {
        this.value = value;
    }
}