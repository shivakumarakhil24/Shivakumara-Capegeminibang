package com.jspiders.capgemini.exceptionB;

import java.util.Scanner;

public class ScannUse {
	public static void main(String[] args) {
		
	
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		System.out.println("age is "+age);
	}
}
}
