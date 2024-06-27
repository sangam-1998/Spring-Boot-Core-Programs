package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.conf.conf;
import spring.core.parent.TokenService;

public class TestApplication {

	
	public static void main(String args[]) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(conf.class);
		
		TokenService t1= context.getBean("tService",TokenService.class);
		System.out.println(t1);
		System.out.println(t1.hashCode());
		System.out.println(t1.getT().hashCode());
		
		TokenService t2= context.getBean("tService",TokenService.class);
	    System.out.println(t2);
	    System.out.println(t2.hashCode());
		System.out.println(t2.getT().hashCode());
		
	    
	}
	
}
