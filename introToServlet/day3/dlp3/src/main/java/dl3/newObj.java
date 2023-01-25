package dl3;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class newObj extends HttpServlet {

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
        

        clsObj obj = new clsObj(5, 10);
        cont.setAttribute("firstObj", obj);

      
       
    }
    
}



