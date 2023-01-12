package ITI.JETS.ORM;

import jakarta.persistence.*;
import ITI.JETS.Entities3.*;

public class inh3 {


    public static void impinh3(){


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("3");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

//        java.sql.Date.valueOf(java.time.LocalDate.now())

        Teacher3 t1 = new Teacher3("Mohsen", "Diab",new java.util.Date());
//        t1.setHire_date(new Date());
        Teacher3 t2 = new Teacher3("Amira", "Elmergawy",new java.util.Date());
//        t2.setHire_date(new Date());
        Teacher3 t3 = new Teacher3("Mohamed", "Elsherbini",new java.util.Date());
//        t3.setHire_date(new Date());


        Student3 s1 = new Student3("Yousef", "Sayed","JETS");

        em.persist(t1);

        em.persist(t2);
        em.persist(t3);

        em.persist(s1);


        em.getTransaction().commit();



        emf.close();
        em.close();

    }
    
}
