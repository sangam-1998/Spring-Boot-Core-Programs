package spring.core.service;

import spring.core.bean.DbInfo;

public class DbService {

	DbInfo dinfo;
	

	public DbInfo getDinfo() {
		return dinfo;
	}


	public void setDinfo(DbInfo dinfo) {
		this.dinfo = dinfo;
	}


	@Override
	public String toString() {
		return "DbService [dinfo=" + dinfo + "]";
	}


	private void start() {
    
		System.out.println("Start Method Is called -"+dinfo);
	}
	
	private void stop() {
	    
		System.out.println("Stop Method is called");
	}
}
