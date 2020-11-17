package com.pro_management.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/index").setViewName("index");
        //registry.addViewController("/user").setViewName("user");
        //registry.addViewController("/main").setViewName("main");
        registry.addViewController("/toSave").setViewName("save");
        registry.addViewController("/saveUser").setViewName("saveUser");
        registry.addViewController("/savePro").setViewName("savePro");
    }
}
