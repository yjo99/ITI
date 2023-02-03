// default package
// Generated Jan 15, 2023, 9:06:09 PM by Hibernate Tools 6.0.0.Alpha3
package com.rest.Entity;

import java.util.Date;
import jakarta.persistence.*;
/**
 * Capabilitylist generated by hbm2java
 */
@Entity
@Table(name="capabilitylist"
    ,catalog="jpaws"
)
public class Capabilitylist  implements java.io.Serializable {


     private String pn;
     private Aircraftmodel aircraftmodel;
     private Date datePublished;
     private String nsn;
     private String name;

    public Capabilitylist() {
    }

	
    public Capabilitylist(String pn, Date datePublished, String name) {
        this.pn = pn;
        this.datePublished = datePublished;
        this.name = name;
    }
    public Capabilitylist(String pn, Aircraftmodel aircraftmodel, Date datePublished, String nsn, String name) {
       this.pn = pn;
       this.aircraftmodel = aircraftmodel;
       this.datePublished = datePublished;
       this.nsn = nsn;
       this.name = name;
    }
   
     @Id 

    
    @Column(name="pn", unique=true, nullable=false, length=25)
    public String getPn() {
        return this.pn;
    }
    
    public void setPn(String pn) {
        this.pn = pn;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ac_model_id")
    public Aircraftmodel getAircraftmodel() {
        return this.aircraftmodel;
    }
    
    public void setAircraftmodel(Aircraftmodel aircraftmodel) {
        this.aircraftmodel = aircraftmodel;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_published", nullable=false, length=26)
    public Date getDatePublished() {
        return this.datePublished;
    }
    
    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    
    @Column(name="nsn", length=25)
    public String getNsn() {
        return this.nsn;
    }
    
    public void setNsn(String nsn) {
        this.nsn = nsn;
    }

    
    @Column(name="name", nullable=false, length=255)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}

