package com.jspiders.capgemini.exceptionB;

public class MainAge {
	public static void main(String[] args) {
		TestAge t=new TestAge();
		try
		{
			t.valid(12);	
		}
		catch(InvalidAgeException ie)
		
		{
		System.out.println("exception occur");
		ie.printStackTrace();
		}
		
	}

}
