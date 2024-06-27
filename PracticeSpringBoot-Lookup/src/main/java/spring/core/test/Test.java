package spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import core.spring.child.Time;
import core.spring.conf.config;
import core.spring.parent.SmartWatch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

		SmartWatch t = context.getBean("sw",SmartWatch.class);
		SmartWatch t1 = context.getBean("sw",SmartWatch.class);

		System.out.println(t);
		System.out.println(t1);
		
	}

}
