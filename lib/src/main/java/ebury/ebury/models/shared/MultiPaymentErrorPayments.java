/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;


public class MultiPaymentErrorPayments {
    /**
     * The ID of the beneficiary's bank account
     */
    @JsonProperty("account_id")
    public String accountId;

    public MultiPaymentErrorPayments withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    /**
     * The payment amount
     */
    @JsonProperty("amount")
    public Float amount;

    public MultiPaymentErrorPayments withAmount(Float amount) {
        this.amount = amount;
        return this;
    }
    
    /**
     * The ID of the beneficiary
     */
    @JsonProperty("beneficiary_id")
    public String beneficiaryId;

    public MultiPaymentErrorPayments withBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
        return this;
    }
    
    /**
     * Whether the beneficiary should receive and email on payment
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_beneficiary")
    public Boolean emailBeneficiary;

    public MultiPaymentErrorPayments withEmailBeneficiary(Boolean emailBeneficiary) {
        this.emailBeneficiary = emailBeneficiary;
        return this;
    }
    
    /**
     * The date on which payment is required
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("payment_date")
    public LocalDate paymentDate;

    public MultiPaymentErrorPayments withPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
    
    /**
     * Payment reference
     */
    @JsonProperty("reference")
    public String reference;

    public MultiPaymentErrorPayments withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    public MultiPaymentErrorPayments(@JsonProperty("account_id") String accountId, @JsonProperty("amount") Float amount, @JsonProperty("beneficiary_id") String beneficiaryId, @JsonProperty("payment_date") LocalDate paymentDate, @JsonProperty("reference") String reference) {
        this.accountId = accountId;
        this.amount = amount;
        this.beneficiaryId = beneficiaryId;
        this.paymentDate = paymentDate;
        this.reference = reference;
  }
}
