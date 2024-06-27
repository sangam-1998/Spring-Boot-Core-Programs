package spring.core.DbConnection;

import spring.core.bean.DbInfo;

public class DbOperation {

	DbInfo conn;

	public DbInfo getConn() {
		return conn;
	}

	public void setConn(DbInfo conn) {
		this.conn = conn;
	}

	@Override
	public String toString() {
		return "DbOperation [conn=" + conn + "]";
	}
	
	
}
