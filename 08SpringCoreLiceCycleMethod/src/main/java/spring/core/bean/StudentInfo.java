package spring.core.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sinfo")
public class StudentInfo implements InitializingBean,DisposableBean {

	@Value("Sangam")
	private String itsName;
	
	@Value("Davanagve")
	private String itsLastName;
	
	
	public StudentInfo() {
		super();
		System.out.println("Constructor is called");
	}

	@Override
	public String toString() {
		return "StudentInfo [itsName=" + itsName + ", itsLastName=" + itsLastName + "]";
	}

	public void destroy() throws Exception {
	
		
		System.out.println("Destory Method is called");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init Method is called");
			
	}

	
	
	
}
