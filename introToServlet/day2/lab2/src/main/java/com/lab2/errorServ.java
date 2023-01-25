package com.lab2;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;



@WebServlet("/error")

public class errorServ extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        PrintWriter out = resp.getWriter();
        out.println("<div style='border: 1px solid red' backgroud-color:rgba(0,0,0,0.5)><h4 syle='color:red; font-weight:bloder'>Error</h4></div>");


    }

    

  

  
    
}