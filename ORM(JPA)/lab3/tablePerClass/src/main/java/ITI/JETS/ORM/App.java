package ITI.JETS.ORM;
import ITI.JETS.Entities.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
public class App 
{
    public static void main( String[] args )
    {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpc");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

//        java.sql.Date.valueOf(java.time.LocalDate.now())

        Teacher t1 = new Teacher("Mohsen", "Diab",java.sql.Date.valueOf(java.time.LocalDate.now()));
        Teacher t2 = new Teacher("Amira", "Elmergawy",java.sql.Date.valueOf(java.time.LocalDate.now()));
        Teacher t3 = new Teacher("Mohamed", "Elsherbini",java.sql.Date.valueOf(java.time.LocalDate.now()));


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
