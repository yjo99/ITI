package com.springData;

import javax.sql.DataSource;

import com.springData.Entities.Actor;
import com.springData.Entities.ActorDaoImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springData.Confugrations.*;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext conf = new AnnotationConfigApplicationContext();
        conf.register(conf.class);
        conf.refresh();




        ActorDaoImp actorDao = (ActorDaoImp) conf.getBean("actorDaoImp");

        //all actors
        List<Actor> actors = actorDao.findAllActor();
//        for(Actor ac:actors){
//            System.out.println(ac.toString());
//        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("specific Actor");
        System.out.println("==============");
        List<Actor> actorColl = actorDao.findCollection(5,12);
        for(Actor ac: actorColl){
            System.out.println(ac.toString());
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("update Actor");
        System.out.println("==============");
        Actor acUpd = new Actor(5,"Yousef", "Sayed",new java.sql.Date(new java.util.Date().getTime()) );
        actorDao.update(acUpd);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Delete Actor");
        System.out.println("==============");

        try{actorDao.delete(6);}catch(Exception e ){
            System.out.println("this id dose not exist");
        }



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Insert Actor");
        System.out.println("==============");

        Actor newAct = new Actor(6000,"jo", "Eldahshan" , new java.sql.Date(new java.util.Date().getTime()));
        try {
            actorDao.insert(newAct);
        }catch (Exception e){
            System.out.println("This id was exesit");
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("create new table");
        System.out.println("==============");
        actorDao.createTable();

    }
}
