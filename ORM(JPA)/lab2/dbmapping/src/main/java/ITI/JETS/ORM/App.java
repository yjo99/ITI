package ITI.JETS.ORM;
import ITI.JETS.Entities.*;

import jakarta.persistence.*;
public class App 
{
    public static void main( String[] args )
    {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jo");
        EntityManager em = emf.createEntityManager();


        ///objects
        User u1 = new User();

        em.getTransaction().begin();




        em.getTransaction().commit();
        emf.close();
        em.close();



    }


}
