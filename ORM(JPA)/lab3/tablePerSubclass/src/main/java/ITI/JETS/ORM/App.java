package ITI.JETS.ORM;
import jakarta.persistence.*;
import java.util.Date;
import ITI.JETS.Entities.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tpc");        
        EntityManager entityManager = entityManagerFactory .createEntityManager();

        Teacher teacher = new Teacher("Mohsen", "Diab", new Date(), "TA");
        Teacher teacher2 = new Teacher("Amira", "elmergawy", new Date(), "TA");
        Teacher teacher3 = new Teacher("ahmed", "elsherbiniy", new Date(), "TA");
        Student student1 = new Student("Yousef ", "Sayed", "JETS", "ST");
        
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
