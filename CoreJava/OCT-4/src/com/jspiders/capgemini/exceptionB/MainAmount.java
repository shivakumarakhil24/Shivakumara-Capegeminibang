package com.jspiders.capgemini.exceptionB;

public class MainAmount {
	public static void main(String[] args) {
		Amont a=new Amont();
		try {
			a.Amount(4500);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
