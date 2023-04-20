package com.walmart.ourapplication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/welcome")
public class OurFirstServlet extends HttpServlet {
    private static final long serialVersionUID = 8364917604733838366L;
    private static int i = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String ourString = "hello";

       String responseText = ourString + " " + i + " times";
       resp.getOutputStream().write(responseText.getBytes());
       i++;
    }
}
