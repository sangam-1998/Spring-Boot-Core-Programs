package spring.core.beans;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("info")
public class BikeInfo {

   
	@Override
	public String toString() {
		return "BikeInfo [tokan=" + tokan + "]";
	}

	int tokan=0;
	public BikeInfo() {
		
		tokan = new Random().nextInt(9999);
		
	}
	
	public int getTokan() {
		return tokan;
	}
	
	
	
}
