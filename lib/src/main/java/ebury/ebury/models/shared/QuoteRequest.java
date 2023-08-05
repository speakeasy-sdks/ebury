/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * QuoteRequest - Request Payload
 */

public class QuoteRequest {
    /**
     * Amount
     */
    @JsonProperty("amount")
    public Double amount;

    public QuoteRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    
    /**
     * Buy currency
     */
    @JsonProperty("buy_currency")
    public String buyCurrency;

    public QuoteRequest withBuyCurrency(String buyCurrency) {
        this.buyCurrency = buyCurrency;
        return this;
    }
    
    /**
     * Operation (buy or sell)
     */
    @JsonProperty("operation")
    public QuoteRequestOperation operation;

    public QuoteRequest withOperation(QuoteRequestOperation operation) {
        this.operation = operation;
        return this;
    }
    
    /**
     * Sell currency
     */
    @JsonProperty("sell_currency")
    public String sellCurrency;

    public QuoteRequest withSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
        return this;
    }
    
    /**
     * The trade type
     */
    @JsonProperty("trade_type")
    public QuoteRequestTradeType tradeType;

    public QuoteRequest withTradeType(QuoteRequestTradeType tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    
    /**
     * Value date for the trade. If the value date is not valid then the quote will be returned for next available value date. If the value date is not provided, then the quote will be returned for the next available valid value date.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("value_date")
    public LocalDate valueDate;

    public QuoteRequest withValueDate(LocalDate valueDate) {
        this.valueDate = valueDate;
        return this;
    }
    
    public QuoteRequest(@JsonProperty("amount") Double amount, @JsonProperty("buy_currency") String buyCurrency, @JsonProperty("operation") QuoteRequestOperation operation, @JsonProperty("sell_currency") String sellCurrency, @JsonProperty("trade_type") QuoteRequestTradeType tradeType) {
        this.amount = amount;
        this.buyCurrency = buyCurrency;
        this.operation = operation;
        this.sellCurrency = sellCurrency;
        this.tradeType = tradeType;
  }
}