/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TransactionData - Returns the requested transactions
 */

public class TransactionData {
    /**
     * The UUID of the account.
     */
    @JsonProperty("account_id")
    public String accountId;

    public TransactionData withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    /**
     * Additional information for the transaction.
     */
    @JsonProperty("additional_transaction_information")
    public String additionalTransactionInformation;

    public TransactionData withAdditionalTransactionInformation(String additionalTransactionInformation) {
        this.additionalTransactionInformation = additionalTransactionInformation;
        return this;
    }
    
    @JsonProperty("amount")
    public Amount amount;

    public TransactionData withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonProperty("balance")
    public BalanceData balance;

    public TransactionData withBalance(BalanceData balance) {
        this.balance = balance;
        return this;
    }
    
    /**
     * Date and time (UTC) when the transaction was booked
     */
    @JsonProperty("booking_datetime")
    public String bookingDatetime;

    public TransactionData withBookingDatetime(String bookingDatetime) {
        this.bookingDatetime = bookingDatetime;
        return this;
    }
    
    /**
     * Identifier of the client.
     */
    @JsonProperty("client_id")
    public String clientId;

    public TransactionData withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Whether the balance is credit or debit
     */
    @JsonProperty("credit_debit_indicator")
    public CreditDebitIndicator creditDebitIndicator;

    public TransactionData withCreditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("creditor_account")
    public CreditorDebtorAccount creditorAccount;

    public TransactionData withCreditorAccount(CreditorDebtorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }
    
    /**
     * Name of the creditor
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("creditor_name")
    public String creditorName;

    public TransactionData withCreditorName(String creditorName) {
        this.creditorName = creditorName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("debtor_account")
    public CreditorDebtorAccount debtorAccount;

    public TransactionData withDebtorAccount(CreditorDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }
    
    /**
     * Name of the debtor
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("debtor_name")
    public String debtorName;

    public TransactionData withDebtorName(String debtorName) {
        this.debtorName = debtorName;
        return this;
    }
    
    /**
     * This is an enumeration of the types of status for a transaction.
     */
    @JsonProperty("status")
    public TransactionStatus status;

    public TransactionData withStatus(TransactionStatus status) {
        this.status = status;
        return this;
    }
    
    /**
     * The UUID of the transaction.
     */
    @JsonProperty("transaction_id")
    public String transactionId;

    public TransactionData withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    
    /**
     * Basic information for the transaction
     */
    @JsonProperty("transaction_information")
    public String transactionInformation;

    public TransactionData withTransactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
        return this;
    }
    
    /**
     * Reference for the transaction
     */
    @JsonProperty("transaction_reference")
    public String transactionReference;

    public TransactionData withTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }
    
    /**
     * Type of the transaction
     */
    @JsonProperty("transaction_type")
    public TransactionDataTransactionType transactionType;

    public TransactionData withTransactionType(TransactionDataTransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    
    /**
     * Value date and time (UTC) of the transaction
     */
    @JsonProperty("value_datetime")
    public String valueDatetime;

    public TransactionData withValueDatetime(String valueDatetime) {
        this.valueDatetime = valueDatetime;
        return this;
    }
    
    public TransactionData(@JsonProperty("account_id") String accountId, @JsonProperty("additional_transaction_information") String additionalTransactionInformation, @JsonProperty("amount") Amount amount, @JsonProperty("balance") BalanceData balance, @JsonProperty("booking_datetime") String bookingDatetime, @JsonProperty("client_id") String clientId, @JsonProperty("credit_debit_indicator") CreditDebitIndicator creditDebitIndicator, @JsonProperty("status") TransactionStatus status, @JsonProperty("transaction_id") String transactionId, @JsonProperty("transaction_information") String transactionInformation, @JsonProperty("transaction_reference") String transactionReference, @JsonProperty("transaction_type") TransactionDataTransactionType transactionType, @JsonProperty("value_datetime") String valueDatetime) {
        this.accountId = accountId;
        this.additionalTransactionInformation = additionalTransactionInformation;
        this.amount = amount;
        this.balance = balance;
        this.bookingDatetime = bookingDatetime;
        this.clientId = clientId;
        this.creditDebitIndicator = creditDebitIndicator;
        this.status = status;
        this.transactionId = transactionId;
        this.transactionInformation = transactionInformation;
        this.transactionReference = transactionReference;
        this.transactionType = transactionType;
        this.valueDatetime = valueDatetime;
  }
}
