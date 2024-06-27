package spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class EmployeeInfo {

	@Value("Sangam")
	private String itsEmpName;
	@Value("Patil")
	private String itsEmpLastName;
	
	
	
	public String getItsEmpName() {
		return itsEmpName;
	}
	public void setItsEmpName(String itsEmpName) {
		this.itsEmpName = itsEmpName;
	}
	public String getItsEmpLastName() {
		return itsEmpLastName;
	}
	public void setItsEmpLastName(String itsEmpLastName) {
		this.itsEmpLastName = itsEmpLastName;
	}
	
}
