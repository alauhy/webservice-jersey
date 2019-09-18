package com.oocl.ita.webservicejersey;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebservicejerseyApplication {
    @Bean
    public ServletRegistrationBean jerseyServlet() {
        /* 特别注意此路径，与JerseyController中的@Path。可能让最终路径变成：localhost:8080/rest/jersey/get
         * rest是此ServletRegistrationBean定义的(同ResourceConfig的类注解@ApplicationPath("/rest"))
         * jersey是Controller中类注解@Path定义的
         */
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/rest/*");
        // our rest resources will be available in the path /rest/*
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS,
                JerseyConfig.class.getName());
        return registration;
    }
    public static void main(String[] args) {
        SpringApplication.run(WebservicejerseyApplication.class, args);
    }

}
