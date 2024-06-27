package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.cong.config;
import spring.core.movies.Movie;

public class Application {

	
	public static void main(String x[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		Movie m = context.getBean("m",Movie.class);
		System.out.println(m);
		
		Movie m1 = context.getBean("m",Movie.class);
		System.out.println(m1);
		
	}
}
