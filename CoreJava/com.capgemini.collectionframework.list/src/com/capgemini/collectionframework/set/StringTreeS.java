package com.capgemini.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class StringTreeS {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("Manu");
		t.add("Madhu");
		t.add("Dheepu");
		t.add("Anil");
		
		Iterator<String> i1=t.iterator();
		while(i1.hasNext())
		{
			String s=i1.next();
			System.out.println(s);
		}
		
		
		
		
		
	}

}
