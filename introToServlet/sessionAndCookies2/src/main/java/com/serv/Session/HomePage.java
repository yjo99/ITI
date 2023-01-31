package com.serv.Session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class HomePage extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // String name = req.getParameter("UserName");
        PrintWriter out = res.getWriter();
        out.println("<html> <head> <title>HomePage</title> </head><body>");

        HttpSession session = req.getSession();
        String status = (String) session.getAttribute("LoggedIn");

        if (status.equals("true")) {
            out.println("<form action ='Out' method='post'><input type='submit' value='Sign Out'></form>");
            out.println("<h1> Hello,</h1>");
            out.println("<h1> " + req.getParameter("UserName") + "</h1>");

            out.println("</body></html>");

        } else {
            req.getRequestDispatcher("index.html").include(req, res);
        }

    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        String status = (String) session.getAttribute("LoggedIn");

        if (status.equals("false")) {

            // res.sendRedirect("index.html");
            req.getRequestDispatcher("index.html").include(req, res);
            // System.out.println("Hello World ");

        }

    }

}