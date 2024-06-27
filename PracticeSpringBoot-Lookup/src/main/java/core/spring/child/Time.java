package core.spring.child;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("t")
@Data
@Scope("prototype")
public class Time {

	private int time;
	
	
	public Time() {
		
		time = new Random().nextInt(9999);
	}
	
}
