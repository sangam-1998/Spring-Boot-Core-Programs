package spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component("sinfo")
public class StudentInfo {

	@Value("sangam")
	private String itsName;
	
	@Value("patil")
	private String itsLastName;
	
}
