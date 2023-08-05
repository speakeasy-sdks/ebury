/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import ebury.ebury.utils.SpeakeasyMetadata;
import java.time.LocalDate;


public class GetPaymentsRequest {
    /**
     * The ID of the contact
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Contact-ID")
    public String xContactID;

    public GetPaymentsRequest withXContactID(String xContactID) {
        this.xContactID = xContactID;
        return this;
    }
    
    /**
     * The ID of the client
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public GetPaymentsRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Filter payments by from_created_date.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from_created_date")
    public LocalDate fromCreatedDate;

    public GetPaymentsRequest withFromCreatedDate(LocalDate fromCreatedDate) {
        this.fromCreatedDate = fromCreatedDate;
        return this;
    }
    
    /**
     * Filter payments by from_payment_date.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from_payment_date")
    public LocalDate fromPaymentDate;

    public GetPaymentsRequest withFromPaymentDate(LocalDate fromPaymentDate) {
        this.fromPaymentDate = fromPaymentDate;
        return this;
    }
    
    /**
     * Filter by related mass payment's external reference.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mass_payment_external_reference_id")
    public String massPaymentExternalReferenceId;

    public GetPaymentsRequest withMassPaymentExternalReferenceId(String massPaymentExternalReferenceId) {
        this.massPaymentExternalReferenceId = massPaymentExternalReferenceId;
        return this;
    }
    
    /**
     * Filter by related mass payment's uuid.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mass_payment_id")
    public String massPaymentId;

    public GetPaymentsRequest withMassPaymentId(String massPaymentId) {
        this.massPaymentId = massPaymentId;
        return this;
    }
    
    /**
     * The desired page number for pagination. By default is 1.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    public Integer page;

    public GetPaymentsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }
    
    /**
     * The number of items per page for pagination. By default is 50.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_size")
    public Integer pageSize;

    public GetPaymentsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    /**
     * Filter by payment currency
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=payment_currency")
    public String paymentCurrency;

    public GetPaymentsRequest withPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
        return this;
    }
    
    /**
     * Filter payments by reference.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reference")
    public String reference;

    public GetPaymentsRequest withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    /**
     * Filter payments by to_created_date.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=to_created_date")
    public LocalDate toCreatedDate;

    public GetPaymentsRequest withToCreatedDate(LocalDate toCreatedDate) {
        this.toCreatedDate = toCreatedDate;
        return this;
    }
    
    /**
     * Filter payments by to_payment_date.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=to_payment_date")
    public LocalDate toPaymentDate;

    public GetPaymentsRequest withToPaymentDate(LocalDate toPaymentDate) {
        this.toPaymentDate = toPaymentDate;
        return this;
    }
    
    /**
     * Filter payments by trade_id.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=trade_id")
    public String tradeId;

    public GetPaymentsRequest withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    
    public GetPaymentsRequest(@JsonProperty("client_id") String clientId) {
        this.clientId = clientId;
  }
}
