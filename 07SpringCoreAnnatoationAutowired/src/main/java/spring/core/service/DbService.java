package spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.core.dao.DbInfo;

@Component("dbService")
public class DbService {

	@Override
	public String toString() {
		return "DbService [dao=" + dao + "]";
	}

	@Autowired
	DbInfo dao;
	
	
}
