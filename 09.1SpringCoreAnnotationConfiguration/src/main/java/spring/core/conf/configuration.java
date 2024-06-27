package spring.core.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sprinng.core.bean.DbInfo;

@Configuration
public class configuration {

	@Bean("getDB")
	public DbInfo getDB(){
		
		DbInfo db = new DbInfo();
		db.setUrl("mysql:jdbc://localhost:3306/");
		db.setDriver("com.mysql.cj.jdbc.Driver");
		db.setUsername("root");
		db.setPassword("Sangam@123");
		
		return db;
	}
	
}
