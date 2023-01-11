package ITI.JETS.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 * Teacher generated by hbm2java
 */
@Entity
@Table(name = "teacher", catalog = "inheritance4")
public class Teacher extends Person {

    private Date hireDate;

    public Teacher() {
    }

    public Teacher(Date hireDate) {
        this.hireDate = hireDate;
    }
    public Teacher(String firstName, String lastName, Date hireDate, String personType) {
        super(firstName, lastName, personType);
        this.hireDate = hireDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "hire_date", nullable = false, length = 10)
    public Date getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

}