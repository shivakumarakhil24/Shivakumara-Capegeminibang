package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainA4 {
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add(24);
		al.add("Anu");
		al.add(false);
		al.add(2.1);
		al.add('S');
		ListIterator lt=al.listIterator();
		while(lt.hasNext())
		{
			Object r=lt.next();
			System.out.println(r);
			
		}
	}
}
