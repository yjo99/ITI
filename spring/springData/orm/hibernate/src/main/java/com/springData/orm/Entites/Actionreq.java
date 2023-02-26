// default package
// Generated Jan 15, 2023, 9:06:09 PM by Hibernate Tools 6.0.0.Alpha3
package com.springData.orm.Entites;

import java.util.HashSet;
import java.util.Set;
//import jakarta.persistence.*;
import javax.persistence.*;
/**
 * Actionreq generated by hbm2java
 */
@Entity
@Table(name="actionreq"
    ,catalog="jpaws"
)
public class Actionreq  implements java.io.Serializable {


     private Integer id;
     private String actionName;
     private Integer idOrd;
     private Set<Workorderplace> workorderplaces = new HashSet<Workorderplace>(0);

    public Actionreq() {
    }

	
    public Actionreq(String actionName) {
        this.actionName = actionName;
    }
    public Actionreq(String actionName, Integer idOrd, Set<Workorderplace> workorderplaces) {
       this.actionName = actionName;
       this.idOrd = idOrd;
       this.workorderplaces = workorderplaces;
    }
   
     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="action_name", nullable=false, length=50)
    public String getActionName() {
        return this.actionName;
    }
    
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    
    @Column(name="id_ord")
    public Integer getIdOrd() {
        return this.idOrd;
    }
    
    public void setIdOrd(Integer idOrd) {
        this.idOrd = idOrd;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="actionreq")
    public Set<Workorderplace> getWorkorderplaces() {
        return this.workorderplaces;
    }
    
    public void setWorkorderplaces(Set<Workorderplace> workorderplaces) {
        this.workorderplaces = workorderplaces;
    }




}


