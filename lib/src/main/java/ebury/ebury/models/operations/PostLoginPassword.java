/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PostLoginPassword - Your password
 */
public enum PostLoginPassword {
    CODE("code");

    @JsonValue
    public final String value;

    private PostLoginPassword(String value) {
        this.value = value;
    }
}
