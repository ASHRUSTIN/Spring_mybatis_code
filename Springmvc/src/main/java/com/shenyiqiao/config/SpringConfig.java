package com.shenyiqiao.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.shenyiqiao.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
