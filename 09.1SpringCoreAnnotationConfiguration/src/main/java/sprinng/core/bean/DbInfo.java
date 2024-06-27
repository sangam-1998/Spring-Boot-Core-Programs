package sprinng.core.bean;

import org.springframework.stereotype.Component;

@Component("dinfo")
public class DbInfo {

	
	private String url;
	
	@Override
	public String toString() {
		return "DbInfo [url=" + url + ", driver=" + driver + ", username=" + username + ", password=" + password + "]";
	}

	private String driver;
	
	private String username;
	
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
		
}
