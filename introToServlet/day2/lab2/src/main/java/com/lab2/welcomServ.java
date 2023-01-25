package com.lab2;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;



@WebServlet("/welcomPage")

public class welcomServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Welcom Home</title></head><body>");

        out.println("<h1> Hello, " + req.getParameter("userName") + "</h1>");
        out.println("</body></html>");
        
    }

    

  

  
    
}
