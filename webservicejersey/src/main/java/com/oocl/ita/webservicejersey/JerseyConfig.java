package com.oocl.ita.webservicejersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

//@Component
@Configuration
//Jersey servlet将被注册，并默认映射到/*。可将@ApplicationPath添加到ResourceConfig来改变该映射。
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(JerseyController.class);
//      packages("com.vergilyn.demo.springboot.jersey"); // 通过packages注册。
    }
}