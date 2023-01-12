package ITI.JETS.Entities3;


import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="teacher"
    ,catalog="inheritance3"
)

@DiscriminatorValue("tech")
public class Teacher3 extends Person3 {


//    protected Date hire_date;
    @Temporal(TemporalType.DATE)
    @Column(name="hire_date", length=10)
    private Date test;



    public Teacher3() {

    }
    public Teacher3(String fname, String lname, Date hire_date){
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
