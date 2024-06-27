package spring.core.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.bean.ComponentScanConf;
import spring.core.bean.EmployeeInfo;
import spring.core.bean.StudentInfo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConf.class);
		StudentInfo s =context.getBean("sinfo",StudentInfo.class);
		
		System.out.println(s);
		
		EmployeeInfo einfo = context.getBean("einfo", EmployeeInfo.class);
		System.out.println(einfo.getItsEmpName());
		
	}

}
