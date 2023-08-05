/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;


public class GetMassPaymentsRequest {
    /**
     * The ID of the client
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public GetMassPaymentsRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The external reference of the multipayment
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=external_reference_id")
    public String externalReferenceId;

    public GetMassPaymentsRequest withExternalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
        return this;
    }
    
    /**
     * The ID of the multipayment
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mass_payment_id")
    public String massPaymentId;

    public GetMassPaymentsRequest withMassPaymentId(String massPaymentId) {
        this.massPaymentId = massPaymentId;
        return this;
    }
    
    /**
     * The desired page number for pagination. By default is 1.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    public Integer page;

    public GetMassPaymentsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }
    
    /**
     * The number of items per page for pagination. By default is 50.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_size")
    public Integer pageSize;

    public GetMassPaymentsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    /**
     * The sell currency of the multipayment
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sell_currency")
    public String sellCurrency;

    public GetMassPaymentsRequest withSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
        return this;
    }
    
    public GetMassPaymentsRequest(@JsonProperty("client_id") String clientId) {
        this.clientId = clientId;
  }
}
