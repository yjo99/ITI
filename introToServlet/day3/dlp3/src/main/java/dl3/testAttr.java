package dl3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class testAttr extends HttpServlet {

    ServletConfig myConfig;

    @Override
    public void destroy() {
       
    }

   

    @Override
    public void init(ServletConfig config) throws ServletException {
       myConfig = config;
    }


    
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
     
        ServletContext cont = myConfig.getServletContext();

        clsObj obj = (clsObj)cont.getAttribute("firstObj");

        PrintWriter out = arg1.getWriter();
        System.out.println(obj.getX());

        out.println("<html><head><title>Hello</title></head> <body><h1>show Object values</h1> ");
 
        out.println("<h1> x = " + obj.x + " || y = " + obj.y + "</h1>");
        


       

    }
    
}
