package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.DbConnection.DbOperation;
import spring.core.bean.DbInfo;

public class Application {

	public static void main(String[] args) {

      
		
		ApplicationContext context = new ClassPathXmlApplicationContext("db.xml");
		DbOperation db = (DbOperation) context.getBean("conn");
		System.out.println(db.getConn());
		
	}

}
