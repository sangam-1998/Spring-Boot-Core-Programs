package sprin.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(confi.class);
		
		SmartWatch sw = context.getBean("sm",SmartWatch.class);
		Watch w = context.getBean("w",Watch.class);
		
		System.out.println("Parent Watch--"+w.toString());
		System.out.println("Child Samrt Watch--"+sw.toString());
		
		System.out.println("-------------------------------------------");
		
		
	}
	

}
