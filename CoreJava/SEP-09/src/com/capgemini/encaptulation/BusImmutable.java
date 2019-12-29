package com.capgemini.encaptulation;

public class BusImmutable {
	private final String name;
	private final int ticket;
	public BusImmutable(String name, int ticket) {
		super();
		this.name = name;
		this.ticket = ticket;
	}
	public String getName() {
		return name;
	}
	public int getTicket() {
		return ticket;
	}
	

}
