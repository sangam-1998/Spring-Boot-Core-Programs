package spring.core.bean;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("sinfo")
public class StudentInfo {

	@Override
	public String toString() {
		return "StudentInfo [itsName=" + itsName + ", itsRoll=" + itsRoll + ", itsColleage=" + itsColleage + "]";
	}

	@Value("Sangam")
	private String itsName;
	
	@Value("10")
	private int itsRoll;
	
	@Value("MGM GYPC")
	private String itsColleage;

	
	
}
