package spring.core.DbOperation;

import spring.core.bean.DbInfo;

public class DbConnection {

	
	DbInfo dinfo;

	@Override
	public String toString() {
		return "DbConnection [dinfo=" + dinfo + "]";
	}

	public DbInfo getDinfo() {
		return dinfo;
	}

	public void setDinfo(DbInfo dinfo) {
		this.dinfo = dinfo;
	}
	
}
