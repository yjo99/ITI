package ITI.JETS.ORM;

import jakarta.persistence.*;
import ITI.JETS.Entities4.*;
import java.util.Date;

public class inh4 {


    public static void impinh4(){


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("4");        
        EntityManager entityManager = entityManagerFactory .createEntityManager();

        Teacher4 teacher = new Teacher4("Mohsen", "Diab", new Date(), "TA");
        Teacher4 teacher2 = new Teacher4("Amira", "elmergawy", new Date(), "TA");
        Teacher4 teacher3 = new Teacher4("ahmed", "elsherbiniy", new Date(), "TA");
        Student4 student1 = new Student4("Yousef ", "Sayed", "JETS", "ST");
        
        entityManager.getTransaction().begin();
        entityManager.persist(teacher);
        entityManager.persist(teacher2);
        entityManager.persist(teacher3);
        entityManager.persist(student1);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
    
}
