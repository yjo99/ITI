package ITI.JETS.ORM;
import jakarta.persistence.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        EntityManagerFactory session = Persistence.createEntityManagerFactory("actorEnt");
        EntityManager sen = session.createEntityManager();

        sen.getTransaction().begin();

        entActor ac1 = new entActor(510, "yousef", "Sayed", java.sql.Date.valueOf(java.time.LocalDate.now()));

        sen.persist(ac1);
        sen.getTransaction().commit();


        session.close();
        sen.close();

    }
}
