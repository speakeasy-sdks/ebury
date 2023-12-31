/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BalanceData {
    /**
     * The UUID of the account.
     */
    @JsonProperty("account_id")
    public String accountId;

    public BalanceData withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @JsonProperty("amount")
    public BalanceAmount amount;

    public BalanceData withAmount(BalanceAmount amount) {
        this.amount = amount;
        return this;
    }
    
    /**
     * Whether the balance is credit or debit
     */
    @JsonProperty("credit_debit_indicator")
    public CreditDebitIndicator creditDebitIndicator;

    public BalanceData withCreditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }
    
    /**
     * The date and time when the balance was calculated.
     */
    @JsonProperty("datetime")
    public String datetime;

    public BalanceData withDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }
    
    /**
     * This is an enumeration of the balance types of an account.
     */
    @JsonProperty("type")
    public BalanceType type;

    public BalanceData withType(BalanceType type) {
        this.type = type;
        return this;
    }
    
    public BalanceData(@JsonProperty("account_id") String accountId, @JsonProperty("amount") BalanceAmount amount, @JsonProperty("credit_debit_indicator") CreditDebitIndicator creditDebitIndicator, @JsonProperty("datetime") String datetime, @JsonProperty("type") BalanceType type) {
        this.accountId = accountId;
        this.amount = amount;
        this.creditDebitIndicator = creditDebitIndicator;
        this.datetime = datetime;
        this.type = type;
  }
}
