/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BeneficiaryMetadataItem {
    /**
     * The country, expressed as an ISO 3166-1 alpha-2 value.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    public String country;

    public BeneficiaryMetadataItem withCountry(String country) {
        this.country = country;
        return this;
    }
    
    /**
     * The requirements for a given currency for this country.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currencies")
    public BeneficiaryMetadataItemCurrencies[] currencies;

    public BeneficiaryMetadataItem withCurrencies(BeneficiaryMetadataItemCurrencies[] currencies) {
        this.currencies = currencies;
        return this;
    }
    
    /**
     * Whether or not a reason for trade for the country needs to be supplied.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reason_required")
    public Boolean reasonRequired;

    public BeneficiaryMetadataItem withReasonRequired(Boolean reasonRequired) {
        this.reasonRequired = reasonRequired;
        return this;
    }
    
    public BeneficiaryMetadataItem(){}
}