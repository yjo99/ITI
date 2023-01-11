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

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ms");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

        Teacher t1 = new Teacher();
        t1.setFirstName("Mohsen");
        t1.setLastName("Diab");
        t1.setHireDate(java.sql.Date.valueOf(java.time.LocalDate.now()));

        Student s1 = new Student();
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
