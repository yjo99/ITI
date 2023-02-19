package com.connection;

import jakarta.persistence.*;



public class connImpl implements conn {

    EntityManagerFactory entFact;
    EntityManager entMng;

    @Override
    public EntityManager initFact() {

        EntityManagerFactory entFact = Persistence.createEntityManagerFactory("crt");
        
        return entFact.createEntityManager();
    }



    
}
