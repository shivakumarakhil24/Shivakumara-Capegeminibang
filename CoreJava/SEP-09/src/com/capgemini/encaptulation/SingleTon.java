package com.capgemini.encaptulation;

public class SingleTon {
	private static SingleTon ref=new SingleTon();
	
	private  SingleTon() {
	
	}
	
	public static  SingleTon getVan() {
		return ref;
		
	}
	
		
	

}
