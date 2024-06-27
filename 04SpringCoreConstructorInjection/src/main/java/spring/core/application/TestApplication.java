package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.DbOperation.DbConnection;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
		
		DbConnection d = (DbConnection) context.getBean("conn");
		
		System.out.println(d);
		
	}

}
