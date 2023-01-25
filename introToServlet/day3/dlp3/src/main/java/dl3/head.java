package dl3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class head extends HttpServlet {

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
      
        
        Enumeration<String> hd = arg0.getHeaderNames();

        PrintWriter out = arg1.getWriter();
        out.println("<html><head><title>Hello</title></head> <body><h1>show header values</h1> ");

        for(String s : Collections.list(hd)){
            out.println("<h2>=======================================</h2>");
            out.println("<h2> Name :" + s +" value:  "+ arg0.getHeader(s) + "</h2>");
            
            // Enumeration<String> lq = arg0.getHeaders(s);
            // for(String x : Collections.list(lq)){
            //     out.println("<h2>"+x+"</h2>");
            // }
            // out.println("<h1>Name: " + s + " || Value: " + arg1.getHeader(s));
        }
      
       
    }
    
}



