package ITI.JETS;

import ITI.Entites.Workorder;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.jdbc.Work;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        var emf = Persistence.createEntityManagerFactory("crt");
        var em = emf.createEntityManager();

        em.getTransaction().begin();
        var crtBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Workorder> crtQuery = crtBuilder.createQuery(Workorder.class);
        Root<Workorder> frm = crtQuery.from(Workorder.class);


        ///select with where condition
        crtQuery.select(frm).where(crtBuilder.equal(frm.get("ordStatus"),"Blocked"));

        TypedQuery<Workorder> tq = em.createQuery(crtQuery);
        List<Workorder> rsltList = tq.getResultList();
        int count = rsltList.size();


        for(Workorder o:rsltList){
            Workorder w = (Workorder) o;
            System.out.println("tagno= " + w.getTagno()+ " || name= " + w.getName() + " || owner= " + w.getOwner().getName());

        }

        System.out.println( "number of entities "+ count);
    }
}
