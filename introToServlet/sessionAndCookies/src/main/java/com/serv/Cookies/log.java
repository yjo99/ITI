package com.serv.Cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class log extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
//        out.println("<html> <head> <title>HomePage</title> </head><body>");

        String name = req.getParameter("UserName");
        String pass = req.getParameter("Pass");

        Cookie c = new Cookie("name", name);
        res.addCookie(c);
        if(name.equals("jo") && pass.equals("123456")){


            res.sendRedirect("ckCookie");
        }else{
            req.getRequestDispatcher("error").include(req,res);

            req.getRequestDispatcher("index.html").include(req,res);
        }



        out.println("</body></html>");
    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    }


}
