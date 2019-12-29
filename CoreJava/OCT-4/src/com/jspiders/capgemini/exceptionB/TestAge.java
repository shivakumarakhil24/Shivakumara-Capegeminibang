package com.jspiders.capgemini.exceptionB;


public class TestAge {
	 
	 void valid(int age)
		{
		if(age<18)
		{
			throw new InvalidAgeException();
			
		}
		else 
			System.out.println("welcome to marriage");
		
		}
	}


