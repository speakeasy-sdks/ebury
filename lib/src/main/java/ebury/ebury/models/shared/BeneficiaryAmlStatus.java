/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * BeneficiaryAmlStatus - AML status of the beneficiary.
 */
public enum BeneficiaryAmlStatus {
    OK("OK"),
    PENDING_REVIEW("Pending Review"),
    PENDING_INFORMATION("Pending information"),
    BLOCKED("Blocked");

    @JsonValue
    public final String value;

    private BeneficiaryAmlStatus(String value) {
        this.value = value;
    }
}
