package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinliGeneric {
	public static void main(String[] args) {
		LinkedList<String> a=new LinkedList<String>();
		a.add("Amma");
		a.add("Appaji");
		a.add("Sunday");
		a.add("Monday");
		a.add("Tuesday");
		a.add("Wednessday");
		Iterator<String> i1=a.iterator();
		System.out.println("--------retrieving using Iterator----------");
		while(i1.hasNext())
		{
			String r=i1.next();
			System.out.println(r);
			
		}
		System.out.println("------------Backward");
		ListIterator<String> l1=a.listIterator();
		while(l1.hasPrevious())
		{
			String r=l1.previous();
			System.out.println(r);
			
		}
		System.out.println("--------for each");
		for(String oj:a)
		{
			
			System.out.println(oj);
		}
		
		System.out.println("----------using-----forloop");
		for(int k=0;k<a.size();k++)
		{
			String oj=a.get(k);
			System.out.println(oj);
		}
		
	}

}
