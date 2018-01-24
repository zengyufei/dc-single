/**
 * Copyright (C): 恒大集团©版权所有 Evergrande Group
 * FileName: AllowOriginFilter.java
 * Author:   zengyufei
 * Date:     2017-11-6 19:11
 * Description: 请求支持跨域
 */


package com.zyf.lf.config.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求支持跨域
 * @author zengyufei
 * @create 2017-11-17
 * @since 1.0.0
 */
@WebFilter
@Component
public class AllowOriginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest reqs = (HttpServletRequest) req;
        String acao = "Access-Control-Allow-Origin";
        String acac = "Access-Control-Allow-Credentials";
        String acam = "Access-Control-Allow-Methods";
        String acma = "Access-Control-Max-Age";
        String acah = "Access-Control-Allow-Headers";

        String aTrue = "true";
        String origin = "Origin";
        String methods = "POST, GET, OPTIONS, DELETE";
        String outOfTime = "3600";
        String xrw = "x-requested-with";

        response.setHeader(acac, aTrue);
        response.setHeader(acao, reqs.getHeader(origin));
        response.setHeader(acam, methods);
        response.setHeader(acma, outOfTime);
        response.setHeader(acah, xrw);
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
    }
}