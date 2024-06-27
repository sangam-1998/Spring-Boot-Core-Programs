package spring.core.bean;

public class StudentInfo {

	private String itsName;
	public String getItsName() {
		return itsName;
	}
	public void setItsName(String itsName) {
		this.itsName = itsName;
	}
	private String itsLastName;
	@Override
	public String toString() {
		return "StudentInfo [itsName=" + itsName + ", itsLastName=" + itsLastName + "]";
	}
	public String getItsLastName() {
		return itsLastName;
	}
	public void setItsLastName(String itsLastName) {
		this.itsLastName = itsLastName;
	}
	
	
	
}
