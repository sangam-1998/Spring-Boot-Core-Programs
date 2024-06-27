package spring.core.bean;

public class DataBaseTye {

	
	private String DbType;

	@Override
	public String toString() {
		return "DataBaseTye [DbType=" + DbType + "]";
	}

	public DataBaseTye(String dbType) {
		super();
		DbType = dbType;
	}
	

}
