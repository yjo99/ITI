// default package
// Generated Jan 15, 2023, 9:06:09 PM by Hibernate Tools 6.0.0.Alpha3
package com.Entities;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;
/**
 * PartsWorkshop generated by hbm2java
 */
@Entity
@Table(name="parts_workshop"
    ,catalog="jpaws"
)
public class PartsWorkshop  implements java.io.Serializable {


     private String code;
     private Date datePublished;
     private String name;
     private Integer id;
     private Set<Workorderplace> workorderplaces = new HashSet<Workorderplace>(0);

    public PartsWorkshop() {
    }

	
    public PartsWorkshop(String code, Date datePublished, String name) {
        this.code = code;
        this.datePublished = datePublished;
        this.name = name;
    }
    public PartsWorkshop(String code, Date datePublished, String name, Integer id, Set<Workorderplace> workorderplaces) {
       this.code = code;
       this.datePublished = datePublished;
       this.name = name;
       this.id = id;
       this.workorderplaces = workorderplaces;
    }
   
     @Id 

    
    @Column(name="code", unique=true, nullable=false, length=10)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_published", nullable=false, length=26)
    public Date getDatePublished() {
        return this.datePublished;
    }
    
    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    
    @Column(name="name", nullable=false, length=255)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="partsWorkshop")
    public Set<Workorderplace> getWorkorderplaces() {
        return this.workorderplaces;
    }
    
    public void setWorkorderplaces(Set<Workorderplace> workorderplaces) {
        this.workorderplaces = workorderplaces;
    }




}


