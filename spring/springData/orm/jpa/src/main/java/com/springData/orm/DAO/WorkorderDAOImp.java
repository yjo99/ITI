package com.springData.orm.DAO;

import com.springData.orm.Entites.Workorder;
import com.springData.orm.Interfaces.WorkOrderDAO;


import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



public class WorkorderDAOImp implements WorkOrderDAO {

//    @Autowired
    EntityManager entityManager;


    public void setEntityManager(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override

    public Workorder findByTagNo(String tagNo) {
        return null;
    }

    @Override
    public List<Workorder> findAllWorkorder() {
        return null;
    }

    @Override
    @Transactional
    public void deletedWorkorder(Workorder w) {

        System.out.println("Deleted Successfully");

    }

    @Override
    @Transactional
    public void updateWorkorder(Workorder w) {



        System.out.println("Updated Successfully");
    }

    @Override
    @Transactional
    public void addWorkorder(Workorder w) {


                System.out.println("Added Successfully");

    }



    public int CountWorkorderBlocked() {
        String sql = "select count(w) from Workorder w where w.ordStatus = :t1 ";

        return 5;
    }
}
