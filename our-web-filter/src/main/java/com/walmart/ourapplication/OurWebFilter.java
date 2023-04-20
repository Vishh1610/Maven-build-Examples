package com.walmart.ourapplication;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/not-welcome")
public class OurWebFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter is initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter is invoked");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("filter is closed");
    }
}
