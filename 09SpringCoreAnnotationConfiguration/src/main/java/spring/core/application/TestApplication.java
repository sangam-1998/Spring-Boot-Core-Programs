package spring.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.bean.DbInfo;
import spring.core.configuation.MyConfiguration;

public class TestApplication {

    public static void main(String[] args) {
        // Create the application context using your configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        // Retrieve the bean named "getDB" from the context
        DbInfo db = context.getBean("getDB", DbInfo.class);

        // Print the information from the retrieved bean
        System.out.println(db);
    }
}
