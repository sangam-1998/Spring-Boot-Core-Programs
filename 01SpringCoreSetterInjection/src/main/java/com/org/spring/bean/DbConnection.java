package com.org.spring.bean;

public class DbConnection {
	
	
	private String url;
	
	private String driver;
	
	private String username;
	
	private String password;
	

	
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

	@Override
	public String toString() {
		return "DbConnection [url=" + url + ", driver=" + driver + ", username=" + username + ", password=" + password
				+ "]";
	}

	public DbConnection() {
		super();
		// TODO Auto-generated constructor stub
	}


}
