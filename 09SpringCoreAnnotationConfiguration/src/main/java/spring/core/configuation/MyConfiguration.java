package spring.core.configuation;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.bean.DbInfo;

@Configuration
public class MyConfiguration {

	@Bean
	public DbInfo getDB(){
		
		DbInfo db = new DbInfo();
		db.setUsername("root");
		db.setPassword("System");
		
		return db;
		
	}
	
	
}
