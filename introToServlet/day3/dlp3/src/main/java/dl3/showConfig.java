package dl3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;

public class showConfig extends HttpServlet {

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
       PrintWriter out = arg1.getWriter();
       out.println("<html><head><title>Hello</title></head> <body><h1>show config value</h1> ");

       Enumeration<String> names = myConfig.getInitParameterNames();

       out.println("<h1> Name   ||   Value </h1> " );
       for(String x:  Collections.list(names)){
        out.println("<h2> " + x + " : " + myConfig.getInitParameter(x) + " " );
       }
      
       
    }
    
}



