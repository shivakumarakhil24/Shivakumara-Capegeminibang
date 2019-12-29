package com.capgemini.array.generic;

public class IntRet {
	public static int[] recv()
	{
		int [] a= {29,39,49,59};
		return a;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int [] d=recv();
		for(int r: d)
		{ 
			System.out.println(r);}
		}

}
