package org.com.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentInfo {

	
	private Set<String> RollNu ;
	private List<String> Subject ;
	private Map<Integer,String> info  ;
	private Properties prop; 
	
	
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Set<String> getRollNu() {
		return RollNu;
	}
	public void setRollNu(Set<String> rollNu) {
		RollNu = rollNu;
	}
	public List<String> getSubject() {
		return Subject;
	}
	public void setSubject(List<String> subject) {
		Subject = subject;
	}
	public Map<Integer, String> getInfo() {
		return info;
	}
	public void setInfo(Map<Integer, String> info) {
		this.info = info;
	}
	public StudentInfo() {
		super();
	}
	@Override
	public String toString() {
		return "StudentInfo [RollNu=" + RollNu + ", Subject=" + Subject + ", info=" + info + ", prop=" + prop + "]";
	}
	
	
	
}
