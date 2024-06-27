package spring.core.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import spring.core.parent.Time;

@Component("watch")
public class Watch {

	@Autowired
	Time t;
	
	@Lookup
	public Time getNewTime() {
		return null;
	}
	
	

	@Override
	public String toString() {
		this.t = getNewTime();
		return "Watch [t=" + t + "]";
	}

	public Time getT() {
		return t;
	}

    	
	
	
	
	
	
}
