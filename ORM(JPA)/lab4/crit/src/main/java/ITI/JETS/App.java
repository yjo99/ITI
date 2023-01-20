package ITI.JETS;

import ITI.Entites.Owner;
import ITI.Entites.Workorder;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
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


    //     ////create jpql

    //     var emf1 = Persistence.createEntityManagerFactory("crt");
    //     var em1 = emf1.createEntityManager();

    //     String q = "select w from Workorder w where w.ordStatus = ?1";
    //     Query crQ = em1.createQuery(q).setParameter(1, "Closed"); ///like prepared Statement

    //     List<Workorder> rs = crQ.getResultList();
    //     System.out.println("--------------using jpql------------------------");
    //     for(Workorder o:rs){
    //         System.out.println(o.getTagno());
    //     }
    //     System.out.println("Number of Record" + rs.size());

    //     ///get count using query
    //     Query qInt = em1.createQuery("select count(w) from Workorder w");
    //     List<Long> rsInt = qInt.getResultList();
        
    //     System.out.println("count by get "+rsInt.get(0));
    //     for(Long x:rsInt){
    //         System.out.println("Reslut of count is " + x);

    //     }

    // //    ///using join and projection
    // //    Query qJoin = em1.createQuery("SELECT Owner.name , count(Workorder.tagno)  from Workorder inner join Workorder.owner where Owner.id = Workorder.owner.id group by Workorder.owner.id");
    // //    List<joinRes> rsJoin = qJoin.getResultList();
    // //    for(joinRes r:rsJoin){
    // //        System.out.println(r.getOwner() + " || " + r.getCount());
    // //    }






    //     emf1.close();
    //     em1.close();





        var emf = Persistence.createEntityManagerFactory("crt");
        var em = emf.createEntityManager();

        // em.getTransaction().begin();
        var crtBuilder = em.getCriteriaBuilder();
        CriteriaQuery crtQuery = crtBuilder.createQuery();
        Root<Workorder> frm = crtQuery.from(Workorder.class);


        ///select with where condition
        crtQuery.select(frm).where(crtBuilder.equal(frm.get("ordStatus"),"Blocked"));

        Query tq = em.createQuery(crtQuery);
        List<Workorder> rsltList = tq.getResultList();

        int count = rsltList.size();

        System.out.println("---------Using critera-------------------");
        for(Workorder o:rsltList){

            System.out.println("tagno= " + o.getTagno()+ " || name= " + o.getName() + " || owner= " + o.getOwner().getName());

        }

        System.out.println( "number of entities "+ count);

        //using join and projection
//        CriteriaQuery newQ = crtBuilder.createQuery();
//        Root<Workorder> wrk = newQ.from(Workorder.class);
//        Root<Owner> own = newQ.from(Owner.class);
//        Join<Workorder, Owner> jn = wrk.join("owner", JoinType.INNER);
//        jn.on(crtBuilder.equal(wrk.get("owner").<Integer>get("id"), own.get("id") ));
//        newQ.multiselect(own.get("name"),crtBuilder.count(wrk.get("tagno")));
//
//        Query finalRun = em.createQuery(newQ);
//        List<joinRes> finalRs = finalRun.getResultList();
//        System.out.println("-----------join and projection by criteria ------------");
//        for(joinRes x:finalRs){
//            System.out.println(x.getOwner() + " |||| " + x.getCount());
//        }


        //////test
        CriteriaQuery<joinRes> newQ = crtBuilder.createQuery(joinRes.class);
        Root<Workorder> wrk = newQ.from(Workorder.class);
//        Root<Owner> own = newQ.from(Owner.class);
//        Join<Workorder, Owner> jn = wrk.join("owner", JoinType.INNER);
//        jn.on(crtBuilder.equal(wrk.get("owner").<Integer>get("id"), own.get("id") ));
        newQ.multiselect(wrk.get("owner").get("name"),crtBuilder.count(wrk)).groupBy(wrk.get("owner").get("id"));


        Query finalRun = em.createQuery(newQ);
       List<joinRes> list = finalRun.getResultList();
        // List<Object[]> list = finalRun.getResultList();
        System.out.println("-----------join and projection by criteria ------------");

       for(joinRes x:list){
           System.out.println(x.getOwner() + " |||| " + x.getCount());
       }

        // for(Object[] x:list){
        //     System.out.println(x[0] + " |||| " + x[1]);
        // }
    }
}
