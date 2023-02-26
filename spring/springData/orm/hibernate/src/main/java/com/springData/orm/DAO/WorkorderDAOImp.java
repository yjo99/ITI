package com.springData.orm.DAO;

import com.springData.orm.Entites.Workorder;
import com.springData.orm.Interfaces.WorkOrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Repository
//@Transactional
public class WorkorderDAOImp implements WorkOrderDAO {

//    @Autowired
    HibernateTemplate hTemplate;
    TransactionTemplate tTemplate;
    public WorkorderDAOImp(HibernateTemplate hTemplate,TransactionTemplate tTemplate){
        this.hTemplate = hTemplate;


        ///using transaction template or @Translation
        this.tTemplate = tTemplate;
    }


    @Override

    public Workorder findByTagNo(String tagNo) {
        return hTemplate.load(Workorder.class,tagNo);
    }

    @Override
    public List<Workorder> findAllWorkorder() {
        return hTemplate.loadAll(Workorder.class);
    }

    @Override
    public void deletedWorkorder(Workorder w) {
        hTemplate.delete(w);
        System.out.println("Deleted Successfully");

    }

    @Override
    @Transactional(readOnly = false)
    public void updateWorkorder(Workorder w) {
        hTemplate.saveOrUpdate(w);
        System.out.println("Updated Successfully");
    }

    @Override
    public void addWorkorder(Workorder w) {
        hTemplate.saveOrUpdate(w);
        System.out.println("Added Successfully");
    }
    public Long CountWorkorderBlocked() {
        String sql = "select count(w) from Workorder w where w.ordStatus = :t1 ";
        List ResBacked = hTemplate.findByNamedParam(sql, "t1", "Blocked");
        return (Long)  ResBacked.get(0);
    }
}
