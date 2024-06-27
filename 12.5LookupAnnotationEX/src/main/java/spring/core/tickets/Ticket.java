package spring.core.tickets;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("t")
public class Ticket {

	@Override
	public String toString() {
		return "Ticket [ticketNum=" + ticketNum + "]";
	}

	private int ticketNum = 0;

	public Ticket() {

		ticketNum = new Random().nextInt(9999);

	}

	public int getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}

}
