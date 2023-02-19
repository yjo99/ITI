package com.CrudApp;

import com.Entities.*;
import java.util.*;
import jakarta.persistence.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        EntityManagerFactory entFact = Persistence.createEntityManagerFactory("crt");
        EntityManager entMng = entFact.createEntityManager();

        entMng.getTransaction().begin();

        String q = "select w from Workorder w where w.ordStatus = ?1";
        Query setQuery = entMng.createQuery(q).setParameter(1,"Closed");

        List<Workorder> wsRes = setQuery.getResultList();

        System.out.println(wsRes.get(0).getTagno());

    }
}
