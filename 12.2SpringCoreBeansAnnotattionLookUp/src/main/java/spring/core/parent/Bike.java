package spring.core.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;
import spring.core.beans.BikeInfo;

@Component("bike")
public class Bike {
	
	
	public BikeInfo getBi() {
	    return bi;
	}


	@Override
	public String toString() {
		this.bi = getBike();
		return "Bike [bi=" + bi + "]";
	}


	@Autowired
	BikeInfo bi;
	
	@Lookup
	public BikeInfo getBike() {
		 return null;
	}
	
	

	
	

	
	
	

}
