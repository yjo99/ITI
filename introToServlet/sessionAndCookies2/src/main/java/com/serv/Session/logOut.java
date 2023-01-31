package com.serv.Session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class logOut extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        HttpSession s = req.getSession(false);
        s.setAttribute("LoggedIn", "false");

        System.out.println(s.getAttribute("LoggedIn"));
        res.sendRedirect("index.html");
        // System.out.println("hellllllllllllllllllo");

    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
       




    }


}