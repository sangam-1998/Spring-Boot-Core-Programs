package spring.core.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.beans.BikeInfo;
import spring.core.conf.confi;
import spring.core.parent.Bike;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(confi.class);
		
		Bike bi = context.getBean("bike", Bike.class);
		
		Bike b1 = context.getBean("bike", Bike.class);
		
		System.out.println(bi);
		System.out.println(b1);
		
	}

}
