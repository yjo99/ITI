package ITI.JETS.Entities3;

import jakarta.persistence.*;


@Entity

@Table(name="student"
    ,catalog="inheritance3"
)
@DiscriminatorValue("stu")
public class Student3 extends Person3 {
    protected String Department;

    public Student3(){}
    public Student3(String fname, String lname, String department){
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
