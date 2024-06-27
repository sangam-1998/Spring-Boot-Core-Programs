package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.child.Watch;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(cofig.class);
        Watch w = context.getBean("watch",Watch.class);
        Watch w1 = context.getBean("watch",Watch.class);
        Watch w2 = context.getBean("watch",Watch.class);
        
        
        System.out.println(w.toString());
        System.out.println(w.hashCode());
        System.out.println(w.getT().hashCode());
        System.out.println("-----------------------------------------");
        
        System.out.println(w1.toString());
        System.out.println(w1.hashCode());
        System.out.println(w1.getT().hashCode());
        System.out.println("-----------------------------------------");
       
        System.out.println(w2.toString());
        System.out.println(w2.hashCode());
        System.out.println(w2.getT().hashCode());
        System.out.println("-----------------------------------------");
       
	}

}
