package com.capgemini.array.generic;

public class TestE 
{
	public static void recieve(double [] a)
	{
		for(double d:a)
		{
			System.out.println(d);
		}
	}
	public static void main(String[] args)
	{
	double [] a={10,20,30,50,90};
	recieve(a);
}
}
