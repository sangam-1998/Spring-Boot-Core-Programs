package spring.core.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import spring.core.bean.DbInfo;

@Configuration
@PropertySource("classpath:db.properties")
public class ConfigurationClass {

	@Autowired
	Environment env;
	
	@Bean
	public DbInfo getDB() {
		
	DbInfo db = new DbInfo();
	db.setUrl(env.getProperty("url"));
	db.setDriver(env.getProperty("driver"));
	db.setUsername(env.getProperty("username"));
	db.setPassword(env.getProperty("password"));
	return db;
	
	
	}
}
