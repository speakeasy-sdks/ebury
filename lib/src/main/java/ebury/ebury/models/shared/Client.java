/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Client {
    /**
     * The first address line of a client.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address_line_1")
    public String addressLine1;

    public Client withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }
    
    /**
     * The second address line of a client.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address_line_2")
    public String addressLine2;

    public Client withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }
    
    /**
     * Brand name of the client.
     */
    @JsonProperty("brand_name")
    public String brandName;

    public Client withBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    
    /**
     * The city name of a client.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    public String city;

    public Client withCity(String city) {
        this.city = city;
        return this;
    }
    
    /**
     * Identifier of the client.
     */
    @JsonProperty("client_id")
    public String clientId;

    public Client withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Name of the client.
     */
    @JsonProperty("client_name")
    public String clientName;

    public Client withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    
    /**
     * The post code of the client.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("post_code")
    public String postCode;

    public Client withPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    
    /**
     * The state or province of the client.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state_province")
    public String stateProvince;

    public Client withStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
        return this;
    }
    
    /**
     * Status of the client.
     */
    @JsonProperty("status")
    public ClientStatus status;

    public Client withStatus(ClientStatus status) {
        this.status = status;
        return this;
    }
    
    public Client(@JsonProperty("brand_name") String brandName, @JsonProperty("client_id") String clientId, @JsonProperty("client_name") String clientName, @JsonProperty("status") ClientStatus status) {
        this.brandName = brandName;
        this.clientId = clientId;
        this.clientName = clientName;
        this.status = status;
  }
}