// default package
// Generated Jan 12, 2023, 9:42:42 AM by Hibernate Tools 6.0.0.Alpha3


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Teacher generated by hbm2java
 */
@Entity
@Table(name="teacher"
    ,catalog="inheritance2"
)
public class Teacher  implements java.io.Serializable {


     private int id;
     private String firstName;
     private String lastName;
     private Date hireDate;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, Date hireDate) {
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.hireDate = hireDate;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="first_name", nullable=false, length=50)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=50)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="hire_date", nullable=false, length=10)
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }




}


