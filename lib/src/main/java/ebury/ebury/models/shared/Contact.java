/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact - The data of a contact which can be updated.
 */

public class Contact {
    /**
     * The first address line of a contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address_line_1")
    public String addressLine1;

    public Contact withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }
    
    /**
     * The second address line of a contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address_line_2")
    public String addressLine2;

    public Contact withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }
    
    /**
     * True if contact can authorise payments, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_authorise_payments")
    public Boolean canAuthorisePayments;

    public Contact withCanAuthorisePayments(Boolean canAuthorisePayments) {
        this.canAuthorisePayments = canAuthorisePayments;
        return this;
    }
    
    /**
     * True if contact can create trades and assign same currency payments, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_make_same_currency_payments")
    public Boolean canMakeSameCurrencyPayments;

    public Contact withCanMakeSameCurrencyPayments(Boolean canMakeSameCurrencyPayments) {
        this.canMakeSameCurrencyPayments = canMakeSameCurrencyPayments;
        return this;
    }
    
    /**
     * True if contact can manage beneficiaries, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_manage_beneficiaries")
    public Boolean canManageBeneficiaries;

    public Contact withCanManageBeneficiaries(Boolean canManageBeneficiaries) {
        this.canManageBeneficiaries = canManageBeneficiaries;
        return this;
    }
    
    /**
     * True if can manage beneficiaries groups, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_manage_beneficiaries_groups")
    public Boolean canManageBeneficiariesGroups;

    public Contact withCanManageBeneficiariesGroups(Boolean canManageBeneficiariesGroups) {
        this.canManageBeneficiariesGroups = canManageBeneficiariesGroups;
        return this;
    }
    
    /**
     * True if contact can manage contacts, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_manage_contacts")
    public Boolean canManageContacts;

    public Contact withCanManageContacts(Boolean canManageContacts) {
        this.canManageContacts = canManageContacts;
        return this;
    }
    
    /**
     * True if contact can manage fixed forwards, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_manage_fix_forwards")
    public Boolean canManageFixForwards;

    public Contact withCanManageFixForwards(Boolean canManageFixForwards) {
        this.canManageFixForwards = canManageFixForwards;
        return this;
    }
    
    /**
     * True if contact can manage multipayments, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_manage_multipayments")
    public Boolean canManageMultipayments;

    public Contact withCanManageMultipayments(Boolean canManageMultipayments) {
        this.canManageMultipayments = canManageMultipayments;
        return this;
    }
    
    /**
     * True if contact can manage payments, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_manage_payments")
    public Boolean canManagePayments;

    public Contact withCanManagePayments(Boolean canManagePayments) {
        this.canManagePayments = canManagePayments;
        return this;
    }
    
    /**
     * True if contact can manage permissions, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_manage_permissions")
    public Boolean canManagePermissions;

    public Contact withCanManagePermissions(Boolean canManagePermissions) {
        this.canManagePermissions = canManagePermissions;
        return this;
    }
    
    /**
     * True if contact can execute trades, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_trade")
    public Boolean canTrade;

    public Contact withCanTrade(Boolean canTrade) {
        this.canTrade = canTrade;
        return this;
    }
    
    /**
     * The city name of a contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    public String city;

    public Contact withCity(String city) {
        this.city = city;
        return this;
    }
    
    /**
     * The identifier of the contact.
     */
    @JsonProperty("contact_id")
    public String contactId;

    public Contact withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    
    /**
     * The ISO 3166-1 alpha-2 code of the contact's country.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country_code")
    public String countryCode;

    public Contact withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    
    /**
     * The name of the contact's country.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country_name")
    public String countryName;

    public Contact withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    
    /**
     * The email address of a contact.
     */
    @JsonProperty("email_address")
    public String emailAddress;

    public Contact withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    
    /**
     * The first name of the contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    public String firstName;

    public Contact withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    /**
     * True if contact has access to Ebury Online, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_online_access")
    public Boolean hasOnlineAccess;

    public Contact withHasOnlineAccess(Boolean hasOnlineAccess) {
        this.hasOnlineAccess = hasOnlineAccess;
        return this;
    }
    
    /**
     * The home contact number of a contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("home_contact_number")
    public String homeContactNumber;

    public Contact withHomeContactNumber(String homeContactNumber) {
        this.homeContactNumber = homeContactNumber;
        return this;
    }
    
    /**
     * The ISO 639-1:2002 code of the contact's language.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    public String language;

    public Contact withLanguage(String language) {
        this.language = language;
        return this;
    }
    
    /**
     * The last name of the contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    public String lastName;

    public Contact withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    /**
     * The ISO 639-1:2002 code of the contact's locale.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("locale")
    public String locale;

    public Contact withLocale(String locale) {
        this.locale = locale;
        return this;
    }
    
    /**
     * The mobile contact number of a contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mobile_contact_number")
    public String mobileContactNumber;

    public Contact withMobileContactNumber(String mobileContactNumber) {
        this.mobileContactNumber = mobileContactNumber;
        return this;
    }
    
    /**
     * The full name of a contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public Contact withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * True if contact needs to reset his password, False otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password_reset_required")
    public Boolean passwordResetRequired;

    public Contact withPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }
    
    /**
     * The post code of the contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("post_code")
    public String postCode;

    public Contact withPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    
    /**
     * The time zone of the contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_zone")
    public String timeZone;

    public Contact withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    
    /**
     * The work contact number of a contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("work_contact_number")
    public String workContactNumber;

    public Contact withWorkContactNumber(String workContactNumber) {
        this.workContactNumber = workContactNumber;
        return this;
    }
    
    public Contact(@JsonProperty("contact_id") String contactId, @JsonProperty("email_address") String emailAddress) {
        this.contactId = contactId;
        this.emailAddress = emailAddress;
  }
}
