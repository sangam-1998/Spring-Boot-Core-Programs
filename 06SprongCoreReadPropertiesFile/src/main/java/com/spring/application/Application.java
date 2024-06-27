package com.spring.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.DbInfo;
import com.spring.config.config;

public class Application {

	
	public static void main(String x[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
	    
		DbInfo d =(DbInfo) context.getBean("dinfo");
		System.out.println(d);
	  
	}
}
