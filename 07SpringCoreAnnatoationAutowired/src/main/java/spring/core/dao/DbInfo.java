package spring.core.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("dbInfo")
public class DbInfo {

	
	@Value("${db.url}")
	private String url;

	@Value("${db.driver}")
	private String driver;
	
	@Value("${db.username}")
	private String username;
	
	@Value("${db.password}")
	private String password;

	
	
	@Override
	public String toString() {
		return "DbInfo [url=" + url + ", driver=" + driver + ", username=" + username + ", password=" + password
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
