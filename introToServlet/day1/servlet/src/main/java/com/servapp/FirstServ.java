package com.servapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;;

public class FirstServ implements Servlet{

    @Override
    public void destroy() {
        System.out.println("servlet destroied");
        
    }

    @Override
    public ServletConfig getServletConfig() {
        
        return null;
    }

    @Override
    public String getServletInfo() {
        
        return null;
    }

    @Override
    public void init(ServletConfig arg0) throws ServletException {
        System.out.println("Servlet started");
        
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {

        System.out.println("This is first servlet");

        // arg1.setContentType("text/html");
        PrintWriter x = arg1.getWriter();
        x.println("<!DOCTYPE html><html><head><title>Second Page</title></head><body><h1>SecondPage</h1><h1>Hello EveryOne</h1><a href='jo'>FirstPage</a></body></html>");

        
    }
    
}
