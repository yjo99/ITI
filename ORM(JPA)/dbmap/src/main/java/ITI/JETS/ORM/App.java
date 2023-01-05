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

        entActor ac1 = new entActor( 600,"testing2", "Faisel","01142490433", java.sql.Date.valueOf(java.time.LocalDate.now()), "Yousef Sayed Abdelaziz", "123456");

        //// insert
        sen.persist(ac1);

        ///////// search
        entActor ac2 = sen.find(entActor.class,1);

        System.out.println("======Search=====");
        System.out.println(ac2.getUser_name());
        System.out.println("================");


        /////update
        System.out.println("======update=====");
        ac2.setUser_name("test name Yousef");
        System.out.println(ac2.getUser_name());
        sen.merge(ac2);
        System.out.println("================");

        ////delete
        entActor ac3 = sen.find(entActor.class, 521);
        sen.remove(ac3);
        sen.getTransaction().commit();

        session.close();
        sen.close();

    }
}
