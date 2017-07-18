//package com.singam.Security;
//
///**
// * Created by jjegasingam on 7/11/2017.
// */
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
//
//
//public class CustomBasicAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {
//
//    @Override
//    public void commence(final HttpServletRequest request,
//                         final HttpServletResponse response,
//                         final AuthenticationException authException) throws IOException, ServletException {
//        System.out.println("commence");
//        //Authentication failed, send error response.
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName() + "");
//
//        PrintWriter writer = response.getWriter();
//        writer.println("HTTP Status 401 : " + authException.getMessage());
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet");
//        setRealmName("MY_TEST_REALM");
//        super.afterPropertiesSet();
//    }
//}