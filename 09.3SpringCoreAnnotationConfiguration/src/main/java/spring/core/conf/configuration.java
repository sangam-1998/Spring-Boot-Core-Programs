package spring.core.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import spring.core.bean.DbInfo;
import spring.core.bean.EmployeeInfo;
import spring.core.bean.StudentInfo;

@Configuration
@PropertySource("classpath:db.properties")
public class configuration {
     
	@Autowired
	Environment env;
	
	@Bean("getInfo")
	public StudentInfo getInfo() {
		
		StudentInfo info = new StudentInfo();
		return info;
		
	}
	
	@Bean("emp")
	public EmployeeInfo getEmp() {
		EmployeeInfo emp = new EmployeeInfo();
		return emp;
		
	}
	
	@Bean("db")
	public DbInfo getDB() {
		DbInfo db = new DbInfo();
		db.setUsername(env.getProperty("username"));
		db.setPassword(env.getProperty("password"));
		return db;
		
	}
	
}
