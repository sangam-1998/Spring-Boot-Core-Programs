package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.bean.DbInfo;
import spring.core.conf.ConfigurationClass;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		DbInfo db = context.getBean("getDB",DbInfo.class);
		System.out.println(db);
		
	}

}
