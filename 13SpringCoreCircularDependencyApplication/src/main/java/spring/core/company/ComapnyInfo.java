package spring.core.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.core.employees.EmployeeInfo;

@Component("cinfo")
public class ComapnyInfo {
	
	@Autowired
	EmployeeInfo einfo;

	
	

}
