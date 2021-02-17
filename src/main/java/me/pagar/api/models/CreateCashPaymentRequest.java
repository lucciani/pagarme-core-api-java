/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class CreateCashPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 518783234878015106L;
    private String description;
    private boolean confirm;
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Indicates whether cash collection will be confirmed in the act of creation
     */
    @JsonGetter("confirm")
    public boolean getConfirm ( ) { 
        return this.confirm;
    }
    
    /** SETTER
     * Indicates whether cash collection will be confirmed in the act of creation
     */
    @JsonSetter("confirm")
    public void setConfirm (boolean value) { 
        this.confirm = value;
    }
 
}
