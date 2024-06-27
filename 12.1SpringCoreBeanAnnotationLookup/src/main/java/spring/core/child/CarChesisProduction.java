package spring.core.child;


import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("chesis")

@Scope("prototype")
public class CarChesisProduction {
	private int chesis;

	public CarChesisProduction() {
		
		chesis = new Random().nextInt(9999);
		
	}
	
	@Override
	public String toString() {
		return "CarChesisProduction [chesis=" + chesis + "]";
	}

	public int getChesis() {
		return chesis;
	}

	public void setChesis(int chesis) {
		this.chesis = chesis;
	}



	
	
}
