package ITI.JETS.ORM;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="actor")
public class entActor {
    @Id
    @Column(name="actor_id")
    private int id;

    @Column(name="first_name")
    private String fName;
    @Column(name="last_name")
    private String lName;
    @Column(name="last_update")
    private Date lUpdate;

    public entActor(){

    }
    public entActor(int id, String fName,String lName, Date lUpdate){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.lUpdate = lUpdate;
    }
    public int getId(){
        return this.id;
    }
    public String getfName(){
        return this.fName;
    }
    public String getlName(){
        return this.lName;
    }

}
