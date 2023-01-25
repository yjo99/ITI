package com.lab2;
import com.Entities.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.persistence.*;
import java.util.*;


@WebServlet("/jpa")

public class jpa extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>loaded Page</title></head><body>");

         var emf1 = Persistence.createEntityManagerFactory("crt");
         var em1 = emf1.createEntityManager();

         String q = "select w from Workorder w where w.ordStatus = ?1";
         Query crQ = em1.createQuery(q).setParameter(1, "Closed"); ///like prepared Statement

         List<Workorder> rs = crQ.getResultList();

         System.out.println("--------------using jpql------------------------");
         for(Workorder o:rs){
             out.println(" <h1> TagNo: " + o.getTagno() + "|| Name : " + o.getName() + "</h1>");
         }

        System.out.println("--------------using jpql------------------------");
        for(Workorder o:rs){
            System.out.println(" <h1> TagNo: " + o.getTagno() + "|| Name : " + o.getName() + "</h1>");
        }

        out.println("<p>Heloooooooooooooooooooooooo</p>");

        out.println("</body>");
    }







}
