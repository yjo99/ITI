package ITI.JETS.ORM;
import ITI.JETS.Entities.*;


import jakarta.persistence.*;

import java.util.Date;

public class App
{
    public static void main( String[] args )
    {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpc");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

//        java.sql.Date.valueOf(java.time.LocalDate.now())

        Teacher t1 = new Teacher("Mohsen", "Diab",new java.util.Date());
//        t1.setHire_date(new Date());
        Teacher t2 = new Teacher("Amira", "Elmergawy",new java.util.Date());
//        t2.setHire_date(new Date());
        Teacher t3 = new Teacher("Mohamed", "Elsherbini",new java.util.Date());
//        t3.setHire_date(new Date());


        Student s1 = new Student("Yousef", "Sayed","JETS");

        em.persist(t1);

        em.persist(t2);
        em.persist(t3);

        em.persist(s1);


        em.getTransaction().commit();



        emf.close();
        em.close();

    }


}
