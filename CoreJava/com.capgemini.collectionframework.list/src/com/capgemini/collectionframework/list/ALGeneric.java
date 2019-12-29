package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ALGeneric {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(2);
		a.add(1997);
		a.add(2019);
		a.add(21);
		a.add(90);
		Iterator i1=a.iterator();
		System.out.println("--------retrieving using Iterator----------");
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);
		}
		System.out.println("-------- Using For Each-------------------");
		for(Integer i:a)
		{
			System.out.println(i);
		}
		
		
	}


}
