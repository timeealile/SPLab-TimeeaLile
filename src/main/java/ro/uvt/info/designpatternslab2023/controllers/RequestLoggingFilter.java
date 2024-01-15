package ro.uvt.info.designpatternslab2023.controllers;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(1)
public class RequestLoggingFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
//        LOG.info(
//                "Starting a transaction for req : {}",
//                req.getRequestURI());

        chain.doFilter(request, response);
//        LOG.info(
//                "Committing a transaction for req : {}",
//                req.getRequestURI());
    }

    @Override
    public void destroy() {

    }
}
