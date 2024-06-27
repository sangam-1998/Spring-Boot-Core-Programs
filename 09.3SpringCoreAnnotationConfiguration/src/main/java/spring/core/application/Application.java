package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.bean.DbInfo;
import spring.core.bean.EmployeeInfo;
import spring.core.bean.StudentInfo;
import spring.core.conf.configuration;

public class Application {

	public static void main(String x[]) {

		ApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
		StudentInfo info = context.getBean("getInfo", StudentInfo.class);
		EmployeeInfo emp = context.getBean("emp", EmployeeInfo.class);
		DbInfo db = context.getBean("db",DbInfo.class);
		emp.setItsEmpInfo("Sangam");

		emp.setItsEmpLastInfo("Davangave");
		System.out.println(info);
		System.out.println(emp);
		
		System.out.println("DbInfo--"+db.toString());
		
		
		
	}

}
