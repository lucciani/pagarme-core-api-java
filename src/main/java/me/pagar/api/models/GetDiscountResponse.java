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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import me.pagar.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonInclude(Include.ALWAYS)
public class GetDiscountResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4860166110558289665L;
    private String id;
    private double value;
    private String discountType;
    private String status;
    private DateTime createdAt;
    private Integer cycles;
    private DateTime deletedAt;
    private String description;
    private GetSubscriptionResponse subscription;
    private GetSubscriptionItemResponse subscriptionItem;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("value")
    public double getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("value")
    public void setValue (double value) { 
        this.value = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("discount_type")
    public String getDiscountType ( ) { 
        return this.discountType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("discount_type")
    public void setDiscountType (String value) { 
        this.discountType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deleted_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDeletedAt ( ) { 
        return this.deletedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt (DateTime value) { 
        this.deletedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("subscription")
    public GetSubscriptionResponse getSubscription ( ) { 
        return this.subscription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("subscription")
    public void setSubscription (GetSubscriptionResponse value) { 
        this.subscription = value;
    }
 
    /** GETTER
     * The subscription item
     */
    @JsonGetter("subscription_item")
    public GetSubscriptionItemResponse getSubscriptionItem ( ) { 
        return this.subscriptionItem;
    }
    
    /** SETTER
     * The subscription item
     */
    @JsonSetter("subscription_item")
    public void setSubscriptionItem (GetSubscriptionItemResponse value) { 
        this.subscriptionItem = value;
    }
 
}
