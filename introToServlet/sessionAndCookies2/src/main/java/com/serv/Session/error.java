package com.serv.Session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class error extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        out.println("<div style='background-color:rgb(255,222,205); border: solid 2px red'> <h1 style='color:red;'>UserName or Password is Invalid</h1> </div>");

    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
      




    }


}