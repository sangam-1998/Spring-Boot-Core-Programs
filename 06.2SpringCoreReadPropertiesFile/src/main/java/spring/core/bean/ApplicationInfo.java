package spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("AppInfo")
public class ApplicationInfo {

	@Value("${Name}")
	private String ApplicationName;
	
	@Value("${URL}")
	private String ApplicationURL;
	
	@Override
	public String toString() {
		return "ApplicationInfo [ApplicationName=" + ApplicationName + ", ApplicationURL=" + ApplicationURL
				+ ", ApplicationOwner=" + ApplicationOwner + "]";
	}

	@Value("${Owner}")
	private String ApplicationOwner;

	public String getApplicationName() {
		return ApplicationName;
	}

	public void setApplicationName(String applicationName) {
		ApplicationName = applicationName;
	}

	public String getApplicationURL() {
		return ApplicationURL;
	}

	public void setApplicationURL(String applicationURL) {
		ApplicationURL = applicationURL;
	}

	public String getApplicationOwner() {
		return ApplicationOwner;
	}

	public void setApplicationOwner(String applicationOwner) {
		ApplicationOwner = applicationOwner;
	}
	
	
}
