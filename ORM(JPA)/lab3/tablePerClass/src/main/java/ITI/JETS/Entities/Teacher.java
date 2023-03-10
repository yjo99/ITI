package ITI.JETS.Entities;// default package
// Generated Jan 10, 2023, 5:59:22 PM by Hibernate Tools 6.0.0.Alpha3

import jakarta.persistence.*;
import java.util.Date;
/**
 * Teacher generated by hbm2java
 */
@Entity
@Table(name="teacher"
    ,catalog="inheritance2"
)
public class Teacher  implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String lastName;
     private Date hireDate;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, Date hireDate) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.hireDate = hireDate;
    }
   
     @Id @GeneratedValue(strategy=GenerationType.TABLE)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
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


