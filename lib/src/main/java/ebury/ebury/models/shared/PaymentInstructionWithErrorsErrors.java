/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentInstructionWithErrorsErrors {
    /**
     * A short code for the error
     */
    @JsonProperty("code")
    public String code;

    public PaymentInstructionWithErrorsErrors withCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * The detailed explanation of the error
     */
    @JsonProperty("message")
    public String message;

    public PaymentInstructionWithErrorsErrors withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public PaymentInstructionWithErrorsErrors(@JsonProperty("code") String code, @JsonProperty("message") String message) {
        this.code = code;
        this.message = message;
  }
}
