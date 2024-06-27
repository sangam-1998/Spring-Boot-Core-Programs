package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.bean.StudentInfo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentInfo.class);
		StudentInfo sinfo = context.getBean("sinfo",StudentInfo.class);
		
		System.out.println(sinfo);
		
	}

}
