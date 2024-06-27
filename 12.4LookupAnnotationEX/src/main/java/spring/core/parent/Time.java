package spring.core.parent;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("t")
public class Time {

	long time=0;
	String Date;
	public String getDate() {
		return Date;
	}

	@Override
	public String toString() {
		return "Time [time=" + time + ", Date=" + Date + "]";
	}

	public void setDate(String date) {
		Date = date;
	}

	public Time() {
		
		time = System.currentTimeMillis();
	    SimpleDateFormat formatter = new SimpleDateFormat();
	    Date =formatter.format(time);
	    
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
    	
}
