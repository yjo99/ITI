package dl3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;

public class shContPar extends HttpServlet {

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
        Enumeration<String> context = cont.getInitParameterNames();

        PrintWriter out = arg1.getWriter();
        out.println("<html><head><title>Hello</title></head> <body><h1>show context value</h1> ");
 

        for(String x : Collections.list(context)){
            out.println("<h2> Name :" + x + "|| value: " + cont.getInitParameter(x) +" </h2>");
      
        }




        out.println("</body></html>");

        clsObj obj = new clsObj(5, 10);
        cont.setAttribute("firstObj", obj);

      
       
    }
    
}



