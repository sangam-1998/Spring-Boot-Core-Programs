package spring.core.bean;

import java.util.Set;

public class DbInfo {


	private String url;
	private String driver;
	private String username;
	private String password;
	private Set<String> Operation;
	DataBaseTye dbType;
	@Override
	public String toString() {
		return "DbInfo [url=" + url + ", driver=" + driver + ", username=" + username + ", password=" + password
				+ ", Operation=" + Operation + ", dbType=" + dbType + "]";
	}
	public DbInfo(String url, String driver, String username, String password, Set<String> operation,
			DataBaseTye dbType) {
		super();
		this.url = url;
		this.driver = driver;
		this.username = username;
		this.password = password;
		Operation = operation;
		this.dbType = dbType;
	}
	
	
	
	
	
}
