package io.eronalves1996.spring;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	

	public static void main(String... args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("io/eronalves1996/spring/config.xml");
		TicketReservation tr = (TicketReservation) ctx.getBean("ticketreservation");
		ctx.registerShutdownHook();
	}

}
