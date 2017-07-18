//package com.singam.Security;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//
///**
// * Created by jjegasingam on 7/11/2017.
// */
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    private static String REALM="MY_TEST_REALM";
//
//    @Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
//        System.out.println("configureGlobalSecurity");
//        auth.inMemoryAuthentication().withUser("singam").password("abc").roles("admin");
//        auth.inMemoryAuthentication().withUser("tom").password("abc").roles("user");
//    }
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        System.out.println("configure(HttpSecurity http)");
////
////        http.csrf().disable()
////                .authorizeRequests()
////                .antMatchers("/user/**").hasRole("ADMIN")
////                .and().httpBasic().realmName(REALM).authenticationEntryPoint(getBasicAuthEntryPoint())
////                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);//We don't need sessions to be created.
////    }
//
//    @Bean
//    public CustomBasicAuthenticationEntryPoint getBasicAuthEntryPoint(){
//        System.out.println("getBasicAuthEntryPoint");
//        return new CustomBasicAuthenticationEntryPoint();
//    }
//
//    /* To allow Pre-flight [OPTIONS] request from browser */
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        System.out.println("configure");
//        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
//    }
//}
