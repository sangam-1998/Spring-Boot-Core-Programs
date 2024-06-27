package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.bean.StudentInfo;
import spring.core.conf.conf;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext context = new AnnotationConfigApplicationContext(conf.class);	
		
      StudentInfo s = context.getBean("sinfo",StudentInfo.class);

      System.out.println(s);
     
		
	}

}
