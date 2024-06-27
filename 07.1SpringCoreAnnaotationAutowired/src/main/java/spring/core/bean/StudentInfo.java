package spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sinfo")
public class StudentInfo {

	@Value("Sangam")
	private String firstName;
	
	@Value("Davanagve")
	private String lastName;
	
	@Value("17")
	private int itsRollNum;
	
	@Value("81.23")
	private double itsPercenetage;

	@Override
	public String toString() {
		return "StudentInfo [firstName=" + firstName + ", lastName=" + lastName + ", itsRollNum=" + itsRollNum
				+ ", itsPercenetage=" + itsPercenetage + "]";
	}
	
	
	
	
	
}
