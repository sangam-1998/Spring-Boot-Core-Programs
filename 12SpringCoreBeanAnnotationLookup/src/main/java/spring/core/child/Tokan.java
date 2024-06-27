package spring.core.child;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t")
@Scope("prototype")
public class Tokan {

	private int tokan;
	
	public Tokan(){
	
		tokan = new Random().nextInt(9999);
	   
	}

	
	@Override
	public String toString() {
		return "Token [token=" + tokan + "]";
	}

	
	
}
