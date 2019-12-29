package com.capgemini.collectionframework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DobleLHS {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls=new LinkedHashSet<Double>();
		ls.add(15.1);
		ls.add(151.2);
		ls.add(1551.3);
		ls.add(12.7);
		
		for(Object a:ls)
		{
		
		System.out.println(a);	
		
		}
		
		System.out.println("iterator");
		Iterator<Double> i1=ls.iterator();
		while(i1.hasNext())
		{
			Double sr=i1.next();
			System.out.println(sr);
		}

}
}
