package com.capgemini.collectionframework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHS {
public static void main(String[] args) {
	LinkedHashSet ls=new LinkedHashSet();
	ls.add(15);
	ls.add('A');
	ls.add(2.4);
	ls.add("Deepa");
	ls.add(null);
	
	for(Object a:ls)
	{
	
	System.out.println(a);	
	
	}
	
	System.err.println("iterator");
	Iterator i1=ls.iterator();
	while(i1.hasNext())
	{
		Object sr=i1.next();
		System.out.println(sr);
	}
}
}
