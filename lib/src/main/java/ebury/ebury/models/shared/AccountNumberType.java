/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AccountNumberType - The type of the account number.
 */
public enum AccountNumberType {
    IBAN("IBAN"),
    BBAN("BBAN");

    @JsonValue
    public final String value;

    private AccountNumberType(String value) {
        this.value = value;
    }
}
