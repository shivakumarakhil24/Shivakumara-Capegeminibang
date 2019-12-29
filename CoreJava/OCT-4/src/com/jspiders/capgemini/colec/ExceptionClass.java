package com.jspiders.capgemini.colec;

public class ExceptionClass {
	 public static void check(int a)
	 {
		 
		 
			int []b= {1,3,4,5};
			try {
				System.out.println(b[a]);
				
				System.out.println("first line working Fine");
				System.out.println(5/a);
				String s="hello";
				System.out.println(s.length());
				System.out.println(s);
				System.out.println("all are executed");
				
			} 
			
			catch (ArithmeticException |ArrayIndexOutOfBoundsException | NullPointerException e) 
			{
		           System.out.println("||||||||||||EXCEPTION||||||||||");
		           String sd= e.getMessage();
		           System.out.println(sd);
	           
	        } 
			
	 }
	

	public static void main(String[] args) {
		
		System.out.println("------ Main start------");
		
		check(0);
		
		
		System.out.println("------ main end ------");
		
		
		
	}

}
