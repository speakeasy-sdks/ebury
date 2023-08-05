/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PostQuotesQuoteType - The quote type. A quote_type of quote returns a quote ID which a trade can be booked against
 */
public enum PostQuotesQuoteType {
    ESTIMATE("estimate"),
    QUOTE("quote");

    @JsonValue
    public final String value;

    private PostQuotesQuoteType(String value) {
        this.value = value;
    }
}
