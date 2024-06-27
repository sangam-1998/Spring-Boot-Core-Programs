package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.conf.config;
import spring.core.controller.DbController;
import spring.core.dao.DbInfo;
import spring.core.service.DbService;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

		DbController ds = context.getBean("dbControll",DbController.class);
		
		System.out.println(ds);
		
	}

}
