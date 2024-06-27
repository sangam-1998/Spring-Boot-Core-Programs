package spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("nInfo")
public class NetworkInfo {

	
	@Value("${ip}")
	private String ipAddress;
	
	@Value("${port}")
	private int port;
	
	
	@Override
	public String toString() {
		return "NeworkInfo [ipAddress=" + ipAddress + ", port=" + port + "]";
	}
	
	
	
	
}
