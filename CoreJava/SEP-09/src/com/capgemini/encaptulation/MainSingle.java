package com.capgemini.encaptulation;

public class MainSingle {
	public static void main(String[] args) {
		
		SingleTon s= SingleTon.getVan();
		System.out.println(s);
		SingleTon r=SingleTon.getVan();
		System.out.println(r);
		
		
		
	}

}
