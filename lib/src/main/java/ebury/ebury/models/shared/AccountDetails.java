/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountDetails {
    /**
     * The address of the account
     */
    @JsonProperty("account_address")
    public String accountAddress;

    public AccountDetails withAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
        return this;
    }
    
    /**
     * The name or names of the account owner(s) represented at an account level
     */
    @JsonProperty("account_name")
    public String accountName;

    public AccountDetails withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    
    /**
     * The number of the account
     */
    @JsonProperty("account_number")
    public String accountNumber;

    public AccountDetails withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    
    /**
     * The type of the account number.
     */
    @JsonProperty("account_number_type")
    public AccountNumberType accountNumberType;

    public AccountDetails withAccountNumberType(AccountNumberType accountNumberType) {
        this.accountNumberType = accountNumberType;
        return this;
    }
    
    /**
     * The identifier of the bank
     */
    @JsonProperty("bank_identifier")
    public String bankIdentifier;

    public AccountDetails withBankIdentifier(String bankIdentifier) {
        this.bankIdentifier = bankIdentifier;
        return this;
    }
    
    /**
     * The type of the bank identifier, to comply with ISO20022 `code`s related to [Clearing System Identification](https://www.iso20022.org/sites/default/files/2020-05/ExternalCodeSets_1Q2020_February2020_v1.xls), with the addition of `SWBIC` for swift international payments.
     */
    @JsonProperty("bank_identifier_type")
    public String bankIdentifierType;

    public AccountDetails withBankIdentifierType(String bankIdentifierType) {
        this.bankIdentifierType = bankIdentifierType;
        return this;
    }
    
    public AccountDetails(@JsonProperty("account_address") String accountAddress, @JsonProperty("account_name") String accountName, @JsonProperty("account_number") String accountNumber, @JsonProperty("account_number_type") AccountNumberType accountNumberType, @JsonProperty("bank_identifier") String bankIdentifier, @JsonProperty("bank_identifier_type") String bankIdentifierType) {
        this.accountAddress = accountAddress;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountNumberType = accountNumberType;
        this.bankIdentifier = bankIdentifier;
        this.bankIdentifierType = bankIdentifierType;
  }
}