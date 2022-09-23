package io.eronalves1996.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUP");
	}
}
