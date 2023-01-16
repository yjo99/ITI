// default package
// Generated Jan 15, 2023, 9:06:09 PM by Hibernate Tools 6.0.0.Alpha3
package ITI.Entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;
/**
 * Owner generated by hbm2java
 */
@Entity
@Table(name="owner"
    ,catalog="jpaws"
)
public class Owner  implements java.io.Serializable {


     private Integer id;
     private Date datePublished;
     private String name;
     private Set<Workorder> workorders = new HashSet<Workorder>(0);

    public Owner() {
    }

	
    public Owner(Date datePublished, String name) {
        this.datePublished = datePublished;
        this.name = name;
    }
    public Owner(Date datePublished, String name, Set<Workorder> workorders) {
       this.datePublished = datePublished;
       this.name = name;
       this.workorders = workorders;
    }
   
     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="owner")
    public Set<Workorder> getWorkorders() {
        return this.workorders;
    }
    
    public void setWorkorders(Set<Workorder> workorders) {
        this.workorders = workorders;
    }




}


