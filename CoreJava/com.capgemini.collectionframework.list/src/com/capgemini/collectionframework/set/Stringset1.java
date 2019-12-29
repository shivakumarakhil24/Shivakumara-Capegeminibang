package com.capgemini.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class Stringset1 {
	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();
		s.add("Dhanya");
		s.add("Bavan");
		s.add("Pranav");
		s.add("Nikhil");
		System.out.println("---------for each---------");
		for(Object a:s)
		{
		
		System.out.println(a);	
		
		}
		
		System.out.println("iterator");
		Iterator<String> i1=s.iterator();
		while(i1.hasNext())
		{
			String sr=i1.next();
			System.out.println(sr);
		}
		
		
		
		
	}

}
