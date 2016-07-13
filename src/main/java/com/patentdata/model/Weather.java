package com.patentdata.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Generated by Hibernate Tools 4.3.1.Final
 * Weather generated by hbm2java
 * @author tonykuo
 *
 */
@Entity
@Table(name="weather"
)
public class Weather  implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private WeatherId id;

    public Weather() {
    }

    public Weather(WeatherId id) {
       this.id = id;
    }
   
    @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="city", column=@Column(name="city", nullable=false, length=80) ), 
        @AttributeOverride(name="tempLo", column=@Column(name="temp_lo", nullable=false) ), 
        @AttributeOverride(name="tempHi", column=@Column(name="temp_hi", nullable=false) ), 
        @AttributeOverride(name="prcp", column=@Column(name="prcp", nullable=false, precision=8, scale=8) ), 
        @AttributeOverride(name="date", column=@Column(name="date", nullable=false, length=13) ) } )
    public WeatherId getId() {
        return this.id;
    }
    
    public void setId(WeatherId id) {
        this.id = id;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	     return ToStringBuilder.reflectionToString(this);
     }

}
