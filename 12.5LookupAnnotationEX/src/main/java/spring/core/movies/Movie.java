package spring.core.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import spring.core.tickets.Ticket;

@Scope("singleton")
@Component("m")
public class Movie {
	
	@Autowired
	Ticket t;
	
	@Lookup
	public Ticket getNewTicket() {
		return null;
	}

	public int getTicketNum() {
		return t.getTicketNum();
	}
	
	

	public void setTicketNum(int ticketNum) {
		t.setTicketNum(ticketNum);
	}

	public int hashCode() {
		return t.hashCode();
	}

	public boolean equals(Object obj) {
		return t.equals(obj);
	}

	public String toString() {
		this.t= getNewTicket();
		return t.toString();
	}
	
	

}
