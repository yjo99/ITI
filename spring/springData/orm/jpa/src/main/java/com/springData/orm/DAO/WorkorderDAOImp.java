package com.springData.orm.DAO;

import com.springData.orm.Entites.Workorder;
import com.springData.orm.Interfaces.WorkOrderDAO;


import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



public class WorkorderDAOImp implements WorkOrderDAO {

//    @Autowired
    @PersistenceContext
    public EntityManager entityManager;


    public void setEntityManager(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Workorder findByTagNo(String tagNo) {
        return entityManager.find(Workorder.class, tagNo);
    }

    @Override
    public List<Workorder> findAllWorkorder() {
        String q = "select w from Workorder w ";
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    @Transactional
    public void deletedWorkorder(Workorder w) {
        System.out.println(entityManager.contains(w));
        // entityManager.contains( w ? w: entityManager.merge(w));
        entityManager.remove(entityManager.contains( w) ? w: entityManager.merge(w));
        System.out.println("Deleted Successfully");

    }

    @Override
    @Transactional
    public void updateWorkorder(Workorder w) {
        entityManager.merge(w);
        System.out.println("Updated Successfully");
    }

    @Override
    @Transactional
    public void addWorkorder(Workorder w) {

        entityManager.persist(w);
        System.out.println("Added Successfully");

    }


    public int CountWorkorderBlocked() {
        String sql = "select count(w) from Workorder w where w.ordStatus = :t1 ";
        return 5;
    }
}
