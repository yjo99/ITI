package com.serv.Session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class log extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();


        String name = req.getParameter("UserName");
        String pass = req.getParameter("Pass");

        
        
        if(name.equals("jo") && pass.equals("123456")){
        
            HttpSession s = req.getSession(true);
            s.setAttribute("LoggedIn", "true");
            req.getRequestDispatcher("home").forward(req, res);;

        }else{
            req.getRequestDispatcher("error").include(req,res);

            req.getRequestDispatcher("index.html").include(req,res);
        }



        out.println("</body></html>");
    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    }


}
