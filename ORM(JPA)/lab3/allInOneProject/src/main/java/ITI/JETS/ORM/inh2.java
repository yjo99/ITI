package ITI.JETS.ORM;

import jakarta.persistence.*;
import ITI.JETS.Entities2.*;

public class inh2 {


    public static void impinh2(){

        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("2");
        EntityManager em2 = emf2.createEntityManager();


        em2.getTransaction().begin();

//        java.sql.Date.valueOf(java.time.LocalDate.now())

        Teacher2 t1 = new Teacher2("Mohsen", "Diab",java.sql.Date.valueOf(java.time.LocalDate.now()));
        Teacher2 t2 = new Teacher2("Amira", "Elmergawy",java.sql.Date.valueOf(java.time.LocalDate.now()));
        Teacher2 t3 = new Teacher2("Mohamed", "Elsherbini",java.sql.Date.valueOf(java.time.LocalDate.now()));


        Student2 s1 = new Student2("Yousef", "Sayed","JETS");
        Student2 s2 = new Student2("Yousef2", "Sayed2","JETS");

        em2.persist(t1);

        em2.persist(t2);
        em2.persist(t3);

        em2.persist(s1);
        em2.persist(s2);


        em2.getTransaction().commit();



        emf2.close();
        em2.close();
        }
    
}
