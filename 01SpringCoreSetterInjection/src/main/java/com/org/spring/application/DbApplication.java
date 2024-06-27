package com.org.spring.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.spring.bean.DbConnection;

public class DbApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context =new ClassPathXmlApplicationContext("db.xml");	
	DbConnection db =(DbConnection) context.getBean("conn");
	
	System.out.println(db);
		
	}

}
