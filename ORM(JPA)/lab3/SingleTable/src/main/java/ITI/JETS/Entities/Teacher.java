package ITI.JETS.Entities;


import jakarta.persistence.*;
import java.util.*;

@Entity

@DiscriminatorValue("tech")
public class Teacher extends Person {


//    protected Date hire_date;
    @Temporal(TemporalType.DATE)
    @Column(name="hire_date", length=10)
    private Date test;



    public Teacher() {

    }
    public Teacher(String fname, String lname, Date hire_date){
        super(fname, lname);
        test = hire_date;

    }



    public void setHire_date(Date d1){
        this.test = d1;
    }
    public Date getHire_date(){
        return this.test;
    }
}
