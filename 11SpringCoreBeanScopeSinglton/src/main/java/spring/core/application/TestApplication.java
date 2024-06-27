package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.bean.DbInfo;
import spring.core.bean.EmployeeInfo;
import spring.core.bean.StudentInfo;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");

		DbInfo d1 = context.getBean("db", DbInfo.class);
		DbInfo d2 = context.getBean("db", DbInfo.class);
		
		if(d1==d2) {
			System.out.println(d1.hashCode());
			System.out.println(d2.hashCode());
			
			System.out.println("true");
			
		}
		
		StudentInfo s = context.getBean("sinfo",StudentInfo.class);
		StudentInfo s1 = context.getBean("sinfo",StudentInfo.class);
		
		if(s!=s1) {
			
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
			
			System.out.println("true");
			
		}
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(EmployeeInfo.class);
		
		EmployeeInfo emp1 = ac.getBean("emp",EmployeeInfo.class);
		EmployeeInfo emp2 = ac.getBean("emp",EmployeeInfo.class);
		
		if(emp1==emp2) {
			System.out.println("It is signleton bean");
			
		}
		if(emp1!=emp2)
		{
			System.out.println(emp1.hashCode());
			System.out.println(emp2.hashCode());
			
			System.out.println("It is Prototype Bean");
		}
	
	}

}
