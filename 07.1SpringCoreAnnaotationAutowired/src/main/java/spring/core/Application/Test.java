package spring.core.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.config.config;
import spring.core.controller.StudentController;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		StudentController sc = context.getBean("sc",StudentController.class);
		
		System.out.println(sc);
		
	}

}
