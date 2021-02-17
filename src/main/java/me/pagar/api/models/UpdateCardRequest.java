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
public class UpdateCardRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5047304574631942482L;
    private String holderName;
    private int expMonth;
    private int expYear;
    private String billingAddressId;
    private CreateAddressRequest billingAddress;
    private LinkedHashMap<String, String> metadata;
    private String label;
    /** GETTER
     * Holder name
     */
    @JsonGetter("holder_name")
    public String getHolderName ( ) { 
        return this.holderName;
    }
    
    /** SETTER
     * Holder name
     */
    @JsonSetter("holder_name")
    public void setHolderName (String value) { 
        this.holderName = value;
    }
 
    /** GETTER
     * Expiration month
     */
    @JsonGetter("exp_month")
    public int getExpMonth ( ) { 
        return this.expMonth;
    }
    
    /** SETTER
     * Expiration month
     */
    @JsonSetter("exp_month")
    public void setExpMonth (int value) { 
        this.expMonth = value;
    }
 
    /** GETTER
     * Expiration year
     */
    @JsonGetter("exp_year")
    public int getExpYear ( ) { 
        return this.expYear;
    }
    
    /** SETTER
     * Expiration year
     */
    @JsonSetter("exp_year")
    public void setExpYear (int value) { 
        this.expYear = value;
    }
 
    /** GETTER
     * Id of the address to be used as billing address
     */
    @JsonGetter("billing_address_id")
    public String getBillingAddressId ( ) { 
        return this.billingAddressId;
    }
    
    /** SETTER
     * Id of the address to be used as billing address
     */
    @JsonSetter("billing_address_id")
    public void setBillingAddressId (String value) { 
        this.billingAddressId = value;
    }
 
    /** GETTER
     * Billing address
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * Billing address
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (CreateAddressRequest value) { 
        this.billingAddress = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("label")
    public String getLabel ( ) { 
        return this.label;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("label")
    public void setLabel (String value) { 
        this.label = value;
    }
 
}
