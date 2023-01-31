package com.serv.Cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class HomePage extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{


        Cookie c[] = req.getCookies();


        if(c != null){
            String name = c[0].getValue();
            PrintWriter out = res.getWriter();
            out.println("<html> <head> <title>HomePage</title> </head><body>");
            out.println("<h1> Hello,</h1>");
            out.println("<h1> "+ name + "</h1>");

            out.println("</body></html>");
        }else{
            res.sendRedirect("index.html");
        }

    }


}