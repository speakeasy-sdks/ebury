/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksRequest - The GraphQL query to execute
 */

public class WebhooksRequest {
    /**
     * The GraphQL query
     */
    @JsonProperty("query")
    public String query;

    public WebhooksRequest withQuery(String query) {
        this.query = query;
        return this;
    }
    
    /**
     * The GraphQL variables
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("variables")
    public String variables;

    public WebhooksRequest withVariables(String variables) {
        this.variables = variables;
        return this;
    }
    
    public WebhooksRequest(@JsonProperty("query") String query) {
        this.query = query;
  }
}
