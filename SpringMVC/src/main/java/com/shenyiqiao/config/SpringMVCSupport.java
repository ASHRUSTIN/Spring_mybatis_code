package com.shenyiqiao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class SpringMVCSupport extends WebMvcConfigurationSupport {
   @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry){
       registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
       registry.addResourceHandler("/dist/css/**").addResourceLocations("/css/");
       registry.addResourceHandler("/dist/js/**").addResourceLocations("/js/");
       registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
   }
}
