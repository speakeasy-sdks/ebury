/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AccountDetailsDomesticInternationalResponseStatus - Status of the account details
 */
public enum AccountDetailsDomesticInternationalResponseStatus {
    PENDING("pending"),
    CONFIRMED("confirmed"),
    FAILED("failed");

    @JsonValue
    public final String value;

    private AccountDetailsDomesticInternationalResponseStatus(String value) {
        this.value = value;
    }
}