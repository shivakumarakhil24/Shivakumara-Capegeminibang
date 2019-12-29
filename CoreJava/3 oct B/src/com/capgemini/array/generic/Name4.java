package com.capgemini.array.generic;

public class Name4 {
	public static void main(String[] args) {
		String [] str= {"abay","baby","cat","doll"};
	
		for (int i = 0; i < str.length; i++) 
		{
			if(str[i]=="baby")
			{
				continue;
			}
		 System.out.println(str[i]);
		}
	}

}
