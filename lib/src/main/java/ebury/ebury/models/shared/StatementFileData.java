/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatementFileData - Statement processing started
 */

public class StatementFileData {
    /**
     * The url needed to retrieve the statement. It contains two UUID values, the first one (from the left) is the account id and the second one is the statement id.
     */
    @JsonProperty("url")
    public String url;

    public StatementFileData withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public StatementFileData(@JsonProperty("url") String url) {
        this.url = url;
  }
}