package ITI.JETS.Entities3;// default package
// Generated Jan 10, 2023, 6:27:40 PM by Hibernate Tools 6.0.0.Alpha3


import java.util.Date;
import jakarta.persistence.*;
/**
 * Person generated by hbm2java
 */
@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="person_type")
public class Person3  implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String lastName;
//     private String personType;
//     private String department;
//     private Date hireDate;

    public Person3() {
    }

	
    public Person3(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.personType = personType;
    }
    public Person3(String firstName, String lastName,  String department, Date hireDate) {
       this.firstName = firstName;
       this.lastName = lastName;
//       this.personType = personType;
//       this.department = department;
//       this.hireDate = hireDate;
    }
   
     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)

    
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


//    @Column(name="person_type", nullable=false,insertable=false, updatable=false, length=45)
//    public String getPersonType() {
//        return this.personType;
//    }

//    public void setPersonType(String personType) {
//        this.personType = personType;
//    }

    
//    @Column(name="department", length=45)
//    public String getDepartment() {
//        return this.department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    @Temporal(TemporalType.DATE)
//    @Column(name="hire_date", length=10)
//    public Date getHireDate() {
//        return this.hireDate;
//    }
//
//    public void setHireDate(Date hireDate) {
//        this.hireDate = hireDate;
//    }




}


