package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.bean.NetworkInfo;
import spring.core.conf.NetworkConf;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context = new AnnotationConfigApplicationContext(NetworkConf.class);
	
	NetworkInfo nInfo =(NetworkInfo) context.getBean("nInfo");
	
	System.out.println(nInfo);
	
		
	}

}
