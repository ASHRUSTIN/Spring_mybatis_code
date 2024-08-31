package com.shenyiqiao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.shenyiqiao.controller","com.shenyiqiao.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
