package ITI.JETS.Entities;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@DiscriminatorValue("stu")
public class Student extends Person {
    protected String Department;

    public Student(){}
    public Student(String fname, String lname, String department){
        super(fname,lname);
        this.Department = department;
    }

    public void setDepartment(String d1){
        this.Department = d1;
    }
    public String getDepartment(){
        return this.Department;
    }
}
