package ITI.JETS.ORM;

import jakarta.persistence.*;
import ITI.JETS.Entities1.*;

public class inh1 {


    public static void impinh1(){


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ms");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

       



        Teacher1 t1 = new Teacher1();
        t1.setFirstName("Mohsen");
        t1.setLastName("Diab");
        t1.setHireDate(java.sql.Date.valueOf(java.time.LocalDate.now()));

        Student1 s1 = new Student1();
        s1.setFirstName("Yousef");
        s1.setLastName("Sayed");
        s1.setDepartment("JETS");

        em.persist(t1);
        em.persist(s1);


        em.getTransaction().commit();



        emf.close();
        em.close();
    }
    
}
