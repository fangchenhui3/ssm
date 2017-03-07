package com.imyzone.main.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Titie:
 * Description:
 * JDK:
 * Tomcat:
 * Author: fangchenhui
 * CreateTime:2017/3/6 21:47
 * version: 1.0
 **/
@WebFilter(filterName = "LogFilter",urlPatterns = "*.jsp")
public class LogFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response= (HttpServletResponse) resp;
        HttpSession session=request.getSession();
        String username= (String) session.getAttribute("username");
        StringBuffer url=request.getRequestURL();
        //解析请求的url，获取请求后面的路径
        int inx=url.indexOf("8080");
        String requestUrl=url.substring(inx+4);
        if(requestUrl.equals("/")||requestUrl.equals("/jsp/login.jsp")){
            if (username != null) {
                response.sendRedirect("/jsp/main.jsp");
            } else {
                chain.doFilter(req,resp);
            }
        }else{
            if (username == null) {
                response.sendRedirect("/jsp/login.jsp");
            } else {
                chain.doFilter(req, resp);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
