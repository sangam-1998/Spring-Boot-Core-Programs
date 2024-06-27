package org.com.application;

import org.com.spring.StudentInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");	
	StudentInfo s=(StudentInfo) context.getBean("sinfo");	
	
	System.out.println("Roll Number"+s.getRollNu());
	System.out.println("Subject"+s.getSubject());
	System.out.println("Roll Number , Student"+s.getInfo());
	System.out.println("Roll Number , Subject"+s.getProp());
		
	}

}
