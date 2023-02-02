package com.rest.repo;

import java.util.List;

import com.rest.Entity.*;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


public class woRepo {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("crt");
    private EntityManager em;

    public woRepo(){
        em = emf.createEntityManager();
    }


    public String save(Workorder w){
        em.getTransaction().begin();
        em.persist(w);
        em.getTransaction().commit();
        return " wo: " + w.getName() + "added successfully";
    }

    public Workorder findByTagNo( int x){
        em.getTransaction().begin();
        Workorder w = em.find(Workorder.class, x);
        em.getTransaction().commit();
        return w;
    }

    public List<Workorder> findAll(){
        var crtBuilder = em.getCriteriaBuilder();
        CriteriaQuery crtQuery = crtBuilder.createQuery();
        Root<Workorder> frm = crtQuery.from(Workorder.class);
        crtQuery.select(frm);
        Query tq = em.createQuery(crtQuery);
        List<Workorder> rsltList = tq.getResultList();
        return rsltList;

    }

    public Workorder update(Workorder x){
        em.getTransaction().begin();
        Workorder w = em.merge(x);
        em.getTransaction().commit();
        return w;

    }

    public void deleteById(int tagNo) {
        em.getTransaction().begin();
        em.remove(em.find(Workorder.class, tagNo));
        em.getTransaction().commit();
    }




}
