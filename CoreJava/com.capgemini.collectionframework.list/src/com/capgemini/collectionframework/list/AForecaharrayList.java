package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class AForecaharrayList {
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();

		al.add(2);
		al.add("Anu");
		al.add(false);
		al.add(2.1);
		al.add('S');
		al.remove("Anu");
		boolean B=al.contains(2.1);
		System.out.println(B);
		
		int i=1;
		for(Object a:al)
		{
		System.out.println("The element "+i+"th is  "+a);	
		i++;
		} 
		al.clear();
		System.out.println(al);
	}
}
  