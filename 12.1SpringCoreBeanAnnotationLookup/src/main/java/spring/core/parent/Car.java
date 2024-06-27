package spring.core.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import spring.core.child.CarChesisProduction;

@Component("car")
public class Car {

	@Autowired
	CarChesisProduction chesis;
	
	
	@Lookup
	public CarChesisProduction getNewChesis() {
		return null;
	}
	
	public CarChesisProduction getChesis() {
		this.chesis = getNewChesis();
		return chesis;
	}


	@Override
	public String toString() {
		return "Car [chesis=" + chesis + "]";
	}
	
	
}
