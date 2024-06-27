package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.spring")
@PropertySource("classpath:conf.properties")
public class config {

}
