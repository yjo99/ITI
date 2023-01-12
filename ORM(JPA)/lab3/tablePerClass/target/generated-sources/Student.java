// default package
// Generated Jan 12, 2023, 9:42:42 AM by Hibernate Tools 6.0.0.Alpha3


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name="student"
    ,catalog="inheritance2"
)
public class Student  implements java.io.Serializable {


     private int id;
     private String firstName;
     private String lastName;
     private String department;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String department) {
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.department = department;
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

    
    @Column(name="department", nullable=false, length=45)
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }




}


