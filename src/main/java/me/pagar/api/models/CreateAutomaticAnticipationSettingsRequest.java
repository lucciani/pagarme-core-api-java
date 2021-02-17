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
public class CreateAutomaticAnticipationSettingsRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6112277174249643726L;
    private boolean enabled;
    private String type;
    private int volumePercentage;
    private int delay;
    private List<Integer> days;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("enabled")
    public boolean getEnabled ( ) { 
        return this.enabled;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("enabled")
    public void setEnabled (boolean value) { 
        this.enabled = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("volume_percentage")
    public int getVolumePercentage ( ) { 
        return this.volumePercentage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("volume_percentage")
    public void setVolumePercentage (int value) { 
        this.volumePercentage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("delay")
    public int getDelay ( ) { 
        return this.delay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("delay")
    public void setDelay (int value) { 
        this.delay = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("days")
    public List<Integer> getDays ( ) { 
        return this.days;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("days")
    public void setDays (List<Integer> value) { 
        this.days = value;
    }
 
}
