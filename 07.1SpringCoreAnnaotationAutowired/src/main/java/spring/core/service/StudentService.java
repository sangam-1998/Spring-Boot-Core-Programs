package spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.core.bean.StudentInfo;

@Component("ss")
public class StudentService {

	@Autowired
	StudentInfo sinfo;

	@Override
	public String toString() {
		return "StudentService [sinfo=" + sinfo + "]";
	}
	
}
