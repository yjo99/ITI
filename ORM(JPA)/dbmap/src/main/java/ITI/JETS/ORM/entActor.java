package ITI.JETS.ORM;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="account")
public class entActor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_name")
    private String user_name;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private String phone;

    @Column(name="birthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;

    @Column(name="full_name")
    private String full_name;

    @Column(name="password")
    private String password;

    public entActor(){

    }
    public entActor( int id ,String user_name,String address, String phone, Date birthday, String full_name, String password){
//        this.id = id;
        this.user_name = user_name;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
        this.full_name = full_name;
        this.password = password;
    }

    public String getUser_name(){
        return this.user_name;
    }
    public void setUser_name(String user_name){
        this.user_name = user_name;
    }

}
