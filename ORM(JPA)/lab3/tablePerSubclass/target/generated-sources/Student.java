// default package
// Generated Jan 11, 2023, 1:32:50 PM by Hibernate Tools 6.0.0.Alpha3


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name="student"
    ,catalog="inheritance4"
)
public class Student  implements java.io.Serializable {


     private int id;
     private Person person;
     private String department;

    public Student() {
    }

    public Student(Person person, String department) {
       this.person = person;
       this.department = department;
    }
   
     @GenericGenerator(name="StudentIdGenerator", strategy="foreign", parameters=@Parameter(name="property", value="person"))@Id @GeneratedValue(generator="StudentIdGenerator")

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    
    @Column(name="department", nullable=false, length=45)
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }




}

