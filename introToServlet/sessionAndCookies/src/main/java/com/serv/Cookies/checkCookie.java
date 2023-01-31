package com.serv.Cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class checkCookie extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        PrintWriter out = res.getWriter();

        Cookie all[] = req.getCookies();

        if(all != null){
            res.sendRedirect("home");
        }else{
            req.getRequestDispatcher("ckerror").include(req,res);
            req.getRequestDispatcher("index.html").include(req,res);
        }



    }


}