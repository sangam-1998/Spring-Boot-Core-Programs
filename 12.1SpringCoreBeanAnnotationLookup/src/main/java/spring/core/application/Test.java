package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.conf.conf;
import spring.core.parent.Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(conf.class);
		
		Car c = context.getBean("car",Car.class);
		System.out.println(c);
		System.out.println("Parent class hashcode (car)-"+c.hashCode());
		System.out.println("Chile class hashcode (chesis)-"+c.getChesis().hashCode());
		
		
		Car c1 = context.getBean("car",Car.class);
		System.out.println(c1);
		System.out.println("Parent class hashcode (car)-"+c1.hashCode());
		System.out.println("Chile class hashcode (chesis)-"+c1.getChesis().hashCode());
		
	}

}
