/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BankAccount - The data of the bank account. Refer to the Metadata API for valid field combinations.
 */

public class BankAccount {
    /**
     * The identifier of the bank account.
     */
    @JsonProperty("account_id")
    public Long accountId;

    public BankAccount withAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    
    /**
     * The account number of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_number")
    public String accountNumber;

    public BankAccount withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    
    /**
     * The first address line of the bank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bank_address_line_1")
    public String bankAddressLine1;

    public BankAccount withBankAddressLine1(String bankAddressLine1) {
        this.bankAddressLine1 = bankAddressLine1;
        return this;
    }
    
    /**
     * The ISO 3166-1 alpha-2 code of the bank's country.
     */
    @JsonProperty("bank_country_code")
    public String bankCountryCode;

    public BankAccount withBankCountryCode(String bankCountryCode) {
        this.bankCountryCode = bankCountryCode;
        return this;
    }
    
    /**
     * The ISO 4217 code of the bank account's currency.
     */
    @JsonProperty("bank_currency_code")
    public String bankCurrencyCode;

    public BankAccount withBankCurrencyCode(String bankCurrencyCode) {
        this.bankCurrencyCode = bankCurrencyCode;
        return this;
    }
    
    /**
     * The identifier of the bank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bank_identifier")
    public String bankIdentifier;

    public BankAccount withBankIdentifier(String bankIdentifier) {
        this.bankIdentifier = bankIdentifier;
        return this;
    }
    
    /**
     * Name of the bank account holder.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bank_name")
    public String bankName;

    public BankAccount withBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    
    /**
     * The account for the correspondant account of the bank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("correspondent_account")
    public String correspondentAccount;

    public BankAccount withCorrespondentAccount(String correspondentAccount) {
        this.correspondentAccount = correspondentAccount;
        return this;
    }
    
    /**
     * The SWIFT code for the correspondant account of the bank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("correspondent_swift_code")
    public String correspondentSwiftCode;

    public BankAccount withCorrespondentSwiftCode(String correspondentSwiftCode) {
        this.correspondentSwiftCode = correspondentSwiftCode;
        return this;
    }
    
    /**
     * The IBAN of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("iban")
    public String iban;

    public BankAccount withIban(String iban) {
        this.iban = iban;
        return this;
    }
    
    /**
     * The INN of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inn")
    public String inn;

    public BankAccount withInn(String inn) {
        this.inn = inn;
        return this;
    }
    
    /**
     * The KBK of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("kbk")
    public String kbk;

    public BankAccount withKbk(String kbk) {
        this.kbk = kbk;
        return this;
    }
    
    /**
     * The KIO of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("kio")
    public String kio;

    public BankAccount withKio(String kio) {
        this.kio = kio;
        return this;
    }
    
    /**
     * The KPP of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("kpp")
    public String kpp;

    public BankAccount withKpp(String kpp) {
        this.kpp = kpp;
        return this;
    }
    
    /**
     * Text explaining the purpose of payment. Required by the Central Bank for all payments sent to China (CHN) in the Chinese Renminbi (CNY) currency or United Arab Emirates in any currency (GDE to RDA) [Coming soon].
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purpose_of_payment")
    public BankAccountPurposeOfPayment purposeOfPayment;

    public BankAccount withPurposeOfPayment(BankAccountPurposeOfPayment purposeOfPayment) {
        this.purposeOfPayment = purposeOfPayment;
        return this;
    }
    
    /**
     * The reason for trade of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reason_for_trade")
    public String reasonForTrade;

    public BankAccount withReasonForTrade(String reasonForTrade) {
        this.reasonForTrade = reasonForTrade;
        return this;
    }
    
    /**
     * The reference information of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference_information")
    public String referenceInformation;

    public BankAccount withReferenceInformation(String referenceInformation) {
        this.referenceInformation = referenceInformation;
        return this;
    }
    
    /**
     * The Russian central account number of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("russian_central_bank_account")
    public String russianCentralBankAccount;

    public BankAccount withRussianCentralBankAccount(String russianCentralBankAccount) {
        this.russianCentralBankAccount = russianCentralBankAccount;
        return this;
    }
    
    /**
     * The SWIFT code of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("swift_code")
    public String swiftCode;

    public BankAccount withSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
        return this;
    }
    
    /**
     * The VO of the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vo")
    public String vo;

    public BankAccount withVo(String vo) {
        this.vo = vo;
        return this;
    }
    
    public BankAccount(@JsonProperty("account_id") Long accountId, @JsonProperty("bank_country_code") String bankCountryCode, @JsonProperty("bank_currency_code") String bankCurrencyCode) {
        this.accountId = accountId;
        this.bankCountryCode = bankCountryCode;
        this.bankCurrencyCode = bankCurrencyCode;
  }
}
