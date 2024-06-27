package spring.core.bean;

public class DbInfo {

	
	private String url;
	private String driver;
	

	public DbInfo() {
		super();
	}
	
	@Override
	public String toString() {
		return "DbInfo [url=" + url + ", driver=" + driver + "]";
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
	
	
}
