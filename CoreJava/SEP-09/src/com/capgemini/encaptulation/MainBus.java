package com.capgemini.encaptulation;

public class MainBus {
public static void main(String[] args) {
	BusImmutable b=new BusImmutable("UDAYARANGA",101);
	System.out.println(b.getName());
	System.out.println(b.getTicket());
}
}
