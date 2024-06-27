package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.bean.DbInfo;
import spring.core.service.DbService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");	
	
	DbService ds = context.getBean("ds",DbService.class);
	context.close();
	}

}
