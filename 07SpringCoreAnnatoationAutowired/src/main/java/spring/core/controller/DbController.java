package spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.core.service.DbService;

@Component("dbControll")
public class DbController {

	@Override
	public String toString() {
		return "DbController [dService=" + dService + "]";
	}

	@Autowired
	DbService dService;
	
}
