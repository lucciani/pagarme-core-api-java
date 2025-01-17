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
public class GetSubscriptionResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 6665266992638812086L;
    private String id;
    private String code;
    private DateTime startAt;
    private String interval;
    private int intervalCount;
    private String billingType;
    private GetPeriodResponse currentCycle;
    private String paymentMethod;
    private String currency;
    private int installments;
    private String status;
    private DateTime createdAt;
    private DateTime updatedAt;
    private GetCustomerResponse customer;
    private GetCardResponse card;
    private List<GetSubscriptionItemResponse> items;
    private String statementDescriptor;
    private LinkedHashMap<String, String> metadata;
    private GetSetupResponse setup;
    private String gatewayAffiliationId;
    private DateTime nextBillingAt;
    private Integer billingDay;
    private Integer minimumPrice;
    private DateTime canceledAt;
    private List<GetDiscountResponse> discounts;
    private List<GetIncrementResponse> increments;
    private Integer boletoDueDays;
    private GetSubscriptionSplitResponse split;
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
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("start_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getStartAt ( ) { 
        return this.startAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("start_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartAt (DateTime value) { 
        this.startAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("interval")
    public String getInterval ( ) { 
        return this.interval;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("interval")
    public void setInterval (String value) { 
        this.interval = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("interval_count")
    public int getIntervalCount ( ) { 
        return this.intervalCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("interval_count")
    public void setIntervalCount (int value) { 
        this.intervalCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billing_type")
    public String getBillingType ( ) { 
        return this.billingType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_type")
    public void setBillingType (String value) { 
        this.billingType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("current_cycle")
    public GetPeriodResponse getCurrentCycle ( ) { 
        return this.currentCycle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("current_cycle")
    public void setCurrentCycle (GetPeriodResponse value) { 
        this.currentCycle = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod ( ) { 
        return this.paymentMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod (String value) { 
        this.paymentMethod = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("installments")
    public int getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("installments")
    public void setInstallments (int value) { 
        this.installments = value;
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
    @JsonGetter("updated_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt (DateTime value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customer")
    public GetCustomerResponse getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customer")
    public void setCustomer (GetCustomerResponse value) { 
        this.customer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("card")
    public GetCardResponse getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("card")
    public void setCard (GetCardResponse value) { 
        this.card = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("items")
    public List<GetSubscriptionItemResponse> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("items")
    public void setItems (List<GetSubscriptionItemResponse> value) { 
        this.items = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("setup")
    public GetSetupResponse getSetup ( ) { 
        return this.setup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("setup")
    public void setSetup (GetSetupResponse value) { 
        this.setup = value;
    }
 
    /** GETTER
     * Affiliation Code
     */
    @JsonGetter("gateway_affiliation_id")
    public String getGatewayAffiliationId ( ) { 
        return this.gatewayAffiliationId;
    }
    
    /** SETTER
     * Affiliation Code
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId (String value) { 
        this.gatewayAffiliationId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("next_billing_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getNextBillingAt ( ) { 
        return this.nextBillingAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("next_billing_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextBillingAt (DateTime value) { 
        this.nextBillingAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billing_day")
    public Integer getBillingDay ( ) { 
        return this.billingDay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_day")
    public void setBillingDay (Integer value) { 
        this.billingDay = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("canceled_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCanceledAt ( ) { 
        return this.canceledAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("canceled_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCanceledAt (DateTime value) { 
        this.canceledAt = value;
    }
 
    /** GETTER
     * Subscription discounts
     */
    @JsonGetter("discounts")
    public List<GetDiscountResponse> getDiscounts ( ) { 
        return this.discounts;
    }
    
    /** SETTER
     * Subscription discounts
     */
    @JsonSetter("discounts")
    public void setDiscounts (List<GetDiscountResponse> value) { 
        this.discounts = value;
    }
 
    /** GETTER
     * Subscription increments
     */
    @JsonGetter("increments")
    public List<GetIncrementResponse> getIncrements ( ) { 
        return this.increments;
    }
    
    /** SETTER
     * Subscription increments
     */
    @JsonSetter("increments")
    public void setIncrements (List<GetIncrementResponse> value) { 
        this.increments = value;
    }
 
    /** GETTER
     * Days until boleto expires
     */
    @JsonGetter("boleto_due_days")
    public Integer getBoletoDueDays ( ) { 
        return this.boletoDueDays;
    }
    
    /** SETTER
     * Days until boleto expires
     */
    @JsonSetter("boleto_due_days")
    public void setBoletoDueDays (Integer value) { 
        this.boletoDueDays = value;
    }
 
    /** GETTER
     * Subscription's split responde
     */
    @JsonGetter("split")
    public GetSubscriptionSplitResponse getSplit ( ) { 
        return this.split;
    }
    
    /** SETTER
     * Subscription's split responde
     */
    @JsonSetter("split")
    public void setSplit (GetSubscriptionSplitResponse value) { 
        this.split = value;
    }
 
}
