package spring.core.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.bean.ApplicationInfo;
import spring.core.conf.ApplicationConf;

public class ApplicationTest {

	
	public static void main(String x[]) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConf.class);
	    
		ApplicationInfo info =  (ApplicationInfo) context.getBean("AppInfo");
	
		System.out.println(info);
	
	}
}
