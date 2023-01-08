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

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jo");
        EntityManager em = emf.createEntityManager();


        ///objects

        //user
        User u1 = new User("yousef16992@gmail.com", "20 elrahman", "0235943341","01142490433", java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),"Yousef Sayed", "pass","Yousef Sayed Abdelaziz mohamed");
        User u2 = new User("jo@gmail.com", "20 elrahman", "0235943341","01142490433", java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),"jo", "pass","jo sayed");
        User u3 = new User("yousef@gmail.com", "20 elrahman", "0235943341","01142490433", java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),"Yousef", "pass","Yousef Sayed");


        //buyer
        Buyer b1 = new Buyer(u1, "by mobile");

        //seller
        Seller s1 = new Seller(u2, "electronic seller");
        Seller s2 = new Seller(u3, "graphic tablet seller");


        ///category
        Category c1 = new Category("laptop");
        Category c2 = new Category("graphic tablets");
        Category c3 = new Category("Camera");

        Set<Category> sc = new HashSet<>();
        sc.add(c1);
        sc.add(c2);
        sc.add(c3);

        //product
        Product p1 = new Product(s1,"laptop-dell", "core i7 , ram 8 , ...","dell",java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),3,java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),sc );
        Product p2 = new Product(s1,"laptop-hp", "core i3 , ram 4 , ...","hp",java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),2,java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()) ,sc);
        Product p3 = new Product(s1,"laptop-lenovo", "core i5 , ram 8 , ...","lenovo",java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),5,java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()) ,sc);
        Product p4 = new Product(s2,"xp-pen deco 02", "The roller wheel comes with a green stopper...","xp-pen",java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),10,java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),sc );
        Product p5 = new Product(s2,"Canon EOS 250D", "كاميرا DSLR الأخف وزنًا في العالم مزودة بشاشة قابلة للحركة...","Cannon",java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),3,java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),sc );
        Product p6 = new Product(s1,"canon 9980", "Canon · EOS 250D · 449g ...","cannon",java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),1,java.sql.Date.valueOf(java.time.LocalDate.now()),java.sql.Date.valueOf(java.time.LocalDate.now()),sc );









        //buyer buy products

        em.getTransaction().begin();

        //user
        em.persist(u1);
        em.persist(u2);
        em.persist(u3);

        //buyer and seller
        em.persist(b1);
        em.persist(s1);
        em.persist(s2);

        //Category
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);

        //product
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);
        em.persist(p6);

        em.flush();

        System.out.println("the id of buyer nomber one is ??????" +b1.getId());


        BuyerBidProductId bpId = new BuyerBidProductId(b1.getId().intValue(), p1.getId().intValue());
        BuyerBidProduct buyerNewProd = new BuyerBidProduct(bpId, b1, p1, java.sql.Date.valueOf(java.time.LocalDate.now()), 15.9f, 20 );

        BuyerBuyProductId bpbuyId = new BuyerBuyProductId(b1.getId().intValue(), p1.getId().intValue());
        BuyerBuyProduct bbp = new BuyerBuyProduct(bpbuyId, b1, p1, java.sql.Date.valueOf(java.time.LocalDate.now()), 15.9f, 20 );


        em.persist(buyerNewProd);
        em.persist(bbp);

        em.getTransaction().commit();


//        em.flush();


        //buyerBidProduct
//        BuyerBidProductId bpId = new BuyerBidProductId(b1.getId().intValue(), p1.getId().intValue());
//        BuyerBidProduct buyerNewProd = new BuyerBidProduct(bpId, b1, p1, java.sql.Date.valueOf(java.time.LocalDate.now()), 15.9f, 20 );
//
//        BuyerBuyProductId bpbuyId = new BuyerBuyProductId(b1.getId().intValue(), p1.getId().intValue());
//        BuyerBuyProduct bbp = new BuyerBuyProduct(bpbuyId, b1, p1, java.sql.Date.valueOf(java.time.LocalDate.now()), 15.9f, 20 );
//
//
//        em.persist(buyerNewProd);
//        em.persist(bbp);
//
//        em.getTransaction().commit();




        emf.close();
        em.close();

//        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("jo");
//        EntityManager em1 = emf1.createEntityManager();
//
//
//        em1.getTransaction().begin();
//
//        BuyerBidProductId bpId = new BuyerBidProductId(b1.getId().intValue(), p1.getId().intValue());
//        BuyerBidProduct buyerNewProd = new BuyerBidProduct(bpId, b1, p1, java.sql.Date.valueOf(java.time.LocalDate.now()), 15.9f, 20 );
//
//        BuyerBuyProductId bpbuyId = new BuyerBuyProductId(b1.getId().intValue(), p1.getId().intValue());
//        BuyerBuyProduct bbp = new BuyerBuyProduct(bpbuyId, b1, p1, java.sql.Date.valueOf(java.time.LocalDate.now()), 15.9f, 20 );
//
//
//
//        ///
//        em1.persist(buyerNewProd);
//        em1.persist(bbp);
//
//        em1.getTransaction().commit();
//
//        emf1.close();
//        em1.close();


    }


}
