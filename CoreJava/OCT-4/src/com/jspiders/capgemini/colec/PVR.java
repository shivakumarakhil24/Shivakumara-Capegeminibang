package com.jspiders.capgemini.colec;

public class PVR {
	
	void confirm() {
		System.out.println("confirm started");
		
	
	try {
		System.out.println(10/0);
		System.out.println("booked ticket");
	}
	catch(ArithmeticException ae)
	{
		ae.printStackTrace();
		throw ae;
	}
	
	finally
	{
		System.out.println("confirm end");
	}
	
}
}
