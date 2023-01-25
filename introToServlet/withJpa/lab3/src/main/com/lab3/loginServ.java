package com.lab3;

import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;



@WebServlet("/login")

public class loginServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String pass = req.getParameter("pass");

        if(userName.equals("Yousef") && pass.equals("123456")){
            System.out.println("Helloooooooooooooooooooooooooooooooo world");
            req.getRequestDispatcher("welcomPage").forward(req, resp);

        }else{
            // PrintWriter out = resp.getWriter();
            // out.println("<h1>Wrong data</h1>");
            req.getRequestDispatcher("error").include(req,resp);
            req.getRequestDispatcher("index.html").include(req,resp);
        }
    }

    

  

  
    
}
