package com.lyliu.java.bookmanager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /*
     addViewControllers()方法
     （覆盖WebMvcConfigurerAdapter中同名的方法）添加了四个视图控制器。
     两个视图控制器引用名称为“home”的视图（在home.html中定义），
     另一个引用名为“hello”的视图（在hello.html中定义）。
     第四个视图控制器引用另一个名为“login”的视图。
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/error").setViewName("error");
        registry.addViewController("/success").setViewName("success");
    }
}
