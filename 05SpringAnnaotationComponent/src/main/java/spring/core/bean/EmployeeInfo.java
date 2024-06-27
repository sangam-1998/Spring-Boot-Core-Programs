package spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("einfo")
public class EmployeeInfo {

	public String getItsEmpName() {
		return itsEmpName;
	}
	public void setItsEmpName(String itsEmpName) {
		this.itsEmpName = itsEmpName;
	}
	public String getItsEmpID() {
		return itsEmpID;
	}
	public void setItsEmpID(String itsEmpID) {
		this.itsEmpID = itsEmpID;
	}
	public String getItsEmpCompany() {
		return itsEmpCompany;
	}
	public void setItsEmpCompany(String itsEmpCompany) {
		this.itsEmpCompany = itsEmpCompany;
	}
	@Value("Sangam")
	private String itsEmpName;
	@Value("101")
	private String itsEmpID;
	@Value("AIPL")
	private String itsEmpCompany;
	
	
}
