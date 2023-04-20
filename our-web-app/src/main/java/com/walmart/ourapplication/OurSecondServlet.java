package com.walmart.ourapplication;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/not-welcome")
public class OurSecondServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.printf("Servlet init method got called ");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method got called");
        String ourMessage = "Hello from servlet";
        res.getOutputStream().write(ourMessage.getBytes());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method is being called");
    }
}
