// default package
// Generated Jan 15, 2023, 9:06:09 PM by Hibernate Tools 6.0.0.Alpha3

package com.springData.orm.Entites;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;
/**
 * Aircrafttype generated by hbm2java
 */
@Entity
@Table(name="aircrafttype"
    ,catalog="jpaws"
)
public class Aircrafttype  implements java.io.Serializable {


     private String actype;
     private Aircraftmodel aircraftmodel;
     private Date datePublished;
     private Set<Workorder> workorders = new HashSet<Workorder>(0);

    public Aircrafttype() {
    }

	
    public Aircrafttype(String actype, Aircraftmodel aircraftmodel, Date datePublished) {
        this.actype = actype;
        this.aircraftmodel = aircraftmodel;
        this.datePublished = datePublished;
    }
    public Aircrafttype(String actype, Aircraftmodel aircraftmodel, Date datePublished, Set<Workorder> workorders) {
       this.actype = actype;
       this.aircraftmodel = aircraftmodel;
       this.datePublished = datePublished;
       this.workorders = workorders;
    }
   
     @Id 

    
    @Column(name="actype", unique=true, nullable=false, length=50)
    public String getActype() {
        return this.actype;
    }
    
    public void setActype(String actype) {
        this.actype = actype;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="acmodel_id", nullable=false)
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="aircrafttype")
    public Set<Workorder> getWorkorders() {
        return this.workorders;
    }
    
    public void setWorkorders(Set<Workorder> workorders) {
        this.workorders = workorders;
    }




}


