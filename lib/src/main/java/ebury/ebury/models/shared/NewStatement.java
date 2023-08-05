/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NewStatement - Request Payload
 */

public class NewStatement {
    /**
     * Only return transactions with value date after this date. Time ignored, considered always to be the start of the day. YYYY-MM-DDThh:mm format
     */
    @JsonProperty("from_value_datetime")
    public String fromValueDatetime;

    public NewStatement withFromValueDatetime(String fromValueDatetime) {
        this.fromValueDatetime = fromValueDatetime;
        return this;
    }
    
    /**
     * Only return transactions with value date before this date. Time ignored, considered always to be the end of the day. YYYY-MM-DDThh:mm format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to_value_datetime")
    public String toValueDatetime;

    public NewStatement withToValueDatetime(String toValueDatetime) {
        this.toValueDatetime = toValueDatetime;
        return this;
    }
    
    public NewStatement(@JsonProperty("from_value_datetime") String fromValueDatetime) {
        this.fromValueDatetime = fromValueDatetime;
  }
}
